package ViewControllers;

import DAO.DisciplinaJpaController;
import DAO.HorarioJpaController;
import DAO.ProfessorJpaController;
import DAO.SalaJpaController;
import DAO.TurmaJpaController;
import Entidades.Disciplina;
import Entidades.Horario;
import Entidades.Professor;
import Entidades.Sala;
import Entidades.Turma;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class TelaCadastroController {
    
    public void guiaClicada(int guiaEscolhida, DefaultTableModel model){        
        Object informColuna[];
        
        switch(guiaEscolhida){
            case 0:
                //Define como 4 o número de informações que serão passadas para a tabela,
                //onde 4 é o número de colunas na tabela.
                informColuna = new Object[4];
        
                //Acessa o banco de dados e seleciona todas as disciplinas
                DisciplinaJpaController discControl = new DisciplinaJpaController();
                List<Disciplina> disc = discControl.findDisciplinaOrdered();
                //Para cada disciplina, recebe informações e ao fim adiciona uma nova linha na tabela
                for (Disciplina disciplina : disc) {
                    informColuna[0] = disciplina.getDisciplinaCodigo();
                    informColuna[1] = disciplina.getDisciplinaNome();
                    informColuna[2] = disciplina.getDisciplinaSemestre();
                    if(disciplina.getDisciplinaSubTurma())
                        informColuna[3] = "Sim";
                    else
                        informColuna[3] = "Não";
                                
                    model.addRow(informColuna);
                }
                break;
                
            case 1:
                informColuna = new Object[4];
        
                ProfessorJpaController profControl = new ProfessorJpaController();
                List<Professor> prof = profControl.findProfessorOrdered();

                for (Professor professor : prof) {
                    informColuna[0] = professor.getProfessorNome();
                    informColuna[1] = professor.getProfessorTitulo();
                    informColuna[2] = professor.getProfessorEspecializacao();
                    if(professor.getProfessorStatus())
                        informColuna[3] = "Sim";
                    else
                        informColuna[3] = "Não";
                                
                    model.addRow(informColuna);
                }
                break;
                
            case 2:
                informColuna = new Object[4];
        
                SalaJpaController salaControl = new SalaJpaController();
                List<Sala> sal = salaControl.findSalaOrdered();

                for (Sala sala : sal) {
                    informColuna[0] = sala.getSalaCodigo();
                    informColuna[1] = sala.getSalaNumAluno();
                    informColuna[2] = sala.getSalaLocalizacao();
                    informColuna[3] = sala.getSalaObservacao();
                    
                    model.addRow(informColuna);
                }
                break;
                
            case 3:  
                informColuna = new Object[4];
        
                TurmaJpaController turmaControl = new TurmaJpaController();
                List<Turma> turm = turmaControl.findTurmaOrdered();
                
                for (Turma turma : turm) {
                    informColuna[0] = turma.getTurmaCodigo();
                    informColuna[1] = turma.getTurmaSemestre();
                    informColuna[2] = turma.getTurmaNumAluno();
                    if(turma.getTurmaStatus())
                        informColuna[3] = "Sim";
                    else
                        informColuna[3] = "Não";
                    
                    model.addRow(informColuna);
                }
                break;
                
            case 4:
                informColuna = new Object[2];
        
                HorarioJpaController horarioControl = new HorarioJpaController();
                List<Horario> hora = horarioControl.findHorarioOrdered();

                for (Horario horario : hora) {
                    informColuna[0] = horario.getHorarioInicial();
                    informColuna[1] = horario.getHorarioFinal();
                    
                    //Transforma o objeto recebido em String, corta a nova variável
                    //para eliminar as informações sobressalentes.
                    String inicialString = informColuna[0].toString();
                    String inicialStringCort = inicialString.substring(11, 16);
                    
                    String finalString = informColuna[1].toString();
                    String finalStringCort = finalString.substring(11, 16);
                    
                    //Passa as novas Strings para a tabela.
                    model.addRow(new Object[]{inicialStringCort + " - " + finalStringCort});
                    
                   
                    
                }
                break;
        }
    }
}


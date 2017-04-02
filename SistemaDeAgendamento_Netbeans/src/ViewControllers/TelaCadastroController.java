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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.html.parser.DTDConstants;

public class TelaCadastroController {
    
    public void guiaClicada(int guiaEscolhida, DefaultTableModel model){        
        Object informColuna[];
        
        switch(guiaEscolhida){
            case 0:
                //Define como 5 o número de informações que serão passadas para a tabela,
                //onde 5 é o número de colunas na tabela.
                informColuna = new Object[5];
        
                //Acessa o banco de dados e seleciona todas as disciplinas
                DisciplinaJpaController discControl = new DisciplinaJpaController();
                List<Disciplina> disc = discControl.findDisciplinaOrdered();
                //Para cada disciplina, recebe informações e ao fim adiciona uma nova linha na tabela
                for (Disciplina disciplina : disc) {
                    informColuna[0] = disciplina.getDisciplinaNome();
                    informColuna[1] = disciplina.getDisciplinaSemestre();
                    informColuna[2] = disciplina.getDisciplinaCargaHoraria();
                    informColuna[3] = disciplina.getDisciplinaNumAluno();
                    if(disciplina.getDisciplinaSubTurma())
                        informColuna[4] = "Sim";
                    else
                        informColuna[4] = "Não";
                                
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
                    informColuna[0] = turma.getTurmaTurno();
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
                informColuna = new Object[1];
        
                HorarioJpaController horarioControl = new HorarioJpaController();
                List<Horario> hora = horarioControl.findHorarioOrdered();

                for (Horario horario : hora) {
                    informColuna[0] = horario.getHorarioInicial();
                    
                    model.addRow(informColuna);
                }
                break;
        }
    }
}


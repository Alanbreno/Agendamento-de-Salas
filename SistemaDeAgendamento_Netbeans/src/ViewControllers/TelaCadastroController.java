package ViewControllers;

import DAO.DisciplinaJpaController;
import Entidades.Disciplina;
import java.awt.Component;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class TelaCadastroController {
    public guiaClicada(int guiaEscolhida){
        
        String nomeGuia;
        
        switch(guiaEscolhida){
            case 0:
                nomeGuia = "Disciplina";
                
                int numColunas = tabelaDisciplina.getColumnCount();
                Object informColuna[] = new Object[numColunas];
                DefaultTableModel model = (DefaultTableModel) tabelaDisciplina.getModel();
        
                //Acessa o banco de dados e seleciona todas as disciplinas
                DisciplinaJpaController discControl = new DisciplinaJpaController();
                List<Disciplina> disc = discControl.findDisciplinasOrdered();
                            //Para cada disciplina, recebe informações e ao fim adiciona uma nova linha na tabela
                for (Disciplina disciplina : disc) {
                    informColuna[0] = disciplina.getDisciplinaNome();
                    informColuna[1] = disciplina.getDisciplinaSemestre();
                    informColuna[2] = disciplina.getDisciplinaCargaHoraria();
                    informColuna[3] = disciplina.getDisciplinaNumAluno();
                    String alocaDisciplina;
                    if(disciplina.getDisciplinaSubTurma())
                        informColuna[4] = "Sim";
                    else
                        informColuna[4] = "Não";
                                
                    model.addRow(informColuna);
                }
        
                    model.setNumRows(0);
                    System.out.println("tela limpada");
        }
        
        
        
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewControllers;

import DAO.Controladores.ControladorDisciplina;
import Entidades.Disciplina;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sedepti
 */
public class TelaCadastroFiltroController {

    public void filtroControllerDisciplinaIdentificaçao(DefaultTableModel model, String palavra) {
        Object informColuna[];
        informColuna = new Object[4];
        ControladorDisciplina discControl = new ControladorDisciplina();
        List<Disciplina> Alguem = discControl.FiltroCodigoDisciplina(palavra);
        model.setNumRows(0);
        for (Disciplina disciplina : Alguem) {
            informColuna[0] = disciplina.getDisciplinaCodigo();
            informColuna[1] = disciplina.getDisciplinaNome();
            informColuna[2] = disciplina.getDisciplinaSemestre();
            if (disciplina.getDisciplinaSubTurma()) {
                informColuna[3] = "Sim";
            } else {
                informColuna[3] = "Não";
            }

            model.addRow(informColuna);

        }
    }

    public void filtroControllerDisciplina(DefaultTableModel model, String palavra) {
        Object informColuna[];
        informColuna = new Object[4];
        ControladorDisciplina discControl = new ControladorDisciplina();
        List<Disciplina> Alguem = discControl.filtroNomeDisciplina(palavra);
        model.setNumRows(0);
        for (Disciplina disciplina : Alguem) {
            informColuna[0] = disciplina.getDisciplinaCodigo();
            informColuna[1] = disciplina.getDisciplinaNome();
            informColuna[2] = disciplina.getDisciplinaSemestre();
            if (disciplina.getDisciplinaSubTurma()) {
                informColuna[3] = "Sim";
            } else {
                informColuna[3] = "Não";
            }

            model.addRow(informColuna);

        }
    }

    public void FiltroControllerDisciplinaSemestre(DefaultTableModel model, short palavra) {
        Object informColuna[];
        informColuna = new Object[4];
        ControladorDisciplina discControl = new ControladorDisciplina();
        List<Disciplina> Alguem = discControl.FiltroSemestreDisciplina(palavra);
        model.setNumRows(0);
        for (Disciplina disciplina : Alguem) {
            informColuna[0] = disciplina.getDisciplinaCodigo();
            informColuna[1] = disciplina.getDisciplinaNome();
            informColuna[2] = disciplina.getDisciplinaSemestre();
            if (disciplina.getDisciplinaSubTurma()) {
                informColuna[3] = "Sim";
            } else {
                informColuna[3] = "Não";
            }

            model.addRow(informColuna);

        }
    }

    public void FiltroControllerDisciplinaCargaHoraria(DefaultTableModel model, boolean palavra) {
        Object informColuna[];
        informColuna = new Object[4];
        ControladorDisciplina discControl = new ControladorDisciplina();
        List<Disciplina> Alguem = discControl.FiltroSubturmaDisciplina(palavra);
        model.setNumRows(0);
        for (Disciplina disciplina : Alguem) {
            informColuna[0] = disciplina.getDisciplinaCodigo();
            informColuna[1] = disciplina.getDisciplinaNome();
            informColuna[2] = disciplina.getDisciplinaSemestre();
            if (disciplina.getDisciplinaSubTurma()) {
                informColuna[3] = "Sim";
            } else {
                informColuna[3] = "Não";
            }

            model.addRow(informColuna);

        }
    }

}

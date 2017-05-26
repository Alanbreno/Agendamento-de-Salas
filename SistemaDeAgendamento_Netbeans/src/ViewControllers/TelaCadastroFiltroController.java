/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewControllers;

import DAO.Controladores.ControladorDisciplina;
import DAO.Controladores.ControladorProfessor;
import DAO.Controladores.ControladorSala;
import Entidades.Disciplina;
import Entidades.Professor;
import Entidades.Sala;
import java.util.List;
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
    public void FiltroControllerProfessorNome(DefaultTableModel model, String palavra) {
        Object informColuna[];
        informColuna = new Object[4];
        ControladorProfessor discControl = new ControladorProfessor();
        List<Professor> Alguem = discControl.filtroNomeProfessor(palavra);
        model.setNumRows(0);
        for (Professor professor : Alguem) {
            informColuna[0] = professor.getProfessorNome();
            informColuna[1] = professor.getProfessorTitulo();
            informColuna[2] = professor.getProfessorEspecializacao();
            if (professor.getProfessorStatus()) {
                informColuna[3] = "Sim";
            } else {
                informColuna[3] = "Não";
            }

            model.addRow(informColuna);

        }
    }
    public void FiltroControllerProfessorTitulo(DefaultTableModel model, String palavra) {
        Object informColuna[];
        informColuna = new Object[4];
        ControladorProfessor discControl = new ControladorProfessor();
        List<Professor> Alguem = discControl.filtroTituloProfessor(palavra);
        model.setNumRows(0);
        for (Professor professor : Alguem) {
            informColuna[0] = professor.getProfessorNome();
            informColuna[1] = professor.getProfessorTitulo();
            informColuna[2] = professor.getProfessorEspecializacao();
            if (professor.getProfessorStatus()) {
                informColuna[3] = "Sim";
            } else {
                informColuna[3] = "Não";
            }

            model.addRow(informColuna);

        }
    }
    public void FiltroControllerProfessorEspecializaçao(DefaultTableModel model, String palavra) {
        Object informColuna[];
        informColuna = new Object[4];
        ControladorProfessor discControl = new ControladorProfessor();
        List<Professor> Alguem = discControl.filtroEspecializaçaoProfessor(palavra);
        model.setNumRows(0);
        for (Professor professor : Alguem) {
            informColuna[0] = professor.getProfessorNome();
            informColuna[1] = professor.getProfessorTitulo();
            informColuna[2] = professor.getProfessorEspecializacao();
            if (professor.getProfessorStatus()) {
                informColuna[3] = "Sim";
            } else {
                informColuna[3] = "Não";
            }

            model.addRow(informColuna);

        }
    }
    public void FiltroControllerProfessorStatus(DefaultTableModel model, boolean palavra) {
        Object informColuna[];
        informColuna = new Object[4];
        ControladorProfessor discControl = new ControladorProfessor();
        List<Professor> Alguem = discControl.filtroCargahorariaCumpridaProfessor(palavra);
        model.setNumRows(0);
        for (Professor professor : Alguem) {
            informColuna[0] = professor.getProfessorNome();
            informColuna[1] = professor.getProfessorTitulo();
            informColuna[2] = professor.getProfessorEspecializacao();
            if (professor.getProfessorStatus()) {
                informColuna[3] = "Sim";
            } else {
                informColuna[3] = "Não";
            }

            model.addRow(informColuna);

        }
    }
    
    public void FiltroControllerSalaNome(DefaultTableModel model, String palavra ){
        Object informColuna[];
        informColuna = new Object[4];
        ControladorSala discControl = new ControladorSala();
        List<Sala> Alguem = discControl.filtroNomeSala(palavra);
        model.setNumRows(0);
        for (Sala sala : Alguem) {
            informColuna[0] = sala.getSalaCodigo();
            informColuna[1] = sala.getSalaNumAluno();
            informColuna[2] = sala.getSalaLocalizacao();
            informColuna[3] = sala.getSalaObservacao();

            model.addRow(informColuna);

        }
    }
    public void FiltroControllerSalaNumeroAlunos(DefaultTableModel model, short palavra ){
        Object informColuna[];
        informColuna = new Object[4];
        ControladorSala discControl = new ControladorSala();
        List<Sala> Alguem = discControl.filtroCapacidadeSala(palavra);
        model.setNumRows(0);
        for (Sala sala : Alguem) {
            informColuna[0] = sala.getSalaCodigo();
            informColuna[1] = sala.getSalaNumAluno();
            informColuna[2] = sala.getSalaLocalizacao();
            informColuna[3] = sala.getSalaObservacao();

            model.addRow(informColuna);

        }
    }
    public void FiltroControllerSalaLocalizaçao(DefaultTableModel model, String palavra ){
        Object informColuna[];
        informColuna = new Object[4];
        ControladorSala discControl = new ControladorSala();
        List<Sala> Alguem = discControl.filtroLocalizaçaoSala(palavra);
        model.setNumRows(0);
        for (Sala sala : Alguem) {
            informColuna[0] = sala.getSalaCodigo();
            informColuna[1] = sala.getSalaNumAluno();
            informColuna[2] = sala.getSalaLocalizacao();
            informColuna[3] = sala.getSalaObservacao();

            model.addRow(informColuna);

        }
    }
    public void FiltroControllerSalaObservaçao(DefaultTableModel model, String palavra ){
        Object informColuna[];
        informColuna = new Object[4];
        ControladorSala discControl = new ControladorSala();
        List<Sala> Alguem = discControl.filtroObservacaoSala(palavra);
        model.setNumRows(0);
        for (Sala sala : Alguem) {
            informColuna[0] = sala.getSalaCodigo();
            informColuna[1] = sala.getSalaNumAluno();
            informColuna[2] = sala.getSalaLocalizacao();
            informColuna[3] = sala.getSalaObservacao();

            model.addRow(informColuna);

        }
    }
    

}

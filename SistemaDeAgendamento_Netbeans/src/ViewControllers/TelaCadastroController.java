package ViewControllers;

import DAO.Controladores.ControladorDisciplina;
import DAO.Controladores.ControladorHorario;
import DAO.Controladores.ControladorProfessor;
import DAO.Controladores.ControladorSala;
import DAO.Controladores.ControladorTurma;
import DAO.SalaJpaController;
import DAO.TurmaJpaController;
import DAO.exceptions.NonexistentEntityException;
import Entidades.Disciplina;
import Entidades.Horario;
import Entidades.Professor;
import Entidades.Sala;
import Entidades.Turma;
import View.TelaEditarSalas;
import View.TelaEditarTurmas;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TelaCadastroController {

    //Variáveis necessárias para o método de ícones dinâmicos.
    final ImageIcon lapisIcone = new ImageIcon("src/Imagens/Gestao/pen_16.png");
    final ImageIcon lupaIcone = new ImageIcon("src/Imagens/Gestao/lupa_16px.png");
    final ImageIcon xisIcone = new ImageIcon("src/Imagens/Gestao/xis_16px.png");
    private int linhaEscolhidaAnter;

    public void guiaClicada(int guiaEscolhida, DefaultTableModel model) {
        Object informColuna[];

        switch (guiaEscolhida) {
            case 0:
                //Define como 4 o número de informações que serão passadas para a tabela,
                //onde 4 é o número de colunas na tabela.
                informColuna = new Object[4];

                //Acessa o banco de dados e seleciona todas as disciplinas
                ControladorDisciplina discControl = new ControladorDisciplina();
                List<Disciplina> disc = discControl.selectDisciplinas();
                //Para cada disciplina, recebe informações e ao fim adiciona uma nova linha na tabela
                for (Disciplina disciplina : disc) {
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
                break;

            case 1:
                informColuna = new Object[4];

                ControladorProfessor profControl = new ControladorProfessor();
                List<Professor> prof = profControl.selectProfessores();

                for (Professor professor : prof) {
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
                break;

            case 2:
                informColuna = new Object[4];

                ControladorSala salaControl = new ControladorSala();
                List<Sala> sal = salaControl.selectSalas();

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

                ControladorTurma turmaControl = new ControladorTurma();
                List<Turma> turm = turmaControl.selectTurmas();

                for (Turma turma : turm) {
                    informColuna[0] = turma.getTurmaCodigo();
                    informColuna[1] = turma.getTurmaSemestre();
                    informColuna[2] = turma.getTurmaNumAluno();
                    if (turma.getTurmaStatus()) {
                        informColuna[3] = "Sim";
                    } else {
                        informColuna[3] = "Não";
                    }

                    model.addRow(informColuna);
                }
                break;

            case 4:
                informColuna = new Object[2];

                ControladorHorario horarioControl = new ControladorHorario();
                List<Horario> hora = horarioControl.selectHorarios();

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

    public void iconesDinamicos(JTable tabela) {

        int linhaEscolhida = tabela.getSelectedRow();

        //Define as colunas com ações
        int colunaEditar = tabela.getColumnCount() - 3;
        int colunaVisual = tabela.getColumnCount() - 2;
        int colunaApagar = tabela.getColumnCount() - 1;

        //Caso haja troca de tabelas, com uma tabela de maior número de linhas.
        if (tabela.getRowCount() <= this.linhaEscolhidaAnter) {
            this.linhaEscolhidaAnter = 0;
        }

        //Caso usuário escolha a mesma linha duas vezes, na segunda vez realiza uma
        //ação ao clicar nas colunas de ação. Também adiciona e retira ícones.
        if (this.linhaEscolhidaAnter == linhaEscolhida) {

            if (tabela.getSelectedColumn() == colunaEditar) {
                editarDados(tabela);
            } else if (tabela.getSelectedColumn() == colunaVisual) {
                visualizarDados();
            } else if (tabela.getSelectedColumn() == colunaApagar) {
                excluirDados(tabela);
            }

        } else {
            tabela.setValueAt("", this.linhaEscolhidaAnter, colunaEditar);
            tabela.setValueAt("", this.linhaEscolhidaAnter, colunaVisual);
            tabela.setValueAt("", this.linhaEscolhidaAnter, colunaApagar);

            tabela.setValueAt(this.lapisIcone, linhaEscolhida, colunaEditar);
            tabela.setValueAt(this.lupaIcone, linhaEscolhida, colunaVisual);
            tabela.setValueAt(this.xisIcone, linhaEscolhida, colunaApagar);
        }

        if (this.linhaEscolhidaAnter == 0) {
            tabela.setValueAt(this.lapisIcone, linhaEscolhida, colunaEditar);
            tabela.setValueAt(this.lupaIcone, linhaEscolhida, colunaVisual);
            tabela.setValueAt(this.xisIcone, linhaEscolhida, colunaApagar);
        }

        this.linhaEscolhidaAnter = linhaEscolhida;
    }

    //Cruds
    public void editarDados(JTable tabela) {
        String tabelaUsada = tabela.getModel().getColumnName(0);
        int valor = tabela.getSelectedRow();
        String valores = tabela.getValueAt(valor, 0).toString();
        switch (tabelaUsada) {
            case "Identificação":

                break;
            case "Professor":

                break;

            case "Sala":
                TelaEditarSalas telaeditarsalas = new TelaEditarSalas(null, true);
                telaeditarsalas.editar(valores);
                telaeditarsalas.setVisible(true);
                //Adicionar refresh na tabela.
                break;
            case "Turma":
                TelaEditarTurmas telaeditarturmas = new TelaEditarTurmas(null, true);
                telaeditarturmas.editarTurma(valores);
                telaeditarturmas.setVisible(true);
                break;
            case "Horário":

                break;
        }
    }

    public void visualizarDados() {

    }

    public void excluirDados(JTable tabela) {

        String tabelaUsada = tabela.getModel().getColumnName(0);

        int valor = tabela.getSelectedRow();
        String valores = tabela.getValueAt(valor, 0).toString();
        int resposta = JOptionPane.showConfirmDialog(null, "Você esta deletando " + valores + ", Tem certeza disso?", "AVISO", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {

            switch (tabelaUsada) {

                case "Identificação":

                    break;
                case "Professor":

                    break;

                case "Sala":
                    SalaJpaController jpaControl = new SalaJpaController();
                    Sala sala = new Sala();
                    List<Sala> lista = jpaControl.FiltroSala(valores);
                    sala = lista.get(0);
                    try {
                        jpaControl.destroy(sala.getSalaId());

                        JOptionPane.showMessageDialog(null, "Deletado com sucesso");
                    } catch (NonexistentEntityException ex) {
                        JOptionPane.showMessageDialog(null, "ERRO: A sala nao existe no baco de dados");
                    }

                    //Adicionar refresh na tabela.
                    break;
                case "Turma":
                    ControladorTurma jpaControlTurma = new ControladorTurma();
                    Turma turma = new Turma();
                    List<Turma> listarTurma = jpaControlTurma.FiltroTurma(valores);
                    turma = listarTurma.get(0);
                    try {
                        jpaControlTurma.destroy(turma.getTurmaId());
                        JOptionPane.showMessageDialog(null, "Deletado com sucesso");
                    } catch (NonexistentEntityException ex) {
                        JOptionPane.showMessageDialog(null, "ERRO: A Turma nao existe no baco de dados");
                    }
                    break;
                case "Horário":

                    break;

            }

        }
    }
}

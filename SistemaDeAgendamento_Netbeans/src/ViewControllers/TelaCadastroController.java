package ViewControllers;

import DAO.Controladores.ControladorDisciplina;
import DAO.Controladores.ControladorHorario;
import DAO.Controladores.ControladorProfessor;
import DAO.Controladores.ControladorSala;
import DAO.Controladores.ControladorTurma;
import DAO.exceptions.NonexistentEntityException;
import Entidades.Disciplina;
import Entidades.Horario;
import Entidades.Professor;
import Entidades.Sala;
import Entidades.Turma;
import View.TelaEditarDisciplinas;
import View.TelaEditarHorario;
import View.TelaEditarProfessor;
import View.TelaEditarSala;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
                informColuna = new Object[5];

                ControladorSala salaControl = new ControladorSala();
                List<Sala> sal = salaControl.selectSalas();

                for (Sala sala : sal) {
                    informColuna[0] = sala.getSalaCodigo();
                    informColuna[1] = sala.getSalaNumAluno();
                    informColuna[2] = sala.getSalaLocalizacao();
                    if (sala.getSalaLaboratorio()) {
                        informColuna[3] = "Sim";
                    } else {
                        informColuna[3] = "Não";
                    }
                    informColuna[4] = sala.getSalaObservacao();

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

    public void iconesDinamicos(JTable tabela) throws ParseException {

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
                visualizarDados(tabela);
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
    public void editarDados(JTable tabela) throws ParseException {
        String tabelaUsada = tabela.getModel().getColumnName(0);
        int valor = tabela.getSelectedRow();
        String valores = tabela.getValueAt(valor, 0).toString();
        switch (tabelaUsada) {
            case "Identificação":
                TelaEditarDisciplinas telaEditarDisciplina = new TelaEditarDisciplinas(null, true, tabela);
                telaEditarDisciplina.editar(valores);
                telaEditarDisciplina.setVisible(true);
                break;
            case "Professor":
                TelaEditarProfessor telaEditarProfessor = new TelaEditarProfessor(null, true, tabela);
                telaEditarProfessor.editar(valores);
                telaEditarProfessor.setVisible(true);
                break;

            case "Sala":
                TelaEditarSala telaeditarsalas = new TelaEditarSala(null, true, tabela);
                telaeditarsalas.editar(valores);
                telaeditarsalas.setVisible(true);
                
                break;
            case "Turma":
                TelaEditarTurmas telaeditarturmas = new TelaEditarTurmas(null, true, tabela);
                telaeditarturmas.editarTurma(valores);
                telaeditarturmas.setVisible(true);
                break;
            case "Horário":
                TelaEditarHorario telaVizualizarHorario = new TelaEditarHorario(null, true, tabela);
                telaVizualizarHorario.editar(valores);
                telaVizualizarHorario.setVisible(true);
                
                break;
        }
    }

    public void visualizarDados(JTable tabela) throws ParseException {
        String tabelaUsada = tabela.getModel().getColumnName(0);
        int valor = tabela.getSelectedRow();
        String valores = tabela.getValueAt(valor, 0).toString();
        switch (tabelaUsada) {
            case "Identificação":
                TelaEditarDisciplinas telaEditarDisciplina2 = new TelaEditarDisciplinas(null, true, tabela);
                telaEditarDisciplina2.mostrarDados(valores);
                telaEditarDisciplina2.setVisible(true);
                break;
            case "Professor":
                TelaEditarProfessor telaEditarProfessor2 = new TelaEditarProfessor(null, true, tabela);
                telaEditarProfessor2.mostrarDados(valores);
                telaEditarProfessor2.setVisible(true);
                break;

            case "Sala":
                TelaEditarSala telaeditarsalas2 = new TelaEditarSala(null, true, tabela);
                telaeditarsalas2.mostrarDados(valores);
                telaeditarsalas2.setVisible(true);
                
                break;
            case "Turma":
                TelaEditarTurmas telaeditarturmas2 = new TelaEditarTurmas(null, true, tabela);
                telaeditarturmas2.mostrarDados(valores);
                telaeditarturmas2.setVisible(true);
                break;
            case "Horário":
                TelaEditarHorario telaVizualizarHorario = new TelaEditarHorario(null, true, tabela);
                telaVizualizarHorario.mostrarDados(valores);
                telaVizualizarHorario.setVisible(true);
                break;
        }
    }

    public void excluirDados(JTable tabela) throws ParseException {

        String tabelaUsada = tabela.getModel().getColumnName(0);

        int valor = tabela.getSelectedRow();
        String valores = tabela.getValueAt(valor, 0).toString();
        int resposta = JOptionPane.showConfirmDialog(null, "Você esta deletando " + valores + ", Tem certeza disso?", "AVISO", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {

            switch (tabelaUsada) {

                case "Identificação":
                    ControladorDisciplina controlDisciplina = new ControladorDisciplina();
                    List<Disciplina> listaDisciplina = controlDisciplina.FiltroDisciplina(valores);
                    try {
                        controlDisciplina.destroy(listaDisciplina.get(0).getDisciplinaId());
                        this.refreshTable(tabela, 0);
                        
                        
                        JOptionPane.showMessageDialog(null, "Deletado com sucesso");
                    } catch (NonexistentEntityException ex) {
                        JOptionPane.showMessageDialog(null, "ERRO: A disciplina nao existe no baco de dados");
                    }                  
                                      
                    break;
                case "Professor":
                    ControladorProfessor controlProfessor = new ControladorProfessor();
                    List<Professor> listaProfessor = controlProfessor.FiltroProfessor(valores);
                    try {
                        controlProfessor.destroy(listaProfessor.get(0).getProfessorId());

                        JOptionPane.showMessageDialog(null, "Deletado com sucesso");
                    } catch (NonexistentEntityException ex) {
                        JOptionPane.showMessageDialog(null, "ERRO: O professor nao existe no baco de dados");
                    }                  
                    
                    this.refreshTable(tabela, 1);
                    break;

                case "Sala":
                    ControladorSala controlSala = new ControladorSala();
                    List<Sala> listaSala = controlSala.FiltroSala(valores);
                    try {
                        controlSala.destroy(listaSala.get(0).getSalaId());

                        JOptionPane.showMessageDialog(null, "Deletado com sucesso");
                    } catch (NonexistentEntityException ex) {
                        JOptionPane.showMessageDialog(null, "ERRO: A sala nao existe no baco de dados");
                    }

                    this.refreshTable(tabela, 2);
                    break;
                case "Turma":

                    ControladorTurma controlTurma = new ControladorTurma();
                    List<Turma> listaTurma = controlTurma.FiltroTurma(valores);
                    try {
                        controlTurma.destroy(listaTurma.get(0).getTurmaId());

                        JOptionPane.showMessageDialog(null, "Deletado com sucesso");
                    } catch (NonexistentEntityException ex) {
                        JOptionPane.showMessageDialog(null, "ERRO: A turma nao existe no baco de dados");
                    }                  
                    
                    this.refreshTable(tabela, 3);
                    
                    break;
                case "Horário":
                    Date hora = (Date) new SimpleDateFormat("HH:mm").parse( tabela.getModel().getValueAt(valor, 0).toString().substring(0, 5));
                    ControladorHorario controlHorario = new ControladorHorario();
                    List<Horario> listaHorario = controlHorario.FiltroHora(hora);
                    
                    try {
                        controlHorario.destroy(listaHorario.get(0).getHorarioId());

                        JOptionPane.showMessageDialog(null, "Deletado com sucesso");
                    } catch (NonexistentEntityException ex) {
                        JOptionPane.showMessageDialog(null, "ERRO: A turma nao existe no baco de dados");
                    }                  
                    
                    this.refreshTable(tabela, 4);
                    
                    break;

            }

        }
    }
    
    public void refreshTable(JTable tabela, int guiaEscolhida){
        
        DefaultTableModel modeloTabela = (DefaultTableModel) tabela.getModel();
        while (modeloTabela.getRowCount() > 0){
            modeloTabela.removeRow(0);
        }
            
        this.guiaClicada(guiaEscolhida, modeloTabela);
    }
}

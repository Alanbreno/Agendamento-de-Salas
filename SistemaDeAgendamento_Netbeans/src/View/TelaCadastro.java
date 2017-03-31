/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.DisciplinaJpaController;
import Entidades.Disciplina;
import java.sql.DriverManager;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alan Breno
 */
public class TelaCadastro extends javax.swing.JFrame {
    
    /**
     * Creates new form TelaCadastro
     */
    public TelaCadastro(int indiceDoJTabbed) {
        initComponents();
        painelComGuiasCadastro.setSelectedIndex(indiceDoJTabbed);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotaoHora = new javax.swing.ButtonGroup();
        painelComGuiasCadastro = new javax.swing.JTabbedPane();
        painelDisciplina = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDisciplina = new javax.swing.JTable();
        botaoAdicionarDisciplina = new javax.swing.JButton();
        painelProfessor = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaProfessores = new javax.swing.JTable();
        botaoAdicionarProfessor = new javax.swing.JButton();
        painelSala = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaSalas = new javax.swing.JTable();
        botaoAdicionarSala = new javax.swing.JButton();
        painelTurma = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaTurma = new javax.swing.JTable();
        botaoAdicionarTurma = new javax.swing.JButton();
        painelHorario = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabelaHorarios = new javax.swing.JTable();
        botaoAdicionarHorarios = new javax.swing.JButton();
        botaoRadio12h = new javax.swing.JRadioButton();
        botaoRadio24h = new javax.swing.JRadioButton();
        menuBarra = new javax.swing.JMenuBar();
        menuTabela = new javax.swing.JMenu();
        menuTabelaNovoProjeto = new javax.swing.JMenuItem();
        menuTabelaAbrirArquivo = new javax.swing.JMenuItem();
        menuTabelaProjetosRecentes = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuTabelaSalvarProjeto = new javax.swing.JMenuItem();
        menuTabelaSalvarProjetoComo = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuTabelaExportar = new javax.swing.JMenuItem();
        menuTabelaSair = new javax.swing.JMenuItem();
        menuCadastro = new javax.swing.JMenu();
        menuCadastroProfessores = new javax.swing.JMenuItem();
        menuCadastroDisciplina = new javax.swing.JMenuItem();
        menuCadastroSalas = new javax.swing.JMenuItem();
        menuCadastroTurmas = new javax.swing.JMenuItem();
        menuCadastroHorarios = new javax.swing.JMenuItem();
        menuGestao = new javax.swing.JMenu();
        menuGestaoTurma = new javax.swing.JMenuItem();
        menuGestaoSala = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        menuAjudaDocumentacao = new javax.swing.JMenuItem();
        menuAjudaAtalhos = new javax.swing.JMenuItem();
        menuAjudaExemploDeTabela = new javax.swing.JMenuItem();
        menuAjudaSobreNos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro");
        setExtendedState(6);
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setPreferredSize(new java.awt.Dimension(1024, 768));

        painelComGuiasCadastro.setPreferredSize(new java.awt.Dimension(100, 600));
        painelComGuiasCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelComGuiasCadastroMouseClicked(evt);
            }
        });

        painelDisciplina.setPreferredSize(new java.awt.Dimension(800, 600));

        tabelaDisciplina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Disciplina", "Semestre", "Carga Horária", "N° de Alunos", "Subturmas"
            }
        ));
        jScrollPane1.setViewportView(tabelaDisciplina);
        if (tabelaDisciplina.getColumnModel().getColumnCount() > 0) {
            tabelaDisciplina.getColumnModel().getColumn(0).setPreferredWidth(250);
            tabelaDisciplina.getColumnModel().getColumn(1).setPreferredWidth(100);
            tabelaDisciplina.getColumnModel().getColumn(2).setPreferredWidth(100);
            tabelaDisciplina.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        botaoAdicionarDisciplina.setText("Adicionar disciplina");
        botaoAdicionarDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarDisciplinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelDisciplinaLayout = new javax.swing.GroupLayout(painelDisciplina);
        painelDisciplina.setLayout(painelDisciplinaLayout);
        painelDisciplinaLayout.setHorizontalGroup(
            painelDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDisciplinaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDisciplinaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoAdicionarDisciplina)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelDisciplinaLayout.setVerticalGroup(
            painelDisciplinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDisciplinaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoAdicionarDisciplina)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelComGuiasCadastro.addTab("Disciplina", new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone_cadastro.png")), painelDisciplina); // NOI18N

        painelProfessor.setPreferredSize(new java.awt.Dimension(795, 575));

        tabelaProfessores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Professor", "Título", "Área de conhecimento", "Carga horária cumprida"
            }
        ));
        jScrollPane2.setViewportView(tabelaProfessores);
        if (tabelaProfessores.getColumnModel().getColumnCount() > 0) {
            tabelaProfessores.getColumnModel().getColumn(1).setPreferredWidth(150);
            tabelaProfessores.getColumnModel().getColumn(2).setPreferredWidth(80);
        }

        botaoAdicionarProfessor.setText("Adicionar profesor");
        botaoAdicionarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarProfessorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelProfessorLayout = new javax.swing.GroupLayout(painelProfessor);
        painelProfessor.setLayout(painelProfessorLayout);
        painelProfessorLayout.setHorizontalGroup(
            painelProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelProfessorLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(painelProfessorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoAdicionarProfessor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelProfessorLayout.setVerticalGroup(
            painelProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelProfessorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoAdicionarProfessor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelComGuiasCadastro.addTab("Professor", new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone_professor.png")), painelProfessor); // NOI18N

        tabelaSalas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sala", "Capacidade", "bloco", "Observação"
            }
        ));
        jScrollPane3.setViewportView(tabelaSalas);
        if (tabelaSalas.getColumnModel().getColumnCount() > 0) {
            tabelaSalas.getColumnModel().getColumn(1).setPreferredWidth(150);
            tabelaSalas.getColumnModel().getColumn(2).setPreferredWidth(80);
        }

        botaoAdicionarSala.setText("Adicionar sala");
        botaoAdicionarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarSalaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelSalaLayout = new javax.swing.GroupLayout(painelSala);
        painelSala.setLayout(painelSalaLayout);
        painelSalaLayout.setHorizontalGroup(
            painelSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSalaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(painelSalaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoAdicionarSala)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelSalaLayout.setVerticalGroup(
            painelSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSalaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoAdicionarSala)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelComGuiasCadastro.addTab("Sala", new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone_sala.png")), painelSala); // NOI18N

        tabelaTurma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Turma", "Semestre", "N° de alunos", "Status"
            }
        ));
        jScrollPane4.setViewportView(tabelaTurma);
        if (tabelaTurma.getColumnModel().getColumnCount() > 0) {
            tabelaTurma.getColumnModel().getColumn(1).setPreferredWidth(150);
            tabelaTurma.getColumnModel().getColumn(1).setHeaderValue("Semestre");
            tabelaTurma.getColumnModel().getColumn(2).setPreferredWidth(80);
            tabelaTurma.getColumnModel().getColumn(2).setHeaderValue("N° de alunos");
            tabelaTurma.getColumnModel().getColumn(3).setHeaderValue("Status");
        }

        botaoAdicionarTurma.setText("Adicionar turma");
        botaoAdicionarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarTurmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelTurmaLayout = new javax.swing.GroupLayout(painelTurma);
        painelTurma.setLayout(painelTurmaLayout);
        painelTurmaLayout.setHorizontalGroup(
            painelTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTurmaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(painelTurmaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoAdicionarTurma)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelTurmaLayout.setVerticalGroup(
            painelTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTurmaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoAdicionarTurma)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelComGuiasCadastro.addTab("Turma", new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone_turma.png")), painelTurma); // NOI18N

        tabelaHorarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Horário"
            }
        ));
        jScrollPane5.setViewportView(tabelaHorarios);

        botaoAdicionarHorarios.setText("Adicionar horário");
        botaoAdicionarHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarHorariosActionPerformed(evt);
            }
        });

        grupoBotaoHora.add(botaoRadio12h);
        botaoRadio12h.setText("12h");

        grupoBotaoHora.add(botaoRadio24h);
        botaoRadio24h.setText("24h");

        javax.swing.GroupLayout painelHorarioLayout = new javax.swing.GroupLayout(painelHorario);
        painelHorario.setLayout(painelHorarioLayout);
        painelHorarioLayout.setHorizontalGroup(
            painelHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelHorarioLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(painelHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelHorarioLayout.createSequentialGroup()
                        .addComponent(botaoRadio12h)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoRadio24h)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 320, Short.MAX_VALUE)
                        .addComponent(botaoAdicionarHorarios)
                        .addContainerGap(422, Short.MAX_VALUE))
                    .addGroup(painelHorarioLayout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
                        .addGap(10, 10, 10))))
        );
        painelHorarioLayout.setVerticalGroup(
            painelHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelHorarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoAdicionarHorarios)
                    .addComponent(botaoRadio12h)
                    .addComponent(botaoRadio24h))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelComGuiasCadastro.addTab("Horário", new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone_relogio.png")), painelHorario); // NOI18N

        menuTabela.setText("Tabela");

        menuTabelaNovoProjeto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menuTabelaNovoProjeto.setText("Novo Projeto");
        menuTabelaNovoProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTabelaNovoProjetoActionPerformed(evt);
            }
        });
        menuTabela.add(menuTabelaNovoProjeto);

        menuTabelaAbrirArquivo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        menuTabelaAbrirArquivo.setText("Abrir Arquivo");
        menuTabelaAbrirArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTabelaAbrirArquivoActionPerformed(evt);
            }
        });
        menuTabela.add(menuTabelaAbrirArquivo);

        menuTabelaProjetosRecentes.setText("Projetos Recentes");
        menuTabela.add(menuTabelaProjetosRecentes);
        menuTabela.add(jSeparator1);

        menuTabelaSalvarProjeto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuTabelaSalvarProjeto.setText("Salvar Projeto");
        menuTabela.add(menuTabelaSalvarProjeto);

        menuTabelaSalvarProjetoComo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuTabelaSalvarProjetoComo.setText("Salvar Projeto Como");
        menuTabelaSalvarProjetoComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTabelaSalvarProjetoComoActionPerformed(evt);
            }
        });
        menuTabela.add(menuTabelaSalvarProjetoComo);
        menuTabela.add(jSeparator2);

        menuTabelaExportar.setText("Exportar");
        menuTabela.add(menuTabelaExportar);

        menuTabelaSair.setText("Sair");
        menuTabela.add(menuTabelaSair);

        menuBarra.add(menuTabela);

        menuCadastro.setText("Cadastro");

        menuCadastroProfessores.setText("Cadastro de Professores");
        menuCadastroProfessores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroProfessoresActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCadastroProfessores);

        menuCadastroDisciplina.setText("Cadastro de Disciplinas");
        menuCadastroDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroDisciplinaActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCadastroDisciplina);

        menuCadastroSalas.setText("Cadastro de Salas");
        menuCadastroSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroSalasActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCadastroSalas);

        menuCadastroTurmas.setText("Cadastro de Turmas");
        menuCadastroTurmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroTurmasActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCadastroTurmas);

        menuCadastroHorarios.setText("Cadastro de Horários");
        menuCadastroHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroHorariosActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCadastroHorarios);

        menuBarra.add(menuCadastro);

        menuGestao.setText("Gestão");

        menuGestaoTurma.setText("Turma");
        menuGestaoTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGestaoTurmaActionPerformed(evt);
            }
        });
        menuGestao.add(menuGestaoTurma);

        menuGestaoSala.setText("Sala");
        menuGestaoSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGestaoSalaActionPerformed(evt);
            }
        });
        menuGestao.add(menuGestaoSala);

        menuBarra.add(menuGestao);

        menuAjuda.setText("Ajuda");

        menuAjudaDocumentacao.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        menuAjudaDocumentacao.setText("Documentação");
        menuAjuda.add(menuAjudaDocumentacao);

        menuAjudaAtalhos.setText("Atalhos");
        menuAjuda.add(menuAjudaAtalhos);

        menuAjudaExemploDeTabela.setText("Exemplo de tabela");
        menuAjuda.add(menuAjudaExemploDeTabela);

        menuAjudaSobreNos.setText("Sobre ");
        menuAjuda.add(menuAjudaSobreNos);

        menuBarra.add(menuAjuda);

        setJMenuBar(menuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelComGuiasCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelComGuiasCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAdicionarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarProfessorActionPerformed
       
        TelaAdicionarProfessores telaAdicionarProfessores = new TelaAdicionarProfessores(this,true);
        telaAdicionarProfessores.setVisible(true);
        
    }//GEN-LAST:event_botaoAdicionarProfessorActionPerformed

    private void botaoAdicionarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarSalaActionPerformed
        
        TelaAdicionarSalas telaAdicionarSalas = new TelaAdicionarSalas(this,true);
        telaAdicionarSalas.setVisible(true);
        
    }//GEN-LAST:event_botaoAdicionarSalaActionPerformed

    private void botaoAdicionarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarTurmaActionPerformed
        
        TelaAdicionarTurmas telaAdicionarTurmas = new TelaAdicionarTurmas(this,true);
        telaAdicionarTurmas.setVisible(true);
        
    }//GEN-LAST:event_botaoAdicionarTurmaActionPerformed

    private void botaoAdicionarHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarHorariosActionPerformed
        
        TelaAdicionarHorarios telaAdicionarHorarios = new TelaAdicionarHorarios(this,true);
        telaAdicionarHorarios.setVisible(true);
        
    }//GEN-LAST:event_botaoAdicionarHorariosActionPerformed

    private void botaoAdicionarDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarDisciplinaActionPerformed
        //Realiza a troca de telas    
        TelaAdicionarDisciplinas telaAdicionar = new TelaAdicionarDisciplinas(this,true);
        telaAdicionar.setVisible(true);
        
    }//GEN-LAST:event_botaoAdicionarDisciplinaActionPerformed

    private void menuTabelaNovoProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTabelaNovoProjetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuTabelaNovoProjetoActionPerformed

    private void menuTabelaAbrirArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTabelaAbrirArquivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuTabelaAbrirArquivoActionPerformed

    private void menuTabelaSalvarProjetoComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTabelaSalvarProjetoComoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuTabelaSalvarProjetoComoActionPerformed

    private void menuCadastroProfessoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroProfessoresActionPerformed

        JFrame telaCadastro = new TelaCadastro(1);
        telaCadastro.setVisible(true);
        dispose();

    }//GEN-LAST:event_menuCadastroProfessoresActionPerformed

    private void menuCadastroDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroDisciplinaActionPerformed

        JFrame telaCadastro = new TelaCadastro(0);
        telaCadastro.setVisible(true);
        dispose(); 

    }//GEN-LAST:event_menuCadastroDisciplinaActionPerformed

    private void menuCadastroSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroSalasActionPerformed

        JFrame telaCadastro = new TelaCadastro(2);
        telaCadastro.setVisible(true);
        dispose();

    }//GEN-LAST:event_menuCadastroSalasActionPerformed

    private void menuCadastroTurmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroTurmasActionPerformed

        JFrame telaCadastro = new TelaCadastro(3);
        telaCadastro.setVisible(true);
        dispose();

    }//GEN-LAST:event_menuCadastroTurmasActionPerformed

    private void menuCadastroHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroHorariosActionPerformed

        JFrame telaCadastro = new TelaCadastro(4);
        telaCadastro.setVisible(true);
        dispose();

    }//GEN-LAST:event_menuCadastroHorariosActionPerformed

    private void menuGestaoTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGestaoTurmaActionPerformed

        TelaGestao telaGestao = new TelaGestao(0);
        telaGestao.setVisible(true);
        dispose();

    }//GEN-LAST:event_menuGestaoTurmaActionPerformed

    private void menuGestaoSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGestaoSalaActionPerformed

        TelaGestao telaGestao = new TelaGestao(1);
        telaGestao.setVisible(true);
        dispose();

    }//GEN-LAST:event_menuGestaoSalaActionPerformed

    private void painelComGuiasCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelComGuiasCadastroMouseClicked
        int numColunas = tabelaDisciplina.getColumnCount();
        Object informColuna[] = new Object[numColunas];
        DefaultTableModel model = (DefaultTableModel) tabelaDisciplina.getModel();
        
        //Acessa o banco de dados e seleciona todas as disciplinas
        DisciplinaJpaController discControl = new DisciplinaJpaController();
        List<Disciplina> disc = discControl.findDisciplinasOrdered();
        
        //Para cada disciplina, recebe informações e ao fim adiciona a nova linha
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
        
    }//GEN-LAST:event_painelComGuiasCadastroMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdicionarDisciplina;
    private javax.swing.JButton botaoAdicionarHorarios;
    private javax.swing.JButton botaoAdicionarProfessor;
    private javax.swing.JButton botaoAdicionarSala;
    private javax.swing.JButton botaoAdicionarTurma;
    private javax.swing.JRadioButton botaoRadio12h;
    private javax.swing.JRadioButton botaoRadio24h;
    private javax.swing.ButtonGroup grupoBotaoHora;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenuItem menuAjudaAtalhos;
    private javax.swing.JMenuItem menuAjudaDocumentacao;
    private javax.swing.JMenuItem menuAjudaExemploDeTabela;
    private javax.swing.JMenuItem menuAjudaSobreNos;
    private javax.swing.JMenuBar menuBarra;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem menuCadastroDisciplina;
    private javax.swing.JMenuItem menuCadastroHorarios;
    private javax.swing.JMenuItem menuCadastroProfessores;
    private javax.swing.JMenuItem menuCadastroSalas;
    private javax.swing.JMenuItem menuCadastroTurmas;
    private javax.swing.JMenu menuGestao;
    private javax.swing.JMenuItem menuGestaoSala;
    private javax.swing.JMenuItem menuGestaoTurma;
    private javax.swing.JMenu menuTabela;
    private javax.swing.JMenuItem menuTabelaAbrirArquivo;
    private javax.swing.JMenuItem menuTabelaExportar;
    private javax.swing.JMenuItem menuTabelaNovoProjeto;
    private javax.swing.JMenuItem menuTabelaProjetosRecentes;
    private javax.swing.JMenuItem menuTabelaSair;
    private javax.swing.JMenuItem menuTabelaSalvarProjeto;
    private javax.swing.JMenuItem menuTabelaSalvarProjetoComo;
    private javax.swing.JTabbedPane painelComGuiasCadastro;
    private javax.swing.JPanel painelDisciplina;
    private javax.swing.JPanel painelHorario;
    private javax.swing.JPanel painelProfessor;
    private javax.swing.JPanel painelSala;
    private javax.swing.JPanel painelTurma;
    private javax.swing.JTable tabelaDisciplina;
    private javax.swing.JTable tabelaHorarios;
    private javax.swing.JTable tabelaProfessores;
    private javax.swing.JTable tabelaSalas;
    private javax.swing.JTable tabelaTurma;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JFrame;

/**
 *
 * @author Alan Breno
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNomeDoPrograma1 = new javax.swing.JLabel();
        labelNomeDoPrograma2 = new javax.swing.JLabel();
        labelLogoDoPrograma = new javax.swing.JLabel();
        botaoNovoProjeto = new javax.swing.JButton();
        labelNovoProjeto = new javax.swing.JLabel();
        botaoAbrirProjeto = new javax.swing.JButton();
        labelAbrirProjeto = new javax.swing.JLabel();
        botaoVizualizarDisciplinas = new javax.swing.JButton();
        labelVizualizarDisciplinas = new javax.swing.JLabel();
        botaoVizualizarProfessores = new javax.swing.JButton();
        labelVizualizarProfessores = new javax.swing.JLabel();
        botaoGestaoDeSalas = new javax.swing.JButton();
        labelGestaoDeSalas = new javax.swing.JLabel();
        botaoCadastrar = new javax.swing.JButton();
        labelCadastrar = new javax.swing.JLabel();
        botaoGerarPDF = new javax.swing.JButton();
        labelGerarPDF = new javax.swing.JLabel();
        botaoGestaoDeTurmas = new javax.swing.JButton();
        labelGestaoDeTurmas = new javax.swing.JLabel();
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
        setTitle("Sistema de Alocação");
        setExtendedState(6);
        setMinimumSize(new java.awt.Dimension(1024, 768));

        labelNomeDoPrograma1.setBackground(new java.awt.Color(255, 255, 255));
        labelNomeDoPrograma1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 36)); // NOI18N
        labelNomeDoPrograma1.setForeground(new java.awt.Color(0, 51, 102));
        labelNomeDoPrograma1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelNomeDoPrograma1.setText("  Sistema de");
        labelNomeDoPrograma1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        labelNomeDoPrograma2.setBackground(new java.awt.Color(255, 255, 255));
        labelNomeDoPrograma2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 36)); // NOI18N
        labelNomeDoPrograma2.setForeground(new java.awt.Color(0, 51, 102));
        labelNomeDoPrograma2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelNomeDoPrograma2.setText("Agendamento");
        labelNomeDoPrograma2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        labelLogoDoPrograma.setBackground(new java.awt.Color(255, 255, 255));
        labelLogoDoPrograma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLogoDoPrograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone_logo.png"))); // NOI18N
        labelLogoDoPrograma.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        botaoNovoProjeto.setText("Novo Projeto");
        botaoNovoProjeto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        botaoNovoProjeto.setRolloverEnabled(false);
        botaoNovoProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoProjetoActionPerformed(evt);
            }
        });

        labelNovoProjeto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNovoProjeto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TelaPrincipal/icone_novo_projeto.png"))); // NOI18N
        labelNovoProjeto.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        labelNovoProjeto.setBorder(null);

        botaoAbrirProjeto.setText("Abrir Projeto");
        botaoAbrirProjeto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        botaoAbrirProjeto.setRolloverEnabled(false);
        botaoAbrirProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAbrirProjetoActionPerformed(evt);
            }
        });

        labelAbrirProjeto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAbrirProjeto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TelaPrincipal/icone_projeto.png"))); // NOI18N
        labelAbrirProjeto.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        labelAbrirProjeto.setBorder(null);
        labelAbrirProjeto.setPreferredSize(new java.awt.Dimension(54, 90));

        botaoVizualizarDisciplinas.setText("<html><center>Visualizar<br />Disciplinas<center/></html>");
        botaoVizualizarDisciplinas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        botaoVizualizarDisciplinas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoVizualizarDisciplinas.setRolloverEnabled(false);
        botaoVizualizarDisciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVizualizarDisciplinasActionPerformed(evt);
            }
        });

        labelVizualizarDisciplinas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVizualizarDisciplinas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TelaPrincipal/icone_visualizar_disciplinas.png"))); // NOI18N
        labelVizualizarDisciplinas.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        labelVizualizarDisciplinas.setBorder(null);
        labelVizualizarDisciplinas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labelVizualizarDisciplinas.setPreferredSize(new java.awt.Dimension(54, 90));

        botaoVizualizarProfessores.setText("<html><center>Visualizar<br />professores<center/></html>");
        botaoVizualizarProfessores.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        botaoVizualizarProfessores.setRolloverEnabled(false);
        botaoVizualizarProfessores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVizualizarProfessoresActionPerformed(evt);
            }
        });

        labelVizualizarProfessores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVizualizarProfessores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TelaPrincipal/icone_professor.png"))); // NOI18N
        labelVizualizarProfessores.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        labelVizualizarProfessores.setBorder(null);
        labelVizualizarProfessores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labelVizualizarProfessores.setPreferredSize(new java.awt.Dimension(54, 90));

        botaoGestaoDeSalas.setText("<html><center>Gestão<br />de salas<center/></html>");
        botaoGestaoDeSalas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        botaoGestaoDeSalas.setRolloverEnabled(false);
        botaoGestaoDeSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoGestaoDeSalasActionPerformed(evt);
            }
        });

        labelGestaoDeSalas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGestaoDeSalas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TelaPrincipal/icone_sala.png"))); // NOI18N
        labelGestaoDeSalas.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        labelGestaoDeSalas.setBorder(null);
        labelGestaoDeSalas.setPreferredSize(new java.awt.Dimension(54, 90));

        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        botaoCadastrar.setRolloverEnabled(false);
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        labelCadastrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TelaPrincipal/icone_cadastro.png"))); // NOI18N
        labelCadastrar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        labelCadastrar.setBorder(null);
        labelCadastrar.setPreferredSize(new java.awt.Dimension(54, 90));

        botaoGerarPDF.setText("Gerar PDF");
        botaoGerarPDF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        botaoGerarPDF.setRolloverEnabled(false);
        botaoGerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoGerarPDFActionPerformed(evt);
            }
        });

        labelGerarPDF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGerarPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TelaPrincipal/icone_pdf.png"))); // NOI18N
        labelGerarPDF.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        labelGerarPDF.setBorder(null);
        labelGerarPDF.setPreferredSize(new java.awt.Dimension(54, 90));

        botaoGestaoDeTurmas.setText("<html><center>Gestão<br />de turmas<center/></html>");
        botaoGestaoDeTurmas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        botaoGestaoDeTurmas.setRolloverEnabled(false);
        botaoGestaoDeTurmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoGestaoDeTurmasActionPerformed(evt);
            }
        });

        labelGestaoDeTurmas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGestaoDeTurmas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TelaPrincipal/icone_turma.png"))); // NOI18N
        labelGestaoDeTurmas.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        labelGestaoDeTurmas.setBorder(null);
        labelGestaoDeTurmas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labelGestaoDeTurmas.setPreferredSize(new java.awt.Dimension(54, 90));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoNovoProjeto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNovoProjeto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelVizualizarDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botaoVizualizarDisciplinas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(botaoAbrirProjeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelAbrirProjeto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelVizualizarProfessores, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoVizualizarProfessores, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelGestaoDeTurmas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoGestaoDeTurmas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(botaoGerarPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelGerarPDF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botaoGestaoDeSalas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelGestaoDeSalas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(labelLogoDoPrograma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelNomeDoPrograma1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelNomeDoPrograma2, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(labelNomeDoPrograma1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNomeDoPrograma2))
                    .addComponent(labelLogoDoPrograma))
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoNovoProjeto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNovoProjeto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoAbrirProjeto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAbrirProjeto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCadastrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCadastrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelGerarPDF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoGerarPDF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelVizualizarProfessores, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botaoVizualizarDisciplinas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelVizualizarDisciplinas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botaoVizualizarProfessores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(botaoGestaoDeSalas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelGestaoDeSalas, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelGestaoDeTurmas, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botaoGestaoDeTurmas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 66, 66))
        );

        setSize(new java.awt.Dimension(816, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuCadastroTurmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroTurmasActionPerformed
        
        JFrame telaCadastro = new TelaCadastro(3);
        telaCadastro.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_menuCadastroTurmasActionPerformed

    private void menuGestaoSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGestaoSalaActionPerformed
        
        TelaGestao telaGestao = new TelaGestao(1);
        telaGestao.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_menuGestaoSalaActionPerformed

    private void menuTabelaSalvarProjetoComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTabelaSalvarProjetoComoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuTabelaSalvarProjetoComoActionPerformed

    private void menuTabelaAbrirArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTabelaAbrirArquivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuTabelaAbrirArquivoActionPerformed

    private void menuTabelaNovoProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTabelaNovoProjetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuTabelaNovoProjetoActionPerformed

    private void botaoNovoProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoProjetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoNovoProjetoActionPerformed

    private void botaoAbrirProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAbrirProjetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoAbrirProjetoActionPerformed

    private void botaoVizualizarDisciplinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVizualizarDisciplinasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoVizualizarDisciplinasActionPerformed

    private void botaoVizualizarProfessoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVizualizarProfessoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoVizualizarProfessoresActionPerformed

    private void botaoGestaoDeSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoGestaoDeSalasActionPerformed
        
        TelaGestao telaGestao = new TelaGestao(1);
        telaGestao.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_botaoGestaoDeSalasActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        
        JFrame telaCadastro = new TelaCadastro(0);
        telaCadastro.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void botaoGerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoGerarPDFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoGerarPDFActionPerformed

    private void botaoGestaoDeTurmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoGestaoDeTurmasActionPerformed
        
        TelaGestao telaGestao = new TelaGestao(0);
        telaGestao.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_botaoGestaoDeTurmasActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAbrirProjeto;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoGerarPDF;
    private javax.swing.JButton botaoGestaoDeSalas;
    private javax.swing.JButton botaoGestaoDeTurmas;
    private javax.swing.JButton botaoNovoProjeto;
    private javax.swing.JButton botaoVizualizarDisciplinas;
    private javax.swing.JButton botaoVizualizarProfessores;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel labelAbrirProjeto;
    private javax.swing.JLabel labelCadastrar;
    private javax.swing.JLabel labelGerarPDF;
    private javax.swing.JLabel labelGestaoDeSalas;
    private javax.swing.JLabel labelGestaoDeTurmas;
    private javax.swing.JLabel labelLogoDoPrograma;
    private javax.swing.JLabel labelNomeDoPrograma1;
    private javax.swing.JLabel labelNomeDoPrograma2;
    private javax.swing.JLabel labelNovoProjeto;
    private javax.swing.JLabel labelVizualizarDisciplinas;
    private javax.swing.JLabel labelVizualizarProfessores;
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
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;

/**
 *
 * @author Alan Breno
 */
public class TelaGestao extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastro
     */
    
    private int contadorTelaTurma = 0;
    private int yTurma = 0;
    private int ySala = 0;
    private int contadorTelaSala = 0;
    
            
    public TelaGestao(int indicePainel) {
        initComponents();
        painelComGuiasGestao.setSelectedIndex(indicePainel);
        
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
        painelComGuiasGestao = new javax.swing.JTabbedPane();
        painelTurmas = new javax.swing.JPanel();
        painelScrollTurmas = new javax.swing.JScrollPane();
        painelTurmasScroll = new javax.swing.JPanel();
        botaoAdicionarTurma = new javax.swing.JButton();
        painelSalas = new javax.swing.JPanel();
        painelScrollSalas = new javax.swing.JScrollPane();
        painelSalasScroll = new javax.swing.JPanel();
        botaoAdicionarSalas = new javax.swing.JButton();
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

        painelComGuiasGestao.setPreferredSize(new java.awt.Dimension(100, 600));

        painelTurmas.setAlignmentX(1.0F);
        painelTurmas.setAutoscrolls(true);
        painelTurmas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        painelTurmas.setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout painelTurmasScrollLayout = new javax.swing.GroupLayout(painelTurmasScroll);
        painelTurmasScroll.setLayout(painelTurmasScrollLayout);
        painelTurmasScrollLayout.setHorizontalGroup(
            painelTurmasScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 793, Short.MAX_VALUE)
        );
        painelTurmasScrollLayout.setVerticalGroup(
            painelTurmasScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 523, Short.MAX_VALUE)
        );

        painelScrollTurmas.setViewportView(painelTurmasScroll);

        botaoAdicionarTurma.setText("Adicionar");
        botaoAdicionarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarTurmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelTurmasLayout = new javax.swing.GroupLayout(painelTurmas);
        painelTurmas.setLayout(painelTurmasLayout);
        painelTurmasLayout.setHorizontalGroup(
            painelTurmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelScrollTurmas)
            .addGroup(painelTurmasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoAdicionarTurma)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelTurmasLayout.setVerticalGroup(
            painelTurmasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTurmasLayout.createSequentialGroup()
                .addComponent(painelScrollTurmas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoAdicionarTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        painelComGuiasGestao.addTab("Turmas", new javax.swing.ImageIcon(getClass().getResource("/Imagens/Gestao/turma_32px.png")), painelTurmas); // NOI18N

        painelSalas.setPreferredSize(new java.awt.Dimension(795, 575));

        javax.swing.GroupLayout painelSalasScrollLayout = new javax.swing.GroupLayout(painelSalasScroll);
        painelSalasScroll.setLayout(painelSalasScrollLayout);
        painelSalasScrollLayout.setHorizontalGroup(
            painelSalasScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 793, Short.MAX_VALUE)
        );
        painelSalasScrollLayout.setVerticalGroup(
            painelSalasScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 523, Short.MAX_VALUE)
        );

        painelScrollSalas.setViewportView(painelSalasScroll);

        botaoAdicionarSalas.setText("Adicionar");
        botaoAdicionarSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarSalasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelSalasLayout = new javax.swing.GroupLayout(painelSalas);
        painelSalas.setLayout(painelSalasLayout);
        painelSalasLayout.setHorizontalGroup(
            painelSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelScrollSalas)
            .addGroup(painelSalasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoAdicionarSalas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelSalasLayout.setVerticalGroup(
            painelSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSalasLayout.createSequentialGroup()
                .addComponent(painelScrollSalas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoAdicionarSalas, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        painelComGuiasGestao.addTab("Salas", new javax.swing.ImageIcon(getClass().getResource("/Imagens/Gestao/sala_32px.png")), painelSalas); // NOI18N

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
            .addComponent(painelComGuiasGestao, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelComGuiasGestao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void botaoAdicionarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarTurmaActionPerformed
        int x;
        
        String[] colunas = {"", "", "", "",""};
        String[][] data = {
            {null, null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null}
        };
        JTable tabela = new JTable(data,colunas);

        tabela.setPreferredScrollableViewportSize(new Dimension(600,300));
        tabela.setFillsViewportHeight(true);
        tabela.setShowHorizontalLines(true);
        tabela.setShowVerticalLines(true);
        tabela.setShowGrid(true);
        
        JLabel jl = new JLabel();
        jl.setText("Turma/Semestre");
        
        
        
        if (contadorTelaTurma % 2 == 0){
            x = 20;
            yTurma = (contadorTelaTurma / 2) * 350 + 50;
           
        }else {
            x = 720;
        }
        
        painelTurmasScroll.setSize(painelTurmasScroll.getWidth(), painelTurmasScroll.getHeight() + 100);        
        painelTurmasScroll.setPreferredSize(new Dimension(painelTurmasScroll.getWidth(), painelTurmasScroll.getHeight() + 100));
        jl.setBounds(x + 3, yTurma - 20, 620, 20);
        jl.setOpaque(true);
        jl.setBackground(Color.GRAY);
        jl.setHorizontalAlignment((int) JLabel.CENTER_ALIGNMENT);
        
        
        JScrollPane jps = new JScrollPane(tabela);
        jps.setBounds( x, yTurma, 625, 300);
        painelTurmasScroll.add(jps);
        painelTurmasScroll.add(jl);
        contadorTelaTurma++;
    }//GEN-LAST:event_botaoAdicionarTurmaActionPerformed

    private void botaoAdicionarSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarSalasActionPerformed
        int x;
        
        String[] colunas = {"", "", "", "",""};
        String[][] data = {
            {null, null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null}
        };
        JTable tabela = new JTable(data,colunas);

        tabela.setPreferredScrollableViewportSize(new Dimension(600,300));
        tabela.setFillsViewportHeight(true);
        tabela.setShowHorizontalLines(true);
        tabela.setShowVerticalLines(true);
        tabela.setShowGrid(true);
        
        JLabel jl = new JLabel();
        jl.setText("Sala");
        
        
        
        if (contadorTelaSala % 2 == 0){
            x = 20;
            ySala = (contadorTelaSala / 2) * 350 + 50;
           
        }else {
            x = 720;
        }
        
        painelSalasScroll.setSize(painelSalasScroll.getWidth(), painelSalasScroll.getHeight() + 100);        
        painelSalasScroll.setPreferredSize(new Dimension(painelSalasScroll.getWidth(), painelSalasScroll.getHeight() + 100));
        jl.setBounds(x + 3, ySala - 20, 620, 20);
        jl.setOpaque(true);
        jl.setBackground(Color.GRAY);
        jl.setHorizontalAlignment((int) JLabel.CENTER_ALIGNMENT);
        
        
        JScrollPane jps = new JScrollPane(tabela);
        jps.setBounds( x, ySala, 625, 300);
        painelSalasScroll.add(jps);
        painelSalasScroll.add(jl);
        contadorTelaSala++;
    }//GEN-LAST:event_botaoAdicionarSalasActionPerformed

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
            java.util.logging.Logger.getLogger(TelaGestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGestao(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdicionarSalas;
    private javax.swing.JButton botaoAdicionarTurma;
    private javax.swing.ButtonGroup grupoBotaoHora;
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
    private javax.swing.JTabbedPane painelComGuiasGestao;
    private javax.swing.JPanel painelSalas;
    private javax.swing.JPanel painelSalasScroll;
    private javax.swing.JScrollPane painelScrollSalas;
    private javax.swing.JScrollPane painelScrollTurmas;
    private javax.swing.JPanel painelTurmas;
    private javax.swing.JPanel painelTurmasScroll;
    // End of variables declaration//GEN-END:variables

    private static class BorderImpl implements Border {

        public BorderImpl() {
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Insets getBorderInsets(Component c) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public boolean isBorderOpaque() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.ProfessorJpaController;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Alan Breno
 */
public class TelaAdicionarProfessores extends javax.swing.JDialog {

    /**
     * Creates new form TelaAdicionarProfessores
     */
    public TelaAdicionarProfessores(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        grupoBotoesCargaHoraria = new javax.swing.ButtonGroup();
        painelAdicionarProfessores = new javax.swing.JPanel();
        labelInformacoes = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        labelEspecializacao = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        txtEspecializacao = new javax.swing.JTextField();
        botaoCancelar = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        labelCargaHoraria = new javax.swing.JLabel();
        txtCargaHoraria = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar Professores");
        setResizable(false);

        labelInformacoes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelInformacoes.setText("Adicionar novo Professor");

        labelNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNome.setText("Nome");

        labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTitulo.setText("Título");

        labelEspecializacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelEspecializacao.setText("Especialização");

        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        labelCargaHoraria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelCargaHoraria.setText("Carga horária");

        txtCargaHoraria.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout painelAdicionarProfessoresLayout = new javax.swing.GroupLayout(painelAdicionarProfessores);
        painelAdicionarProfessores.setLayout(painelAdicionarProfessoresLayout);
        painelAdicionarProfessoresLayout.setHorizontalGroup(
            painelAdicionarProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAdicionarProfessoresLayout.createSequentialGroup()
                .addGroup(painelAdicionarProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAdicionarProfessoresLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(painelAdicionarProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelAdicionarProfessoresLayout.createSequentialGroup()
                                .addComponent(botaoCancelar)
                                .addGap(99, 99, 99)
                                .addComponent(botaoSalvar))
                            .addGroup(painelAdicionarProfessoresLayout.createSequentialGroup()
                                .addGroup(painelAdicionarProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelEspecializacao)
                                    .addComponent(labelTitulo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelNome, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelCargaHoraria))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelAdicionarProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(txtTitulo)
                                    .addComponent(txtEspecializacao)
                                    .addComponent(txtCargaHoraria)))))
                    .addGroup(painelAdicionarProfessoresLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(labelInformacoes)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        painelAdicionarProfessoresLayout.setVerticalGroup(
            painelAdicionarProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAdicionarProfessoresLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(labelInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(painelAdicionarProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelAdicionarProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTitulo)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelAdicionarProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEspecializacao)
                    .addComponent(txtEspecializacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelAdicionarProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCargaHoraria)
                    .addComponent(txtCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(painelAdicionarProfessoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCancelar)
                    .addComponent(botaoSalvar))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelAdicionarProfessores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelAdicionarProfessores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        
        if (!"".equals(txtNome.getText()) && !"".equals(txtTitulo.getText()) && !"".equals(txtEspecializacao.getText()) && !"".equals(txtCargaHoraria.getText() ) ){
            Entidades.Professor p = new Entidades.Professor();
            p.setProfessorNome(txtNome.getText());
            p.setProfessorTitulo(txtTitulo.getText());
            p.setProfessorEspecializacao(txtEspecializacao.getText());
            p.setProfessorCargaHoraria((short) Integer.parseInt(txtCargaHoraria.getText()));
            p.setProfessorStatus(false);
            
            ProfessorJpaController j = new ProfessorJpaController();
            j.create(p);

            txtNome.setText("");
            txtTitulo.setText("");
            txtEspecializacao.setText("");
            txtCargaHoraria.setText("");
 
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null, "Erro - Preencha todos os campos!");
        } 
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAdicionarProfessores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionarProfessores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionarProfessores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionarProfessores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaAdicionarProfessores dialog = new TelaAdicionarProfessores(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.ButtonGroup grupoBotoesCargaHoraria;
    private javax.swing.JLabel labelCargaHoraria;
    private javax.swing.JLabel labelEspecializacao;
    private javax.swing.JLabel labelInformacoes;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel painelAdicionarProfessores;
    private javax.swing.JFormattedTextField txtCargaHoraria;
    private javax.swing.JTextField txtEspecializacao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}

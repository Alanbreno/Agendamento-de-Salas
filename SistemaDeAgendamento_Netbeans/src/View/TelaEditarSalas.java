/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.SalaJpaController;
import Entidades.Sala;
import ViewControllers.TelaCadastroController;
import com.sun.jmx.snmp.SnmpDataTypeEnums;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sedepti
 */
public class TelaEditarSalas extends javax.swing.JFrame {
DefaultTableModel modeloTabela;
TelaCadastroController control = new TelaCadastroController();    
/**
     * Creates new form TelaEditarSalas
     */
    public TelaEditarSalas(java.awt.Frame parent, boolean modal) {
        
        initComponents();
        txtId.setVisible(false);
        
        
    }
public void editar(String  valores){
        SalaJpaController j = new SalaJpaController();
        String sala = valores;
         Entidades.Sala  p = new Entidades.Sala();
         
        List<Sala> a = j.FiltroSala(sala);
         p = a.get(1);
        
         txtNome.setText(p.getSalaCodigo());
         txtCapacidade.setText(String.valueOf(p.getSalaNumAluno()));
         txtBloco.setText(p.getSalaLocalizacao());
         txtObservação.setText(p.getSalaObservacao());
       txtId.setText(p.getSalaId().toString());
}
    

  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoCancelar = new javax.swing.JButton();
        botãoSalvar = new javax.swing.JButton();
        labelInformações = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCapacidade = new javax.swing.JTextField();
        txtBloco = new javax.swing.JTextField();
        txtObservação = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        botãoSalvar.setText("Salvar");
        botãoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botãoSalvarActionPerformed(evt);
            }
        });

        labelInformações.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelInformações.setText("Informações Sala");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtObservação.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtObservaçãoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nome");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Capacidade");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Bloco");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Observação");

        txtId.setEditable(false);
        txtId.setEnabled(false);
        txtId.setOpaque(false);
        txtId.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                txtIdComponentHidden(evt);
            }
        });
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(labelInformações)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                    .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCapacidade, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtBloco, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtObservação, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(botaoCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(botãoSalvar)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(labelInformações)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBloco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtObservação, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCancelar)
                    .addComponent(botãoSalvar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtObservaçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtObservaçãoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtObservaçãoActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botãoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botãoSalvarActionPerformed
       if (!"".equals(txtNome.getText()) && !"".equals(txtBloco.getText()) && !"".equals(txtCapacidade.getText()) && !"".equals(txtObservação.getText())){
            Entidades.Sala s = new Entidades.Sala();
            
           
            
//faltou o campo bloco
            SalaJpaController j = new SalaJpaController();
            
            s = j.findSala(Integer.parseInt(txtId.getText()));
         
         
         //  s.setSalaId(Integer.parseInt(txtId.getText()));
             s.setSalaNumAluno((short)Integer.parseInt(txtCapacidade.getText()));
            s.setSalaObservacao(txtObservação.getText());
            s.setSalaCodigo(txtNome.getText());
            s.setSalaLocalizacao(txtBloco.getText());
           // s.setSalaId(Integer.parseInt(txtId.getText()));
            
           try {
               j.edit(s);
                txtCapacidade.setText("");
            txtNome.setText("");
            txtBloco.setText("");
            txtObservação.setText("");
            txtId.setText("");
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
           } catch (Exception ex) {
               Logger.getLogger(TelaEditarSalas.class.getName()).log(Level.SEVERE, null, ex);
           }

           
        } 
            
         
         
    }//GEN-LAST:event_botãoSalvarActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtIdComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_txtIdComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdComponentHidden

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
            java.util.logging.Logger.getLogger(TelaEditarSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEditarSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEditarSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEditarSalas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaEditarSalas dialog = new TelaEditarSalas(new javax.swing.JFrame(), true  );
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
    private javax.swing.JButton botãoSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelInformações;
    private javax.swing.JTextField txtBloco;
    private javax.swing.JTextField txtCapacidade;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtObservação;
    // End of variables declaration//GEN-END:variables
}

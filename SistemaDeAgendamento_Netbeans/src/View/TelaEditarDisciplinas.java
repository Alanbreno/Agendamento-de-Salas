/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.Controladores.ControladorDisciplina;
import DAO.DisciplinaJpaController;
import DAO.SalaJpaController;
import Entidades.Disciplina;
import Entidades.Sala;
import ViewControllers.TelaCadastroController;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sedepti
 */
public class TelaEditarDisciplinas extends javax.swing.JFrame {

    DefaultTableModel modeloTabela;
    JTable tabela1;
    TelaCadastroController control = new TelaCadastroController();
    

    /**
     * Creates new form TelaEditarSalas
     */
    public TelaEditarDisciplinas(java.awt.Frame parent, boolean modal, JTable tabela) {

        initComponents();
        txtId.setVisible(false);
        botaoFechar.setVisible(false);
        tabela1 = tabela;

    }

    private TelaEditarDisciplinas(JFrame jFrame, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void editar(String valores) {
        ControladorDisciplina j = new ControladorDisciplina();
        String sala = valores;
        Entidades.Disciplina p = new Entidades.Disciplina();

        List<Disciplina> a = j.FiltroDisciplina(sala);
        p = a.get(0);

        txtNome.setText(p.getDisciplinaNome());
        txtCodigo.setText(p.getDisciplinaCodigo());
        txtCargaHoraria.setText(String.valueOf(p.getDisciplinaCargaHoraria()));
        txtNumeroDeAlunos.setText(String.valueOf(p.getDisciplinaNumAluno()));
        txtSemestre.setText(String.valueOf(p.getDisciplinaSemestre()));
        
        txtId.setText(p.getDisciplinaId().toString());
        
        if(p.getDisciplinaSubTurma() == true){
            botaoRadioSim.setSelected(true);
        }else {
            botaoRadioNao.setSelected(true);
        }
    }
    
    public void mostrarDados(String valores){
        this.editar(valores);
        txtNome.setEditable(false);
        txtCodigo.setEditable(false);
        txtNumeroDeAlunos.setEditable(false);
        txtCargaHoraria.setEditable(false);
        txtSemestre.setEditable(false);
        
        botaoRadioSim.setEnabled(false);
        botaoRadioNao.setEnabled(false);
        
        botaoSalvar.setVisible(false);
        botaoCancelar.setVisible(false);
        botaoFechar.setVisible(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        botaoCancelar = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        labelInformações = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCargaHoraria = new javax.swing.JTextField();
        txtSemestre = new javax.swing.JTextField();
        txtNumeroDeAlunos = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        labelCargaHoraria = new javax.swing.JLabel();
        labelSemestre = new javax.swing.JLabel();
        labelNumeroDeAlunos = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        labelCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        labelSubTurma = new javax.swing.JLabel();
        botaoRadioSim = new javax.swing.JRadioButton();
        botaoRadioNao = new javax.swing.JRadioButton();
        botaoFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        labelInformações.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelInformações.setText("Informações Disciplina");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtSemestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSemestreActionPerformed(evt);
            }
        });

        txtNumeroDeAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroDeAlunosActionPerformed(evt);
            }
        });

        labelNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNome.setText("Nome");

        labelCargaHoraria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelCargaHoraria.setText("Carga Horária");

        labelSemestre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelSemestre.setText("Semestre");

        labelNumeroDeAlunos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNumeroDeAlunos.setText("Numero de Aluno");

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

        labelCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelCodigo.setText("Codigo");

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        labelSubTurma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelSubTurma.setText("Subturma");

        buttonGroup1.add(botaoRadioSim);
        botaoRadioSim.setText("Sim");

        buttonGroup1.add(botaoRadioNao);
        botaoRadioNao.setText("Não");

        botaoFechar.setText("Fechar");
        botaoFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCodigo)
                            .addComponent(labelSubTurma)
                            .addComponent(labelNome)
                            .addComponent(labelCargaHoraria)
                            .addComponent(labelSemestre)
                            .addComponent(labelNumeroDeAlunos))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtCargaHoraria, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtSemestre, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtNumeroDeAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoRadioSim)
                                .addGap(18, 18, 18)
                                .addComponent(botaoRadioNao))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(labelInformações))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoCancelar)
                                .addGap(18, 18, 18)
                                .addComponent(botaoSalvar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(botaoFechar)
                                .addGap(35, 35, 35)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(labelInformações)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelSemestre))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumeroDeAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNumeroDeAlunos)))
                    .addComponent(labelCargaHoraria))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCodigo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSubTurma)
                    .addComponent(botaoRadioSim)
                    .addComponent(botaoRadioNao))
                .addGap(18, 18, 18)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCancelar)
                    .addComponent(botaoSalvar))
                .addGap(2, 2, 2)
                .addComponent(botaoFechar)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtNumeroDeAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroDeAlunosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroDeAlunosActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        if (!"".equals(txtNome.getText()) && !"".equals(txtSemestre.getText()) && !"".equals(txtCargaHoraria.getText()) && !"".equals(txtNumeroDeAlunos.getText()) && !"".equals(txtCodigo.getText()) && (botaoRadioNao.isSelected() || botaoRadioSim.isSelected())) {
            Entidades.Disciplina s = new Entidades.Disciplina();


            ControladorDisciplina j = new ControladorDisciplina();

            s = j.findDisciplina(Integer.parseInt(txtId.getText()));

            
            s.setDisciplinaNome(txtNome.getText());
            s.setDisciplinaCodigo(txtCodigo.getText());
            s.setDisciplinaCargaHoraria((short)Integer.parseInt(txtCargaHoraria.getText()));
            s.setDisciplinaNumAluno((short)Integer.parseInt(txtNumeroDeAlunos.getText()));
            s.setDisciplinaSemestre((short)Integer.parseInt(txtSemestre.getText()));
            if(botaoRadioSim.isSelected()){
                s.setDisciplinaSubTurma(true);
            }else if (botaoRadioNao.isSelected()){
                s.setDisciplinaSubTurma(false);
            }
            
            try {
                j.edit(s);
                txtCargaHoraria.setText("");
                txtNome.setText("");
                txtSemestre.setText("");
                txtNumeroDeAlunos.setText("");
                txtId.setText("");
                txtCodigo.setText("");
                JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            } catch (Exception ex) {
                Logger.getLogger(TelaEditarDisciplinas.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            TelaCadastroController control = new TelaCadastroController();
            
       
            control.refreshTable(tabela1, 0);

        }


    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtIdComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_txtIdComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdComponentHidden

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtSemestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSemestreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSemestreActionPerformed

    private void botaoFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoFecharActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEditarDisciplinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEditarDisciplinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEditarDisciplinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEditarDisciplinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaEditarDisciplinas dialog = new TelaEditarDisciplinas(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton botaoFechar;
    private javax.swing.JRadioButton botaoRadioNao;
    private javax.swing.JRadioButton botaoRadioSim;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel labelCargaHoraria;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelInformações;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNumeroDeAlunos;
    private javax.swing.JLabel labelSemestre;
    private javax.swing.JLabel labelSubTurma;
    private javax.swing.JTextField txtCargaHoraria;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumeroDeAlunos;
    private javax.swing.JTextField txtSemestre;
    // End of variables declaration//GEN-END:variables
}

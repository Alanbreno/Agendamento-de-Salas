package View;

import DAO.Controladores.ControladorDisciplina;
import DAO.Controladores.ControladorTurma;
import Entidades.Disciplina;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JComboBox;

public class TelaAlocarDisciplinaEmTurma extends javax.swing.JDialog {

    private int yHorarios = 0;
    private ControladorTurma turmaControl = new ControladorTurma();
    private ControladorDisciplina discControl = new ControladorDisciplina();
            
    public TelaAlocarDisciplinaEmTurma(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        List<Disciplina> disc = discControl.selectDisciplinas();
        for(Disciplina disciplina : disc){
            botaoComboBox.addItem(disciplina.getDisciplinaNome());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        botaoAlocar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        botaoAdicionarDisciplina = new javax.swing.JButton();
        painelScrollDisciplina = new javax.swing.JScrollPane();
        painelComboBox = new javax.swing.JPanel();
        botaoComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Disciplina em turma");
        setPreferredSize(new java.awt.Dimension(415, 320));
        setResizable(false);

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Escolha a disciplina:");
        labelTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botaoAlocar.setText("Alocar");

        botaoCancelar.setText("Cancelar");

        botaoAdicionarDisciplina.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botaoAdicionarDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarDisciplinaActionPerformed(evt);
            }
        });

        painelScrollDisciplina.setPreferredSize(new java.awt.Dimension(277, 100));

        painelComboBox.setPreferredSize(new java.awt.Dimension(250, 90));

        javax.swing.GroupLayout painelComboBoxLayout = new javax.swing.GroupLayout(painelComboBox);
        painelComboBox.setLayout(painelComboBoxLayout);
        painelComboBoxLayout.setHorizontalGroup(
            painelComboBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelComboBoxLayout.createSequentialGroup()
                .addComponent(botaoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );
        painelComboBoxLayout.setVerticalGroup(
            painelComboBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelComboBoxLayout.createSequentialGroup()
                .addComponent(botaoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 106, Short.MAX_VALUE))
        );

        painelScrollDisciplina.setViewportView(painelComboBox);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(botaoCancelar)
                        .addGap(95, 95, 95)
                        .addComponent(botaoAlocar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(painelScrollDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(botaoAdicionarDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoAdicionarDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(painelScrollDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoCancelar)
                    .addComponent(botaoAlocar))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAdicionarDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarDisciplinaActionPerformed
        
        yHorarios += 32;
        String[] data = {"teste","teste","teste"};
        JComboBox box1 = new JComboBox(data);
        box1.setBounds(0,yHorarios,235,30);
        box1.setSelectedIndex(0);
        painelComboBox.add(box1);
        painelComboBox.setSize(painelComboBox.getWidth(), painelComboBox.getHeight() + 32);
        painelComboBox.setPreferredSize(new Dimension(painelComboBox.getWidth()-20, painelComboBox.getHeight() + 32));
        
    }//GEN-LAST:event_botaoAdicionarDisciplinaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAlocarDisciplinaEmTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAlocarDisciplinaEmTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAlocarDisciplinaEmTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAlocarDisciplinaEmTurma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaAlocarDisciplinaEmTurma dialog = new TelaAlocarDisciplinaEmTurma(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton botaoAdicionarDisciplina;
    private javax.swing.JButton botaoAlocar;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JComboBox<String> botaoComboBox;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel painelComboBox;
    private javax.swing.JScrollPane painelScrollDisciplina;
    // End of variables declaration//GEN-END:variables
}

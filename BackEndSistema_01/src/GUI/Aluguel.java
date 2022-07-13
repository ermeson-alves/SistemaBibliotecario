/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.util.ArrayList;
import main.ArrayListComboBoxModel;
import main.ConjuntoLeitores;

/**
 *
 * @author Guilherme
 */
public class Aluguel extends javax.swing.JFrame {

    /**
     * Creates new form Aluguel
     */
    public Aluguel() {
        initComponents();
    }
    ConjuntoLeitores leitores = ConjuntoLeitores.getInstance();
    ArrayList arraylist = leitores.getLeitores();
    ArrayListComboBoxModel modelLeitor = new ArrayListComboBoxModel(arraylist);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVoltarAluguel = new javax.swing.JButton();
        lblLeitor = new javax.swing.JLabel();
        lblAluguel = new javax.swing.JLabel();
        lblDevolucao = new javax.swing.JLabel();
        jComboBoxLeitor = new javax.swing.JComboBox<>();
        txtfDevolucao = new javax.swing.JTextField();
        txtfAluguel = new javax.swing.JTextField();
        btnEnviarAluguel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVoltarAluguel.setText("Voltar");
        btnVoltarAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarAluguelActionPerformed(evt);
            }
        });

        lblLeitor.setText("Leitor:");

        lblAluguel.setText("Data de Aluguel:");

        lblDevolucao.setText("Data de devolução:");

        jComboBoxLeitor.setModel(modelLeitor);
        jComboBoxLeitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLeitorActionPerformed(evt);
            }
        });

        txtfDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfDevolucaoActionPerformed(evt);
            }
        });

        btnEnviarAluguel.setText("Enviar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVoltarAluguel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAluguel)
                            .addComponent(lblDevolucao)
                            .addComponent(lblLeitor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtfAluguel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                .addComponent(txtfDevolucao, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(btnEnviarAluguel))
                            .addComponent(jComboBoxLeitor, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltarAluguel)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDevolucao)
                    .addComponent(txtfDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAluguel)
                    .addComponent(txtfAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLeitor)
                    .addComponent(jComboBoxLeitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(btnEnviarAluguel)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarAluguelActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnVoltarAluguelActionPerformed

    private void txtfDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfDevolucaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfDevolucaoActionPerformed

    private void jComboBoxLeitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLeitorActionPerformed
        jComboBoxLeitor.removeAllItems();
        for(int i=0; i<leitores.getLeitores().size(); i++){
            jComboBoxLeitor.addItem(leitores.getLeitores().get(i).toString());
        }
    }//GEN-LAST:event_jComboBoxLeitorActionPerformed

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
            java.util.logging.Logger.getLogger(Aluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aluguel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aluguel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviarAluguel;
    private javax.swing.JButton btnVoltarAluguel;
    private javax.swing.JComboBox<String> jComboBoxLeitor;
    private javax.swing.JLabel lblAluguel;
    private javax.swing.JLabel lblDevolucao;
    private javax.swing.JLabel lblLeitor;
    private javax.swing.JTextField txtfAluguel;
    private javax.swing.JTextField txtfDevolucao;
    // End of variables declaration//GEN-END:variables
}

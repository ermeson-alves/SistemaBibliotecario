/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.util.ArrayList;
import main.ArrayListComboBoxModelBiblioteca;
import main.ArrayListComboBoxModelBibliotecaAux;
import main.ArrayListComboBoxModelLeitor;
import main.Biblioteca;
import main.ConjuntoLeitores;
import main.Leitor;
import main.Copia;
import main.Obra;

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
    ArrayListComboBoxModelLeitor modelLeitor = new ArrayListComboBoxModelLeitor(arraylist);
    Biblioteca biblioteca = Biblioteca.getInstance();
    ArrayList arraylist1 = biblioteca.getArrayAuxiliar();
    ArrayListComboBoxModelBibliotecaAux model = new ArrayListComboBoxModelBibliotecaAux(arraylist1);
    ArrayList arraylist2 = biblioteca.getObras();
    ArrayListComboBoxModelBiblioteca model2 = new ArrayListComboBoxModelBiblioteca(arraylist);
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
        lblDevolucao = new javax.swing.JLabel();
        jComboBoxLeitor = new javax.swing.JComboBox<>();
        txtfDevolucao = new javax.swing.JTextField();
        btnEnviarAluguel = new javax.swing.JButton();
        jComboBoxLivro = new javax.swing.JComboBox<>();
        lblLivroAluguel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVoltarAluguel.setText("Voltar");
        btnVoltarAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarAluguelActionPerformed(evt);
            }
        });

        lblLeitor.setText("Leitor:");

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
        btnEnviarAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarAluguelActionPerformed(evt);
            }
        });

        jComboBoxLivro.setModel(model2);

        lblLivroAluguel.setText("Livro:");

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
                            .addComponent(lblDevolucao)
                            .addComponent(lblLeitor)
                            .addComponent(lblLivroAluguel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxLeitor, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(btnEnviarAluguel)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltarAluguel)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLivroAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDevolucao)
                    .addComponent(txtfDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxLeitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLeitor))
                .addGap(18, 18, 18)
                .addComponent(btnEnviarAluguel)
                .addContainerGap(75, Short.MAX_VALUE))
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
       /* jComboBoxLeitor.removeAllItems();
        for(int i=0; i<leitores.getLeitores().size(); i++){
            jComboBoxLeitor.addItem(leitores.getLeitores().get(i).toString());
        }*/
    }//GEN-LAST:event_jComboBoxLeitorActionPerformed

    private void btnEnviarAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarAluguelActionPerformed
        String prazoDevolucao = txtfDevolucao.getText();
        String leitor = jComboBoxLeitor.getSelectedItem().toString();
        int numeroLivro = jComboBoxLivro.getSelectedIndex();
        for(int i=0; i<biblioteca.getObras().size(); i++){
            if(numeroLivro == biblioteca.getObras().get(i).getCodigoObra()){
                biblioteca.getObras().get(i).alugarObra(leitor, prazoDevolucao);
            }
        }
        this.dispose();
    }//GEN-LAST:event_btnEnviarAluguelActionPerformed

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
    private javax.swing.JComboBox<String> jComboBoxLivro;
    private javax.swing.JLabel lblDevolucao;
    private javax.swing.JLabel lblLeitor;
    private javax.swing.JLabel lblLivroAluguel;
    private javax.swing.JTextField txtfDevolucao;
    // End of variables declaration//GEN-END:variables
}

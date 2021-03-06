/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula24.ex1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Rafael
 */
public class Inteiros extends javax.swing.JFrame {

    ArrayList<Integer> alInteiros = new ArrayList<Integer>();
    
    /**
     * Creates new form Inteiros
     */
    public Inteiros() {
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

        jLabel1 = new javax.swing.JLabel();
        tfNumeroEntrada = new javax.swing.JTextField();
        btInserir = new javax.swing.JButton();
        btCalcular = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfSoma = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfMedia = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Insira um número inteiro:");
        getContentPane().add(jLabel1);

        tfNumeroEntrada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(tfNumeroEntrada);

        btInserir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btInserir.setText("Inserir");
        btInserir.setMaximumSize(new java.awt.Dimension(100, 35));
        btInserir.setPreferredSize(new java.awt.Dimension(80, 25));
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });
        getContentPane().add(btInserir);

        btCalcular.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btCalcular.setText("Calcular");
        btCalcular.setMaximumSize(new java.awt.Dimension(100, 35));
        btCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btCalcular);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Resultado da Soma:");
        getContentPane().add(jLabel2);

        tfSoma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(tfSoma);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Resultado da Média:");
        getContentPane().add(jLabel3);

        tfMedia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(tfMedia);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        int numero;
        numero = Integer.parseInt(tfNumeroEntrada.getText());
        tfNumeroEntrada.setText("");
        
        alInteiros.add(numero);
    }//GEN-LAST:event_btInserirActionPerformed

    private void btCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcularActionPerformed
        Iterator it = alInteiros.iterator();        
        int soma, i;
        float media;
        i = 0;
        soma = 0;
        media = 0;
        
        while (it.hasNext()) {
            soma += alInteiros.get(i);
            it.next();
            i++;
        }
        
        media = (float) soma/alInteiros.size();
        
        tfSoma.setText(String.valueOf(soma));
        tfMedia.setText(String.valueOf(media));
        
    }//GEN-LAST:event_btCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Inteiros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inteiros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inteiros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inteiros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inteiros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCalcular;
    private javax.swing.JButton btInserir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField tfMedia;
    private javax.swing.JTextField tfNumeroEntrada;
    private javax.swing.JTextField tfSoma;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula18.ex2;

/**
 *
 * @author Rafael
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
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

        jPanel2 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 800));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jPanel2.setMaximumSize(new java.awt.Dimension(600, 200));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField2.setText("25,3");
        jTextField2.setPreferredSize(new java.awt.Dimension(600, 40));
        jPanel2.add(jTextField2);

        getContentPane().add(jPanel2);

        jPanel1.setMaximumSize(new java.awt.Dimension(600, 600));
        jPanel1.setName("teste"); // NOI18N
        jPanel1.setLayout(new java.awt.GridLayout(4, 4, 2, 2));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton1.setText("7");
        jPanel1.add(jButton1);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton2.setText("8");
        jPanel1.add(jButton2);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton3.setText("9");
        jPanel1.add(jButton3);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton4.setText("/");
        jPanel1.add(jButton4);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton5.setText("4");
        jPanel1.add(jButton5);

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton6.setText("5");
        jPanel1.add(jButton6);

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton7.setText("6");
        jPanel1.add(jButton7);

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton8.setText("*");
        jButton8.setName(""); // NOI18N
        jPanel1.add(jButton8);

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton9.setText("1");
        jButton9.setToolTipText("");
        jPanel1.add(jButton9);

        jButton10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton10.setText("2");
        jPanel1.add(jButton10);

        jButton11.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton11.setText("3");
        jPanel1.add(jButton11);

        jButton12.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton12.setText("-");
        jPanel1.add(jButton12);

        jButton13.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton13.setText("0");
        jPanel1.add(jButton13);

        jButton14.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton14.setText("C");
        jPanel1.add(jButton14);

        jButton15.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton15.setText("=");
        jPanel1.add(jButton15);

        jButton16.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton16.setText("+");
        jPanel1.add(jButton16);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}

package interpolacionnewton;

import javax.swing.JOptionPane;

public class frmNewton extends javax.swing.JFrame {
    public frmNewton() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        btnInterpolar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblFp1 = new javax.swing.JLabel();
        lblFp2 = new javax.swing.JLabel();
        lblFp3 = new javax.swing.JLabel();
        lblFs1 = new javax.swing.JLabel();
        lblFs2 = new javax.swing.JLabel();
        lblFt1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tablaDatos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "x", "f(x)"
            }
        ));
        jScrollPane1.setViewportView(tablaDatos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 100, 260, 110);

        btnInterpolar.setBackground(new java.awt.Color(0, 51, 255));
        btnInterpolar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnInterpolar.setForeground(new java.awt.Color(255, 255, 255));
        btnInterpolar.setText("Interpolar");
        btnInterpolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInterpolarActionPerformed(evt);
            }
        });
        getContentPane().add(btnInterpolar);
        btnInterpolar.setBounds(330, 190, 110, 23);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("f [x1,x0] = ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 270, 80, 15);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("f [x2, x1] =");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 300, 80, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("f [x3, x2] =");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 330, 80, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("f [x2, x1, x0] = ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(170, 270, 110, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("f [x3, x2, x1] =");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(170, 300, 110, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("f [x3, x2, x1, x0] = ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(330, 270, 130, 14);

        lblFp1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFp1.setText("0.0");
        getContentPane().add(lblFp1);
        lblFp1.setBounds(110, 270, 60, 15);

        lblFp2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFp2.setText("0.0");
        getContentPane().add(lblFp2);
        lblFp2.setBounds(110, 300, 60, 15);

        lblFp3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFp3.setText("0.0");
        getContentPane().add(lblFp3);
        lblFp3.setBounds(110, 330, 60, 15);

        lblFs1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFs1.setText("0.0");
        getContentPane().add(lblFs1);
        lblFs1.setBounds(270, 270, 50, 15);

        lblFs2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFs2.setText("0.0");
        getContentPane().add(lblFs2);
        lblFs2.setBounds(270, 300, 50, 15);

        lblFt1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFt1.setText("0.0");
        getContentPane().add(lblFt1);
        lblFt1.setBounds(450, 270, 50, 14);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Primera Diferencia");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 240, 120, 15);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("Segunda Diferencia");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(170, 240, 130, 14);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setText("Tercera Diferencia");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(330, 240, 140, 15);

        jLabel10.setFont(new java.awt.Font("Abel", 1, 24)); // NOI18N
        jLabel10.setText("Interpolacion de Newton");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 40, 310, 32);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInterpolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInterpolarActionPerformed
        try{
            ctrlInterpolacion inter = new ctrlInterpolacion();
            inter.pasarDatos();
            inter.calcular();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Inserte Enteros completos y correctos");
        }
          
    }//GEN-LAST:event_btnInterpolarActionPerformed

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
            java.util.logging.Logger.getLogger(frmNewton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmNewton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmNewton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmNewton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmNewton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInterpolar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lblFp1;
    public static javax.swing.JLabel lblFp2;
    public static javax.swing.JLabel lblFp3;
    public static javax.swing.JLabel lblFs1;
    public static javax.swing.JLabel lblFs2;
    public static javax.swing.JLabel lblFt1;
    public static javax.swing.JTable tablaDatos;
    // End of variables declaration//GEN-END:variables
}

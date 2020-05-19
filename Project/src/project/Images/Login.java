/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.Images;

import java.awt.Color;

/**
 *
 * @author Bhashitha
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        pnl1.setBackground(new Color(0,0,0,200));
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
        lblname = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblpass = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        pwdupass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        lblexit = new javax.swing.JLabel();
        lblscan = new javax.swing.JLabel();
        pnl1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblname.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        lblname.setForeground(new java.awt.Color(51, 51, 51));
        lblname.setText("Username");

        txtname.setBackground(new java.awt.Color(255, 255, 255));
        txtname.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        txtname.setForeground(new java.awt.Color(0, 102, 204));
        txtname.setBorder(null);
        txtname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnameFocusGained(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));

        lblpass.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        lblpass.setForeground(new java.awt.Color(51, 51, 51));
        lblpass.setText("Password");

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));

        pwdupass.setBackground(new java.awt.Color(255, 255, 255));
        pwdupass.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        pwdupass.setForeground(new java.awt.Color(0, 102, 204));
        pwdupass.setBorder(null);
        pwdupass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pwdupassFocusGained(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 51, 153));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblexit.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        lblexit.setForeground(new java.awt.Color(0, 51, 153));
        lblexit.setText("x");
        lblexit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblexitMousePressed(evt);
            }
        });

        lblscan.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        lblscan.setForeground(new java.awt.Color(51, 51, 51));
        lblscan.setText("Scan your ID");
        lblscan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblscan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblscanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblscanMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                        .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblpass, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pwdupass, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator1)
                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblscan, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblexit)
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblexit, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(lblname)
                .addGap(12, 12, 12)
                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(lblpass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwdupass, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lblscan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 520, 510));

        pnl1.setBackground(java.awt.Color.black);
        pnl1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText(" LOGIN");
        pnl1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 170, 100));

        jLabel3.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("    We  make a better journey for you!");
        pnl1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 290, 60));

        getContentPane().add(pnl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 510));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\LMS\\2nd year\\1st Sem\\java\\Coursework\\Project\\src\\project\\Images\\h.jpeg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusGained
        // TODO add your handling code here:
        lblname.setForeground(new Color(0,51,153));
        jSeparator1.setBackground(new Color(0,51,153));
        lblpass.setForeground(new Color(60,63,65));
        pwdupass.setForeground(new Color(60,63,65));
        txtname.setForeground(new Color(0,51,153));
        
        
    }//GEN-LAST:event_txtnameFocusGained

    private void pwdupassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwdupassFocusGained
        // TODO add your handling code here:
        lblpass.setForeground(new Color(0,51,153));
        jSeparator2.setBackground(new Color(0,51,153));
        lblname.setForeground(new Color(60,63,65));
        pwdupass.setForeground(new Color(0,51,153));
        txtname.setForeground(new Color(60,63,65));
       
        
        
    }//GEN-LAST:event_pwdupassFocusGained

    private void lblexitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblexitMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lblexitMousePressed

    private void lblscanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblscanMouseExited
        // TODO add your handling code here:
         lblscan.setForeground(new Color(60,63,65)); 
    }//GEN-LAST:event_lblscanMouseExited

    private void lblscanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblscanMouseEntered
        // TODO add your handling code here:
         lblscan.setForeground(new Color(0,51,153)); 
    }//GEN-LAST:event_lblscanMouseEntered

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblexit;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblpass;
    private javax.swing.JLabel lblscan;
    private javax.swing.JPanel pnl1;
    private javax.swing.JPasswordField pwdupass;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
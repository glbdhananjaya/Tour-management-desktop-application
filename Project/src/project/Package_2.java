/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Color;

/**
 *
 * @author Bhashitha
 */
public class Package_2 extends javax.swing.JFrame {

    /**
     * Creates new form Package_2
     */
    public Package_2() {
        initComponents();
        pnlt3.setBackground(new Color(0,0,0,200));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblpack = new javax.swing.JLabel();
        lblnumpc = new javax.swing.JLabel();
        lblnumk = new javax.swing.JLabel();
        txtfn1 = new javax.swing.JTextField();
        txtln = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        rbds = new javax.swing.JRadioButton();
        rbuc = new javax.swing.JRadioButton();
        lblln1 = new javax.swing.JLabel();
        rbuc1 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        lblexit = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox<>();
        lblln2 = new javax.swing.JLabel();
        cb3 = new javax.swing.JComboBox<>();
        lblln4 = new javax.swing.JLabel();
        cb4 = new javax.swing.JComboBox<>();
        lblln5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        pnlt3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblpack.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        lblpack.setForeground(new java.awt.Color(51, 51, 51));
        lblpack.setText("Accomadation+Transport");

        lblnumpc.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        lblnumpc.setForeground(new java.awt.Color(51, 51, 51));
        lblnumpc.setText("No.of  Packs");

        lblnumk.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        lblnumk.setForeground(new java.awt.Color(51, 51, 51));
        lblnumk.setText("No.of Kids");

        txtfn1.setBackground(new java.awt.Color(255, 255, 255));
        txtfn1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        txtfn1.setForeground(new java.awt.Color(0, 102, 204));
        txtfn1.setBorder(null);
        txtfn1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtfn1FocusGained(evt);
            }
        });
        txtfn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfn1ActionPerformed(evt);
            }
        });

        txtln.setBackground(new java.awt.Color(255, 255, 255));
        txtln.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        txtln.setForeground(new java.awt.Color(0, 102, 204));
        txtln.setBorder(null);
        txtln.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtlnFocusGained(evt);
            }
        });
        txtln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlnActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));

        rbds.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        rbds.setText("Down South");
        rbds.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbds.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbdsMouseClicked(evt);
            }
        });

        rbuc.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        rbuc.setText("City tour");
        rbuc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbuc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbucMouseClicked(evt);
            }
        });

        lblln1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        lblln1.setForeground(new java.awt.Color(51, 51, 51));
        lblln1.setText("Place wish to visit");

        rbuc1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        rbuc1.setText("Up Country");
        rbuc1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbuc1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbuc1MouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 51, 153));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Next Page");
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

        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblln2.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        lblln2.setForeground(new java.awt.Color(51, 51, 51));
        lblln2.setText("Accomadation");

        cb3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblln4.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        lblln4.setForeground(new java.awt.Color(51, 51, 51));
        lblln4.setText("Accomadation");

        cb4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblln5.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        lblln5.setForeground(new java.awt.Color(51, 51, 51));
        lblln5.setText("Accomadation");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Icons/icons8-back-arrow-24.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblexit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblnumpc, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtfn1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblpack, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblln1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbds, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rbuc1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblln2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(rbuc, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblnumk, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtln, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb4, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblln5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb3, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblln4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 43, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblexit, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblpack)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblnumpc)
                            .addComponent(txtfn1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(lblnumk))
                    .addComponent(txtln, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblln1)
                .addGap(18, 18, 18)
                .addComponent(rbds)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblln2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rbuc1)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(lblln4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rbuc)
                .addGap(18, 18, 18)
                .addComponent(lblln5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 520, 740));

        pnlt3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("    We  make a better journey for you!");

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("TRAVELLER");

        javax.swing.GroupLayout pnlt3Layout = new javax.swing.GroupLayout(pnlt3);
        pnlt3.setLayout(pnlt3Layout);
        pnlt3Layout.setHorizontalGroup(
            pnlt3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlt3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlt3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlt3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlt3Layout.setVerticalGroup(
            pnlt3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlt3Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(447, Short.MAX_VALUE))
        );

        getContentPane().add(pnlt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 740));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\LMS\\2nd year\\1st Sem\\java\\Coursework\\Project\\src\\project\\Images\\crop.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfn1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfn1FocusGained
        // TODO add your handling code here:
        lblnumpc.setForeground(new Color(0,51,153));
        jSeparator2.setForeground(new Color(60,63,65));
        jSeparator1.setForeground(new Color(60,63,65));
        lblnumk.setForeground(new Color(60,63,65));
        txtfn1.setForeground(new Color(0,51,153));
        txtln.setForeground(new Color(60,63,65));
    }//GEN-LAST:event_txtfn1FocusGained

    private void txtfn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfn1ActionPerformed

    private void txtlnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtlnFocusGained
        // TODO add your handling code here:
        lblnumk.setForeground(new Color(0,51,153));
        jSeparator2.setForeground(new Color(60,63,65));
        jSeparator1.setForeground(new Color(60,63,65));
        lblnumpc.setForeground(new Color(60,63,65));
        txtln.setForeground(new Color(0,51,153));
        txtfn1.setForeground(new Color(60,63,65));
    }//GEN-LAST:event_txtlnFocusGained

    private void txtlnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlnActionPerformed

    private void rbdsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbdsMouseClicked
        // TODO add your handling code here:
        rbds.setForeground(new Color(0,51,153));
        rbds.setForeground(new Color(60,63,65));
    }//GEN-LAST:event_rbdsMouseClicked

    private void rbuc1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbuc1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rbuc1MouseClicked

    private void lblexitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblexitMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lblexitMousePressed

    private void rbucMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbucMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rbucMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         Traveller_3 t2=new  Traveller_3 ();
        t2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Package_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Package_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Package_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Package_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Package_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cb3;
    private javax.swing.JComboBox<String> cb4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblexit;
    private javax.swing.JLabel lblln1;
    private javax.swing.JLabel lblln2;
    private javax.swing.JLabel lblln4;
    private javax.swing.JLabel lblln5;
    private javax.swing.JLabel lblnumk;
    private javax.swing.JLabel lblnumpc;
    private javax.swing.JLabel lblpack;
    private javax.swing.JPanel pnlt3;
    private javax.swing.JRadioButton rbds;
    private javax.swing.JRadioButton rbuc;
    private javax.swing.JRadioButton rbuc1;
    private javax.swing.JTextField txtfn1;
    private javax.swing.JTextField txtln;
    // End of variables declaration//GEN-END:variables
}
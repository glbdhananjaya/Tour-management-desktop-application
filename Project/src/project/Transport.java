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
public class Transport extends javax.swing.JFrame {

    /**
     * Creates new form Transport
     */
    public Transport() {
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

        pnlt3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblVno = new javax.swing.JLabel();
        txtVno = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblOname = new javax.swing.JLabel();
        txtOCnum = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lblOCnum = new javax.swing.JLabel();
        lblID3 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        lblexit = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtOname = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlt3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("    We  make a better journey for you!");

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("TRANSPORT");

        javax.swing.GroupLayout pnlt3Layout = new javax.swing.GroupLayout(pnlt3);
        pnlt3.setLayout(pnlt3Layout);
        pnlt3Layout.setHorizontalGroup(
            pnlt3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlt3Layout.createSequentialGroup()
                .addGroup(pnlt3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlt3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlt3Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel5)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        pnlt3Layout.setVerticalGroup(
            pnlt3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlt3Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(311, Short.MAX_VALUE))
        );

        getContentPane().add(pnlt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 610));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblVno.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        lblVno.setForeground(new java.awt.Color(51, 51, 51));
        lblVno.setText("Vehicle No:");

        txtVno.setBackground(new java.awt.Color(255, 255, 255));
        txtVno.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        txtVno.setForeground(new java.awt.Color(0, 102, 204));
        txtVno.setBorder(null);
        txtVno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtVnoFocusGained(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));

        lblOname.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        lblOname.setForeground(new java.awt.Color(51, 51, 51));
        lblOname.setText("Owner's Name");

        txtOCnum.setBackground(new java.awt.Color(255, 255, 255));
        txtOCnum.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        txtOCnum.setForeground(new java.awt.Color(0, 102, 204));
        txtOCnum.setBorder(null);
        txtOCnum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtOCnumFocusGained(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));

        lblOCnum.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        lblOCnum.setForeground(new java.awt.Color(51, 51, 51));
        lblOCnum.setText("Owner contact number");

        lblID3.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        lblID3.setForeground(new java.awt.Color(51, 51, 51));
        lblID3.setText("Vehicle Category");

        jSeparator5.setBackground(new java.awt.Color(204, 204, 204));

        jCheckBox1.setText("Affordable car");

        jCheckBox2.setText("Luxuary Car");

        jCheckBox4.setText("32 Seater");

        jCheckBox5.setText("16 Seater");

        lblexit.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        lblexit.setForeground(new java.awt.Color(0, 51, 153));
        lblexit.setText("x");
        lblexit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblexitMousePressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 51, 153));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Submit");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtOname.setBackground(new java.awt.Color(255, 255, 255));
        txtOname.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        txtOname.setForeground(new java.awt.Color(0, 102, 204));
        txtOname.setBorder(null);
        txtOname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtOnameFocusGained(evt);
            }
        });

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
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblOCnum, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator1)
                                .addComponent(txtVno, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblVno, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblID3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jCheckBox4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                        .addComponent(jCheckBox5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jCheckBox1)))
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtOname, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator2)
                                    .addComponent(txtOCnum, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblOname, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblexit)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblexit)
                    .addComponent(jButton4))
                .addGap(16, 16, 16)
                .addComponent(lblVno)
                .addGap(12, 12, 12)
                .addComponent(txtVno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblOname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtOname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblOCnum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOCnum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(lblID3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox5)
                .addGap(9, 9, 9)
                .addComponent(jCheckBox4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 510, 610));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Images/e843f2056e11664d4540a71ac068eab3.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 609));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtVnoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVnoFocusGained
        // TODO add your handling code here:
        lblVno.setForeground(new Color(0,51,153));
        txtVno.setForeground(new Color(0,51,153));
        lblOname.setForeground(new Color(60,63,65));
        txtOCnum.setForeground(new Color(60,63,65));
        lblOCnum.setForeground(new Color(60,63,65));
        txtOCnum.setForeground(new Color(60,63,65));
       
    }//GEN-LAST:event_txtVnoFocusGained

    private void txtOCnumFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOCnumFocusGained
        // TODO add your handling code here:
        lblOCnum.setForeground(new Color(0,51,153));
        txtOCnum.setForeground(new Color(0,51,153));
        lblVno.setForeground(new Color(60,63,65));
        txtVno.setForeground(new Color(60,63,65));
        lblOname.setForeground(new Color(60,63,65));
        txtOname.setForeground(new Color(60,63,65));
    }//GEN-LAST:event_txtOCnumFocusGained

    private void lblexitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblexitMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lblexitMousePressed

    private void txtOnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOnameFocusGained
        // TODO add your handling code here:
        lblOname.setForeground(new Color(0,51,153));
        txtOname.setForeground(new Color(0,51,153));
        lblVno.setForeground(new Color(60,63,65));
        txtVno.setForeground(new Color(60,63,65));
        lblOCnum.setForeground(new Color(60,63,65));
        txtOCnum.setForeground(new Color(60,63,65));
    }//GEN-LAST:event_txtOnameFocusGained

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Home t2=new  Home();
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
            java.util.logging.Logger.getLogger(Transport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblID3;
    private javax.swing.JLabel lblOCnum;
    private javax.swing.JLabel lblOname;
    private javax.swing.JLabel lblVno;
    private javax.swing.JLabel lblexit;
    private javax.swing.JPanel pnlt3;
    private javax.swing.JTextField txtOCnum;
    private javax.swing.JTextField txtOname;
    private javax.swing.JTextField txtVno;
    // End of variables declaration//GEN-END:variables
}
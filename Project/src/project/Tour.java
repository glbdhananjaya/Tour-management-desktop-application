/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Bhashitha
 */
public class Tour extends javax.swing.JFrame {

    /**
     * Creates new form Tour
     */
    public Tour() {
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
        lblexit = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblTdes = new javax.swing.JLabel();
        txtTdes = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lblloc = new javax.swing.JLabel();
        txtloc = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        lblkm = new javax.swing.JLabel();
        txtkm = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        lblSfea = new javax.swing.JLabel();
        txtSfea = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        pnlt3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblexit.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        lblexit.setForeground(new java.awt.Color(0, 51, 153));
        lblexit.setText("x");
        lblexit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblexitMousePressed(evt);
            }
        });

        lblID.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        lblID.setForeground(new java.awt.Color(51, 51, 51));
        lblID.setText("Tour ID");

        txtID.setBackground(new java.awt.Color(255, 255, 255));
        txtID.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        txtID.setForeground(new java.awt.Color(0, 102, 204));
        txtID.setBorder(null);
        txtID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIDFocusGained(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));

        lblTdes.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        lblTdes.setForeground(new java.awt.Color(51, 51, 51));
        lblTdes.setText("Tour Description");

        txtTdes.setBackground(new java.awt.Color(255, 255, 255));
        txtTdes.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        txtTdes.setForeground(new java.awt.Color(0, 102, 204));
        txtTdes.setBorder(null);
        txtTdes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTdesFocusGained(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));

        lblloc.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        lblloc.setForeground(new java.awt.Color(51, 51, 51));
        lblloc.setText("Location");

        txtloc.setBackground(new java.awt.Color(255, 255, 255));
        txtloc.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        txtloc.setForeground(new java.awt.Color(0, 102, 204));
        txtloc.setBorder(null);
        txtloc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtlocFocusGained(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(204, 204, 204));

        lblkm.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        lblkm.setForeground(new java.awt.Color(51, 51, 51));
        lblkm.setText("km from Capital city");

        txtkm.setBackground(new java.awt.Color(255, 255, 255));
        txtkm.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        txtkm.setForeground(new java.awt.Color(0, 102, 204));
        txtkm.setBorder(null);
        txtkm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtkmFocusGained(evt);
            }
        });

        jSeparator4.setBackground(new java.awt.Color(204, 204, 204));

        lblSfea.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        lblSfea.setForeground(new java.awt.Color(51, 51, 51));
        lblSfea.setText("Special Features");

        txtSfea.setBackground(new java.awt.Color(255, 255, 255));
        txtSfea.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        txtSfea.setForeground(new java.awt.Color(0, 102, 204));
        txtSfea.setBorder(null);
        txtSfea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSfeaFocusGained(evt);
            }
        });

        jSeparator5.setBackground(new java.awt.Color(204, 204, 204));

        jButton1.setBackground(new java.awt.Color(0, 51, 153));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Submit");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblexit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator1)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator2)
                                .addComponent(txtTdes, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblTdes, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator3)
                                .addComponent(txtloc, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblloc, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator4)
                                .addComponent(txtkm, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblkm, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator5)
                                .addComponent(txtSfea, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblSfea, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblexit)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblID)
                .addGap(12, 12, 12)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTdes)
                .addGap(12, 12, 12)
                .addComponent(txtTdes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblloc)
                .addGap(12, 12, 12)
                .addComponent(txtloc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblkm)
                .addGap(12, 12, 12)
                .addComponent(txtkm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSfea)
                .addGap(12, 12, 12)
                .addComponent(txtSfea, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 510, 600));

        pnlt3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("    We  make a better journey for you!");

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("TOUR REG.");

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
                .addContainerGap(301, Short.MAX_VALUE))
        );

        getContentPane().add(pnlt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/Images/6-Days-Beauty-of-Sri-Lanka-Wildlife1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblexitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblexitMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lblexitMousePressed

    private void txtIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIDFocusGained
        // TODO add your handling code here:
        lblID.setForeground(new Color(0,51,153));
        txtID.setForeground(new Color(0,51,153));
        lblTdes.setForeground(new Color(60,63,65));
        txtTdes.setForeground(new Color(60,63,65));
        lblloc.setForeground(new Color(60,63,65));
        txtloc.setForeground(new Color(60,63,65));
        lblkm.setForeground(new Color(60,63,65));
        txtkm.setForeground(new Color(60,63,65));
        lblSfea.setForeground(new Color(60,63,65));
        txtSfea.setForeground(new Color(60,63,65));
        
    }//GEN-LAST:event_txtIDFocusGained

    private void txtTdesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTdesFocusGained
        // TODO add your handling code here:
        lblTdes.setForeground(new Color(0,51,153));
        txtTdes.setForeground(new Color(0,51,153));
        lblID.setForeground(new Color(60,63,65));
        txtID.setForeground(new Color(60,63,65));
        lblloc.setForeground(new Color(60,63,65));
        txtloc.setForeground(new Color(60,63,65));
        lblkm.setForeground(new Color(60,63,65));
        txtkm.setForeground(new Color(60,63,65));
        lblSfea.setForeground(new Color(60,63,65));
        txtSfea.setForeground(new Color(60,63,65));
    }//GEN-LAST:event_txtTdesFocusGained

    private void txtlocFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtlocFocusGained
        // TODO add your handling code here:
        lblloc.setForeground(new Color(0,51,153));
        txtloc.setForeground(new Color(0,51,153));
        lblTdes.setForeground(new Color(60,63,65));
        txtTdes.setForeground(new Color(60,63,65));
        lblID.setForeground(new Color(60,63,65));
        txtID.setForeground(new Color(60,63,65));
        lblkm.setForeground(new Color(60,63,65));
        txtkm.setForeground(new Color(60,63,65));
        lblSfea.setForeground(new Color(60,63,65));
        txtSfea.setForeground(new Color(60,63,65));
    }//GEN-LAST:event_txtlocFocusGained

    private void txtkmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtkmFocusGained
        // TODO add your handling code here:
        lblkm.setForeground(new Color(0,51,153));
        txtkm.setForeground(new Color(0,51,153));
        lblTdes.setForeground(new Color(60,63,65));
        txtTdes.setForeground(new Color(60,63,65));
        lblloc.setForeground(new Color(60,63,65));
        txtloc.setForeground(new Color(60,63,65));
        lblID.setForeground(new Color(60,63,65));
        txtID.setForeground(new Color(60,63,65));
        lblSfea.setForeground(new Color(60,63,65));
        txtSfea.setForeground(new Color(60,63,65));
    }//GEN-LAST:event_txtkmFocusGained

    private void txtSfeaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSfeaFocusGained
        // TODO add your handling code here:
        lblSfea.setForeground(new Color(0,51,153));
        txtSfea.setForeground(new Color(0,51,153));
        lblTdes.setForeground(new Color(60,63,65));
        txtTdes.setForeground(new Color(60,63,65));
        lblloc.setForeground(new Color(60,63,65));
        txtloc.setForeground(new Color(60,63,65));
        lblkm.setForeground(new Color(60,63,65));
        txtkm.setForeground(new Color(60,63,65));
        lblID.setForeground(new Color(60,63,65));
        txtID.setForeground(new Color(60,63,65));
    }//GEN-LAST:event_txtSfeaFocusGained

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Home t2=new  Home();
        t2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          if (txtID.getText().trim().isEmpty()&&txtTdes.getText().trim().isEmpty()&&txtloc.getText().trim().isEmpty()&&txtkm.getText().trim().isEmpty()&&txtSfea.getText().trim().isEmpty())
           {
               JOptionPane.showMessageDialog(null, "Fill all the fields"); 
              
           }
          else if(txtID.getText().trim().isEmpty())
          {
              JOptionPane.showMessageDialog(null, "Enter the Tour ID"); 
          }
           else if(txtTdes.getText().trim().isEmpty())
          {
              JOptionPane.showMessageDialog(null, "Add Description"); 
          }
            else if(txtloc.getText().trim().isEmpty())
          {
              JOptionPane.showMessageDialog(null, "Add the location"); 
          }
             else if(txtkm.getText().trim().isEmpty())
          {
              JOptionPane.showMessageDialog(null, "Enter the km value"); 
          }
              else if(txtSfea.getText().trim().isEmpty())
          {
              JOptionPane.showMessageDialog(null, "Add special features about the tour"); 
          }
          else
            {
            try
                {

                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectjava","root","");

                String sql="INSERT INTO tour VALUES(?,?,?,?,?)";    
                PreparedStatement pstmt=con.prepareStatement(sql);
                pstmt.setString(1, txtID.getText());
                pstmt.setString(2, txtTdes.getText());
                pstmt.setString(3, txtloc.getText());
                pstmt.setInt(4, Integer.parseInt(txtkm.getText()));
                pstmt.setString(5, txtSfea.getText());
                
                JOptionPane.showMessageDialog(null, "Inserted Successfully"); 
                pstmt.executeUpdate();  
           

                con.close();
                }
            catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }

          }
      
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Tour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tour().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblSfea;
    private javax.swing.JLabel lblTdes;
    private javax.swing.JLabel lblexit;
    private javax.swing.JLabel lblkm;
    private javax.swing.JLabel lblloc;
    private javax.swing.JPanel pnlt3;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtSfea;
    private javax.swing.JTextField txtTdes;
    private javax.swing.JTextField txtkm;
    private javax.swing.JTextField txtloc;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewSaleM;
import com.sun.glass.events.KeyEvent;
import database.Connectionget;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import static viewSaleM.NewCustomer.valEmail;
/**
 *
 * @author Dinuja pinto
 */
public class UpdateCustomer extends javax.swing.JFrame {

    /**
     * Creates new form UpdateCustomer
     */
    public UpdateCustomer() {
        initComponents();
        //For center to window --------------------------------
        Toolkit toolkitobj1 = getToolkit();
        Dimension size = toolkitobj1.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        SearchNic = new javax.swing.JTextField();
        btnUSechCus = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Uname = new javax.swing.JTextField();
        Uphone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Uemail = new javax.swing.JTextField();
        Uaddress = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnUreset = new javax.swing.JButton();
        btnUclose = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Address");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel1.setText("Update Customer");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 21, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 576, 10));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("NIC No");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        SearchNic.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        SearchNic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchNicKeyReleased(evt);
            }
        });
        getContentPane().add(SearchNic, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 193, 30));

        btnUSechCus.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnUSechCus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Saleicon/search.png"))); // NOI18N
        btnUSechCus.setText("Search");
        btnUSechCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUSechCusActionPerformed(evt);
            }
        });
        getContentPane().add(btnUSechCus, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, -1, 40));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        Uname.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(Uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 250, 29));

        Uphone.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Uphone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UphoneKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                UphoneKeyReleased(evt);
            }
        });
        getContentPane().add(Uphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 250, 29));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Phone");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Email");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        Uemail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Uemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UemailActionPerformed(evt);
            }
        });
        Uemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UemailKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                UemailKeyReleased(evt);
            }
        });
        getContentPane().add(Uemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 250, 29));

        Uaddress.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Uaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UaddressActionPerformed(evt);
            }
        });
        getContentPane().add(Uaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 250, 29));

        btnUpdate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Saleicon/save.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, -1, 42));

        btnUreset.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnUreset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Saleicon/Reset.png"))); // NOI18N
        btnUreset.setText("Reset");
        btnUreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUresetActionPerformed(evt);
            }
        });
        getContentPane().add(btnUreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, -1, 42));

        btnUclose.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnUclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Saleicon/close Jframe.png"))); // NOI18N
        btnUclose.setText("Close");
        btnUclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUcloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnUclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, -1, 42));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Saleicon/Update buyer.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 12, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 576, 10));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 84, 576, 10));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 90, 29));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(222, 16, 25));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 80, 40));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 90, 29));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 230, 20));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Saleicon/all page background image.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUSechCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUSechCusActionPerformed
        // TODO add your handling code here:
        //String Cnic = btnUSechCus.getText();

        try {
            Connection con = Connectionget.getInstatnce().getConnection();
            PreparedStatement pstm = con.prepareStatement("select * from customer where nic ='" + SearchNic.getText() + "'");
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                //btnUSechCus.setText(rs.getString(1));
                Uname.setText(rs.getString("name"));
                Uphone.setText(rs.getString("phone"));
                Uemail.setText(rs.getString("email"));
                Uaddress.setText(rs.getString("address"));
                SearchNic.setEditable(false);
                jLabel4.setText("");
            } else {
                //JOptionPane.showMessageDialog(null, "Customer does not exit");
                jLabel4.setText("Not Exit");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUSechCusActionPerformed

    private void UemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UemailActionPerformed

    private void UaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UaddressActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String name = Uname.getText();
        String phone = Uphone.getText();
        String email = Uemail.getText();
        String add = Uaddress.getText();

        try {
            Connection con = Connectionget.getInstatnce().getConnection();
            Statement st = con.createStatement();
            st.executeUpdate("update customer set name='" + name + "',phone='" + phone + "',email ='" + email + "',address = '" + add + "' where nic ='" + SearchNic.getText() + "' ");
            //JOptionPane.showMessageDialog(null, "Update successfull");
            //setVisible(false);
            //new UpdateCustomer().setVisible(true);
            jLabel11.setText("Update successfull");
            jLabel11.setForeground(new Color(28,147,47,255));
        } catch (HeadlessException | SQLException e) {
            //JOptionPane.showMessageDialog(null, "Update not successfull");
            jLabel11.setText("Unsuccessfull");
            jLabel11.setForeground(new Color(243,0,0,255));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnUresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUresetActionPerformed
        // TODO add your handling code here:
        //setVisible(false);
        //new UpdateCustomer().setVisible(true);
        
        SearchNic.setText("");
        Uname.setText("");
        Uphone.setText("");
        Uemail.setText("");
        Uaddress.setText("");
        jLabel4.setText("");
        jLabel10.setText("");
        jLabel9.setText("");
        jLabel11.setText("");
        SearchNic.setEditable(true);
        
        
    }//GEN-LAST:event_btnUresetActionPerformed

    private void btnUcloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUcloseActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btnUcloseActionPerformed

    private void UphoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UphoneKeyPressed
        // TODO add your handling code here:
        String phone = Uphone.getText();

        int length = phone.length();

        char c = evt.getKeyChar();
        /*if(length<10){
                //Uphone.setEditable(true);
                jLabel9.setText("Invalid");
         }
        if(length == 9){
            jLabel9.setText("");
        }*/

        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            if (length < 10) {
                Uphone.setEditable(true);
                //jLabel10.setText("Invalid");
            } else {
                Uphone.setEditable(false);
                //jLabel10.setText("");
            }
        } else {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACKSPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                Uphone.setEditable(true);
            } else {
                Uphone.setEditable(false);
            }
        }
    }//GEN-LAST:event_UphoneKeyPressed

    private void UphoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UphoneKeyReleased
        // TODO add your handling code here:
        String phone = Uphone.getText();

        int length = phone.length();
        
       if (length < 10) {
            //phon.setEditable(true);
            jLabel10.setText("Invalid");
        }
        if (length == 10) {
            jLabel10.setText("");
        }
    }//GEN-LAST:event_UphoneKeyReleased

    private void UemailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UemailKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_UemailKeyPressed

    private void UemailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UemailKeyReleased
        // TODO add your handling code here:
        String mail = Uemail.getText();

        if (valEmail(mail) == false) {
            jLabel9.setText("Invalid");
        }
        if (valEmail(mail) == true) {
            jLabel9.setText("");
        }
    }//GEN-LAST:event_UemailKeyReleased

    private void SearchNicKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchNicKeyReleased
        // TODO add your handling code here:
        jLabel4.setText("");
    }//GEN-LAST:event_SearchNicKeyReleased

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
            java.util.logging.Logger.getLogger(UpdateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SearchNic;
    private javax.swing.JTextField Uaddress;
    private javax.swing.JTextField Uemail;
    private javax.swing.JTextField Uname;
    private javax.swing.JTextField Uphone;
    private javax.swing.JButton btnUSechCus;
    private javax.swing.JButton btnUclose;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUreset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}

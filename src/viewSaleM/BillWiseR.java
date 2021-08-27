/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewSaleM;

import com.itextpdf.*;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import static com.itextpdf.text.html.HtmlTags.P;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import database.Connectionget;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Dinuja pinto
 */
public class BillWiseR extends javax.swing.JFrame {

    //SetIcon
    ImageIcon icon;
    
    double TotAmt = 0;
    /**
     * Creates new form BillWiseR
     */
    public BillWiseR() {
        initComponents();
        //For center to window --------------------------------
        Toolkit toolkitobj1 = getToolkit();
        Dimension size = toolkitobj1.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        
        totAmt.setEnabled(false);
        
        //setIcon
        icon = new ImageIcon("E:\\SLIIT Hub\\2nd year\\2nd Sem\\IT Project\\project\\zzImpliment2\\dammikaLogo2.jpg");
        setIconImage(icon.getImage());
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
        dateChooserPanel2 = new datechooser.beans.DateChooserPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        viewResult = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        close = new javax.swing.JButton();
        print = new javax.swing.JButton();
        totAmt = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Saleicon/reportbackground - Copy.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Saleicon/billwise.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel3.setText("Bill Wise Report");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        jDateChooser1.setDateFormatString("yyyy/MM/dd");
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 96, 150, 31));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 80, 1145, 10));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Date  From");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 96, -1, 31));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("To");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 96, -1, 31));

        jDateChooser2.setDateFormatString("yyyy/MM/dd");
        getContentPane().add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(567, 96, 150, 31));

        viewResult.setBackground(new java.awt.Color(0, 0, 255));
        viewResult.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        viewResult.setForeground(new java.awt.Color(255, 255, 255));
        viewResult.setText("View Result");
        viewResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewResultActionPerformed(evt);
            }
        });
        getContentPane().add(viewResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(743, 97, -1, 30));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 133, 1145, 10));

        jTable1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bill_No", "Date", "Time", "Customer_NIC", "Customer_Name", "Customer_Phone", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 149, 1140, 340));

        close.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Saleicon/close Jframe.png"))); // NOI18N
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 500, -1, 40));

        print.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Saleicon/print.png"))); // NOI18N
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        getContentPane().add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, 40));

        totAmt.setBackground(new java.awt.Color(0, 204, 0));
        totAmt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        totAmt.setText("Total Amount");
        totAmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totAmtActionPerformed(evt);
            }
        });
        getContentPane().add(totAmt, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, -1, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Saleicon/reportbackground - Copy.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    private void viewResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewResultActionPerformed
        // TODO add your handling code here:
        
        TotAmt = 0;
        
        java.util.Date from=jDateChooser1.getDate();
        java.util.Date to=jDateChooser2.getDate();
        
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String DateFrom = dateFormat.format(from);
        String DateTo = dateFormat.format(to);
        
        //System.out.println(DateFrom);
        //System.out.println(DateTo);
        
        try {
            Connection con = Connectionget.getInstatnce().getConnection();
            Statement st = con.createStatement();
            
            ResultSet rs = st.executeQuery("select * from bill where Date between '"+DateFrom+"' and '"+DateTo+"' ");

            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (HeadlessException | SQLException e) {
            
            System.out.println(e);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BillWiseR.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        totAmt.setEnabled(true);
    }//GEN-LAST:event_viewResultActionPerformed

    private void totAmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totAmtActionPerformed
        // TODO add your handling code here:
        
        double no =TotalJTable(jTable1);
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"", "", "","", "", "",""});
        model.addRow(new Object[]{"", "", "","", "", "                  TOTAL AMOUNT",no});
        
        
        totAmt.setEnabled(false);
    }//GEN-LAST:event_totAmtActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:
        java.util.Date from=jDateChooser1.getDate();
        java.util.Date to=jDateChooser2.getDate();
        
        
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String DateFrom = dateFormat.format(from);
        String DateTo = dateFormat.format(to);
        
        String path = "E:\\SLIIT Hub\\2nd year\\2nd Sem\\IT Project\\project\\zzImpliment2\\printed\\Dammika Tex\\Bill Wise Report\\";
        
        com.itextpdf.text.Document doc = new com.itextpdf.text.Document();
        
        try{
            PdfWriter.getInstance(doc, new FileOutputStream(path+""+DateFrom+" To "+DateTo+".pdf"));
            doc.open();
            
            Paragraph para1 = new Paragraph("DHAMMIKA Tex\nBill Wise Report");
            doc.add(para1);
            
            Paragraph para2 = new Paragraph("Date: From  "+DateFrom+"  To   "+DateTo+"\n\n");
            doc.add(para2);
            
            PdfPTable tbl = new PdfPTable(7);
            tbl.addCell("Bill_No");
            tbl.addCell("Date");
            tbl.addCell("Time");
            tbl.addCell("Customer_NIC");
            tbl.addCell("Customer_Name");
            tbl.addCell("Customer_Phone");
            tbl.addCell("Amount LKR");
            
            for(int i=0;i<jTable1.getRowCount();i++){
                String bill = jTable1.getValueAt(i, 0).toString();
                String date = jTable1.getValueAt(i, 1).toString();
                String time = jTable1.getValueAt(i, 2).toString();
                String cNic = jTable1.getValueAt(i, 3).toString();
                String cName = jTable1.getValueAt(i, 4).toString();
                String cPhone = jTable1.getValueAt(i, 5).toString();
                String amt = jTable1.getValueAt(i, 6).toString();
                
                tbl.addCell(bill);
                tbl.addCell(date);
                tbl.addCell(time);
                tbl.addCell(cNic);
                tbl.addCell(cName);
                tbl.addCell(cPhone);
                tbl.addCell(amt);
            }
            doc.add(tbl);
            
            
            JOptionPane.showMessageDialog(null,"Report Generated");
            
        }catch(DocumentException | HeadlessException | FileNotFoundException e)
        {
            System.out.println(e);
        }
        
        doc.close();
    }//GEN-LAST:event_printActionPerformed

        public double TotalJTable(JTable table) {

        //DefaultTableModel model = (DefaultTableModel) table.getModel();
        int numberOfRows = table.getRowCount();
        double Tamt;
        int rowCounter = 0;

        //we will travel to every row and clean it
        for (rowCounter = 0; rowCounter < numberOfRows; rowCounter++) {

            String cell = table.getModel().getValueAt(rowCounter, 6).toString();
            Tamt = Double.parseDouble(cell);
            
            //System.out.println(Tamt);
            
            TotAmt = TotAmt + Tamt;
            
        }
        
        //System.out.println();
        //System.out.println(TotAmt);
        return TotAmt;
        
    }
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
            java.util.logging.Logger.getLogger(BillWiseR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillWiseR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillWiseR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillWiseR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillWiseR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    private datechooser.beans.DateChooserPanel dateChooserPanel2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton print;
    private javax.swing.JButton totAmt;
    private javax.swing.JButton viewResult;
    // End of variables declaration//GEN-END:variables
}

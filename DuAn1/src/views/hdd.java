/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import service.imple.HoaDonDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class hdd extends javax.swing.JFrame {

    ArrayList<Model.HoaDon>list=new ArrayList<>();
    HoaDonDAO ql= new HoaDonDAO();
    DefaultTableModel dtm= new DefaultTableModel();
    private QuanLyTraHang qll;
    private List<Object[]> selectedRows;
    public hdd() {
        this.qll = new QuanLyTraHang();
        initComponents();
        setLocationRelativeTo(null);
        dtm=(DefaultTableModel)tblHd.getModel();
        list=ql.getAll();
        loadTable(list);
        selectedRows=new ArrayList<>();
            addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {                
                setVisible(false);
            }
        }); 
        setDefaultCloseOperation(hdd.DISPOSE_ON_CLOSE);
        
    }
    

   public void loadTable(ArrayList<Model.HoaDon> li){
        dtm.setRowCount(0);
        for (Model.HoaDon th:li){
            dtm.addRow(new Object[]{
               th.getId(),
               th.getUser(),
               th.getAddress_id(),
               th.getInto_money(),
               th.getTotal_cost(),
               th.getCreated_at(),
               th.getUpdate_at(),
               th.getDelivery_at(),
               th.getVoucher(),
               th.getStatus()
            });
        }
    }
   
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblHd = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblHd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "kh", "diachi", "tienSP", "tienShip", "ngayTao", "ngayCN", "ngayShip", "id Voucher", "Trang thai"
            }
        ));
        tblHd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHdMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHd);

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblHdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHdMouseClicked

btnThem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = tblHd.getSelectedRow();
                    if(selectedRow != -1){
                    Object[] rowData = new Object[tblHd.getColumnCount()];
                    for (int i = 0; i < tblHd.getColumnCount(); i++){
                        rowData[i] = tblHd.getValueAt(selectedRow, i);
                    }
                   qll.addRowDataToTable(rowData);
                    qll.setVisible(true);
                    
                   }
                }
            });
    }//GEN-LAST:event_tblHdMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
           
//tblHd.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
//            @Override
//            public void valueChanged(ListSelectionEvent e) {
//                if(!e.getValueIsAdjusting()){
//                    int selectedRow = tblHd.getSelectedRow();
//                    selectedRows.clear();
//                    if(selectedRow != -1){
//                    Object[] rowData = new Object[tblHd.getColumnCount()];
//                    for (int i = 0; i < tblHd.getColumnCount(); i++){
//                        rowData[i] = tblHd.getValueAt(selectedRow, i);
//                    }
//                    selectedRows.add(rowData);
//                    }
//            }
//            }
//        });



    }//GEN-LAST:event_btnThemActionPerformed

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
            java.util.logging.Logger.getLogger(hdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHd;
    // End of variables declaration//GEN-END:variables
}

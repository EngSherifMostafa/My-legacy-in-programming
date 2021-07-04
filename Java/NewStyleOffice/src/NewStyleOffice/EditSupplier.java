package NewStyleOffice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class EditSupplier extends javax.swing.JFrame {
    public EditSupplier() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SupplierNameSearch = new javax.swing.JComboBox<>();
        DelSupplier = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        SupplierPhone1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        SupplierPhone2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        SupplierAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        SupplierEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        SupplierCity = new javax.swing.JTextField();
        EditSupplier = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SupplierNameSearch.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        SupplierNameSearch.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SupplierNameSearchItemStateChanged(evt);
            }
        });
        getContentPane().add(SupplierNameSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 398, 40));

        DelSupplier.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        DelSupplier.setText("حذف");
        DelSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelSupplierActionPerformed(evt);
            }
        });
        getContentPane().add(DelSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 110, 40));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("تعديل بيانات المورد");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 170, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("اسم المورد");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 140, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("رقم الموبيل");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 140, 40));

        SupplierPhone1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        SupplierPhone1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(SupplierPhone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 400, 40));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("رقم الموبيل 2");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 140, 40));

        SupplierPhone2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        SupplierPhone2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(SupplierPhone2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 400, 40));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("العنوان");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 140, 40));

        SupplierAddress.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        SupplierAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(SupplierAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 400, 40));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Email");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 140, 40));

        SupplierEmail.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        SupplierEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(SupplierEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 400, 40));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("المحافظة");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 140, 40));

        SupplierCity.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        SupplierCity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(SupplierCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 400, 40));

        EditSupplier.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        EditSupplier.setText("تعديل");
        EditSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditSupplierActionPerformed(evt);
            }
        });
        getContentPane().add(EditSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 110, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

        Connection con = null;
        PreparedStatement pstSupplierNameSearch , pstSearchSupplier , pstEditSupplier , pstDelSupplier = null;
        ResultSet rsSupplierNameSearch , rsSearchSupplier = null;
        int rsEditSupplier = 0;
        int i = 0;
        String url = "jdbc:mysql://localhost/NewStyleOffice?useUnicode=true&characterEncoding=UTF-8";
        String user = "root";
        String password = "";
        String sqlSupplierNameSearch = "Select * From Supplier";
        String sqlSearchSupplier = "Select * From Supplier WHERE SupplierName = ?";
        String sqlDelSupplier = "DELETE FROM Supplier WHERE SupplierName = ?";
        String sqlEditSupplier = "UPDATE Supplier SET SupplierPhone_1 = ?, "
                                + "SupplierPhone_2 = ?, SupplierAddress = ?, "
                                + "SupplierEmail = ?, SupplierCity = ? WHERE SupplierName = ?";
        
    private void SupplierNameSearchItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_SupplierNameSearchItemStateChanged
        try
        {
            con = DriverManager.getConnection(url , user , password);
            pstSearchSupplier = con.prepareStatement(sqlSearchSupplier);
            pstSearchSupplier.setString(1 , SupplierNameSearch.getSelectedItem().toString());
            rsSearchSupplier = pstSearchSupplier.executeQuery();

            if (rsSearchSupplier.next())
            {
                SupplierPhone1.setText(rsSearchSupplier.getString("SupplierPhone_1"));
                SupplierPhone2.setText(rsSearchSupplier.getString("SupplierPhone_2"));
                SupplierAddress.setText(rsSearchSupplier.getString("SupplierAddress"));
                SupplierEmail.setText(rsSearchSupplier.getString("SupplierEmail"));
                SupplierCity.setText(rsSearchSupplier.getString("SupplierCity"));
            }
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_SupplierNameSearchItemStateChanged

    private void DelSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelSupplierActionPerformed
        try
        {
            con = DriverManager.getConnection(url , user , password);
            pstDelSupplier = con.prepareStatement(sqlDelSupplier);
            pstDelSupplier.setString(1, SupplierNameSearch.getSelectedItem().toString());
            pstDelSupplier.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "تم حذف البيانات بنجاح");
            SupplierNameSearch.removeItemAt(SupplierNameSearch.getSelectedIndex());
            SupplierPhone1.setText(null);
            SupplierPhone2.setText(null);
            SupplierAddress.setText(null);
            SupplierEmail.setText(null);
            SupplierCity.setText(null);
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_DelSupplierActionPerformed

    private void EditSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditSupplierActionPerformed
        try
        {
            con = DriverManager.getConnection(url , user , password);
            pstEditSupplier = con.prepareStatement(sqlEditSupplier);
            
            if (SupplierPhone1.getText().length() > 11 || SupplierPhone2.getText().length() > 11)
            {
             JOptionPane.showMessageDialog(null, "رقم الهاتف غير صحيح");
            }
            else
            {
            pstEditSupplier.setString(1, SupplierPhone1.getText());
            pstEditSupplier.setString(2, SupplierPhone2.getText());
            pstEditSupplier.setString(3, SupplierAddress.getText());
            pstEditSupplier.setString(4, SupplierEmail.getText());
            pstEditSupplier.setString(5, SupplierCity.getText());
            pstEditSupplier.setString(6, SupplierNameSearch.getSelectedItem().toString());
            rsEditSupplier = pstEditSupplier.executeUpdate();
            JOptionPane.showMessageDialog(null, "تم تعديل البيانات بنجاح");
            }
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_EditSupplierActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if (i == 0)
        {
        try
        {
            con = DriverManager.getConnection(url , user , password);
            pstSupplierNameSearch = con.prepareStatement(sqlSupplierNameSearch);
            rsSupplierNameSearch = pstSupplierNameSearch.executeQuery();
            
            while (rsSupplierNameSearch.next())
            {
              SupplierNameSearch.addItem(rsSupplierNameSearch.getString("SupplierName"));
            }
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        i = 1;
        }
    }//GEN-LAST:event_formWindowActivated
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new EditSupplier().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DelSupplier;
    private javax.swing.JButton EditSupplier;
    private javax.swing.JTextField SupplierAddress;
    private javax.swing.JTextField SupplierCity;
    private javax.swing.JTextField SupplierEmail;
    private javax.swing.JComboBox<String> SupplierNameSearch;
    private javax.swing.JTextField SupplierPhone1;
    private javax.swing.JTextField SupplierPhone2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
package NewStyleOffice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class EditMarketer extends javax.swing.JFrame {
    public EditMarketer() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MarketerNameSearch = new javax.swing.JComboBox<>();
        DelMarketer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        MarketerPhone1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        MarketerPhone2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        MarketerAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        MarketerEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        MarketerCity = new javax.swing.JTextField();
        EditMarketer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MarketerNameSearch.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        MarketerNameSearch.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                MarketerNameSearchItemStateChanged(evt);
            }
        });
        getContentPane().add(MarketerNameSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 398, 40));

        DelMarketer.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        DelMarketer.setText("حذف");
        DelMarketer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelMarketerActionPerformed(evt);
            }
        });
        getContentPane().add(DelMarketer, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 110, 40));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("تعديل بيانات المسوق");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 170, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("اسم المسوق");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 140, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("رقم الموبيل");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 140, 40));

        MarketerPhone1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        MarketerPhone1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(MarketerPhone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 400, 40));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("رقم الموبيل 2");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 140, 40));

        MarketerPhone2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        MarketerPhone2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(MarketerPhone2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 400, 40));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("العنوان");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 140, 40));

        MarketerAddress.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        MarketerAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(MarketerAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 400, 40));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Email");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 140, 40));

        MarketerEmail.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        MarketerEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(MarketerEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 400, 40));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("المحافظة");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 140, 40));

        MarketerCity.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        MarketerCity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(MarketerCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 400, 40));

        EditMarketer.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        EditMarketer.setText("تعديل");
        EditMarketer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditMarketerActionPerformed(evt);
            }
        });
        getContentPane().add(EditMarketer, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 110, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

        Connection con = null;
        PreparedStatement pstMarketerNameSearch , pstSearchMarketer , pstEditMarketer , pstDelMarketer = null;
        ResultSet rsMarketerNameSearch , rsSearchMarketer = null;
        int rsEditMarketer = 0;
        int i = 0;
        String url = "jdbc:mysql://localhost/NewStyleOffice?useUnicode=true&characterEncoding=UTF-8";
        String user = "root";
        String password = "";
        String sqlMarketerNameSearch = "Select * From Marketer";
        String sqlSearchMarketer = "Select * From Marketer WHERE MarketerName = ?";
        String sqlDelMarketer = "DELETE FROM Marketer WHERE MarketerName = ?";
        String sqlEditMarketer = "UPDATE Marketer SET MarketerPhone_1 = ?, "
                                + "MarketerPhone_2 = ?, MarketerAddress = ?, "
                                + "MarketerEmail = ?, MarketerCity = ? WHERE MarketerName = ?";
        
    private void MarketerNameSearchItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_MarketerNameSearchItemStateChanged
        try
        {
            con = DriverManager.getConnection(url , user , password);
            pstSearchMarketer = con.prepareStatement(sqlSearchMarketer);
            pstSearchMarketer.setString(1 , MarketerNameSearch.getSelectedItem().toString());
            rsSearchMarketer = pstSearchMarketer.executeQuery();

            if (rsSearchMarketer.next())
            {
                MarketerPhone1.setText(rsSearchMarketer.getString("MarketerPhone_1"));
                MarketerPhone2.setText(rsSearchMarketer.getString("MarketerPhone_2"));
                MarketerAddress.setText(rsSearchMarketer.getString("MarketerAddress"));
                MarketerEmail.setText(rsSearchMarketer.getString("MarketerEmail"));
                MarketerCity.setText(rsSearchMarketer.getString("MarketerCity"));
            }
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_MarketerNameSearchItemStateChanged

    private void DelMarketerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelMarketerActionPerformed
        try
        {
            con = DriverManager.getConnection(url , user , password);
            pstDelMarketer = con.prepareStatement(sqlDelMarketer);
            pstDelMarketer.setString(1, MarketerNameSearch.getSelectedItem().toString());
            pstDelMarketer.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "تم حذف البيانات بنجاح");
            MarketerNameSearch.removeItemAt(MarketerNameSearch.getSelectedIndex());
            MarketerPhone1.setText(null);
            MarketerPhone2.setText(null);
            MarketerAddress.setText(null);
            MarketerEmail.setText(null);
            MarketerCity.setText(null);
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_DelMarketerActionPerformed

    private void EditMarketerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditMarketerActionPerformed
        try
        {
            con = DriverManager.getConnection(url , user , password);
            pstEditMarketer = con.prepareStatement(sqlEditMarketer);

            if (MarketerPhone1.getText().length() > 11 || MarketerPhone2.getText().length() > 11)
            {
             JOptionPane.showMessageDialog(null, "رقم الهاتف غير صحيح");
            }
            else
            {
            pstEditMarketer.setString(1, MarketerPhone1.getText());
            pstEditMarketer.setString(2, MarketerPhone2.getText());
            pstEditMarketer.setString(3, MarketerAddress.getText());
            pstEditMarketer.setString(4, MarketerEmail.getText());
            pstEditMarketer.setString(5, MarketerCity.getText());
            pstEditMarketer.setString(6, MarketerNameSearch.getSelectedItem().toString());
            rsEditMarketer = pstEditMarketer.executeUpdate();
            JOptionPane.showMessageDialog(null, "تم تعديل البيانات بنجاح");
            }
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_EditMarketerActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if (i == 0)
        {
        try
        {
            con = DriverManager.getConnection(url , user , password);
            pstMarketerNameSearch = con.prepareStatement(sqlMarketerNameSearch);
            rsMarketerNameSearch = pstMarketerNameSearch.executeQuery();
            
            while (rsMarketerNameSearch.next())
            {
              MarketerNameSearch.addItem(rsMarketerNameSearch.getString("MarketerName"));
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
            java.util.logging.Logger.getLogger(EditMarketer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new EditMarketer().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DelMarketer;
    private javax.swing.JButton EditMarketer;
    private javax.swing.JTextField MarketerAddress;
    private javax.swing.JTextField MarketerCity;
    private javax.swing.JTextField MarketerEmail;
    private javax.swing.JComboBox<String> MarketerNameSearch;
    private javax.swing.JTextField MarketerPhone1;
    private javax.swing.JTextField MarketerPhone2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
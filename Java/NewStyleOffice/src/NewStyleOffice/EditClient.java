package NewStyleOffice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class EditClient extends javax.swing.JFrame {        
        public EditClient()
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ClientNameSearch = new javax.swing.JComboBox<>();
        DelClient = new javax.swing.JButton();
        MarketerName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ClientPhone1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ClientPhone2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ClientAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ClientEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ClientCity = new javax.swing.JTextField();
        EditClient = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        MarketerNameSearch = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ClientNameSearch.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ClientNameSearch.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ClientNameSearchItemStateChanged(evt);
            }
        });
        getContentPane().add(ClientNameSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 398, 40));

        DelClient.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        DelClient.setText("حذف");
        DelClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelClientActionPerformed(evt);
            }
        });
        getContentPane().add(DelClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 530, 110, 40));

        MarketerName.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        MarketerName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(MarketerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 400, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("اسم العميل");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 140, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("رقم الموبيل");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 140, 40));

        ClientPhone1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ClientPhone1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ClientPhone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 400, 40));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("رقم الموبيل 2");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 140, 40));

        ClientPhone2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ClientPhone2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ClientPhone2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 400, 40));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("العنوان");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 140, 40));

        ClientAddress.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ClientAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ClientAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 400, 40));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Email");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 140, 40));

        ClientEmail.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ClientEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ClientEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 400, 40));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("المحافظة");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 140, 40));

        ClientCity.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ClientCity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ClientCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 400, 40));

        EditClient.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        EditClient.setText("تعديل");
        EditClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditClientActionPerformed(evt);
            }
        });
        getContentPane().add(EditClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, 110, 40));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("اسم المسوق");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 140, 40));

        MarketerNameSearch.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        getContentPane().add(MarketerNameSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 398, 40));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("المسوق الحالي");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 140, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("تعديل بيانات العميل");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 170, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

        Connection con = null;
        PreparedStatement pstClientNameSearch , pstSearchClient , pstEditClient , pstDelClient , pstMarketerNameSearch = null;
        ResultSet rsClientNameSearch , rsSearchClient , rsMarketerNameSearch = null;
        int rsEditClient = 0;
        int i = 0;
        String url = "jdbc:mysql://localhost/NewStyleOffice?useUnicode=true&characterEncoding=UTF-8";
        String user = "root";
        String password = "";
        String sqlClientNameSearch = "Select * From Client";
        String sqlMarketerNameSearch = "Select * From Marketer";
        String sqlSearchClient = "Select * From Client WHERE ClientName = ?";
        String sqlDelClient = "DELETE FROM Client WHERE ClientName = ?";
        String sqlEditClient = "UPDATE Client SET ClientPhone_1 = ?, "
                                + "ClientPhone_2 = ?, ClientAddress = ?, "
                                + "ClientEmail = ?, ClientCity = ?, MarketerName = ? WHERE ClientName = ?";      
        
    private void ClientNameSearchItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ClientNameSearchItemStateChanged
        try
        { 
            con = DriverManager.getConnection(url , user , password);
            pstSearchClient = con.prepareStatement(sqlSearchClient);
            pstSearchClient.setString(1 , ClientNameSearch.getSelectedItem().toString());
            rsSearchClient = pstSearchClient.executeQuery();

            if (rsSearchClient.next())
            {
                ClientPhone1.setText(rsSearchClient.getString("ClientPhone_1"));
                ClientPhone2.setText(rsSearchClient.getString("ClientPhone_2"));
                ClientAddress.setText(rsSearchClient.getString("ClientAddress"));
                ClientEmail.setText(rsSearchClient.getString("ClientEmail"));
                ClientCity.setText(rsSearchClient.getString("ClientCity"));
                MarketerName.setText(rsSearchClient.getString("MarketerName"));
            }
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_ClientNameSearchItemStateChanged

    private void DelClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelClientActionPerformed
        try
        {
            con = DriverManager.getConnection(url , user , password);
            pstDelClient = con.prepareStatement(sqlDelClient);
            pstDelClient.setString(1, ClientNameSearch.getSelectedItem().toString());
            pstDelClient.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "تم حذف البيانات بنجاح");
            ClientNameSearch.removeItemAt(ClientNameSearch.getSelectedIndex());
            ClientPhone1.setText(null);
            ClientPhone2.setText(null);
            ClientAddress.setText(null);
            ClientEmail.setText(null);
            ClientCity.setText(null);
            MarketerNameSearch.removeAllItems();
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_DelClientActionPerformed

    private void EditClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditClientActionPerformed
        try
        {
            con = DriverManager.getConnection(url , user , password);
            pstEditClient = con.prepareStatement(sqlEditClient);

            if (ClientPhone1.getText().length() > 11 || ClientPhone2.getText().length() > 11)
            {
             JOptionPane.showMessageDialog(null, "رقم الهاتف غير صحيح");
            }
            else
            {
            pstEditClient.setString(1, ClientPhone1.getText());
            pstEditClient.setString(2, ClientPhone2.getText());
            pstEditClient.setString(3, ClientAddress.getText());
            pstEditClient.setString(4, ClientEmail.getText());
            pstEditClient.setString(5, ClientCity.getText());
            pstEditClient.setString(6, MarketerNameSearch.getSelectedItem().toString());
            pstEditClient.setString(7, ClientNameSearch.getSelectedItem().toString());
            rsEditClient = pstEditClient.executeUpdate();
            JOptionPane.showMessageDialog(null, "تم تعديل البيانات بنجاح");
            }
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_EditClientActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if (i == 0)
        {
        try
        {
            con = DriverManager.getConnection(url , user , password);
            
            pstClientNameSearch = con.prepareStatement(sqlClientNameSearch);
            rsClientNameSearch = pstClientNameSearch.executeQuery();
            
            pstMarketerNameSearch = con.prepareStatement(sqlMarketerNameSearch);
            rsMarketerNameSearch = pstMarketerNameSearch.executeQuery();
            
            while (rsClientNameSearch.next())
            {
              ClientNameSearch.addItem(rsClientNameSearch.getString("ClientName"));
            }
            
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
            java.util.logging.Logger.getLogger(EditClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new EditClient().setVisible(true);
        });
        }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ClientAddress;
    private javax.swing.JTextField ClientCity;
    private javax.swing.JTextField ClientEmail;
    private javax.swing.JComboBox<String> ClientNameSearch;
    private javax.swing.JTextField ClientPhone1;
    private javax.swing.JTextField ClientPhone2;
    private javax.swing.JButton DelClient;
    private javax.swing.JButton EditClient;
    private javax.swing.JLabel MarketerName;
    private javax.swing.JComboBox<String> MarketerNameSearch;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
package NewStyleOffice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class InsClient extends javax.swing.JFrame {
    public InsClient() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RecClient = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ClientPhone1 = new javax.swing.JTextField();
        ClientName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ClientPhone2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ClientAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ClientEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ClientCity = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        MarketerNameSearch = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RecClient.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        RecClient.setText("تسجيل");
        RecClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecClientActionPerformed(evt);
            }
        });
        getContentPane().add(RecClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 110, 40));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("العملاء");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 12, 151, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("اسم العميل");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 140, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("رقم الموبيل");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 140, 40));

        ClientPhone1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ClientPhone1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ClientPhone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 400, 40));

        ClientName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ClientName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ClientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 400, 40));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("رقم الموبيل 2");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 140, 40));

        ClientPhone2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ClientPhone2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ClientPhone2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 400, 40));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("العنوان");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 140, 40));

        ClientAddress.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ClientAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ClientAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 400, 40));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Email");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 140, 40));

        ClientEmail.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ClientEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ClientEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 400, 40));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("المحافظة");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 140, 40));

        ClientCity.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ClientCity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ClientCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 400, 40));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("اسم المسوق");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 140, 40));

        MarketerNameSearch.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        getContentPane().add(MarketerNameSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 398, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

        Connection con = null;
        PreparedStatement pst , pstMarketerNameSearch = null;
        ResultSet rsMarketerNameSearch = null;
        int i = 0;
        String url = "jdbc:mysql://localhost/NewStyleOffice?useUnicode=true&characterEncoding=UTF-8";
        String user = "root";
        String password = "";
        String sql = "INSERT INTO Client "
                + "(ClientName , ClientPhone_1 , ClientPhone_2 , "
                + "ClientAddress , ClientEmail , ClientCity , MarketerName) "
                + "VALUES (?,?,?,?,?,?,?)";
        String sqlMarketerNameSearch = "Select * From Marketer";

    private void RecClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecClientActionPerformed
        try
        {
            con = DriverManager.getConnection(url, user, password);
            pst = con.prepareStatement(sql);
            
            if (ClientPhone1.getText().length() > 11 || ClientPhone2.getText().length() > 11)
            {
             JOptionPane.showMessageDialog(null, "رقم الهاتف غير صحيح");
            }
            else
            {
            pst.setString(1, ClientName.getText());
            pst.setString(2, ClientPhone1.getText());
            pst.setString(3, ClientPhone2.getText());
            pst.setString(4, ClientAddress.getText());
            pst.setString(5, ClientEmail.getText());
            pst.setString(6, ClientCity.getText());
            pst.setString(7, MarketerNameSearch.getSelectedItem().toString());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "تم إدخال البيانات بنجاح");
            ClientName.setText(null);
            ClientPhone1.setText(null);
            ClientPhone2.setText(null);
            ClientAddress.setText(null);
            ClientEmail.setText(null);
            ClientCity.setText(null);
            }
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_RecClientActionPerformed

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
            java.util.logging.Logger.getLogger(InsClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new InsClient().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ClientAddress;
    private javax.swing.JTextField ClientCity;
    private javax.swing.JTextField ClientEmail;
    private javax.swing.JTextField ClientName;
    private javax.swing.JTextField ClientPhone1;
    private javax.swing.JTextField ClientPhone2;
    private javax.swing.JComboBox<String> MarketerNameSearch;
    private javax.swing.JButton RecClient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
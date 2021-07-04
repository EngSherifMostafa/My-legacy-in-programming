package NewStyleOffice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class InsMarketer extends javax.swing.JFrame {
    public InsMarketer() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RecClient = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        MarketerPhone1 = new javax.swing.JTextField();
        MarketerName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        MarketerPhone2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        MarketerAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        MarketerEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        MarketerCity = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RecClient.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        RecClient.setText("تسجيل");
        RecClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecClientActionPerformed(evt);
            }
        });
        getContentPane().add(RecClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 110, 40));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("المسوقون");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 12, 151, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("اسم المسوق");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 140, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("رقم الموبيل");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 140, 40));

        MarketerPhone1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        MarketerPhone1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(MarketerPhone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 400, 40));

        MarketerName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        MarketerName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(MarketerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 400, 40));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("رقم الموبيل 2");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 140, 40));

        MarketerPhone2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        MarketerPhone2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(MarketerPhone2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 400, 40));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("العنوان");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 140, 40));

        MarketerAddress.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        MarketerAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(MarketerAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 400, 40));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Email");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 140, 40));

        MarketerEmail.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        MarketerEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(MarketerEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 400, 40));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("المحافظة");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 140, 40));

        MarketerCity.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        MarketerCity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(MarketerCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 400, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        
    Connection con = null;
    PreparedStatement pst = null;
    String url = "jdbc:mysql://localhost/NewStyleOffice?useUnicode=true&characterEncoding=UTF-8";
    String user = "root";
    String password = "";
    String sql = "INSERT INTO Marketer "
            + "(MarketerName , MarketerPhone_1 , MarketerPhone_2 , "
            + "MarketerAddress , MarketerEmail , MarketerCity) VALUES (?,?,?,?,?,?)";

    private void RecClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecClientActionPerformed
        try
        {
            con = DriverManager.getConnection(url, user, password);
            pst = con.prepareStatement(sql);
            
            if (MarketerPhone1.getText().length() > 11 || MarketerPhone2.getText().length() > 11)
            {
             JOptionPane.showMessageDialog(null, "رقم الهاتف غير صحيح");
            }
            else
            {
            pst.setString(1, MarketerName.getText());
            pst.setString(2, MarketerPhone1.getText());
            pst.setString(3, MarketerPhone2.getText());
            pst.setString(4, MarketerAddress.getText());
            pst.setString(5, MarketerEmail.getText());
            pst.setString(6, MarketerCity.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "تم إدخال البيانات بنجاح");
            MarketerName.setText(null);
            MarketerPhone1.setText(null);
            MarketerPhone2.setText(null);
            MarketerAddress.setText(null);
            MarketerEmail.setText(null);
            MarketerCity.setText(null);
            }
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_RecClientActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsMarketer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new InsMarketer().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MarketerAddress;
    private javax.swing.JTextField MarketerCity;
    private javax.swing.JTextField MarketerEmail;
    private javax.swing.JTextField MarketerName;
    private javax.swing.JTextField MarketerPhone1;
    private javax.swing.JTextField MarketerPhone2;
    private javax.swing.JButton RecClient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
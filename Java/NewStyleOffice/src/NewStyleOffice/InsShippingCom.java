package NewStyleOffice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class InsShippingCom extends javax.swing.JFrame {
    public InsShippingCom() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ShippingComPhone1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ShippingComPhone2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ShippingComAddress = new javax.swing.JTextField();
        ShippingComName = new javax.swing.JTextField();
        RecShippingCom = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("شركات الشحن");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 170, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("اسم الشركة");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 140, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("رقم الموبيل");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 140, 40));

        ShippingComPhone1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ShippingComPhone1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ShippingComPhone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 400, 40));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("رقم الموبيل 2");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 140, 40));

        ShippingComPhone2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ShippingComPhone2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ShippingComPhone2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 400, 40));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("العنوان");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 140, 40));

        ShippingComAddress.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ShippingComAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ShippingComAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 400, 40));

        ShippingComName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ShippingComName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ShippingComName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 400, 40));

        RecShippingCom.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        RecShippingCom.setText("تسجيل");
        RecShippingCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecShippingComActionPerformed(evt);
            }
        });
        getContentPane().add(RecShippingCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 110, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

        Connection con = null;
        PreparedStatement pst = null;
        String url = "jdbc:mysql://localhost/NewStyleOffice?useUnicode=true&characterEncoding=UTF-8";
        String user = "root";
        String password = "";
        String sql = "INSERT INTO ShippingCom "
        + "(ShippingComName , ShippingComPhone_1 , ShippingComPhone_2 , "
        + "ShippingComAddress) VALUES (?,?,?,?)";
    
    private void RecShippingComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecShippingComActionPerformed
        try
        {
            con = DriverManager.getConnection(url, user, password);
            pst = con.prepareStatement(sql);

            if (ShippingComPhone1.getText().length() > 11 || ShippingComPhone2.getText().length() > 11)
            {
                JOptionPane.showMessageDialog(null, "رقم الهاتف غير صحيح");
            }
            else
            {
                pst.setString(1, ShippingComName.getText());
                pst.setString(2, ShippingComPhone1.getText());
                pst.setString(3, ShippingComPhone2.getText());
                pst.setString(4, ShippingComAddress.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "تم إدخال البيانات بنجاح");
                ShippingComName.setText(null);
                ShippingComPhone1.setText(null);
                ShippingComPhone2.setText(null);
                ShippingComAddress.setText(null);
            }
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_RecShippingComActionPerformed
   public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsShippingCom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new InsShippingCom().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RecShippingCom;
    private javax.swing.JTextField ShippingComAddress;
    private javax.swing.JTextField ShippingComName;
    private javax.swing.JTextField ShippingComPhone1;
    private javax.swing.JTextField ShippingComPhone2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}

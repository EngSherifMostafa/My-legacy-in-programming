package NewStyleOffice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class InsSupplier extends javax.swing.JFrame {
    public InsSupplier() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        SupplierName = new javax.swing.JTextField();
        RecSupplier = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("الموردون");
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

        SupplierName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        SupplierName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(SupplierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 400, 40));

        RecSupplier.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        RecSupplier.setText("تسجيل");
        RecSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecSupplierActionPerformed(evt);
            }
        });
        getContentPane().add(RecSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 110, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    Connection con = null;
    PreparedStatement pst = null;
    String url = "jdbc:mysql://localhost/NewStyleOffice?useUnicode=true&characterEncoding=UTF-8";
    String user = "root";
    String password = "";
    String sql = "INSERT INTO Supplier "
            + "(SupplierName , SupplierPhone_1 , SupplierPhone_2 , "
            + "SupplierAddress , SupplierEmail , SupplierCity) VALUES (?,?,?,?,?,?)";
    
    private void RecSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecSupplierActionPerformed
        try
        {
            con = DriverManager.getConnection(url, user, password);
            pst = con.prepareStatement(sql);
            
            if (SupplierPhone1.getText().length() > 11 || SupplierPhone2.getText().length() > 11)
            {
             JOptionPane.showMessageDialog(null, "رقم الهاتف غير صحيح");
            }
            else
            {
            pst.setString(1, SupplierName.getText());
            pst.setString(2, SupplierPhone1.getText());
            pst.setString(3, SupplierPhone2.getText());
            pst.setString(4, SupplierAddress.getText());
            pst.setString(5, SupplierEmail.getText());
            pst.setString(6, SupplierCity.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "تم إدخال البيانات بنجاح");
            SupplierName.setText(null);
            SupplierPhone1.setText(null);
            SupplierPhone2.setText(null);
            SupplierAddress.setText(null);
            SupplierEmail.setText(null);
            SupplierCity.setText(null);
            }
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_RecSupplierActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       java.awt.EventQueue.invokeLater(() -> {
           new InsSupplier().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RecSupplier;
    private javax.swing.JTextField SupplierAddress;
    private javax.swing.JTextField SupplierCity;
    private javax.swing.JTextField SupplierEmail;
    private javax.swing.JTextField SupplierName;
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
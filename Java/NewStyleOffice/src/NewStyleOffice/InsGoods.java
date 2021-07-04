package NewStyleOffice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class InsGoods extends javax.swing.JFrame {
    public InsGoods() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RecGood = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        GoodQty = new javax.swing.JTextField();
        GoodName = new javax.swing.JTextField();
        GoodPrice = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setName("Category"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(600, 330));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RecGood.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        RecGood.setText("تسجيل");
        RecGood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecGoodActionPerformed(evt);
            }
        });
        getContentPane().add(RecGood, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 110, 40));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("إدخال البضاعة");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 12, 151, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("الكمية");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 140, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("اسم البضاعة");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 140, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("سعر القطعة");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 140, 40));

        GoodQty.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        GoodQty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(GoodQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 400, 40));

        GoodName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        GoodName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(GoodName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 400, 40));

        GoodPrice.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        GoodPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(GoodPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 400, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    Connection con = null;
    PreparedStatement pst = null;
    String url = "jdbc:mysql://localhost/NewStyleOffice?useUnicode=true&characterEncoding=UTF-8";
    String user = "root";
    String password = "";
    String sql = "INSERT INTO Goods (GoodName, GoodPrice, GoodQty) VALUES (?,?,?)";
    
    private void RecGoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecGoodActionPerformed
        try
        {
            con = DriverManager.getConnection(url, user, password);
            pst = con.prepareStatement(sql);
            
            if(GoodName.getText().length() == 0 || GoodPrice.getText().length() == 0 || GoodQty.getText().length() == 0)
            {
                JOptionPane.showMessageDialog(null, "من فضلك أدخل البيانات كاملة");
            }
            else
            {
            pst.setString(1, GoodName.getText());
            pst.setString(2, GoodPrice.getText());
            pst.setString(3, GoodQty.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null , "تم إدخال البيانات بنجاح");
            GoodName.setText(null);
            GoodPrice.setText(null);
            GoodQty.setText(null);
            }
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null , ex);
        }
    }//GEN-LAST:event_RecGoodActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsGoods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new InsGoods().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField GoodName;
    private javax.swing.JTextField GoodPrice;
    private javax.swing.JTextField GoodQty;
    private javax.swing.JButton RecGood;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
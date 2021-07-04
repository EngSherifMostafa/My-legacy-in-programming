package NewStyleOffice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class EditGood extends javax.swing.JFrame {
    public EditGood() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DelGood = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        GoodQty = new javax.swing.JTextField();
        GoodPrice = new javax.swing.JTextField();
        GoodNameSearch = new javax.swing.JComboBox<>();
        EditGood = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DelGood.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        DelGood.setText("حذف");
        DelGood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelGoodActionPerformed(evt);
            }
        });
        getContentPane().add(DelGood, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 110, 40));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("تعديل البضاعة");
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

        GoodPrice.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        GoodPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(GoodPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 400, 40));

        GoodNameSearch.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        GoodNameSearch.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                GoodNameSearchItemStateChanged(evt);
            }
        });
        getContentPane().add(GoodNameSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 398, 40));

        EditGood.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        EditGood.setText("تعديل");
        EditGood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditGoodActionPerformed(evt);
            }
        });
        getContentPane().add(EditGood, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 110, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    Connection con = null;
    PreparedStatement pstGoodNameSearch , pstSearchGood , pstEditGood , pstDelGood = null;
    ResultSet rsGoodNameSearch , rsSearchGood = null;
    int rsEditGood = 0;
    int i = 0;
    String url = "jdbc:mysql://localhost/NewStyleOffice?useUnicode=true&characterEncoding=UTF-8";
    String user = "root";
    String password = "";
    String sqlGoodNameSearch = "Select * From Goods";
    String sqlSearchGood = "Select * From Goods WHERE GoodName = ?";
    String sqlDelGood = "Delete From Goods WHERE GoodName = ?";
    String sqlEditGood = "UPDATE Goods SET GoodPrice = ?, GoodQty = ? WHERE GoodName = ?";
    
    private void GoodNameSearchItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_GoodNameSearchItemStateChanged
        try
        {
            con = DriverManager.getConnection(url,user, password);
            pstSearchGood = con.prepareStatement(sqlSearchGood);
            pstSearchGood.setString(1, GoodNameSearch.getSelectedItem().toString());
            rsSearchGood = pstSearchGood.executeQuery();
            
            if (rsSearchGood.next())
            {
                GoodPrice.setText(rsSearchGood.getString("GoodPrice"));
                GoodQty.setText(rsSearchGood.getString("GoodQty"));
            }
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_GoodNameSearchItemStateChanged

    private void DelGoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelGoodActionPerformed
        try
        {
            con = DriverManager.getConnection(url,user, password);
            pstDelGood = con.prepareStatement(sqlDelGood);
            pstDelGood.setString(1, GoodNameSearch.getSelectedItem().toString());
            pstDelGood.executeUpdate();
            
            JOptionPane.showMessageDialog(null , "تم حذف البيانات بنجاح");
            GoodNameSearch.removeItemAt(GoodNameSearch.getSelectedIndex());
            GoodPrice.setText(null);
            GoodQty.setText(null);
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null , ex);
        }
    }//GEN-LAST:event_DelGoodActionPerformed

    private void EditGoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditGoodActionPerformed
        try
        {
        con = DriverManager.getConnection(url,user, password);
        pstEditGood = con.prepareStatement(sqlEditGood);
        
        if(GoodPrice.getText().length() == 0 || GoodQty.getText().length() == 0)
            {
                JOptionPane.showMessageDialog(null, "من فضلك أدخل البيانات كاملة");
            }
        else
            {
            pstEditGood.setString(1, GoodPrice.getText());
            pstEditGood.setString(2, GoodQty.getText());
            pstEditGood.setString(3, GoodNameSearch.getSelectedItem().toString());
            rsEditGood = pstEditGood.executeUpdate();
            JOptionPane.showMessageDialog(null, "تم تعديل البيانات بنجاح");
            }
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_EditGoodActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if (i == 0)
        {
        try
        {
            con = DriverManager.getConnection(url , user , password);
            pstGoodNameSearch = con.prepareStatement(sqlGoodNameSearch);
            rsGoodNameSearch = pstGoodNameSearch.executeQuery();
            
            while (rsGoodNameSearch.next())
            {
              GoodNameSearch.addItem(rsGoodNameSearch.getString("GoodName"));
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
            java.util.logging.Logger.getLogger(EditGood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new EditGood().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DelGood;
    private javax.swing.JButton EditGood;
    private javax.swing.JComboBox<String> GoodNameSearch;
    private javax.swing.JTextField GoodPrice;
    private javax.swing.JTextField GoodQty;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
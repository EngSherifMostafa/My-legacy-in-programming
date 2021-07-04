package NewStyleOffice;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Billing extends javax.swing.JFrame 
{       
    public Billing()
    {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        MarketerName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Post = new javax.swing.JButton();
        PrintBill = new javax.swing.JButton();
        GoodNameCom = new javax.swing.JComboBox<>();
        ClientNameCom = new javax.swing.JComboBox<>();
        GoodQtyTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BillTable = new javax.swing.JTable();
        RecBill = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        DelRow = new javax.swing.JButton();
        ClientPhone1 = new javax.swing.JLabel();
        ClientPhone2 = new javax.swing.JLabel();
        ClientCity = new javax.swing.JLabel();
        ClientEmail = new javax.swing.JLabel();
        ClientAddress = new javax.swing.JLabel();
        MarketerPhone2 = new javax.swing.JLabel();
        OneGoodPriceTxt = new javax.swing.JLabel();
        TotalPriceTxt = new javax.swing.JLabel();
        TotalTable = new javax.swing.JLabel();
        MarketerPhone1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("الكمية");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 440, 140, 40));

        MarketerName.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        MarketerName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(MarketerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 390, 200, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("اسم العميل");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 40, 140, 40));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("إجمالي الفاتورة");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 130, 40));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("إجمالي الصنف");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 490, 140, 40));

        Post.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Post.setText("ترحيل");
        Post.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PostActionPerformed(evt);
            }
        });
        getContentPane().add(Post, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, 110, 40));

        PrintBill.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        PrintBill.setText("طباعة");
        getContentPane().add(PrintBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, 110, 40));

        GoodNameCom.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        GoodNameCom.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                GoodNameComItemStateChanged(evt);
            }
        });
        getContentPane().add(GoodNameCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 340, 310, 40));

        ClientNameCom.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ClientNameCom.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ClientNameComItemStateChanged(evt);
            }
        });
        getContentPane().add(ClientNameCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 40, 310, 40));

        GoodQtyTxt.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        GoodQtyTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        GoodQtyTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                GoodQtyTxtKeyReleased(evt);
            }
        });
        getContentPane().add(GoodQtyTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 440, 310, 40));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("رقم الموبيل");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 90, 140, 40));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("رقم الموبيل 2");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 140, 140, 40));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("العنوان");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 240, 140, 40));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Email");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 290, 140, 40));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("المحافظة");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 190, 140, 40));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("سعر القطعة");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 390, 140, 40));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("رقم الموبيل");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 90, 40));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("رقم الموبيل 2");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 90, 40));

        BillTable.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        BillTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "إجمالي السعر", "الكمية", "سعر القطعة", "نوع البضاعة"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BillTable.setToolTipText("");
        jScrollPane1.setViewportView(BillTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 690, 320));

        RecBill.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        RecBill.setText("تسجيل");
        RecBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecBillActionPerformed(evt);
            }
        });
        getContentPane().add(RecBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 500, 110, 40));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("اسم المسوق");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 90, 40));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("نوع الصنف");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 340, 140, 40));

        DelRow.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        DelRow.setText("حذف");
        DelRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelRowActionPerformed(evt);
            }
        });
        getContentPane().add(DelRow, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, 110, 40));

        ClientPhone1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ClientPhone1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(ClientPhone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, 310, 40));

        ClientPhone2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ClientPhone2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(ClientPhone2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 140, 310, 40));

        ClientCity.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ClientCity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(ClientCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 190, 310, 40));

        ClientEmail.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ClientEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(ClientEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, 310, 40));

        ClientAddress.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ClientAddress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(ClientAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 240, 310, 40));

        MarketerPhone2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        MarketerPhone2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(MarketerPhone2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 200, 40));

        OneGoodPriceTxt.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        OneGoodPriceTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(OneGoodPriceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 390, 310, 40));

        TotalPriceTxt.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        TotalPriceTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(TotalPriceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 490, 310, 40));

        TotalTable.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        TotalTable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(TotalTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 130, 40));

        MarketerPhone1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        MarketerPhone1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(MarketerPhone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 200, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("فاتورة");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 151, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    Connection con = null;
    PreparedStatement pstMarketerCom , pstClientCom , pstGoodCom , pstClient , pstGood , pstMarketer = null;    
    ResultSet rs , rsClientCom , rsGoodCom , rsMarketerCom , rsClient , rsGood , rsMarketer = null;
    String url = "jdbc:mysql://localhost/NewStyleOffice?useUnicode=true&characterEncoding=UTF-8";
    String user = "root";
    String password = "";
    String sqlClientCom = "Select * From Client";
    String sqlMarketerCom = "Select * From Marketer";
    String sqlGoodCom = "Select * From Goods";
    String sqlClient = "SELECT * FROM Client WHERE ClientName = ?";
    String sqlGood = "SELECT * FROM Goods WHERE GoodName = ?";    
    String sqlMarketer = "SELECT * FROM Marketer WHERE MarketerName = ?";
    DefaultTableModel model;
    int Sum = 0;
    int i = 0;
    
    private void PostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PostActionPerformed
        if (GoodQtyTxt.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(null , "من فضلك أدخل الكمية");
        }
        else
        {
            model = (DefaultTableModel) BillTable.getModel();
            model.addRow(new Object[]
            {
             TotalPriceTxt.getText(),
             GoodQtyTxt.getText(),
             OneGoodPriceTxt.getText(),
             GoodNameCom.getSelectedItem().toString()
            }
            );
            
            Sum = 0;
            for (int c = 0 ; c < BillTable.getRowCount() ; c++)
            {
                Sum = Sum + new Integer(BillTable.getValueAt(c,0).toString());
            }
            TotalTable.setText(Integer.toString(Sum));    
        }
    }//GEN-LAST:event_PostActionPerformed
    
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if (i == 0)
        {
        try
        {                       
            con = DriverManager.getConnection(url, user, password);
            pstClientCom = con.prepareStatement(sqlClientCom);
            pstGoodCom = con.prepareStatement(sqlGoodCom);
            
            rsClientCom = pstClientCom.executeQuery();
            rsGoodCom = pstGoodCom.executeQuery();
            
            while (rsClientCom.next())
            {
                ClientNameCom.addItem(rsClientCom.getString("ClientName"));
            }
            
            while (rsGoodCom.next())
            {
                GoodNameCom.addItem(rsGoodCom.getString("GoodName"));
            }
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        i = 1;
        }
    }//GEN-LAST:event_formWindowActivated

    private void ClientNameComItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ClientNameComItemStateChanged
        try
        {
            con = DriverManager.getConnection(url, user, password);
            
            pstClient = con.prepareStatement(sqlClient);
            pstClient.setString(1, ClientNameCom.getSelectedItem().toString());
            rsClient = pstClient.executeQuery();
            
            if (rsClient.next())
            {
                ClientPhone1.setText(rsClient.getString("ClientPhone_1"));
                ClientPhone2.setText(rsClient.getString("ClientPhone_2"));
                ClientAddress.setText(rsClient.getString("ClientAddress"));
                ClientEmail.setText(rsClient.getString("ClientEmail"));
                ClientCity.setText(rsClient.getString("ClientCity"));
                MarketerName.setText(rsClient.getString("MarketerName"));
            }
            
            pstMarketer = con.prepareStatement(sqlMarketer);
            pstMarketer.setString(1 , MarketerName.getText());
            rsMarketer = pstMarketer.executeQuery();
            
            if (rsMarketer.next())
            {
            MarketerPhone1.setText(rsMarketer.getString("MarketerPhone_1"));
            MarketerPhone2.setText(rsMarketer.getString("MarketerPhone_2"));
            }
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_ClientNameComItemStateChanged

    private void GoodNameComItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_GoodNameComItemStateChanged
        try
        {
        con = DriverManager.getConnection(url, user, password);
        pstGood = con.prepareStatement(sqlGood);
        pstGood.setString(1 , GoodNameCom.getSelectedItem().toString());
        rsGood = pstGood.executeQuery();
        
            if (rsGood.next())
            {
                OneGoodPriceTxt.setText(rsGood.getString("GoodPrice"));
            }
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_GoodNameComItemStateChanged

    private void GoodQtyTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GoodQtyTxtKeyReleased
        try
        {
            int Qty = new Integer(GoodQtyTxt.getText());
            int Price = new Integer(OneGoodPriceTxt.getText());
            int Total = Price * Qty;
            TotalPriceTxt.setText(Integer.toString(Total));
        }
        catch (NumberFormatException ex)
        {
            TotalPriceTxt.setText("");
        }
    }//GEN-LAST:event_GoodQtyTxtKeyReleased

    private void RecBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecBillActionPerformed
        model = (DefaultTableModel) BillTable.getModel();
        if (model.getRowCount() == 0)
        {
            JOptionPane.showMessageDialog(null, "من فضلك قم بترحيل المبيعات للجدول");
        }
        else
        {
            JSONObject obj = new JSONObject();
            obj.put("ClientName" , ClientNameCom.getSelectedItem().toString());
            obj.put("ClientPhone_1", ClientPhone1.getText());
            obj.put("ClientPhone_2", ClientPhone2.getText());
            obj.put("ClientCity", ClientCity.getText());
            obj.put("ClientAddress", ClientAddress.getText());
            obj.put("ClientEmail" , ClientEmail.getText());
            obj.put("MarketerName", MarketerName.getText());
            obj.put("MarketerPhone_1", MarketerPhone1.getText());
            obj.put("MarketerPhone_2", MarketerPhone2.getText());
            
            //Four Keys with infinite values 
            JSONArray goodName = new JSONArray();
            JSONArray goodQty = new JSONArray();
            JSONArray oneGoodPrice = new JSONArray();
            JSONArray totalPrice = new JSONArray();
            for (int c = 0 ; c < model.getRowCount() ; c++)
            {
                goodName.add(model.getValueAt(c, 3));
                goodQty.add(model.getValueAt(c, 2));
                oneGoodPrice.add(model.getValueAt(c, 1));
                totalPrice.add(model.getValueAt(c, 0));
            }
            
            //Four keys
            obj.put("GoodName", goodName);
            obj.put("GoodQty", goodQty);
            obj.put("OneGoodPrice", oneGoodPrice);
            obj.put("TotalPrice", totalPrice);
            
            try
            {
            FileWriter BillFile = new FileWriter("Bills.json");
            BillFile.write(obj.toString());
            BillFile.flush();
            
            
            con = DriverManager.getConnection(url, user, password);
            }
            catch (SQLException | IOException ex)
            {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }//GEN-LAST:event_RecBillActionPerformed

    private void DelRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelRowActionPerformed
        model = (DefaultTableModel) BillTable.getModel();
        try
        {
        model.removeRow(BillTable.getSelectedRow());
        
            Sum = 0;
            for (int c = 0 ; c < BillTable.getRowCount() ; c++)
            {
                Sum = Sum + new Integer(BillTable.getValueAt(c,0).toString());
            }
            TotalTable.setText(Integer.toString(Sum));
        }
        catch (NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(ClientPhone1, ex);
        }
    }//GEN-LAST:event_DelRowActionPerformed
    
    public static void main(String args[])
    {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Billing().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BillTable;
    private javax.swing.JLabel ClientAddress;
    private javax.swing.JLabel ClientCity;
    private javax.swing.JLabel ClientEmail;
    private javax.swing.JComboBox<String> ClientNameCom;
    private javax.swing.JLabel ClientPhone1;
    private javax.swing.JLabel ClientPhone2;
    private javax.swing.JButton DelRow;
    private javax.swing.JComboBox<String> GoodNameCom;
    private javax.swing.JTextField GoodQtyTxt;
    private javax.swing.JLabel MarketerName;
    private javax.swing.JLabel MarketerPhone1;
    private javax.swing.JLabel MarketerPhone2;
    private javax.swing.JLabel OneGoodPriceTxt;
    private javax.swing.JButton Post;
    private javax.swing.JButton PrintBill;
    private javax.swing.JButton RecBill;
    private javax.swing.JLabel TotalPriceTxt;
    private javax.swing.JLabel TotalTable;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
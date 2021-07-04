/* 
ROV Control Code via Game controller   
by : Mohammed Hmeed  
*/
package RovController;

public class RovController extends javax.swing.JFrame
{
    /**
     * Creates new form RovController
     */
     RovCommunication rovCommunication = new RovCommunication();
     public RovController()
    {
        initComponents();       
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        forwardBtn = new javax.swing.JButton();
        backwardBtn = new javax.swing.JButton();
        rightBtn = new javax.swing.JButton();
        leftBtn = new javax.swing.JButton();
        upBtn = new javax.swing.JButton();
        downBtn = new javax.swing.JButton();
        stopBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        oArmBtn = new javax.swing.JButton();
        cArmBtn = new javax.swing.JButton();
        rArmBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        RovStateLable = new javax.swing.JLabel();
        RovStateLable2 = new javax.swing.JLabel();
        ArmStateLable = new javax.swing.JLabel();
        ArmStateLable2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ROV GUI Controller");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(202, 162, 162));
        setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        setForeground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        forwardBtn.setBackground(new java.awt.Color(0, 153, 102));
        forwardBtn.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        forwardBtn.setText("Forward");
        forwardBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                forwardBtnKeyPressed(evt);
            }
        });

        backwardBtn.setBackground(new java.awt.Color(0, 153, 102));
        backwardBtn.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        backwardBtn.setText("Backward");
        backwardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backwardBtnActionPerformed(evt);
            }
        });

        rightBtn.setBackground(new java.awt.Color(0, 153, 102));
        rightBtn.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        rightBtn.setText("Right");
        rightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightBtnActionPerformed(evt);
            }
        });

        leftBtn.setBackground(new java.awt.Color(0, 153, 102));
        leftBtn.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        leftBtn.setText("Left");

        upBtn.setBackground(new java.awt.Color(0, 153, 102));
        upBtn.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        upBtn.setText("UP");
        upBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upBtnActionPerformed(evt);
            }
        });

        downBtn.setBackground(new java.awt.Color(0, 153, 102));
        downBtn.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        downBtn.setText("DOWN");

        stopBtn.setBackground(new java.awt.Color(255, 51, 51));
        stopBtn.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        stopBtn.setText("STOP");

        resetBtn.setBackground(new java.awt.Color(102, 102, 255));
        resetBtn.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        resetBtn.setText("RESET");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        oArmBtn.setBackground(new java.awt.Color(102, 204, 255));
        oArmBtn.setFont(new java.awt.Font("Aharoni", 0, 12)); // NOI18N
        oArmBtn.setText("Open Arm ");

        cArmBtn.setBackground(new java.awt.Color(102, 204, 255));
        cArmBtn.setFont(new java.awt.Font("Aharoni", 0, 12)); // NOI18N
        cArmBtn.setText("Close Arm ");

        rArmBtn.setBackground(new java.awt.Color(102, 204, 255));
        rArmBtn.setFont(new java.awt.Font("Aharoni", 0, 12)); // NOI18N
        rArmBtn.setText("Rotate Arm");
        rArmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rArmBtnActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 204, 255));
        jButton1.setFont(new java.awt.Font("Aharoni", 0, 12)); // NOI18N
        jButton1.setText("Rotate AntiClkWise");

        RovStateLable.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        RovStateLable.setText("ROV State :");

        RovStateLable2.setText("jLabel2");

        ArmStateLable.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        ArmStateLable.setText("ARM State :");

        ArmStateLable2.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backwardBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(upBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(downBtn))
                        .addGap(108, 108, 108))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(forwardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(oArmBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cArmBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(leftBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(rightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stopBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rArmBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RovStateLable, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ArmStateLable))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ArmStateLable2)
                            .addComponent(RovStateLable2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RovStateLable, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RovStateLable2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ArmStateLable, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ArmStateLable2))
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(forwardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(leftBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stopBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backwardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(downBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rArmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cArmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oArmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void upBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upBtnActionPerformed
        
    System.out.println ("java") ;  
// TODO add your handlijk code here:
    }//GEN-LAST:event_upBtnActionPerformed

    private void backwardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backwardBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backwardBtnActionPerformed

    private void rightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightBtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_rightBtnActionPerformed
    
    private void rArmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rArmBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rArmBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resetBtnActionPerformed

    private void forwardBtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_forwardBtnKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_forwardBtnKeyPressed
    
    public void upBtnAction(java.awt.event.ActionEvent evt) {                                      
        rovCommunication.sendRovBytes("u");
    }                                     
    public void downBtnAction(java.awt.event.ActionEvent evt) {                                      
        rovCommunication.sendRovBytes("d");
    }
    public void forwardBtnAction(java.awt.event.ActionEvent evt) {                                           
        rovCommunication.sendRovBytes("f");
    }                                          

    public void backwardBtnAction(java.awt.event.ActionEvent evt) {                                            
        rovCommunication.sendRovBytes("b");
    }                                           

    public void rightBtnAction(java.awt.event.ActionEvent evt) {                                         
    rovCommunication.sendRovBytes("r");       
    }                                     
    public void leftBtnAction(java.awt.event.ActionEvent evt) {                                         
    rovCommunication.sendRovBytes("l");       
    }
    
   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        RovCommunication rovCommunication = new RovCommunication();
        rovCommunication.serialInit("com3");    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RovController().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ArmStateLable;
    private javax.swing.JLabel ArmStateLable2;
    private javax.swing.JLabel RovStateLable;
    private javax.swing.JLabel RovStateLable2;
    private javax.swing.JButton backwardBtn;
    private javax.swing.JButton cArmBtn;
    private javax.swing.JButton downBtn;
    private javax.swing.JButton forwardBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton leftBtn;
    private javax.swing.JButton oArmBtn;
    private javax.swing.JButton rArmBtn;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton rightBtn;
    private javax.swing.JButton stopBtn;
    private javax.swing.JButton upBtn;
    // End of variables declaration//GEN-END:variables
}
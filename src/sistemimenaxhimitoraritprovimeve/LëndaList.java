
package sistemimenaxhimitoraritprovimeve;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class LëndaList extends javax.swing.JFrame {

    Connection Con=null;
    PreparedStatement Pst=null;
    ResultSet Rs=null,Rs1=null;
    Statement St=null,St1=null;
    public LëndaList() {
        initComponents();
        DisplayLënda();
    }

    private void DisplayLënda(){
        try{
            Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root","");
            St=Con.createStatement();
            Rs=St.executeQuery("Select * from LëndaTbl");
            LëndaTable.setModel(DbUtils.resultSetToTableModel(Rs));
        
        }catch(SQLException e){
        
        
        }
    }
    
    int LëndaID;
    private void CountLëndet(){
    
        try{
            St1=Con.createStatement();
            Rs1=St1.executeQuery("Select Max(LëndaID) from LëndaTbl");
            Rs1.next();
            LëndaID=Rs1.getInt(1)+1;
        }catch(SQLException e){
        
        
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        EmriLëndesTb = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        PërshkrimiLëndesTb = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        SemestriTb = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        VitiAkademikTb = new javax.swing.JTextField();
        DeleteBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        EditoBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        LëndaTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel2.setText("Lëndet");

        jLabel1.setText("Numri i Lëndeve është :");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField2.setText("Search");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel5.setText("Emri i Lëndes");

        EmriLëndesTb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        EmriLëndesTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmriLëndesTbActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel6.setText("Përshkrimi i Lëndes");

        PërshkrimiLëndesTb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PërshkrimiLëndesTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PërshkrimiLëndesTbActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel7.setText("Semestri");

        SemestriTb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SemestriTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SemestriTbActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel8.setText("Viti Akademik");

        VitiAkademikTb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        VitiAkademikTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VitiAkademikTbActionPerformed(evt);
            }
        });

        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        EditoBtn.setText("Edito");
        EditoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditoBtnActionPerformed(evt);
            }
        });

        BackBtn.setText("Back");
        BackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackBtnMouseClicked(evt);
            }
        });
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        LëndaTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LëndaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        LëndaTable.setRowHeight(28);
        LëndaTable.setSelectionBackground(new java.awt.Color(51, 0, 204));
        LëndaTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LëndaTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(LëndaTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmriLëndesTb, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(SemestriTb, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(PërshkrimiLëndesTb, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VitiAkademikTb, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(DeleteBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SaveBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EditoBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BackBtn))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1035, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 149, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PërshkrimiLëndesTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(VitiAkademikTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(EmriLëndesTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(SemestriTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(392, 392, 392)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void EmriLëndesTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmriLëndesTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmriLëndesTbActionPerformed

    private void PërshkrimiLëndesTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PërshkrimiLëndesTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PërshkrimiLëndesTbActionPerformed

    private void SemestriTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SemestriTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SemestriTbActionPerformed

    private void VitiAkademikTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VitiAkademikTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VitiAkademikTbActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        if(EmriLëndesTb.getText().isEmpty()||PërshkrimiLëndesTb.getText().isEmpty()||SemestriTb.getText().isEmpty()||VitiAkademikTb.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Information !!!");
        }else{
            try{
                CountLëndet();
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root","");
                PreparedStatement Save=Con.prepareStatement("Insert into LëndetTbl values (?,?,?)");
                Save.setInt(1, LëndaID);
                Save.setString(2, PërshkrimiLëndesTb.getText());
                Save.setString(3, SemestriTb.getText());
                Save.setString(4, VitiAkademikTb.getText());
                int row=Save.executeUpdate();
                JOptionPane.showMessageDialog(this, "Lënda Added!!!");
                Con.close();
                DisplayLënda();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this, ex);
            }
        
        }
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void EditoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditoBtnActionPerformed
       if(!(EmriLëndesTb.getText().isEmpty()||PërshkrimiLëndesTb.getText().isEmpty()||SemestriTb.getText().isEmpty()||VitiAkademikTb.getText().isEmpty())){
        try{
                String UpdateQuery="Update LëndaTbl set EmriLëndes=?,PërshkrimiLëndes=?,Semestri=?,VitiAkademik where LëndaID=?"+Key;
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root","");
                PreparedStatement Save=Con.prepareStatement(UpdateQuery);
                Save.setInt(4, Key);
                Save.setString(1, EmriLëndesTb.getText());
                Save.setString(2, PërshkrimiLëndesTb.getText());
                Save.setString(3, SemestriTb.getText());
                Save.setString(2, VitiAkademikTb.getText());
                if(Save.executeUpdate()==1){
                    DisplayLënda();
                    JOptionPane.showMessageDialog(this,"Lënda Updated!!!");
                }else{
                
                    JOptionPane.showMessageDialog(this,"Mising Information!!!");
                }
                
            }catch(Exception e){
            
      
            }
       }
    }//GEN-LAST:event_EditoBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackBtnActionPerformed

    int Key=0;
    private void LëndaTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LëndaTableMouseClicked
        DefaultTableModel model =(DefaultTableModel) LëndaTable.getModel();
        int MyIndex=LëndaTable.getSelectedRow();
        Key=Integer.valueOf(model.getValueAt(MyIndex,0).toString());
        if(EmriLëndesTb.getText().isEmpty()||PërshkrimiLëndesTb.getText().isEmpty()||SemestriTb.getText().isEmpty()||VitiAkademikTb.getText().isEmpty())
        EmriLëndesTb.setText(model.getValueAt(MyIndex,1).toString());
        PërshkrimiLëndesTb.setText(model.getValueAt(MyIndex,2).toString());
        SemestriTb.setText(model.getValueAt(MyIndex,3).toString());
        VitiAkademikTb.setText(model.getValueAt(MyIndex,4).toString());
    }//GEN-LAST:event_LëndaTableMouseClicked

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        if(Key==0){
            JOptionPane.showMessageDialog(this, "Select a Lënda !!");
        }else{
            try{
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root","");
                String Query="Delete from LëndaTbl where LëndaID="+Key;
                Statement Del=Con.createStatement();
                Del.executeUpdate(Query);
                JOptionPane.showMessageDialog(this,"Lënda Deleted!!!");
                DisplayLënda();
            }catch(Exception e){
            
      
            }
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
        new MainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LëndaList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LëndaList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LëndaList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LëndaList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LëndaList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditoBtn;
    private javax.swing.JTextField EmriLëndesTb;
    private javax.swing.JTable LëndaTable;
    private javax.swing.JTextField PërshkrimiLëndesTb;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JTextField SemestriTb;
    private javax.swing.JTextField VitiAkademikTb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}

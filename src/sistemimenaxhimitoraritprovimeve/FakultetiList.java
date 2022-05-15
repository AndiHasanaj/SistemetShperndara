
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

public class FakultetiList extends javax.swing.JFrame {

    Connection Con=null;
    PreparedStatement Pst=null;
    ResultSet Rs=null,Rs1=null;
    Statement St=null,St1=null;
    public FakultetiList() {
        initComponents();
        DisplayFakulteti();
        UpdateCombo();
    }

    private void DisplayFakulteti(){
        try{
            Con=DriverManager.getConnection("jdbc:mysql://localhost:3308/sistemipërmenaxhimineoraritprovimeve","root","");
            St=Con.createStatement();
            Rs=St.executeQuery("Select * from Fakulteti");
            FakultetiTable.setModel(DbUtils.resultSetToTableModel(Rs));
        
        }catch(SQLException e){
        
        
        }
    }
    public void UpdateCombo(){
        String ComboBox="select * from universiteti";
        try{
            Con=DriverManager.getConnection("jdbc:mysql://localhost:3308/sistemipërmenaxhimineoraritprovimeve","root","");
            Pst=Con.prepareStatement(ComboBox);
            Rs=Pst.executeQuery();
            while(Rs.next()){
                UniversitetiCb.addItem(Rs.getString("EmriUniversiteti"));
            }
        }
        catch(Exception e){
            
        }
    }
    
    int FakultetiID;
    private void CountFakultetet(){
    
        try{
            St1=Con.createStatement();
            Rs1=St1.executeQuery("Select Max(FakultetiID) from Fakulteti");
            Rs1.next();
            FakultetiID=Rs1.getInt(1)+1;
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
        EmriFakultetitTb = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        UniversitetiCb = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        AdresaCb = new javax.swing.JComboBox<>();
        SaveBtn = new javax.swing.JButton();
        EditoBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        FakultetiTable = new javax.swing.JTable();
        DeleteBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel2.setText("Fakulteti");

        jLabel1.setText("Numri i Fakulteteve është :");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField2.setText("Search");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel5.setText("Emri i Fakultetit");

        EmriFakultetitTb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        EmriFakultetitTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmriFakultetitTbActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel6.setText("Universiteti");

        UniversitetiCb.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UniversitetiCbFocusGained(evt);
            }
        });
        UniversitetiCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UniversitetiCbActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel7.setText("Adresa");

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

        FakultetiTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        FakultetiTable.setModel(new javax.swing.table.DefaultTableModel(
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
        FakultetiTable.setRowHeight(28);
        FakultetiTable.setSelectionBackground(new java.awt.Color(51, 0, 204));
        FakultetiTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FakultetiTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(FakultetiTable);

        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AdresaCb, javax.swing.GroupLayout.Alignment.LEADING, 0, 300, Short.MAX_VALUE)
                            .addComponent(EmriFakultetitTb, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UniversitetiCb, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(DeleteBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SaveBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EditoBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BackBtn)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1035, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(UniversitetiCb)
                            .addComponent(EmriFakultetitTb, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdresaCb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(377, Short.MAX_VALUE))))
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

    private void EmriFakultetitTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmriFakultetitTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmriFakultetitTbActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        if(EmriFakultetitTb.getText().isEmpty()||UniversitetiCb.getSelectedIndex()==-1||AdresaCb.getSelectedIndex()==-1)
        {
            JOptionPane.showMessageDialog(this, "Missing Information !!!");
        }else{
            try{
                CountFakultetet();
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3308/sistemipërmenaxhimineoraritprovimeve","root","");
                PreparedStatement Save=Con.prepareStatement("Insert into FakultetiTbl values (?,?,?)");
                Save.setInt(1, FakultetiID);
                Save.setString(2, EmriFakultetitTb.getText());
                Save.setInt(3, UniversitetiCb.getSelectedIndex());
                Save.setInt(4, AdresaCb.getSelectedIndex());
                int row=Save.executeUpdate();
                JOptionPane.showMessageDialog(this, "Fakulteti Added!!!");
                Con.close();
                DisplayFakulteti();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this, ex);
            }
        
        }
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void EditoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditoBtnActionPerformed
        if(!(EmriFakultetitTb.getText().isEmpty()||UniversitetiCb.getSelectedIndex()==-1||AdresaCb.getSelectedIndex()==-1)){
             try{
                String UpdateQuery="Update FakultetTbl set EmriFakultetit=?,UniversitetiID=?,AdresaID=? where FakultetiID=?"+Key;
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root","");
                PreparedStatement Save=Con.prepareStatement(UpdateQuery);
                Save.setInt(4, Key);
                Save.setString(1, EmriFakultetitTb.getText());
                Save.setInt(2, UniversitetiCb.getSelectedIndex());
                Save.setInt(3, AdresaCb.getSelectedIndex());
                if(Save.executeUpdate()==1){
                    DisplayFakulteti();
                    JOptionPane.showMessageDialog(this,"Fakulteti Updated!!!");
                }else{
                
                    JOptionPane.showMessageDialog(this,"Mising Information!!!");
                }
                
            }catch(Exception e){
            
      
            }
        }
    }//GEN-LAST:event_EditoBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        new MainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnActionPerformed

    int Key=0;
    private void FakultetiTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FakultetiTableMouseClicked
        DefaultTableModel model =(DefaultTableModel) FakultetiTable.getModel();
        int MyIndex=FakultetiTable.getSelectedRow();
        Key=Integer.valueOf(model.getValueAt(MyIndex,0).toString());
        if(EmriFakultetitTb.getText().isEmpty()||UniversitetiCb.getSelectedIndex()==-1||AdresaCb.getSelectedIndex()==-1)
        EmriFakultetitTb.setText(model.getValueAt(MyIndex,1).toString());
        UniversitetiCb.setSelectedIndex(Integer.valueOf(model.getValueAt(MyIndex,2).toString()));
        AdresaCb.setSelectedIndex(Integer.valueOf(model.getValueAt(MyIndex,3).toString()));
    }//GEN-LAST:event_FakultetiTableMouseClicked

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        if(Key==0){
            JOptionPane.showMessageDialog(this, "Select a Fakultet !!");
        }else{
            try{
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root","");
                String Query="Delete from FakultetTbl where FakultetiID="+Key;
                Statement Del=Con.createStatement();
                Del.executeUpdate(Query);
                JOptionPane.showMessageDialog(this,"Fakultet Deleted!!!");
                DisplayFakulteti();
            }catch(Exception e){
            
      
            }
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BackBtnMouseClicked

    
    
    private void UniversitetiCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UniversitetiCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UniversitetiCbActionPerformed

    private void UniversitetiCbFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UniversitetiCbFocusGained
    }//GEN-LAST:event_UniversitetiCbFocusGained

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
            java.util.logging.Logger.getLogger(FakultetiList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FakultetiList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FakultetiList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FakultetiList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FakultetiList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AdresaCb;
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditoBtn;
    private javax.swing.JTextField EmriFakultetitTb;
    private javax.swing.JTable FakultetiTable;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JComboBox<String> UniversitetiCb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}

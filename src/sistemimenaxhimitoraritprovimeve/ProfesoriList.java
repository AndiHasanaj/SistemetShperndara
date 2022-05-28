
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

public class ProfesoriList extends javax.swing.JFrame {

    Connection Con=null;
    PreparedStatement Pst=null;
    ResultSet Rs=null,Rs1=null;
    Statement St=null,St1=null;
    public ProfesoriList() {
        initComponents();
        DisplayProfesori();
    }

    private void DisplayProfesori(){
        try{
            Con=DriverManager.getConnection("jdbc:mysql://localhost:3308/sistemipërmenaxhimineoraritprovimeve","root","");
            St=Con.createStatement();
            Rs=St.executeQuery("Select profesoriID,pEmri,pMbiemri,pEmail from profesori");
            ProfesorTable.setModel(DbUtils.resultSetToTableModel(Rs));
        
        }catch(SQLException e){
        
        
        }
    }
    
    int ProfesoriID;
    private void CountProfesori(){
    
        try{
            St1=Con.createStatement();
            Rs1=St1.executeQuery("Select Max(ProfesoriID) from Profesori");
            Rs1.next();
            ProfesoriID=Rs1.getInt(1)+1;
        }catch(SQLException e){
        
        
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        EmriTb = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        EmailTb = new javax.swing.JTextField();
        DeleteBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        EditoBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProfesorTable = new javax.swing.JTable();
        MbiemriTb = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel2.setText("Profesori");

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel5.setText("Emri");

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel9.setText("Mbiemri");

        EmriTb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        EmriTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmriTbActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel12.setText("Email");

        EmailTb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        EmailTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTbActionPerformed(evt);
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

        ProfesorTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ProfesorTable.setModel(new javax.swing.table.DefaultTableModel(
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
        ProfesorTable.setRowHeight(28);
        ProfesorTable.setSelectionBackground(new java.awt.Color(51, 0, 204));
        ProfesorTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProfesorTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProfesorTable);

        MbiemriTb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MbiemriTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MbiemriTbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(EmailTb, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(DeleteBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SaveBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EditoBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(169, 169, 169)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(153, 153, 153)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(EmriTb, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(MbiemriTb, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 841, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1181, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmriTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MbiemriTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(146, 146, 146))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EmriTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmriTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmriTbActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        if(Key==0){
            JOptionPane.showMessageDialog(this, "Select a Profesor !!");
        }else{
            try{
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3308/sistemipërmenaxhimineoraritprovimeve","root","");
                String Query="Delete from ProfesorTbl where ProfesoriID="+Key;
                Statement Del=Con.createStatement();
                Del.executeUpdate(Query);
                JOptionPane.showMessageDialog(this,"Profesori Deleted!!!");
                DisplayProfesori();
            }catch(Exception e){
            
      
            }
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
    
            try{
                CountProfesori();
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3308/sistemipërmenaxhimineoraritprovimeve","root","");
                PreparedStatement Save=Con.prepareStatement("Insert into Profesori (pEmri,pMbiemri,pEmail) values (?,?,?)");
                Save.setString(2, MbiemriTb.getText());
                Save.setString(1, EmriTb.getText());
                Save.setString(3, EmailTb.getText());
                int row=Save.executeUpdate();
                JOptionPane.showMessageDialog(this, "Profesori Added!!!");
                Con.close();
                DisplayProfesori();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this, ex);
            }
        
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void EditoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditoBtnActionPerformed
            try{
                String UpdateQuery="Update Profesori set pEmri=?, pMbiemri=?,pEmail=? where ProfesoriID="+Key;
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3308/sistemipërmenaxhimineoraritprovimeve","root","");
                PreparedStatement Save=Con.prepareStatement(UpdateQuery);
                Save.setString(1, EmriTb.getText());
                Save.setString(2, MbiemriTb.getText());
                Save.setString(3, EmailTb.getText());
                
                if(Save.executeUpdate()==1){
                    DisplayProfesori();
                    JOptionPane.showMessageDialog(this,"Profesori Updated!!!");
                }else{
                
                    JOptionPane.showMessageDialog(this,"Mising Information!!!");
                }
                
            }catch(Exception e){
            
      
            }
        
    }//GEN-LAST:event_EditoBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackBtnActionPerformed

    int Key=-1;
    private void ProfesorTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfesorTableMouseClicked
        DefaultTableModel model =(DefaultTableModel) ProfesorTable.getModel();
        int MyIndex=ProfesorTable.getSelectedRow();
        Key=Integer.valueOf(model.getValueAt(MyIndex,0).toString());
        EmriTb.setText(model.getValueAt(MyIndex,1).toString());
        MbiemriTb.setText(model.getValueAt(MyIndex,2).toString());
        EmailTb.setText(model.getValueAt(MyIndex,3).toString());
        
    }//GEN-LAST:event_ProfesorTableMouseClicked

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
        new MainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnMouseClicked

    private void EmailTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTbActionPerformed

    private void MbiemriTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MbiemriTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MbiemriTbActionPerformed

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
            java.util.logging.Logger.getLogger(ProfesoriList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfesoriList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfesoriList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfesoriList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfesoriList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditoBtn;
    private javax.swing.JTextField EmailTb;
    private javax.swing.JTextField EmriTb;
    private javax.swing.JTextField MbiemriTb;
    private javax.swing.JTable ProfesorTable;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

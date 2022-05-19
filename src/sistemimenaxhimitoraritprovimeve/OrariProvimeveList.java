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


public class OrariProvimeveList extends javax.swing.JFrame {

    Connection Con=null;
    PreparedStatement Pst=null;
    ResultSet Rs=null,Rs1=null;
    Statement St=null,St1=null;
    public OrariProvimeveList() {
        initComponents();
        DisplayOrariProvimeve();
    }

    private void DisplayOrariProvimeve(){
        try{
            Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root","");
            St=Con.createStatement();
            Rs=St.executeQuery("Select * from OrariProvimeveTbl");
            OrariProvimeveTable.setModel(DbUtils.resultSetToTableModel(Rs));
        
        }catch(SQLException e){
        
        
        }
    }
    
    int OrariProvimeveID;
    private void CountOrariProvimeve(){
    
        try{
            St1=Con.createStatement();
            Rs1=St1.executeQuery("Select Max(OrariProvimeveID) from OrariProvimeveTbl");
            Rs1.next();
            OrariProvimeveID=Rs1.getInt(1)+1;
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
        jLabel6 = new javax.swing.JLabel();
        ProfesoriCb = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        AfatiCb = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        DataProvimitTb = new com.toedter.calendar.JDateChooser();
        DeleteBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        EditoBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        OrariProvimeveTable = new javax.swing.JTable();
        LëndaCb = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel2.setText("Orari i Provimeve");

        jLabel1.setText("Numri i Lëndeve është :");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField2.setText("Search");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel5.setText("Lënda");

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel6.setText("Profesori");

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel8.setText("Afati");

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel7.setText("Data e provimit");

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

        OrariProvimeveTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        OrariProvimeveTable.setModel(new javax.swing.table.DefaultTableModel(
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
        OrariProvimeveTable.setRowHeight(28);
        OrariProvimeveTable.setSelectionBackground(new java.awt.Color(51, 0, 204));
        OrariProvimeveTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrariProvimeveTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(OrariProvimeveTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
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
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AfatiCb, 0, 300, Short.MAX_VALUE)
                            .addComponent(LëndaCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProfesoriCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DataProvimitTb, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                        .addGap(93, 93, 93)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(ProfesoriCb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(DataProvimitTb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(LëndaCb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel8)
                            .addGap(4, 4, 4)
                            .addComponent(AfatiCb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(394, 394, 394)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
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

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        if(Key==0){
            JOptionPane.showMessageDialog(this, "Select a OrariProvimeve !!");
        }else{
            try{
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root","");
                String Query="Delete from OrariProvimeveTbl where OrariProvimeveID="+Key;
                Statement Del=Con.createStatement();
                Del.executeUpdate(Query);
                JOptionPane.showMessageDialog(this,"OrariProvimeve Deleted!!!");
                DisplayOrariProvimeve();
            }catch(Exception e){
            
      
            }
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
//        if(LëndaCb.getSelectedIndex()==-1||ProfesoriCb.getSelectedIndex()==-1||AfatiCb.getSelectedIndex()==-1||DataProvimitTb.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Information !!!");
        }else{
            try{
                CountOrariProvimeve();
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root","");
                PreparedStatement Save=Con.prepareStatement("Insert into OrariProvimeveTbl values (?,?,?)");
                Save.setInt(1, OrariProvimeveID);
                Save.setInt(2, LëndaCb.getSelectedIndex());
                Save.setInt(3, ProfesoriCb.getSelectedIndex());
                Save.setInt(4, AfatiCb.getSelectedIndex());
                Save.setString(5, DataProvimitTb);
                int row=Save.executeUpdate();
                JOptionPane.showMessageDialog(this, "OrariProvimit Added!!!");
                Con.close();
                DisplayOrariProvimit();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this, ex);
            }
        
        }
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void EditoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditoBtnActionPerformed
        if(!(LëndaCb.getSelectedIndex()==-1||ProfesoriCb.getSelectedIndex()==-1||AfatiCb.getSelectedIndex()==-1)){
            try{
                String UpdateQuery="Update OrariProvimitTbl set LëndaID=?,ProfesoriID=?,AfatiID=?,DataProvimit=? where OrariProvimitID=?"+Key;
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root","");
                PreparedStatement Save=Con.prepareStatement(UpdateQuery);
                Save.setInt(4, Key);
                Save.setInt(1, LëndaCb.getSelectedIndex());
                Save.setInt(2, ProfesoriCb.getSelectedIndex());
                Save.setInt(3, AfatiCb.getSelectedIndex());
                Save.setString(4,DataProvimitTb.getDate().toString());
                if(Save.executeUpdate()==1){
                    DisplayOrariProvimeve();
                    JOptionPane.showMessageDialog(this,"OrariProvimit Updated!!!");
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
    private void OrariProvimeveTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrariProvimeveTableMouseClicked
        DefaultTableModel model =(DefaultTableModel) OrariProvimeveTable.getModel();
        int MyIndex=OrariProvimeveTable.getSelectedRow();
        Key=Integer.valueOf(model.getValueAt(MyIndex,0).toString());
        if(LëndaCb.getSelectedIndex()==-1||ProfesoriCb.getSelectedIndex()==-1||AfatiCb.getSelectedIndex()==-1)
        LëndaCb.setSelectedIndex(Integer.valueOf(model.getValueAt(MyIndex,1).toString()));
        ProfesoriCb.setSelectedIndex(Integer.valueOf(model.getValueAt(MyIndex,2).toString()));
        AfatiCb.setSelectedIndex(Integer.valueOf(model.getValueAt(MyIndex,3).toString()));
        DataProvimitTb.setText(model.getValueAt(MyIndex,4).toString());
    }//GEN-LAST:event_OrariProvimeveTableMouseClicked

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
            java.util.logging.Logger.getLogger(OrariProvimeveList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrariProvimeveList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrariProvimeveList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrariProvimeveList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrariProvimeveList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AfatiCb;
    private javax.swing.JButton BackBtn;
    private com.toedter.calendar.JDateChooser DataProvimitTb;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditoBtn;
    private javax.swing.JComboBox<String> LëndaCb;
    private javax.swing.JTable OrariProvimeveTable;
    private javax.swing.JComboBox<String> ProfesoriCb;
    private javax.swing.JButton SaveBtn;
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

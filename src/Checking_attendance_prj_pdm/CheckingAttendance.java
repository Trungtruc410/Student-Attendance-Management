/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Checking_attendance_prj_pdm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;


/**
 *
 * @author Admin
 */
public class CheckingAttendance extends javax.swing.JFrame {
   String user,pass;
   String list_id;
    /**
     * Creates new form Booking
     */
    public CheckingAttendance() {
        initComponents();
        addID();
        loadID();
//        addTeamOne();
//        addTeamTwo();
//        addTime();
//        addPrice();
//        addType();
    }
    public void loadID(){
    this.list_id =  txtID.getSelectedItem().toString();
    System.out.println("id list:"+list_id);
}
//
    public CheckingAttendance(String user, String pass) {
        initComponents();
        addID();
        this.user = user;
        this.pass = pass;
        
    }
    public void addID(){
        String connectionUrl = new ConnectionProvider().getConnection();
        try (Connection con = DriverManager.getConnection(connectionUrl); java.sql.Statement stmt = con.createStatement();) {
            String SQL = "select list_id from list where isActive='1'";
            ResultSet rs = stmt.executeQuery(SQL);
            while(rs.next()){
                txtID.addItem(rs.getString("list_id"));
            }
    
           
        } // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
//    public void addTeamTwo(){
//        String connectionUrl = "jdbc:mysql://localhost:3306/stadium_booking_2?user=root&password=123456789";
//        try (Connection con = DriverManager.getConnection(connectionUrl); java.sql.Statement stmt = con.createStatement();) {
//            String SQL = "select team2 from ticket";
//            ResultSet rs = stmt.executeQuery(SQL);
//            while(rs.next()){
//                txtTeam2.addItem(rs.getString("team2"));
//            }
//    
//           
//        } // Handle any errors that may have occurred.
//        catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//    public void addTime(){
//        String connectionUrl = "jdbc:mysql://localhost:3306/stadium_booking_2?user=root&password=123456789";
//        try (Connection con = DriverManager.getConnection(connectionUrl); java.sql.Statement stmt = con.createStatement();) {
//            String SQL = "select time_match from ticket";
//            ResultSet rs = stmt.executeQuery(SQL);
//            while(rs.next()){
//                txtTime.addItem(rs.getString("time_match"));
//            }
//    
//           
//        } // Handle any errors that may have occurred.
//        catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//    public void addPrice(){
//        String connectionUrl = "jdbc:mysql://localhost:3306/stadium_booking_2?user=root&password=123456789";
//        try (Connection con = DriverManager.getConnection(connectionUrl); java.sql.Statement stmt = con.createStatement();) {
//            String SQL = "select price from ticket";
//            ResultSet rs = stmt.executeQuery(SQL);
//            while(rs.next()){
//                txtPrice.addItem(rs.getString("price"));
//            }
//    
//           
//        } // Handle any errors that may have occurred.
//        catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//    public void addType(){
//        String connectionUrl = "jdbc:mysql://localhost:3306/stadium_booking_2?user=root&password=123456789";
//        try (Connection con = DriverManager.getConnection(connectionUrl); java.sql.Statement stmt = con.createStatement();) {
//            String SQL = "select distinct ticket_type from ticket";
//            ResultSet rs = stmt.executeQuery(SQL);
//            while(rs.next()){
//                txtType.addItem(rs.getString("ticket_type"));
//            }
//    
//           
//        } // Handle any errors that may have occurred.
//        catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtID = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        txtChecking = new javax.swing.JComboBox<>();
        txtValue = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResult = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 229, 204));

        txtID.setBackground(new java.awt.Color(255, 247, 230));
        txtID.setEditable(true);
        txtID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtID.setForeground(new java.awt.Color(153, 77, 0));
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 136, 0));
        jLabel3.setText("Choose ID to check");

        jButton2.setBackground(new java.awt.Color(134, 89, 45));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnnext.setBackground(new java.awt.Color(134, 89, 45));
        btnnext.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnnext.setForeground(new java.awt.Color(255, 255, 255));
        btnnext.setText("Next");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btnShow.setBackground(new java.awt.Color(134, 89, 45));
        btnShow.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnShow.setForeground(new java.awt.Color(255, 255, 255));
        btnShow.setText("Show All List");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        txtChecking.setBackground(new java.awt.Color(134, 89, 45));
        txtChecking.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtChecking.setForeground(new java.awt.Color(255, 255, 255));
        txtChecking.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teacher", "Subject", "Week", "Class" }));
        txtChecking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCheckingActionPerformed(evt);
            }
        });

        txtValue.setBackground(new java.awt.Color(255, 247, 230));
        txtValue.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtValue.setForeground(new java.awt.Color(153, 77, 0));
        txtValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValueActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(134, 89, 45));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtResult.setEditable(false);
        txtResult.setBackground(new java.awt.Color(255, 247, 230));
        txtResult.setColumns(20);
        txtResult.setFont(new java.awt.Font("Segoe UI", 1, 18));
        txtResult.setForeground(new java.awt.Color(153, 77, 0));
        txtResult.setRows(10);
        jScrollPane1.setViewportView(txtResult);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(167, 105, 42));
        jLabel2.setText(" List Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(btnnext)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(122, 122, 122))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 38, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnShow)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtChecking, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtValue, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSearch)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)))
                        .addGap(16, 16, 16))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 135, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnShow)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch)
                            .addComponent(txtChecking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnext)
                    .addComponent(jButton2))
                .addGap(27, 27, 27))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 760, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        // TODO add your handling code here:
        //loadID();
        //this.setVisible(false);
        //new Confirm(ticket_id,user,pass).setVisible(true);
        //loadID();
        //this.setVisible(false);
        //new CheckStudentAttendance(ticket_id,user,pass).setVisible(true);
        loadID();
        this.setVisible(false);
        new Confirm(list_id,user,pass).setVisible(true);
       
    }//GEN-LAST:event_btnnextActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        new index(user,pass).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValueActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        // TODO add your handling code here:
        txtResult.selectAll();
        txtResult.replaceSelection("");
        String connectionUrl = new ConnectionProvider().getConnection();


 
        try (Connection con = DriverManager.getConnection(connectionUrl); java.sql.Statement stmt = con.createStatement();) {
            String SQL = "select * from list where isActive='1'";
            ResultSet rs = stmt.executeQuery(SQL);
 
            // Iterate through the data in the result set and display it.
            // process query results
            StringBuilder results = new StringBuilder();
            ResultSetMetaData metaData = rs.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            for (int i = 1; i <= numberOfColumns-1; i++) {
                results.append(metaData.getColumnName(i)).append("\t");
            }
            results.append("\n");
            //  Metadata
            while (rs.next()) {
                for (int i = 1; i <= numberOfColumns-1; i++) {
                    results.append(rs.getObject(i)).append("\t");
                }
                results.append("\n");
            }
            txtResult.setText(results.toString());
        } // Handle any errors that may have occurred.
        catch (SQLException e) {
            txtResult.setText(e.getMessage());
        }
    }//GEN-LAST:event_btnShowActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String checking =  txtChecking.getSelectedItem().toString();
        String value = txtValue.getText();
        txtResult.selectAll();
        txtResult.replaceSelection("");
        String connectionUrl = new ConnectionProvider().getConnection();
        try (Connection con = DriverManager.getConnection(connectionUrl); java.sql.Statement stmt = con.createStatement();) {
            if("Teacher".equals(checking)){
                try{
                    String SQL = "select * from list where list_teacher='"+value+"' and isActive='1'";
                    ResultSet rs = stmt.executeQuery(SQL);
                    StringBuilder results = new StringBuilder();
                    ResultSetMetaData metaData = rs.getMetaData();
                    int numberOfColumns = metaData.getColumnCount();
                    for (int i = 1; i <= numberOfColumns; i++) {
                        results.append(metaData.getColumnName(i)).append("\t");
                    }
                    results.append("\n");
            //  Metadata
                    while (rs.next()) {
                    for (int i = 1; i <= numberOfColumns; i++) {
                        results.append(rs.getObject(i)).append("\t");
                    }
                    results.append("\n");
                    }
                    txtResult.setText(results.toString());
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            
            if("Class".equals(checking)){
                try{
                    String SQL = "select * from list where list_class='"+value+"' and isActive='1'";
                    ResultSet rs = stmt.executeQuery(SQL);
                    StringBuilder results = new StringBuilder();
                    ResultSetMetaData metaData = rs.getMetaData();
                    int numberOfColumns = metaData.getColumnCount();
                    for (int i = 1; i <= numberOfColumns; i++) {
                        results.append(metaData.getColumnName(i)).append("\t");
                    }
                    results.append("\n");
            //  Metadata
                    while (rs.next()) {
                    for (int i = 1; i <= numberOfColumns; i++) {
                        results.append(rs.getObject(i)).append("\t");
                    }
                    results.append("\n");
                    }
                    txtResult.setText(results.toString());
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            if("Week".equals(checking)){
                try{
                    String SQL = "select * from list where list_week='"+value+"' and isActive='1'";
                    ResultSet rs = stmt.executeQuery(SQL);
                    StringBuilder results = new StringBuilder();
                    ResultSetMetaData metaData = rs.getMetaData();
                    int numberOfColumns = metaData.getColumnCount();
                    for (int i = 1; i <= numberOfColumns; i++) {
                        results.append(metaData.getColumnName(i)).append("\t");
                    }
                    results.append("\n");
            //  Metadata
                    while (rs.next()) {
                    for (int i = 1; i <= numberOfColumns; i++) {
                        results.append(rs.getObject(i)).append("\t");
                    }
                    results.append("\n");
                    }
                    txtResult.setText(results.toString());
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            if("Subject".equals(checking)){
                try{
                    String SQL = "(Select * from list where list_subject = '"+value+"' and isActive='1')";
                    ResultSet rs = stmt.executeQuery(SQL);
                    StringBuilder results = new StringBuilder();
                    ResultSetMetaData metaData = rs.getMetaData();
                    int numberOfColumns = metaData.getColumnCount();
                    for (int i = 1; i <= numberOfColumns; i++) {
                        results.append(metaData.getColumnName(i)).append("\t");
                    }
                    results.append("\n");
            //  Metadata
                    while (rs.next()) {
                    for (int i = 1; i <= numberOfColumns; i++) {
                        results.append(rs.getObject(i)).append("\t");
                    }
                    results.append("\n");
                    }
                    txtResult.setText(results.toString());
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtCheckingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCheckingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCheckingActionPerformed

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
            java.util.logging.Logger.getLogger(CheckingAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckingAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckingAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckingAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckingAttendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> txtChecking;
    private javax.swing.JComboBox<String> txtID;
    private javax.swing.JTextArea txtResult;
    private javax.swing.JTextField txtValue;
    // End of variables declaration//GEN-END:variables
}

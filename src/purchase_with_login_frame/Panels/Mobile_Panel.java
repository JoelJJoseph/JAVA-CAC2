/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purchase_with_login_frame.Panels;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static jdk.nashorn.internal.objects.NativeRegExp.source;
import purchase_with_login_frame.DetailsFrame;
import purchase_with_login_frame.LoginFrame;
import static purchase_with_login_frame.LoginFrame.username;
import purchase_with_login_frame.OrdersFrame;
import static purchase_with_login_frame.WelcomePage.Cust_ID;

/**
 *
 * @author Admin
 */
public class Mobile_Panel extends javax.swing.JPanel {

    /**
     * Creates new form Mobile_Panel
     */
        
    public Mobile_Panel() {
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));
        setPreferredSize(new java.awt.Dimension(1265, 377));

        jButton1.setText("Buy");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Buy");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Buy");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Panels/SubPanels/download.jpg"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Panels/SubPanels/samsung-galaxy-j2-prime-8gb-1-5gb-ram-8mp-front-5mp-camera-sme-set-mobile2go-1704-09-mobile2go@5.jpg"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Panels/SubPanels/index.jpg"))); // NOI18N

        jLabel4.setText("Apple iPhone 6 32 GB, 4G");

        jLabel5.setText("Samsung Galaxy J2 Prime 8GB/1.5GB RAM");

        jLabel6.setText("Lenovo A606-MT6582-RAM-1GB");

        jLabel7.setText("Quantity:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Quantity:");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel9.setText("Quantity:");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel4)
                        .addGap(242, 242, 242)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jButton1)
                        .addGap(384, 384, 384)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1))
                            .addComponent(jLabel1))
                        .addGap(185, 185, 185)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(146, 146, 146))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField3))
                            .addComponent(jLabel3))
                        .addGap(59, 59, 59))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    // TODO add your handling code here:
        Connection conn = null;
        Connection conn1 = null;
        Connection conn2 = null;
        Connection conn3 = null;
        String Itxt1,Itxt2,Itxt3;
        String txt1,txt2,txt3;
        String user = setText(username);
        int customerid = setInt(Cust_ID);
        
        int max = 10000;
        int min = 1; 
        Random randomnum = new Random();
        int showMe = min + randomnum.nextInt(max);
        System.out.println(showMe);
        
        try{
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            System.out.println("Going to connect to database");
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/E-Commerce Application;create=true");
            conn1 = DriverManager.getConnection("jdbc:derby://localhost:1527/E-Commerce Application;create=true");
            conn2 = DriverManager.getConnection("jdbc:derby://localhost:1527/E-Commerce Application;create=true");
            conn3 = DriverManager.getConnection("jdbc:derby://localhost:1527/E-Commerce Application;create=true");
            System.out.println("Connection Successfull");
            PreparedStatement stmt = conn.prepareStatement("SELECT PRODUCT_ID FROM APP.PRODUCTDETAILS WHERE PRODUCT_ID = 2");
            PreparedStatement stmt1 = conn1.prepareStatement("UPDATE APP.CUSTOMERDETAILS SET PRODUCT_ID = ? WHERE CUSTOMER_ID =" + customerid);
            PreparedStatement stmt2 = conn.prepareStatement("SELECT CUSTOMER_ID FROM APP.CUSTOMERDETAILS WHERE CUSTOMER_ID =" + customerid);
            PreparedStatement stmt3 = conn1.prepareStatement("UPDATE APP.PRODUCTDETAILS SET CUSTOMER_ID = ? WHERE PRODUCT_ID = 2" );
            ResultSet rs=stmt2.executeQuery();
            ResultSet rst=stmt.executeQuery();
            
            while(rst.next() && rs.next())
            {
                System.out.println("Entering the loop");
                stmt1.setString(1, rst.getString("PRODUCT_ID"));
                stmt3.setInt(1,customerid);
                System.out.println(customerid);
                
                stmt1.executeUpdate();
                stmt3.executeUpdate();
            }
            try
                {
                    PreparedStatement pstmt = conn.prepareStatement("SELECT pd.PRODUCT_ID, pd.PRODUCTNAME, pd.QUANTITY, pd.PRICE, cd.CUSTOMER_ID  FROM APP.PRODUCTDETAILS pd, APP.CUSTOMERDETAILS cd WHERE cd.PRODUCT_ID = pd.PRODUCT_ID AND cd.CUSTOMER_ID =" + customerid);
                    PreparedStatement pstmt1 = conn1.prepareStatement("INSERT INTO APP.ORDERDETAILS (ORDER_NUMBER, PRODUCT_ID, PRODUCTNAME, QUANTITY, PRICE, CUSTOMER_ID) VALUES (?, ?, ?, ?, ?, ?)");
                    ResultSet rst1= pstmt.executeQuery();
                    while(rst1.next())
                    {
                        /*
                        pstmt1.setInt(1, showMe);
                        pstmt1.setString(2, rst1.getString("PRODUCT_ID"));
                        String prod = rst1.getString("PRODUCT_ID");
                        pstmt1.setString(3, rst1.getString("PRODUCTNAME"));
                        pstmt1.setString(4, rst1.getString("QUANTITY"));
                        pstmt1.setString(5, rst1.getString("PRICE"));
                        System.out.println("customerid" + customerid );
                        pstmt1.setInt(6, rst1.getInt("CUSTOMER_ID"));
                        */
                        pstmt1.setInt(1, showMe);
                        pstmt1.setString(2, rst1.getString("PRODUCT_ID"));
                        String prod = rst1.getString("PRODUCT_ID");
                        pstmt1.setString(3, rst1.getString("PRODUCTNAME"));
                        pstmt1.setString(4, jTextField2.getText());
                        pstmt1.setString(5, rst1.getString("PRICE"));
                        System.out.println("customerid" + customerid );
                        pstmt1.setInt(6, rst1.getInt("CUSTOMER_ID"));
                
                        pstmt1.executeUpdate();
                    }
                }catch(Exception ex)
                {
                    System.err.println("Got an exception!"); 
                    System.err.println(ex.getMessage());
                    JOptionPane.showMessageDialog(null, "Got an exception: "+ex.getMessage());
                }
        } catch(Exception ex)
                    {
                    System.err.println("Got an exception!"); 
                    System.err.println(ex.getMessage());
                    JOptionPane.showMessageDialog(null, "Got an exception: "+ex.getMessage());
                    }
            finally{
                try {
                    conn.close();
                    conn1.close();
                } catch (SQLException ex) 
                {
                    Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
                }    
            } 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Connection conn = null;
        Connection conn1 = null;
        Connection conn2 = null;
        Connection conn3 = null;
        String Itxt1,Itxt2,Itxt3;
        String txt1,txt2,txt3;
        String user = setText(username);
        int customerid = setInt(Cust_ID);
        
        int max = 10000;
        int min = 1; 
        Random randomnum = new Random();
        int showMe = min + randomnum.nextInt(max);
        System.out.println(showMe);
        
        try
        {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            System.out.println("Going to connect to database");
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/E-Commerce Application;create=true");
            conn1 = DriverManager.getConnection("jdbc:derby://localhost:1527/E-Commerce Application;create=true");
            conn2 = DriverManager.getConnection("jdbc:derby://localhost:1527/E-Commerce Application;create=true");
            conn3 = DriverManager.getConnection("jdbc:derby://localhost:1527/E-Commerce Application;create=true");
            System.out.println("Connection Successfull");
            PreparedStatement stmt = conn.prepareStatement("SELECT PRODUCT_ID FROM APP.PRODUCTDETAILS WHERE PRODUCT_ID = 1");
            PreparedStatement stmt1 = conn1.prepareStatement("UPDATE APP.CUSTOMERDETAILS SET PRODUCT_ID = ? WHERE CUSTOMER_ID =" + customerid);
            PreparedStatement stmt2 = conn.prepareStatement("SELECT CUSTOMER_ID FROM APP.CUSTOMERDETAILS WHERE CUSTOMER_ID =" + customerid);
            PreparedStatement stmt3 = conn1.prepareStatement("UPDATE APP.PRODUCTDETAILS SET CUSTOMER_ID = ? WHERE PRODUCT_ID = 1" );
            ResultSet rs=stmt2.executeQuery();
            ResultSet rst=stmt.executeQuery();
            
            while(rst.next() && rs.next())
            {
                System.out.println("Entering the loop");
                stmt1.setString(1, rst.getString("PRODUCT_ID"));
                stmt3.setInt(1,customerid);
                System.out.println(customerid);
                
                stmt1.executeUpdate();
                stmt3.executeUpdate();
            }
            try
                {
                    PreparedStatement pstmt = conn.prepareStatement("SELECT pd.PRODUCT_ID, pd.PRODUCTNAME, pd.QUANTITY, pd.PRICE, cd.CUSTOMER_ID  FROM APP.PRODUCTDETAILS pd, APP.CUSTOMERDETAILS cd WHERE cd.PRODUCT_ID = pd.PRODUCT_ID AND cd.CUSTOMER_ID =" + customerid);
                    PreparedStatement pstmt1 = conn1.prepareStatement("INSERT INTO APP.ORDERDETAILS (ORDER_NUMBER, PRODUCT_ID, PRODUCTNAME, QUANTITY, PRICE, CUSTOMER_ID) VALUES (?, ?, ?, ?, ?, ?)");
                    ResultSet rst1= pstmt.executeQuery();
                    while(rst1.next())
                    {
                        pstmt1.setInt(1, showMe);
                        pstmt1.setString(2, rst1.getString("PRODUCT_ID"));
                        String prod = rst1.getString("PRODUCT_ID");
                        pstmt1.setString(3, rst1.getString("PRODUCTNAME"));
                        pstmt1.setString(4, jTextField1.getText());
                        pstmt1.setString(5, rst1.getString("PRICE"));
                        System.out.println("customerid" + customerid );
                        pstmt1.setInt(6, rst1.getInt("CUSTOMER_ID"));
                
                        pstmt1.executeUpdate();
                    }
                }catch(Exception ex)
                {
                    System.err.println("Got an exception!"); 
                    System.err.println(ex.getMessage());
                    JOptionPane.showMessageDialog(null, "Got an exception: "+ex.getMessage());
                }
        } catch(Exception ex)
                    {
                    System.err.println("Got an exception!"); 
                    System.err.println(ex.getMessage());
                    JOptionPane.showMessageDialog(null, "Got an exception: "+ex.getMessage());
                    }
            finally{
                try {
                    conn.close();
                    conn1.close();
                } catch (SQLException ex) 
                {
                    Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
                }    
            } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    // TODO add your handling code here:
        Connection conn = null;
        Connection conn1 = null;
        Connection conn2 = null;
        Connection conn3 = null;
        String Itxt1,Itxt2,Itxt3;
        String txt1,txt2,txt3;
        String user = setText(username);
        int customerid = setInt(Cust_ID);
        int prod;
        
        int max = 10000;
        int min = 1; 
        Random randomnum = new Random();
        int showMe = min + randomnum.nextInt(max);
        System.out.println(showMe);
        
        try{
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            System.out.println("Going to connect to database");
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/E-Commerce Application;create=true");
            conn1 = DriverManager.getConnection("jdbc:derby://localhost:1527/E-Commerce Application;create=true");
            conn2 = DriverManager.getConnection("jdbc:derby://localhost:1527/E-Commerce Application;create=true");
            conn3 = DriverManager.getConnection("jdbc:derby://localhost:1527/E-Commerce Application;create=true");
            System.out.println("Connection Successfull");
            PreparedStatement stmt = conn.prepareStatement("SELECT PRODUCT_ID FROM APP.PRODUCTDETAILS WHERE PRODUCT_ID = 3");
            PreparedStatement stmt1 = conn1.prepareStatement("UPDATE APP.CUSTOMERDETAILS SET PRODUCT_ID = ? WHERE CUSTOMER_ID =" + customerid);
            PreparedStatement stmt2 = conn.prepareStatement("SELECT CUSTOMER_ID FROM APP.CUSTOMERDETAILS WHERE CUSTOMER_ID =" + customerid);
            PreparedStatement stmt3 = conn1.prepareStatement("UPDATE APP.PRODUCTDETAILS SET CUSTOMER_ID = ? WHERE PRODUCT_ID = 3" );
            ResultSet rs=stmt2.executeQuery();
            ResultSet rst=stmt.executeQuery();
            
            while(rst.next() && rs.next())
            {
                System.out.println("Entering the loop");
                stmt1.setString(1, rst.getString("PRODUCT_ID"));
                stmt3.setInt(1,customerid);
                System.out.println(customerid);
                
                stmt1.executeUpdate();
                stmt3.executeUpdate();
            }
            try
                {
                    PreparedStatement pstmt = conn.prepareStatement("SELECT pd.PRODUCT_ID, pd.PRODUCTNAME, pd.QUANTITY, pd.PRICE, cd.CUSTOMER_ID  FROM APP.PRODUCTDETAILS pd, APP.CUSTOMERDETAILS cd WHERE cd.PRODUCT_ID = pd.PRODUCT_ID AND cd.CUSTOMER_ID =" + customerid);
                    PreparedStatement pstmt1 = conn1.prepareStatement("INSERT INTO APP.ORDERDETAILS (ORDER_NUMBER, PRODUCT_ID, PRODUCTNAME, QUANTITY, PRICE, CUSTOMER_ID) VALUES (?, ?, ?, ?, ?, ?)");
                    ResultSet rst1= pstmt.executeQuery();
                    while(rst1.next())
                    {
                        /*
                        pstmt1.setInt(1, showMe);
                        pstmt1.setString(2, rst1.getString("PRODUCT_ID"));
                        pstmt1.setString(3, rst1.getString("PRODUCTNAME"));
                        pstmt1.setString(4, rst1.getString("QUANTITY"));
                        pstmt1.setString(5, rst1.getString("PRICE"));
                        System.out.println("customerid" + customerid );
                        pstmt1.setInt(6, rst1.getInt("CUSTOMER_ID"));
                */
                        pstmt1.setInt(1, showMe);
                        pstmt1.setString(2, rst1.getString("PRODUCT_ID"));
                        pstmt1.setString(3, rst1.getString("PRODUCTNAME"));
                        pstmt1.setString(4, jTextField3.getText());
                        pstmt1.setString(5, rst1.getString("PRICE"));
                        System.out.println("customerid" + customerid );
                        pstmt1.setInt(6, rst1.getInt("CUSTOMER_ID"));
                        pstmt1.executeUpdate();
                    }
                }catch(Exception ex)
                {
                    System.err.println("Got an exception!"); 
                    System.err.println(ex.getMessage());
                    JOptionPane.showMessageDialog(null, "Got an exception: "+ex.getMessage());
                }
        } catch(Exception ex)
                    {
                    System.err.println("Got an exception!"); 
                    System.err.println(ex.getMessage());
                    JOptionPane.showMessageDialog(null, "Got an exception: "+ex.getMessage());
                    }
            finally{
                try {
                    conn.close();
                    conn1.close();
                } catch (SQLException ex) 
                {
                    Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
                }    
            } 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    public static String setText(String username) 
    {      
        System.out.println(username);
        return username;
    }

    int setInt(int Cust_ID) 
    {
        System.out.println(Cust_ID);
        return Cust_ID;
    } 
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TAMS;
import com.mysql.cj.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
//import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author HP
 */
public class Book_Trip extends javax.swing.JFrame {
    
    
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    PreparedStatement pstC=null;

    /**
     * Creates new form Book_Trip
     */
    public Book_Trip() {
        initComponents();
        conn = Mysqlconnect.ConnectDB();
        fetch();
        //conn = Mysqlconnect.ConnectDB();
        //fetch();
        //combo();
    }
    
  /*  public void fetch(){
        try{
                   String sql="select t.tid,c.cid,t.source,t.dest,sdate,edate,cname,caddress,cphone from trip t,customer c,"
                             + "booked_for b resultSetToTableModel"
                             + "where t.tid = b.TID and c.cid = b.CID";
                 
                    
                    String sql = "{call disp1()}";
                    String Csql="select * from customer";
                    CallableStatement cs = (CallableStatement) conn.prepareCall(sql);
                    cs.execute();
                    pst=conn.prepareStatement(sql);
                    pst=conn.prepareStatement(Csql);

                    
                    rs=cs.executeQuery();
                    Btable.setModel(DbUtils.resultSetToTableModel(rs));
                }
        
            catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
    }
    }*/
    
     public void fetch(){
        try{
                    String sql="select * from trip";
                    pst=conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    Btable.setModel(DbUtils.resultSetToTableModel(rs));
                }
        
            catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
    }
    }
     
    public void combo(){
        try{
            String csql = "select * from places";
             pst=conn.prepareStatement(csql);
             rs=pst.executeQuery();
             
//             while(rs.next()){
//                 String place = rs.getString("city");
//                 Src.addItem(place);
//             }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    } 
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanel = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Tid = new javax.swing.JTextField();
        Des = new javax.swing.JTextField();
        Cname = new javax.swing.JTextField();
        Cadd = new javax.swing.JTextField();
        Cphone = new javax.swing.JTextField();
        Cid = new javax.swing.JTextField();
        Delbtn = new javax.swing.JButton();
        Clrbtn = new javax.swing.JButton();
        Modbtn = new javax.swing.JButton();
        BookScrollPane1 = new javax.swing.JScrollPane();
        Btable = new javax.swing.JTable();
        Src = new javax.swing.JTextField();
        Bookbtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpanel.setBackground(new java.awt.Color(0, 0, 51));

        header.setBackground(new java.awt.Color(102, 0, 153));
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                headerMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("BOOKING DASHBOARD");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(298, 298, 298))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Trip ID ");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Source");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Customer ID ");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Journey Date");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("End Date");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Customer Name");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Address");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Phone Number");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Destination");

        Tid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TidActionPerformed(evt);
            }
        });

        Des.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesActionPerformed(evt);
            }
        });

        Cname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CnameActionPerformed(evt);
            }
        });

        Cadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaddActionPerformed(evt);
            }
        });

        Cphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CphoneActionPerformed(evt);
            }
        });

        Cid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CidActionPerformed(evt);
            }
        });

        Delbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Delbtn.setText("DELETE");
        Delbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelbtnActionPerformed(evt);
            }
        });

        Clrbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Clrbtn.setText("CLEAR");
        Clrbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClrbtnActionPerformed(evt);
            }
        });

        Modbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Modbtn.setText("MODIFY");
        Modbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModbtnActionPerformed(evt);
            }
        });

        Btable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Trip ID", "Customer ID", "Source", "Destination", "Journey Date", "End Date", "Customer Name", "Address", "Phone"
            }
        ));
        Btable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtableMouseClicked(evt);
            }
        });
        BookScrollPane1.setViewportView(Btable);

        Src.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SrcActionPerformed(evt);
            }
        });

        Bookbtn1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Bookbtn1.setText("BOOK");
        Bookbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bookbtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelLayout = new javax.swing.GroupLayout(jpanel);
        jpanel.setLayout(jpanelLayout);
        jpanelLayout.setHorizontalGroup(
            jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel3))
                .addGap(63, 63, 63)
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Clrbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelLayout.createSequentialGroup()
                        .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cname, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cphone, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cadd, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tid, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cid, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpanelLayout.createSequentialGroup()
                        .addComponent(Src)
                        .addGap(212, 212, 212)
                        .addComponent(Bookbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelLayout.createSequentialGroup()
                        .addComponent(Des, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
                        .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Modbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Delbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(80, 80, 80))
            .addGroup(jpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BookScrollPane1)
                .addContainerGap())
        );
        jpanelLayout.setVerticalGroup(
            jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Tid))
                .addGap(26, 26, 26)
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(Bookbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Modbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Des, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(jpanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(Src, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(Delbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(13, 13, 13)))
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(Clrbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6)))
                .addGap(10, 10, 10)
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Cname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(Cadd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cphone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(BookScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TidActionPerformed

    private void DesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DesActionPerformed

    private void CnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CnameActionPerformed

    private void CaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CaddActionPerformed

    private void CphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CphoneActionPerformed

    private void CidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CidActionPerformed

    private void DelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelbtnActionPerformed
        // TODO add your handling code here:
        conn = Mysqlconnect.ConnectDB();
          //System.out.print("dpwkp");

          int row = Btable.getSelectedRow();
          
          //System.out.print(row);
          String Tcell = Btable.getModel().getValueAt(row,0).toString();
          String Ccell = Btable.getModel().getValueAt(row,1).toString();

          System.out.println(Tcell);
          System.out.println(Ccell);
          
          String delTsql = "DELETE FROM TRIP WHERE TID ="+Tcell;
      
          String delCsql = "DELETE FROM CUSTOMER WHERE CID =" +Ccell;

          
        try {
            pst=conn.prepareStatement(delTsql);
        } catch (SQLException ex) {
            Logger.getLogger(Book_Trip.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            pstC=conn.prepareStatement(delCsql);
        } catch (SQLException ex) {
            Logger.getLogger(Book_Trip.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            pst.execute();
            //fetch();
        } catch (SQLException ex) {
            Logger.getLogger(Book_Trip.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try { 
            pstC.execute();
            //fetch();
        } 
        
            catch (SQLException ex) {
            Logger.getLogger(Book_Trip.class.getName()).log(Level.SEVERE, null, ex);
        }
            JOptionPane.showMessageDialog(null,"Trip Deleted");
            fetch();
        
       
        
    }//GEN-LAST:event_DelbtnActionPerformed

    private void ClrbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClrbtnActionPerformed
        // TODO add your handling code here:
            Tid.setText("  ");
            Cid.setText("  ");
            Src.setText("  ");
            Des.setText("  ");
            Jdate.setText("  ");
            
            Edate.setText("  ");
            Cname.setText("  ");
            Cadd.setText("  ");
            Cphone.setText("  ");
    }//GEN-LAST:event_ClrbtnActionPerformed

    private void ModbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModbtnActionPerformed
          
          conn = Mysqlconnect.ConnectDB();
          //System.out.print("dpwkp");

          int row = Btable.getSelectedRow();
          
          //System.out.print(row);
          String Tcell = Btable.getModel().getValueAt(row,0).toString();
          String Ccell = Btable.getModel().getValueAt(row,1).toString();

          System.out.println(Tcell);
          System.out.println(Ccell);

          
          String modTsql = "UPDATE TRIP SET TID =?,SOURCE =?,DEST=?,SDATE=?,EDATE=? WHERE TID =" + Tcell;
          
          String modCsql = "UPDATE CUSTOMER SET CID =?, CNAME =?,CADDRESS=?,CPHONE=? WHERE CID =" + Ccell;

          try{
               
            pst=conn.prepareStatement(modTsql);
            
            //PreparedStatement pstC = null;
            
            pstC = conn.prepareStatement(modCsql);
            
            pst.setString(1,Tid.getText());
            pst.setString(2,Src.getText());
            pst.setString(3,Des.getText());
           //pst.setDate(4, new java.sql.Date(Jdate.getDate().getTime()));
            //pst.setDate(5, new java.sql.Date(Edate.getDate().getTime()));
            
            pstC.setString(1,Cid.getText());
            pstC.setString(2,Cname.getText());
            pstC.setString(3,Cadd.getText());
            pstC.setString(4,Cphone.getText());
            
            
            JOptionPane.showMessageDialog(null,"Table Modified");
            pst.execute();
            pstC.execute();
            fetch();
           // pst.setDate(4, new java.sql.Date(Ejdate.getDate().getTime()));     
           
        
        }
          
        catch(Exception e){
           JOptionPane.showMessageDialog(null,e);  
        }   
            
    }//GEN-LAST:event_ModbtnActionPerformed

    private void headerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseClicked
        // TODO add your handling code here:
        dispose();
        Home Hobj = new Home();
        Hobj.setVisible(true);

    }//GEN-LAST:event_headerMouseClicked

    private void SrcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SrcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SrcActionPerformed

    private void Bookbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bookbtn1ActionPerformed
        try {
            // TODO add your handling code here:conn = Mysqlconnect.ConnectDB();
            PreparedStatement ps1 = null;    //FOR CUSTOMER
            // PreparedStatement ps2 = null;    //FOR TRIPDISPLAY
            
            String query = "INSERT INTO TRIP (TID,SOURCE,DEST,SDATE,EDATE)VALUES(?,?,?,?,?)";
            
            String sql="INSERT INTO CUSTOMER (CID,CNAME,CADDRESS,CPHONE)VALUES(?,?,?,?)";
            
            // String tsql = "INSERT INTO TRIPDISPLAY (TID,CNAME,SOURCE,DESTINATION)VALUES(?,?,?,?)";
            
            
            pst =conn.prepareStatement(query);
            ps1 =conn.prepareStatement(sql);
            //ps2 =conn.prepareStatement(tsql);

            pst.setString(1,Tid.getText());
            String s= Tid.getText();
            
            pst.setString(2,Src.getText());
            pst.setString(3,Des.getText());
           // pst.setDate(4, new java.sql.Date(Jdate.getDate().getTime()));            
           // pst.setDate(5, new java.sql.Date(Edate.getDate().getTime()));
            //Date dateNow = new Date
            //SimpleDateFormat aa = new SimpleDateFormat("dd-mm-yyyy");
            //String d = aa.format(new java.sql.Date(Jdate.getDate().getTime()));

            ps1.setString(1,Cid.getText());
            
            String c= Cid.getText();
            
            ps1.setString(2,Cname.getText());            
            ps1.setString(3,Cadd.getText());
            ps1.setString(4,Cphone.getText());
            
            // ps2.setString(1,Tid.getText());
            // ps2.setString(2,Cname.getText());            
            //ps2.setString(3,Src.getText());
            // ps2.setString(4,Des.getText());
           
            pst.execute();
            ps1.execute();
            //  ps2.execute();
           
            //JOptionPane.showMessageDialog(null,"TRIP DETAILS AND CUSTOMER DETAILS ARE ADDED");
            dispose();
           
            Confirm_book Cbobj = new Confirm_book();
            
            Cbobj.Tid6.setText(s);
            
            Cbobj.Cid2.setText(c); 
            
           // Cbobj.Cdate.setDate(new java.sql.Date(Jdate.getDate().getTime()));
            
            Cbobj.setVisible(true);
        } 
        
        catch (SQLException ex) {
            Logger.getLogger(Book_Trip.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null,ex);  
        }   
            
        
        
        
    }//GEN-LAST:event_Bookbtn1ActionPerformed

    private void BtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)Btable.getModel();

        // get the selected row index
       int selectedRowIndex = Btable.getSelectedRow();
       
        // set the selected row data into jtextfields
       Tid.setText(model.getValueAt(selectedRowIndex, 0).toString());
       
       Cid.setText(model.getValueAt(selectedRowIndex, 1).toString());
       
       Src.setText(model.getValueAt(selectedRowIndex, 2).toString());
       
       Des.setText(model.getValueAt(selectedRowIndex, 3).toString());
       
       java.util.Date date1;

       
        try {
            date1 = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(selectedRowIndex,4).toString());
           // Jdate.setDate(date1);

        } catch (ParseException ex) {
            Logger.getLogger(Book_Trip.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        java.util.Date date2;

       
        try {
            date2 = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(selectedRowIndex,5).toString());
            //Edate.setDate(date2);

        } catch (ParseException ex) {
            Logger.getLogger(Book_Trip.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null,ex);  
           
        }
       
//        } catch (ParseException ex) {
//            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
//        }
       
       Cname.setText(model.getValueAt(selectedRowIndex,6).toString());
       
       Cadd.setText(model.getValueAt(selectedRowIndex,7).toString());
       
       Cphone.setText(model.getValueAt(selectedRowIndex, 8).toString());

    }//GEN-LAST:event_BtableMouseClicked

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
            java.util.logging.Logger.getLogger(Book_Trip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Book_Trip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Book_Trip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Book_Trip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Book_Trip().setVisible(true);
            }
        });
    }
    
    private javax.swing.JTextField Jdate;
    private javax.swing.JTextField Edate;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane BookScrollPane1;
    private javax.swing.JButton Bookbtn1;
    private javax.swing.JTable Btable;
    private javax.swing.JTextField Cadd;
    public static javax.swing.JTextField Cid;
    private javax.swing.JButton Clrbtn;
    private javax.swing.JTextField Cname;
    private javax.swing.JTextField Cphone;
    private javax.swing.JButton Delbtn;
    private javax.swing.JTextField Des;
    private javax.swing.JButton Modbtn;
    private javax.swing.JTextField Src;
    public static javax.swing.JTextField Tid;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jpanel;
    // End of variables declaration//GEN-END:variables
}

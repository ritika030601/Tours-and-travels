
package GUI_Forms.example;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Tickets extends javax.swing.JFrame {

    String gen="";
    
    public Tickets() {
        initComponents();
        
        cb1.addItem("2");
        cb1.addItem("3");
        cb1.addItem("4");
        cb1.addItem("5");
        cb1.addItem("6");
        
        cb2.addItem("US");
        cb2.addItem("Morocco");
        cb2.addItem("Brazil");
        cb2.addItem("Canada");
        cb2.addItem("Iraq");
        cb2.addItem("Las Vegas");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf2 = new javax.swing.JTextField();
        tf3 = new javax.swing.JTextField();
        tf1 = new javax.swing.JTextField();
        rd1 = new javax.swing.JRadioButton();
        rd2 = new javax.swing.JRadioButton();
        rd3 = new javax.swing.JRadioButton();
        cb1 = new javax.swing.JComboBox();
        submit = new javax.swing.JButton();
        cb2 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        tf4 = new javax.swing.JTextField();
        show = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Ticket Bookings");

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText(" Age");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel3.setBackground(new java.awt.Color(204, 204, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText(" Name");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel4.setBackground(new java.awt.Color(204, 204, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText(" Gender");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel5.setBackground(new java.awt.Color(204, 204, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText(" Members");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel7.setBackground(new java.awt.Color(204, 204, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText(" Country");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel8.setBackground(new java.awt.Color(204, 204, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText(" Cost per Member");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        tf2.setBackground(new java.awt.Color(153, 153, 255));
        tf2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        tf3.setBackground(new java.awt.Color(153, 153, 255));
        tf3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf3ActionPerformed(evt);
            }
        });

        tf1.setBackground(new java.awt.Color(153, 153, 255));
        tf1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        rd1.setBackground(new java.awt.Color(153, 153, 255));
        rd1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rd1.setText("Male");
        rd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd1ActionPerformed(evt);
            }
        });

        rd2.setBackground(new java.awt.Color(153, 153, 255));
        rd2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rd2.setText("Female");
        rd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd2ActionPerformed(evt);
            }
        });

        rd3.setBackground(new java.awt.Color(153, 153, 255));
        rd3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rd3.setText("Other");
        rd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd3ActionPerformed(evt);
            }
        });

        cb1.setBackground(new java.awt.Color(102, 102, 255));
        cb1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1" }));
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });

        submit.setBackground(new java.awt.Color(153, 153, 255));
        submit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submit.setText("Submit");
        submit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        cb2.setBackground(new java.awt.Color(102, 102, 255));
        cb2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cb2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Japan" }));
        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(204, 204, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText(" Total Cost");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        tf4.setBackground(new java.awt.Color(153, 153, 255));
        tf4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tf4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf4ActionPerformed(evt);
            }
        });

        show.setBackground(new java.awt.Color(153, 153, 255));
        show.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        show.setText("Show");
        show.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(414, 414, 414)
                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(rd1)
                        .addGap(18, 18, 18)
                        .addComponent(rd2)
                        .addGap(18, 18, 18)
                        .addComponent(rd3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97)
                                .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tf3, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf4, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(102, 102, 102))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addGap(103, 103, 103))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd1)
                    .addComponent(rd2)
                    .addComponent(rd3))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(cb1))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf3ActionPerformed
        
    }//GEN-LAST:event_tf3ActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        
        Connection con;
        PreparedStatement pst;
        
        try
        {
             Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practical","root","");
             
             String s3 = "insert into tickets (Name,Age,Gender,Members,Country,Cost_of_one,Cost) values ('"+tf1.getText()+"','"+tf2.getText()+"','"+gen+"','"+cb1.getSelectedItem()+"','"+cb2.getSelectedItem()+"','"+tf3.getText()+"','"+tf4.getText()+"')";
             pst = (PreparedStatement) con.prepareStatement(s3);
             int i = pst.executeUpdate();
             JOptionPane.showMessageDialog(this, "You will Recieve an \n email soon");
             dispose();
        }
         
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, ""+e.getMessage());
        }
    }//GEN-LAST:event_submitActionPerformed

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb2ActionPerformed

    private void tf4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf4ActionPerformed
        
    }//GEN-LAST:event_tf4ActionPerformed

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb1ActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        int c;
        
        
        if(cb2.getSelectedItem() == "US")
        {
            tf3.setText("Rs 90,890/-");
        }
        
        if(cb2.getSelectedItem() == "Morocco")
        {
            tf3.setText("Rs 13,500/-");
        }
        
        if(cb2.getSelectedItem() == "Brazil")
        {
            tf3.setText("Rs 58,441/-");
        }
        
        if(cb2.getSelectedItem() == "Iraq")
        {
            tf3.setText("Rs 82,000/-");
        }
        
        if(cb2.getSelectedItem() == "Las Vegas")
        {
            tf3.setText("Rs 1,08,250/-");
        }
        
        if(cb2.getSelectedItem() == "Canada")
        {
            tf3.setText("Rs 95,800/-");
        }
        
        if(cb2.getSelectedItem() == "Japan")
        {
            tf3.setText("Rs 82,000/-");
        }
        
        if(cb2.getSelectedItem()== "Japan")
        {
            if(cb1.getSelectedItem() == "1")
            {
                tf4.setText(tf3.getText());
            }
            
            if(cb1.getSelectedItem() == "2")
            {
                c = 82000*2;
                tf4.setText("Rs "+c +"/-");
            }
            
            if(cb1.getSelectedItem() == "3")
            {
                 c = 82000*3;
                tf4.setText("Rs "+c +"/-");
            }
            
            if(cb1.getSelectedItem() == "4")
            {
                 c = 82000*4;
                tf4.setText("Rs "+c +"/-");
            }
            
            if(cb1.getSelectedItem() == "5")
            {
                 c = 82000*5;
                tf4.setText("Rs "+c +"/-");
            }
            
            if(cb1.getSelectedItem() == "6")
            {
                 c = 82000*6;
                tf4.setText("Rs "+c +"/-");
            }
        }
        
        if(cb2.getSelectedItem()== "Canada")
        {
            if(cb1.getSelectedItem() == "1")
            {
                tf4.setText(tf3.getText());
            }
            
            if(cb1.getSelectedItem() == "2")
            {
                c = 95800*2;
                tf4.setText("Rs "+c +"/-");
            }
            
            if(cb1.getSelectedItem() == "3")
            {
                 c = 95800*3;
                tf4.setText("Rs "+c +"/-");
            }
            
            if(cb1.getSelectedItem() == "4")
            {
                 c = 95800*4;
                tf4.setText("Rs "+c +"/-");
            }
            
            if(cb1.getSelectedItem() == "5")
            {
                 c = 95800*5;
                tf4.setText("Rs "+c +"/-");
            }
            
            if(cb1.getSelectedItem() == "6")
            {
                 c = 95800*6;
                tf4.setText("Rs "+c +"/-");
            }
        }
        
        if(cb2.getSelectedItem()== "Las Vegas")
        {
            if(cb1.getSelectedItem() == "1")
            {
                tf4.setText(tf3.getText());
            }
            
            if(cb1.getSelectedItem() == "2")
            {
                c = 108250*2;
                tf4.setText("Rs "+c +"/-");
            }
            
            if(cb1.getSelectedItem() == "3")
            {
                 c = 108250*3;
                tf4.setText("Rs "+c +"/-");
            }
            
            if(cb1.getSelectedItem() == "4")
            {
                 c = 108250*4;
                tf4.setText("Rs "+c +"/-");
            }
            
            if(cb1.getSelectedItem() == "5")
            {
                 c = 108250*5;
                tf4.setText("Rs "+c +"/-");
            }
            
            if(cb1.getSelectedItem() == "6")
            {
                 c = 108250*6;
                tf4.setText("Rs "+c +"/-");
            }
        }
        
        if(cb2.getSelectedItem()== "Iraq")
        {
            if(cb1.getSelectedItem() == "1")
            {
                tf4.setText(tf3.getText());
            }
            
            if(cb1.getSelectedItem() == "2")
            {
                c = 82000*2;
                tf4.setText("Rs "+c +"/-");
            }
            
            if(cb1.getSelectedItem() == "3")
            {
                 c = 82000*3;
                tf4.setText("Rs "+c +"/-");
            }
            
            if(cb1.getSelectedItem() == "4")
            {
                 c = 82000*4;
                tf4.setText("Rs "+c +"/-");
            }
            
            if(cb1.getSelectedItem() == "5")
            {
                 c = 82000*5;
                tf4.setText("Rs "+c +"/-");
            }
            
            if(cb1.getSelectedItem() == "6")
            {
                 c = 82000*6;
                tf4.setText("Rs "+c +"/-");
            }
        }
        
        if(cb2.getSelectedItem()== "Brazil")
        {
            if(cb1.getSelectedItem() == "1")
            {
                tf4.setText(tf3.getText());
            }
            
            if(cb1.getSelectedItem() == "2")
            {
                c = 58441*2;
                tf4.setText("Rs "+c +"/-");
            }
            
            if(cb1.getSelectedItem() == "3")
            {
                 c = 58441*3;
                tf4.setText("Rs "+c +"/-");
            }
            
            if(cb1.getSelectedItem() == "4")
            {
                 c = 58441*4;
                tf4.setText("Rs "+c +"/-");
            }
            
            if(cb1.getSelectedItem() == "5")
            {
                 c = 58441*5;
                tf4.setText("Rs "+c +"/-");
            }
            
            if(cb1.getSelectedItem() == "6")
            {
                 c = 58441*6;
                tf4.setText("Rs "+c +"/-");
            }
        }
        
        if(cb2.getSelectedItem()== "Morocco")
        {
            if(cb1.getSelectedItem() == "1")
            {
                tf4.setText(tf3.getText());
            }
            
            if(cb1.getSelectedItem() == "2")
            {
                c = 82000*2;
                tf4.setText("Rs "+c +"/-");
            }
            
            if(cb1.getSelectedItem() == "3")
            {
                 c = 82000*3;
                tf4.setText("Rs "+c +"/-");
            }
            
            if(cb1.getSelectedItem() == "4")
            {
                 c = 82000*4;
                tf4.setText("Rs "+c +"/-");
            }
            
            if(cb1.getSelectedItem() == "5")
            {
                 c = 82000*5;
                tf4.setText("Rs "+c +"/-");
            }
            
            if(cb1.getSelectedItem() == "6")
            {
                 c = 82000*6;
                tf4.setText("Rs "+c +"/-");
            }
        }
        
        if(cb2.getSelectedItem()== "US")
        {
            if(cb1.getSelectedItem() == "1")
            {
                tf4.setText(tf3.getText());
            }
            
            if(cb1.getSelectedItem() == "2")
            {
                c = 90890*2;
                tf4.setText("Rs "+c +"/-");
            }
            
            if(cb1.getSelectedItem() == "3")
            {
                 c = 90890*3;
                tf4.setText("Rs "+c +"/-");
            }
            
            if(cb1.getSelectedItem() == "4")
            {
                 c = 90890*4;
                tf4.setText("Rs "+c +"/-");
            }
            
            if(cb1.getSelectedItem() == "5")
            {
                 c = 90890*5;
                tf4.setText("Rs "+c +"/-");
            }
            
            if(cb1.getSelectedItem() == "6")
            {
                 c = 90890*6;
                tf4.setText("Rs "+c +"/-");
            }
        }
    }//GEN-LAST:event_showActionPerformed

    private void rd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd1ActionPerformed
        gen = rd1.getText();
        
        if(rd1.isSelected())
        {
            rd1.setSelected(true);
            rd2.setSelected(false);
            rd3.setSelected(false);
        }
    }//GEN-LAST:event_rd1ActionPerformed

    private void rd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd2ActionPerformed
        gen = rd2.getText();
        
        if(rd2.isSelected())
        {
            rd1.setSelected(false);
            rd2.setSelected(true);
            rd3.setSelected(false);
        }
    }//GEN-LAST:event_rd2ActionPerformed

    private void rd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd3ActionPerformed
        gen = rd3.getText();
        
        if(rd3.isSelected())
        {
            rd1.setSelected(false);
            rd2.setSelected(false);
            rd3.setSelected(true);
        }
    }//GEN-LAST:event_rd3ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Tickets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb1;
    private javax.swing.JComboBox cb2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rd1;
    private javax.swing.JRadioButton rd2;
    private javax.swing.JRadioButton rd3;
    private javax.swing.JButton show;
    private javax.swing.JButton submit;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    // End of variables declaration//GEN-END:variables
}

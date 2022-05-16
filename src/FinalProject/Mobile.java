
package FinalProject;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Mobile extends javax.swing.JFrame {
    DefaultTableModel model;
String iphn7pcomapny="Apple",iphn7pbatchno="A339";        //iphone7plus
String iphn7comapny="Apple",iphn7batchno="A331";       //iphone 7
String iphn6spcomapny="Apple",iphn6spbatchno="A228";   //iphone 6s plus
String iphn6scompany="Apple",iphn6sbatchno="A221";        //iphone 6s
String iphn6pcompany="Apple",iphn6pbatchno="A119";        //iphone 6 plus
String iphn6company="Apple",iphn6batchno="A117";            //iphone 6 
String iphn5scompany="Apple",iphn5sbatchno="A110";     //iphone 5s
String iphn5company="Apple",iphn5batchno="A109";          //iphone 5                                      //iphone 5
double total;
   
    public Mobile() {
        initComponents();
         model=(DefaultTableModel)jTableCustom.getModel();
    }
    public void mobile()    //User Define Method
    {
        String a=c1.getSelectedItem().toString();
        int price = 0;
        
        if(a.equals("Iphone 7 plus"))
        {
            price=98000;
            tdi.setText(String.valueOf(price));
        int quantity=Integer.parseInt(t2.getText());    
        double rate=quantity*price;
        total+=rate;
        model.insertRow(model.getRowCount(),new Object[]{a,iphn7pcomapny,iphn7pbatchno,quantity,price,rate});
        
        }
        else if(a.equals("Iphone 7"))
        {
            price=90000;
            tdi.setText(String.valueOf(price));
       int quantity=Integer.parseInt(t2.getText());
            double rate=quantity*price;
            total+=rate;
        
            model.insertRow(model.getRowCount(),new Object[]{a,iphn7comapny,iphn7batchno,quantity,price,rate});
            
        }
        else if(a.equals("Iphone 6s plus"))
        {
            price=85000;
            tdi.setText(String.valueOf(price));
       int quantity=Integer.parseInt(t2.getText());
       double rate=quantity*price;
       total+=rate;
       
       model.insertRow(model.getRowCount(),new Object[]{a,iphn6spcomapny,iphn6spbatchno,quantity,price,rate});
            
        }
        else if(a.equals("Iphone 6s"))
        {
            price=80000;
            tdi.setText(String.valueOf(price));
       int quantity=Integer.parseInt(t2.getText());
       double rate=quantity*price;
       total+=rate;
       
       model.insertRow(model.getRowCount(),new Object[]{a,iphn6scompany,iphn6sbatchno,quantity,price,rate});
     
        }
        else if(a.equals("Iphone 6 plus"))
        {
            price=65000;
            tdi.setText(String.valueOf(price));
       int quantity=Integer.parseInt(t2.getText());
       double rate=quantity*price;
       total+=rate;
       
       model.insertRow(model.getRowCount(),new Object[]{a,iphn6pcompany,iphn6pbatchno,quantity,price,rate});
     
        }
        else if(a.equals("Iphone 6"))
        {
            price=60000;
            tdi.setText(String.valueOf(price));
       int quantity=Integer.parseInt(t2.getText());
       double rate=quantity*price;
       total+=rate;
       
       model.insertRow(model.getRowCount(),new Object[]{a,iphn6company,iphn6batchno,quantity,price,rate});
     
        }
        else if(a.equals("Iphone 5s"))
        {
            price=35000;
            tdi.setText(String.valueOf(price));
       int quantity=Integer.parseInt(t2.getText());
       double rate=quantity*price;
       total+=rate;
       
       model.insertRow(model.getRowCount(),new Object[]{a,iphn5scompany,iphn5sbatchno,quantity,price,rate});
     
        }
        else if(a.equals("Iphone 5"))
        {
            price=30000;
            tdi.setText(String.valueOf(price));
       int quantity=Integer.parseInt(t2.getText());
       double rate=quantity*price;
       total+=rate;
       
       model.insertRow(model.getRowCount(),new Object[]{a,iphn5company,iphn5batchno,quantity,price,rate});
     
        }
       
       tdisplay.setText(String.valueOf(total));
       
      
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        c1 = new javax.swing.JComboBox<>();
        b1 = new javax.swing.JButton();
        javax.swing.JButton badd = new javax.swing.JButton();
        t2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tdi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCustom = new javax.swing.JTable();
        tdisplay = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Select Items");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 120, 90, 17);

        c1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Iphone 7 plus", "Iphone 7", "Iphone 6s plus", "Iphone 6s", "Iphone 6 plus", "Iphone 6", "Iphone 5s", "Iphone 5" }));
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        jPanel1.add(c1);
        c1.setBounds(120, 120, 110, 30);

        b1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b1.setForeground(new java.awt.Color(51, 51, 51));
        b1.setText("Payment");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel1.add(b1);
        b1.setBounds(670, 480, 110, 30);

        badd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        badd.setText("Add");
        badd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baddActionPerformed(evt);
            }
        });
        jPanel1.add(badd);
        badd.setBounds(450, 120, 100, 30);
        jPanel1.add(t2);
        t2.setBounds(450, 160, 100, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Quantity");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(270, 160, 70, 20);

        tdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdiActionPerformed(evt);
            }
        });
        jPanel1.add(tdi);
        tdi.setBounds(120, 160, 100, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Price");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 160, 50, 17);

        jTableCustom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Company", "Model Number", "Piece", "Price", "Rate"
            }
        ));
        jScrollPane1.setViewportView(jTableCustom);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 220, 780, 190);

        tdisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdisplayActionPerformed(evt);
            }
        });
        jPanel1.add(tdisplay);
        tdisplay.setBounds(570, 430, 120, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("TOTAL BiLL");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(450, 430, 80, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/home transpe.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(0, 0, 100, 100);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Apple-logo-grey-880x625.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 70, 590, 400);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/White background.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 830, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 827, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed

    }//GEN-LAST:event_c1ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        JOptionPane.showMessageDialog(null, "Thankx For Shopping here\nFor More Shopping\nClick OK");
        dispose();  // for close previous frame
        Menu m=new Menu();
        m.setVisible(true);

    }//GEN-LAST:event_b1ActionPerformed

    private void baddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baddActionPerformed
        mobile();
    }//GEN-LAST:event_baddActionPerformed

    private void tdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tdiActionPerformed

    private void tdisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdisplayActionPerformed

    }//GEN-LAST:event_tdisplayActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        Menu m=new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Mobile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mobile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mobile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mobile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mobile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JComboBox<String> c1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCustom;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField tdi;
    private javax.swing.JTextField tdisplay;
    // End of variables declaration//GEN-END:variables
}

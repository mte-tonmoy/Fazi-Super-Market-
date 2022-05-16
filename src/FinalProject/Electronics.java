package FinalProject;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Electronics extends javax.swing.JFrame {
    DefaultTableModel model;
    double total;
String led32comapny="SONY",led32batchno="jekh009";        //LED-32
String led42comapny="SONY",led42batchno="aruad887";       //LED-42
String speakerscomapny="Audionic",speakersbatchno="cozx776";   //Speakers
String washcompany="Super-Asia",washbatchno="tout777";                 //Washing-machine
String fridgecompany="Dawlance",fridgebatchno="mi66543";        //Fridge
String microcompany="Orient",microbatchno="mmx8xx6";            //MicroWave
String ovencompany="Orient",ovenbatchno="cadn5568";          //Oven
    public Electronics()    //Constructor 
    {
        initComponents();
        model=(DefaultTableModel)jTableCustom.getModel();
    
    }
    public void products()    //User Define Method
    {
        String a=c1.getSelectedItem().toString();
        int price = 0;
        
        if(a.equals("LED 32 inches"))
        {
            price=38000;
            tdi.setText(String.valueOf(price));
        int quantity=Integer.parseInt(t2.getText());    
        double rate=quantity*price;
        total+=rate;
        model.insertRow(model.getRowCount(),new Object[]{a,led32comapny,led32batchno,quantity,price,rate});
        
        }
        else if(a.equals("LED 42 inches"))
        {
            price=45000;
            tdi.setText(String.valueOf(price));
       int quantity=Integer.parseInt(t2.getText());
            double rate=quantity*price;
            total+=rate;
        
            model.insertRow(model.getRowCount(),new Object[]{a,led42comapny,led42batchno,quantity,price,rate});
            
        }
        else if(a.equals("Speakers"))
        {
            price=10000;
            tdi.setText(String.valueOf(price));
       int quantity=Integer.parseInt(t2.getText());
       double rate=quantity*price;
       total+=rate;
       
       model.insertRow(model.getRowCount(),new Object[]{a,speakerscomapny,speakersbatchno,quantity,price,rate});
            
        }
        else if(a.equals("Washing-Machine"))
        {
            price=15000;
            tdi.setText(String.valueOf(price));
       int quantity=Integer.parseInt(t2.getText());
       double rate=quantity*price;
       total+=rate;
       
       model.insertRow(model.getRowCount(),new Object[]{a,washcompany,washbatchno,quantity,price,rate});
     
        }
        else if(a.equals("Fridge"))
        {
            price=21000;
            tdi.setText(String.valueOf(price));
       int quantity=Integer.parseInt(t2.getText());
       double rate=quantity*price;
       total+=rate;
       
       model.insertRow(model.getRowCount(),new Object[]{a,fridgecompany,fridgebatchno,quantity,price,rate});
     
        }
        else if(a.equals("Oven"))
        {
            price=18000;
            tdi.setText(String.valueOf(price));
       int quantity=Integer.parseInt(t2.getText());
       double rate=quantity*price;
       total+=rate;
       
       model.insertRow(model.getRowCount(),new Object[]{a,ovencompany,ovenbatchno,quantity,price,rate});
     
        }
        else if(a.equals("MicroWave"))
        {
            price=19000;
            tdi.setText(String.valueOf(price));
       int quantity=Integer.parseInt(t2.getText());
       double rate=quantity*price;
       total+=rate;
       
       model.insertRow(model.getRowCount(),new Object[]{a,microcompany,microbatchno,quantity,price,rate});
     
        }
       
       tdisplay.setText(String.valueOf(total));
       
      
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCustom = new javax.swing.JTable();
        tdisplay = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        javax.swing.JButton badd = new javax.swing.JButton();
        t2 = new javax.swing.JTextField();
        b1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tdi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        c1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jTableCustom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Company", "Batch Number", "Quantity", "Price", "Rate"
            }
        ));
        jScrollPane1.setViewportView(jTableCustom);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 210, 780, 190);

        tdisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdisplayActionPerformed(evt);
            }
        });
        jPanel1.add(tdisplay);
        tdisplay.setBounds(590, 430, 120, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("TOTAL BiLL");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(490, 430, 80, 30);

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

        b1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b1.setForeground(new java.awt.Color(51, 51, 51));
        b1.setText("Payment");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel1.add(b1);
        b1.setBounds(640, 470, 110, 30);

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Select Items");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 120, 90, 17);

        c1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "LED 32 inches", "LED 42 inches", "Speakers", "Washing-Machine", "Fridge", "Oven", "MicroWave", " " }));
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        jPanel1.add(c1);
        c1.setBounds(120, 120, 90, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/home transpe.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(0, 0, 100, 100);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Elce 2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tdisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdisplayActionPerformed

    }//GEN-LAST:event_tdisplayActionPerformed

    private void baddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baddActionPerformed
            products();
    }//GEN-LAST:event_baddActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
 JOptionPane.showMessageDialog(null, "Thankx For Shopping here\nFor More Shopping\nClick OK");
   dispose();  // for close previous frame
     Menu m=new Menu();
     m.setVisible(true);

    }//GEN-LAST:event_b1ActionPerformed

    private void tdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tdiActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed

    }//GEN-LAST:event_c1ActionPerformed

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
            java.util.logging.Logger.getLogger(Electronics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Electronics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Electronics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Electronics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Electronics().setVisible(true);
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCustom;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField tdi;
    private javax.swing.JTextField tdisplay;
    // End of variables declaration//GEN-END:variables
}

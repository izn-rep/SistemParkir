/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * UISistemParkir.java
 *
 * Created on Nov 12, 2012, 6:43:30 AM
 */
package FIX;
import javax.swing.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author izani
 */
public class UISistemParkir extends javax.swing.JFrame {
int currentHours;
int currentMinutes;
int currentSeconds;
String clock;
String jeniskendaraan;
    /** Creates new form UISistemParkir */
    public UISistemParkir() {
    setTitle("Input Sistem Parkir");
        initComponents();
       /* DateFormat df = new SimpleDateFormat ("dd-MM-yyyy");
        
       txt_nopolisi = new JTextField();         
       txt_jammasuk = new JTextField();
       txt_jamkeluar = new JTextField();
       txt_tglmasuk = new JTextField();
       txt_tglkeluar = new JTextField();*/
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    public void denda() {
        JOptionPane.showMessageDialog(null, "Parkir hanya untuk 1 hari! dikenakan denda diluar daftar tarif!", "Warning!",
                JOptionPane.INFORMATION_MESSAGE);
          txt_tarifparkir.setText("");
    }
    
    
    public void proccess() {
    int masuk = Integer.parseInt(txt_jammasuk.getText());
    int keluar = Integer.parseInt(txt_jamkeluar.getText());
    int lama = keluar - masuk;
    double tarif = 0;
    String kendaraan; 
                    
    if (rbtn_mobil.isSelected()){
           if ( lama >=1 && lama <=100 ) {
        tarif = 2000;
    } else if ( lama >=101 && lama <=200) {
        tarif = 4000;
    } else if ( lama >=201 && lama <=300) {
        tarif = 6000;
    } else if ( lama >=301 && lama <=400) {
        tarif = 8000;
    } else if ( lama >=401 && lama <=500) {
        tarif = 10000;
    } else if ( lama >=501 && lama <=600) {
        tarif = 12000;
    } else if ( lama >=601 && lama <=700) {
        tarif = 14000;
    } else if ( lama >=701 && lama <=800) {
        tarif = 16000;
    } else if ( lama >=801 && lama <=900) {
        tarif = 18000;
    } else if ( lama >=901 && lama <=1000) {
        tarif = 20000;
    } else if ( lama >=1001 && lama <=1100) {
        tarif = 22000;
    } else if ( lama >=1101 && lama <=1200) {
        tarif = 24000;
    } else if ( lama >=1201 && lama <=1300) {
        tarif = 26000;
    } else if ( lama >=1301 && lama <=1400) {
        tarif = 28000;
    } else if ( lama >=1401 && lama <=1500) {
        tarif = 30000;
    } else if ( lama >=1501 && lama <=1600) {
        tarif = 32000;
    } else if ( lama >=1601 && lama <=1700) {
        tarif = 32000;
    } else if ( lama >=1701 && lama <=1800) {
        tarif = 34000;
    } else if ( lama >=1801 && lama <=1900) {
        tarif = 36000;
    } else if ( lama >=1901 && lama <=2000) {
        tarif = 38000;
    } else if ( lama >=2001 && lama <=2100) {
        tarif = 40000;
    } else if ( lama >=2101 && lama <=2200) {
        tarif = 42000;
    } else if ( lama >=2201 && lama <=2300) {
        tarif = 44000;
    } else if ( lama >=2301 && lama <=2400) {
        tarif = 46000;
    } 
           String output = String.valueOf(tarif);
            txt_tarifparkir.setText(output);
       } 
    else if (rbtn_motor.isSelected()) {
           if ( lama >=1 && lama <=100 ) {
        tarif = 1000;
    } else if ( lama >=101 && lama <=200) {
        tarif = 2000;
    } else if ( lama >=201 && lama <=300) {
        tarif = 3000;
    } else if ( lama >=301 && lama <=400) {
        tarif = 4000;
    } else if ( lama >=401 && lama <=500) {
        tarif = 5000;
    } else if ( lama >=501 && lama <=600) {
        tarif = 6000;
    } else if ( lama >=601 && lama <=700) {
        tarif = 7000;
    } else if ( lama >=701 && lama <=800) {
        tarif = 8000;
    } else if ( lama >=801 && lama <=900) {
        tarif = 9000;
    } else if ( lama >=901 && lama <=1000) {
        tarif = 10000;
    } else if ( lama >=1001 && lama <=1100) {
        tarif = 11000;
    } else if ( lama >=1101 && lama <=1200) {
        tarif = 12000;
    } else if ( lama >=1201 && lama <=1300) {
        tarif = 13000;
    } else if ( lama >=1301 && lama <=1400) {
        tarif = 14000;
    } else if ( lama >=1401 && lama <=1500) {
        tarif = 15000;
    } else if ( lama >=1501 && lama <=1600) {
        tarif = 16000;
    } else if ( lama >=1601 && lama <=1700) {
        tarif = 17000;
    } else if ( lama >=1701 && lama <=1800) {
        tarif = 18000;
    } else if ( lama >=1801 && lama <=1900) {
        tarif = 19000;
    } else if ( lama >=1901 && lama <=2000) {
        tarif = 20000;
    } else if ( lama >=2001 && lama <=2100) {
        tarif = 21000;
    } else if ( lama >=2101 && lama <=2200) {
        tarif = 22000;
    } else if ( lama >=2201 && lama <=2300) {
        tarif = 23000;
    } else if ( lama >=2301 && lama <=2400) {
        tarif = 24000;
    } 
           String output = String.valueOf(tarif);
            txt_tarifparkir.setText(output);
    }else  {
          JOptionPane.showMessageDialog(null, "Jenis Kendaraan Belum Dipilih", "Warning!",
                JOptionPane.INFORMATION_MESSAGE);
          txt_tarifparkir.setText("");
      }
           
           
    }
         
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        lbl_jeniskendaraan = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        rbtn_mobil = new javax.swing.JRadioButton();
        rbtn_motor = new javax.swing.JRadioButton();
        lbl_nopolisi = new javax.swing.JLabel();
        txt_nopolisi = new javax.swing.JTextField();
        btn_process = new javax.swing.JButton();
        txt_jamkeluar = new javax.swing.JTextField();
        lbl_jamkeluar = new javax.swing.JLabel();
        lbl_jammasuk = new javax.swing.JLabel();
        txt_jammasuk = new javax.swing.JTextField();
        lbl_tglmasuk = new javax.swing.JLabel();
        lbl_tglkeluar = new javax.swing.JLabel();
        btn_save = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        txt_tglmasuk = new com.toedter.calendar.JDateChooser();
        txt_tglkeluar = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btn_reset = new javax.swing.JButton();
        btn_printout = new javax.swing.JButton();
        txt_tarifparkir = new javax.swing.JTextField();
        lbl_tarifparkir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setMinimumSize(new java.awt.Dimension(50, 100));

        jLabel14.setText("(hhmm)");

        lbl_jeniskendaraan.setText("Jenis Kendaraan :");

        jLabel11.setText("(hhmm)");

        buttonGroup1.add(rbtn_mobil);
        rbtn_mobil.setText("Mobil");

        buttonGroup1.add(rbtn_motor);
        rbtn_motor.setText("Motor");

        lbl_nopolisi.setText("No Polisi              :");

        btn_process.setText("Process");
        btn_process.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_processActionPerformed(evt);
            }
        });

        lbl_jamkeluar.setText("Jam Keluar          :");

        lbl_jammasuk.setText("Jam Masuk          :");

        lbl_tglmasuk.setText("Tanggal Masuk :");

        lbl_tglkeluar.setText("Tanggal Keluar :");

        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_save)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_process))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_nopolisi)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_jammasuk)
                                    .addComponent(lbl_jamkeluar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txt_jamkeluar, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_jammasuk, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                        .addComponent(txt_nopolisi)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl_tglkeluar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_tglkeluar, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl_tglmasuk)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_tglmasuk, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_jeniskendaraan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbtn_mobil)
                                .addGap(12, 12, 12)
                                .addComponent(rbtn_motor)))
                        .addGap(46, 46, 46)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nopolisi)
                    .addComponent(txt_nopolisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_jeniskendaraan)
                    .addComponent(rbtn_motor)
                    .addComponent(rbtn_mobil))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_jammasuk)
                            .addComponent(txt_jammasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addGap(7, 7, 7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_tglmasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_tglmasuk))
                        .addGap(31, 31, 31)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_jamkeluar)
                            .addComponent(txt_jamkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txt_tglkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_tglkeluar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_process)
                    .addComponent(btn_save))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel13.setText("Rp. ");

        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        btn_printout.setText("Print Out");
        btn_printout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_printoutMouseClicked(evt);
            }
        });

        lbl_tarifparkir.setText("Tarif Parkir  ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_tarifparkir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_tarifparkir, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(btn_reset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_printout)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tarifparkir)
                    .addComponent(jLabel13)
                    .addComponent(txt_tarifparkir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_printout)
                    .addComponent(btn_reset))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, 0, 492, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void btn_processActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_processActionPerformed
// TODO add your handling code here:
    DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
    String nopolisi, jammasuk, tanggalmasuk, jamkeluar, tanggalkeluar;
    nopolisi = txt_nopolisi.getText();
    jammasuk = txt_jammasuk.getText();
    //txt_tglmasuk.getDate();
    jamkeluar = txt_jamkeluar.getText();
    //tanggalkeluar = df.format(txt_tglmasuk.getDate());
    
    //String keluar = txt_tglkeluar.getDate().toString();
    
    if (nopolisi.equals("") || nopolisi.length() < 1) {
        JOptionPane.showMessageDialog(null, "Nomor Polisi belum dimasukkan!", "Warning!",
                JOptionPane.INFORMATION_MESSAGE);
        txt_nopolisi.requestFocus(true);
        txt_tarifparkir.setText("");
    } else if (jammasuk.equals("") || jammasuk.length() < 1) {
        JOptionPane.showMessageDialog(null, "Jam Masuk belum dimasukkan!", "Warning!",
                JOptionPane.INFORMATION_MESSAGE);
        txt_jammasuk.requestFocus(true);
        txt_tarifparkir.setText("");
    } else if (txt_tglmasuk.getDate() == null) {
        JOptionPane.showMessageDialog(null, "Tanggal Masuk belum dimasukkan!", "Warning!",
                JOptionPane.INFORMATION_MESSAGE);
        txt_tglmasuk.requestFocus(true);
        txt_tarifparkir.setText("");
    } else if (jamkeluar.equals("") || jamkeluar.length() < 1) {
        JOptionPane.showMessageDialog(null, "Jam Keluar belum dimasukkan!", "Warning!",
                JOptionPane.INFORMATION_MESSAGE);
        txt_jamkeluar.requestFocus(true);
        txt_tarifparkir.setText("");
    } else if (txt_tglkeluar.getDate() == null) {
        JOptionPane.showMessageDialog(null, "Tanggal Keluar belum dimasukkan!", "Warning!",
                JOptionPane.INFORMATION_MESSAGE);
        txt_tglkeluar.requestFocus(true);
        txt_tarifparkir.setText("");
    } else if (!df.format(txt_tglmasuk.getDate()).equals(df.format(txt_tglkeluar.getDate()))){
        denda();
    } else {
        proccess();
    }
    
       
    
    
        
}//GEN-LAST:event_btn_processActionPerformed

private void btn_printoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_printoutMouseClicked
// TODO add your handling code here:
    new UIPrintOutParkir().show();
    this.dispose();
}//GEN-LAST:event_btn_printoutMouseClicked

private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
// TODO add your handling code here:
    txt_nopolisi.setText("");
    txt_jammasuk.setText("");
    txt_tglmasuk.setDate(null);
    txt_jamkeluar.setText("");
    txt_tglkeluar.setDate(null);
    txt_tarifparkir.setText("");
}//GEN-LAST:event_btn_resetActionPerformed

private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
// TODO add your handling code here:
    try {
        Koneksi objkoneksi = new Koneksi ();
        Connection con = Koneksi.bukakoneksi();
        Statement stat = con.createStatement();
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        String tjeniskendaraan;
        if (rbtn_mobil.isSelected()){
           tjeniskendaraan = "Mobil";
       } else {
           tjeniskendaraan = "Motor";
       }
        String sql = "insert into \"DataKendaraan\" values "
                + "('" + txt_nopolisi.getText()+ "','" + tjeniskendaraan +"','" + txt_jammasuk.getText() + "','" + 
                df.format(txt_tglmasuk.getDate()) + "','" + txt_jamkeluar.getText() + "','" + df.format(txt_tglkeluar.getDate()) + "','" +
                txt_tarifparkir.getText() + "', 'Y')";
        int rows = stat.executeUpdate(sql);
        JOptionPane.showMessageDialog(this, "Data telah di save", "Message", JOptionPane.INFORMATION_MESSAGE);
    } catch (SQLException se) {
        System.err.println(se);
    } catch (Exception e) {
        System.err.println(e);
    }
}//GEN-LAST:event_btn_saveActionPerformed

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
            java.util.logging.Logger.getLogger(UISistemParkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UISistemParkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UISistemParkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UISistemParkir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new UISistemParkir().setVisible(true);
                
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_printout;
    private javax.swing.JButton btn_process;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_save;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_jamkeluar;
    private javax.swing.JLabel lbl_jammasuk;
    private javax.swing.JLabel lbl_jeniskendaraan;
    private javax.swing.JLabel lbl_nopolisi;
    private javax.swing.JLabel lbl_tarifparkir;
    private javax.swing.JLabel lbl_tglkeluar;
    private javax.swing.JLabel lbl_tglmasuk;
    private javax.swing.JRadioButton rbtn_mobil;
    private javax.swing.JRadioButton rbtn_motor;
    private javax.swing.JTextField txt_jamkeluar;
    private javax.swing.JTextField txt_jammasuk;
    private javax.swing.JTextField txt_nopolisi;
    private javax.swing.JTextField txt_tarifparkir;
    private com.toedter.calendar.JDateChooser txt_tglkeluar;
    private com.toedter.calendar.JDateChooser txt_tglmasuk;
    // End of variables declaration//GEN-END:variables
}

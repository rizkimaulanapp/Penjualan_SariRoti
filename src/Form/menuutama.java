package Form;


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kiki
 */
public class menuutama extends javax.swing.JFrame implements Runnable {
Thread T;
    boolean kanan =true;
    boolean kiri =false;
    boolean berjalan=true;
    int x,y;
    /**
     * Creates new form menuutama
     */
    public menuutama() {
        initComponents();
        this.setTitle("APLIKASI SARI ROTI");
        this.setLocationRelativeTo(this);
        x=lbl_font.getX();
        y=lbl_font.getY();
        T=new Thread(this);
        T.start();
        
        if (username.equalsIgnoreCase("admin")){
            tomboladmin();
        }else if(jabatan.equalsIgnoreCase("operator")){
            tombolOgudang();
        }else if(jabatan.equalsIgnoreCase("keuangan")){
            tombolkeuangan();
        }else{
            tombolkasir();
        }
        jLabel3.setText("HALO  :"+nama);
    }
     @Override
    public void run (){
        while(true){
            if(berjalan){
                if(x >=jPanel2.getWidth()-400){
                    kiri=true; 
                    kanan=false;
                }
                if (kiri){
                    x--;
                    lbl_font.setLocation(x,y);
                }
                if(x<=5){
                    kanan=true;
                    kiri=false;
                }
                if(kanan){
                    x++;
                    lbl_font.setLocation(x,y);
            }
        }
    try {
        Thread.sleep(2);
    }catch (InterruptedException ex){
        Logger.getLogger(menuutama.class.getName()).log(Level.SEVERE,null,ex);
    }
    repaint();
        }}

     private String nama=aksesLogin.getNama();
     private String username=aksesLogin.getUsername();
     private String password=aksesLogin.getPassword();
     private String jabatan=aksesLogin.getJabatan();
     
     private void tomboladmin(){
         btn_database.setEnabled(true);
         btn_jual.setEnabled(true);
         btn_gudang.setEnabled(true);
         btn_karyawan.setEnabled(true);
         btn_gaji.setEnabled(true);
         btn_database.setEnabled(true);
         btn_konsumen.setEnabled(true);
         btn_laptransaksi.setEnabled(true);
         btn_lapgaji.setEnabled(true);
     }
     private void tombolOgudang(){
         btn_database.setEnabled(false);
         btn_jual.setEnabled(false);
         btn_gudang.setEnabled(true);
         btn_karyawan.setEnabled(false);
         btn_gaji.setEnabled(false);
         btn_database.setEnabled(false);
         btn_konsumen.setEnabled(false);
         btn_laptransaksi.setEnabled(false);
         btn_lapgaji.setEnabled(false);
     }
    private void tombolkeuangan(){
         btn_database.setEnabled(false);
         btn_jual.setEnabled(false);
         btn_gudang.setEnabled(false);
         btn_karyawan.setEnabled(false);
         btn_gaji.setEnabled(true);
         btn_database.setEnabled(false);
         btn_konsumen.setEnabled(false);
         btn_laptransaksi.setEnabled(false);
         btn_lapgaji.setEnabled(true);
     }
    private void tombolkasir(){
         btn_database.setEnabled(false);
         btn_jual.setEnabled(true);
         btn_gudang.setEnabled(false);
         btn_karyawan.setEnabled(false);
         btn_gaji.setEnabled(false);
         btn_database.setEnabled(false);
         btn_konsumen.setEnabled(false);
         btn_laptransaksi.setEnabled(false);
         btn_lapgaji.setEnabled(false);
     }
     
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        btn_laptransaksi = new javax.swing.JButton();
        btn_jual = new javax.swing.JButton();
        btn_gudang = new javax.swing.JButton();
        btn_karyawan = new javax.swing.JButton();
        btn_gaji = new javax.swing.JButton();
        btn_database = new javax.swing.JButton();
        btn_konsumen = new javax.swing.JButton();
        btn_lapgaji = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbl_font = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/logobuat.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(0, 51, 204));

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/sari-roti-580x358.jpeg"))); // NOI18N

        btn_laptransaksi.setBackground(new java.awt.Color(255, 255, 255));
        btn_laptransaksi.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        btn_laptransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/report.png"))); // NOI18N
        btn_laptransaksi.setText("Laporan Transaksi");
        btn_laptransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_laptransaksiActionPerformed(evt);
            }
        });

        btn_jual.setBackground(new java.awt.Color(255, 255, 255));
        btn_jual.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        btn_jual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/th (3).jpg"))); // NOI18N
        btn_jual.setText("Penjualan");
        btn_jual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jualActionPerformed(evt);
            }
        });

        btn_gudang.setBackground(new java.awt.Color(255, 255, 255));
        btn_gudang.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        btn_gudang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/gudang.jpg"))); // NOI18N
        btn_gudang.setText("Gudang");
        btn_gudang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gudangActionPerformed(evt);
            }
        });

        btn_karyawan.setBackground(new java.awt.Color(255, 255, 255));
        btn_karyawan.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        btn_karyawan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/users-17.png"))); // NOI18N
        btn_karyawan.setText("Karyawan");
        btn_karyawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_karyawanActionPerformed(evt);
            }
        });

        btn_gaji.setBackground(new java.awt.Color(255, 255, 255));
        btn_gaji.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        btn_gaji.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/money.jpg"))); // NOI18N
        btn_gaji.setText("Penggajian");
        btn_gaji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gajiActionPerformed(evt);
            }
        });

        btn_database.setBackground(new java.awt.Color(255, 255, 255));
        btn_database.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        btn_database.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/th.jpg"))); // NOI18N
        btn_database.setText("Database");
        btn_database.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_databaseActionPerformed(evt);
            }
        });

        btn_konsumen.setBackground(new java.awt.Color(255, 255, 255));
        btn_konsumen.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        btn_konsumen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/img_196602.png"))); // NOI18N
        btn_konsumen.setText("Konsumen");
        btn_konsumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_konsumenActionPerformed(evt);
            }
        });

        btn_lapgaji.setBackground(new java.awt.Color(255, 255, 255));
        btn_lapgaji.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        btn_lapgaji.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/report.png"))); // NOI18N
        btn_lapgaji.setText("Laporan Gaji");
        btn_lapgaji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lapgajiActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btn_laptransaksi, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btn_jual, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btn_gudang, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btn_karyawan, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btn_gaji, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btn_database, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btn_konsumen, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btn_lapgaji, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_jual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_karyawan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_gudang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_gaji, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_database, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_konsumen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_laptransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(btn_lapgaji, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_laptransaksi)
                            .addComponent(btn_jual))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_gudang)
                            .addComponent(btn_lapgaji))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_karyawan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_gaji, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_database)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_konsumen)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));

        lbl_font.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        lbl_font.setForeground(new java.awt.Color(0, 0, 153));
        lbl_font.setText("SELAMAT DATANG :)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(lbl_font, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_font)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 0));
        jPanel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 24)); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDesktopPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/th (1).jpg"))); // NOI18N
        jButton5.setText("Keluar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton5)))
                .addGap(531, 531, 531))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new menu_login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btn_gudangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gudangActionPerformed
       new gudang().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_gudangActionPerformed

    private void btn_karyawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_karyawanActionPerformed
    new karyawan().setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_btn_karyawanActionPerformed

    private void btn_laptransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_laptransaksiActionPerformed
    try{
            JasperPrint jp=JasperFillManager.fillReport(getClass().getResourceAsStream("faktur.jasper"),null,ClassKoneksi.getkoneksi());
            JasperViewer.viewReport(jp,false);
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_btn_laptransaksiActionPerformed

    private void btn_gajiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gajiActionPerformed
        // TODO add your handling code here:
        new Penggajian().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_gajiActionPerformed

    private void btn_databaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_databaseActionPerformed
     new database().setVisible(true);
     this.setVisible(false);
    }//GEN-LAST:event_btn_databaseActionPerformed

    private void btn_jualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jualActionPerformed
     new FrmJual().setVisible(true);
     this.setVisible(false);
    }//GEN-LAST:event_btn_jualActionPerformed

    private void btn_konsumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_konsumenActionPerformed
     new konsumen().setVisible(true);
     this.setVisible(false);
    }//GEN-LAST:event_btn_konsumenActionPerformed

    private void btn_lapgajiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lapgajiActionPerformed
    try{
            JasperPrint jp=JasperFillManager.fillReport(getClass().getResourceAsStream("laporan_gaji.jasper"),null,ClassKoneksi.getkoneksi());
            JasperViewer.viewReport(jp,false);
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_btn_lapgajiActionPerformed

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
            java.util.logging.Logger.getLogger(menuutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuutama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_database;
    private javax.swing.JButton btn_gaji;
    private javax.swing.JButton btn_gudang;
    private javax.swing.JButton btn_jual;
    private javax.swing.JButton btn_karyawan;
    private javax.swing.JButton btn_konsumen;
    private javax.swing.JButton btn_lapgaji;
    private javax.swing.JButton btn_laptransaksi;
    private javax.swing.JButton jButton5;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbl_font;
    // End of variables declaration//GEN-END:variables

    

   
}

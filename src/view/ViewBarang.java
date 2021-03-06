/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import util.Koneksi;

/**
 *
 * @author PC
 */
public class ViewBarang extends javax.swing.JFrame {
    Koneksi Merlinda = new Koneksi();
    model.ModelBarang Model = new model.ModelBarang();
    controller.ControllerBarang Controller = new controller.ControllerBarang();
    
    /**
     * Creates new form ViewBarang
     */
    public ViewBarang() {
        initComponents();
        setLocationRelativeTo(null);
        enableFalse();
        dataBarang();
    }
    
    private void bersih(){
        JT_IDBarang.setText("");
        JT_NamaBarang.setText("");
        JT_JenisBarang.setText("");
        JT_JumlahBarang.setText("");
        JT_NamaBarang.requestFocus();
    }
    
    private void enableFalse(){
        Btn_Baru.setEnabled(true);
        Btn_Simpan.setEnabled(false);
        Btn_Bersih.setEnabled(false);
        Btn_Ubah.setEnabled(false);
        Btn_Hapus.setEnabled(false);
        Btn_Tutup.setEnabled(false);
        JT_IDBarang.setEnabled(false);
        JT_NamaBarang.setEnabled(false);
        JT_JenisBarang.setEnabled(false);
        JT_JumlahBarang.setEnabled(false);                       
    } 
    
    private void Barufalse(){
        Btn_Baru.setEnabled(false);
        Btn_Simpan.setEnabled(true);
        Btn_Bersih.setEnabled(true);
        Btn_Ubah.setEnabled(false);
        Btn_Hapus.setEnabled(false);
        Btn_Tutup.setEnabled(true);
        JT_IDBarang.setEnabled(false);
        JT_NamaBarang.setEnabled(true);
        JT_JenisBarang.setEnabled(true);
        JT_JumlahBarang.setEnabled(true);
    }
    
    private void ubahHapus(){
        Btn_Baru.setEnabled(false);
        Btn_Simpan.setEnabled(false);
        Btn_Bersih.setEnabled(true);
        Btn_Ubah.setEnabled(true);
        Btn_Hapus.setEnabled(true);
        Btn_Tutup.setEnabled(true);
        JT_IDBarang.setEnabled(false);
        JT_NamaBarang.setEnabled(true);
        JT_JenisBarang.setEnabled(true);
        JT_JumlahBarang.setEnabled(true);
    }
    
    private void dataBarang(){
        Merlinda.koneksiDatabase();
        DefaultTableModel tabel = new DefaultTableModel();
        
        tabel.addColumn("id Barang");
        tabel.addColumn("Nama Barang");
        tabel.addColumn("Jenis Barang");
        tabel.addColumn("Jumlah Barang");
        
        JTableBarang.setModel(tabel);
        try {
            String query = "SELECT * FROM tbl_barang";
            
            ResultSet ress = Merlinda.state.executeQuery(query);
            while (ress.next()){
                tabel.addRow(new Object[]{
                ress.getString("id"),
                ress.getString("nama"),
                ress.getString("jenis"),
                ress.getString("jumlah"),
                });
            }
        } catch (Exception e) {
            System.err.println(""+e);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JT_JumlahBarang = new javax.swing.JTextField();
        JT_IDBarang = new javax.swing.JTextField();
        JT_NamaBarang = new javax.swing.JTextField();
        JT_JenisBarang = new javax.swing.JTextField();
        Btn_Tutup = new javax.swing.JButton();
        Btn_Baru = new javax.swing.JButton();
        Btn_Simpan = new javax.swing.JButton();
        Btn_Bersih = new javax.swing.JButton();
        Btn_Ubah = new javax.swing.JButton();
        Btn_Hapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableBarang = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Barang");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Jumlah Barang   :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("id Barang  :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nama Barang  :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Jenis Barang   :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        getContentPane().add(JT_JumlahBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 120, -1));
        getContentPane().add(JT_IDBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 40, -1));
        getContentPane().add(JT_NamaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 120, -1));
        getContentPane().add(JT_JenisBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 110, -1));

        Btn_Tutup.setText("Tutup");
        Btn_Tutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_TutupActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Tutup, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 70, 30));

        Btn_Baru.setText("Baru");
        Btn_Baru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BaruActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Baru, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 70, 30));

        Btn_Simpan.setText("Simpan");
        Btn_Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SimpanActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 70, 30));

        Btn_Bersih.setText("Bersih");
        Btn_Bersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BersihActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Bersih, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 70, 30));

        Btn_Ubah.setText("Ubah");
        Btn_Ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_UbahActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 70, 30));

        Btn_Hapus.setText("Hapus");
        Btn_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_HapusActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 70, 30));

        JTableBarang.setModel(new javax.swing.table.DefaultTableModel(
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
        JTableBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableBarang);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 380, 130));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 30, 310));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 390, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SimpanActionPerformed
        // TODO add your handling code here:
        try {
            String nama = JT_NamaBarang.getText();
            String jenis = JT_JenisBarang.getText();
            int jumlah = Integer.parseInt(JT_JumlahBarang.getText());
            
            Model.setNama(nama);
            Model.setJenis(jenis);
            Model.setJumlah(jumlah);
            
            Controller.simpanBarang(Model);
            dataBarang();
            bersih();
            enableFalse();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Harap Isi Dengan Benar !");
            JT_NamaBarang.setText("");
            JT_NamaBarang.requestFocus();
        }
    }//GEN-LAST:event_Btn_SimpanActionPerformed

    private void Btn_BaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BaruActionPerformed
        // TODO add your handling code here:
        Barufalse();
    }//GEN-LAST:event_Btn_BaruActionPerformed

    private void Btn_BersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BersihActionPerformed
        // TODO add your handling code here:
        bersih();
        enableFalse();
    }//GEN-LAST:event_Btn_BersihActionPerformed

    private void Btn_UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_UbahActionPerformed
        // TODO add your handling code here:
        try {
            int id = Integer.parseInt(JT_IDBarang.getText());
            String nama = JT_NamaBarang.getText();
            String jenis = JT_JenisBarang.getText();
            int jumlah = Integer.parseInt(JT_JumlahBarang.getText());
            
            Model.setId(id);
            Model.setNama(nama);
            Model.setJenis(jenis);
            Model.setJumlah(jumlah);
            Controller.ubahBarang(Model);
            
            bersih();
            dataBarang();
            enableFalse();            
        } catch (Exception e) {
            System.err.println(""+e);
        }
    }//GEN-LAST:event_Btn_UbahActionPerformed

    private void Btn_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_HapusActionPerformed
        // TODO add your handling code here:
        try {
            int id = Integer.parseInt(JT_IDBarang.getText());
            
            Model.setId(id);
            Controller.hapusBarang(Model);
            
            dataBarang();
            bersih();
            enableFalse();
        } catch (Exception e) {
            System.err.println(""+e);
        }
    }//GEN-LAST:event_Btn_HapusActionPerformed

    private void Btn_TutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_TutupActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_Btn_TutupActionPerformed

    private void JTableBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableBarangMouseClicked
        // TODO add your handling code here:
        ubahHapus();
        try {
            int baris = JTableBarang.getSelectedRow();
            JT_IDBarang.setText(JTableBarang.getValueAt(baris, 0).toString());
            JT_NamaBarang.setText(JTableBarang.getValueAt(baris, 1).toString());
            JT_JenisBarang.setText(JTableBarang.getValueAt(baris, 2).toString());
            JT_JumlahBarang.setText(JTableBarang.getValueAt(baris, 3).toString());
        } catch (Exception e) {
            System.err.println(""+e);
        }
    }//GEN-LAST:event_JTableBarangMouseClicked

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
            java.util.logging.Logger.getLogger(ViewBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Baru;
    private javax.swing.JButton Btn_Bersih;
    private javax.swing.JButton Btn_Hapus;
    private javax.swing.JButton Btn_Simpan;
    private javax.swing.JButton Btn_Tutup;
    private javax.swing.JButton Btn_Ubah;
    private javax.swing.JTextField JT_IDBarang;
    private javax.swing.JTextField JT_JenisBarang;
    private javax.swing.JTextField JT_JumlahBarang;
    private javax.swing.JTextField JT_NamaBarang;
    private javax.swing.JTable JTableBarang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import util.Koneksi;

/**
 *
 * @author PC
 */
public class ControllerBarang {
    Koneksi Merlinda = new Koneksi();
    
    public void simpanBarang(model.ModelBarang mb){
        Merlinda.koneksiDatabase();
        String querySimpan = "INSERT INTO tbl_barang(nama, jenis, jumlah) VALUES"
                + "('"+mb.getNama()+"', '"+mb.getJenis()+"', '"+mb.getJumlah()+"')";
        try {
            Merlinda.state.executeUpdate(querySimpan);
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Tidak Tersimpan !");
            System.err.println(""+e);
        }
    }
    
    public void ubahBarang(model.ModelBarang mb){
        Merlinda.koneksiDatabase();
        
        try {
            int id = mb.getId();
            String nama = mb.getNama();
            String jenis = mb.getJenis();
            int jumlah = mb.getJumlah();
                    
            String queryUbah = "Update tbl_barang set"
                + "nama = ('"+nama+"'),"
                + "jenis = ('"+jenis+"'),"
                + "jumlah = ('"+jumlah+"')"
                + "where id = ('"+id+"')";
            Merlinda.state.executeUpdate(queryUbah);
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Tidak Terubah !");
            System.err.println(""+e);
        }
    }
    
    public void hapusBarang(model.ModelBarang mb){
        try {
            Merlinda.koneksiDatabase();
            String queryHapus = "Delete from tbl_barang where id = ('"+mb.getId()+"')";
            Merlinda.state.executeUpdate(queryHapus);
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Tidak Terhapus !");
            System.err.println(""+e);
        }
    }
}

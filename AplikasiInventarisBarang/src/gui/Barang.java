/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

/**
 *
 * @author user
 */
public class Barang {
    String namabarang, distributor;
    double stok, harga, modal;
// construktor

    public Barang(String namabarang, String distributor, double stok, double harga, double modal) {
        this.namabarang = namabarang;
        this.distributor = distributor;
        this.stok = stok;
        this.harga = harga;
        this.modal = modal;
    }    
}

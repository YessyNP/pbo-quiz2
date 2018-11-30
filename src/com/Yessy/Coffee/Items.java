/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Yessy.Coffee;

/**
 *
 * @author YESSYNP
 */
public class Items {
    // variable ini untuk menyimpan nama barang
    private String nama;
    // variable ini untuk menyimpan harga barang
    private float harga;
    // variable untuk menyimpan jumlah barang
    private int jumlah;
    
    //Constructor
   public Items(){
   }

    public Items(String nama, float harga, int jumlah) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public float getHarga() {
        return harga;
    }

    public void setHarga(float harga) {
        this.harga = harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
   // hasil perkalian harga dan jumlah
    public float getTotal(){
        return this.harga * this.jumlah;
    }
    public String toString(){
        return this.nama;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Yessy.Coffee;
import java.util.* ;
import java.text.SimpleDateFormat ;
import java.util.ArrayList ;
/**
 *
 * @author YESSYNP
 */
public class Transaksi {
    // variable untuk menampilkan kode pembayaran jenis minuman 
    private final String kode ;
    // variable untuk menampilkan item apa saja yang dibeli
    private ArrayList<Items> itemses = new ArrayList<>();
    // variable total untuk menampilkan total pembelian minuman
    private float total ; 
    
    // Konstruktor
    public Transaksi (String kode , ArrayList<Items> itemses){
        this.kode = kode ;
        this.itemses = itemses;
        
    }
        
    // total setter
    public void setTotal () {
        float total = 0 ;
        for (Items itemses : this.itemses){
            total += itemses.getTotal();
        }
        this.total = total ;
    }
    
    // output transaksi
    public String Pembayaran() {
        setTotal () ;
        String obt = "" ;
        obt += "Kode\t\t : " + this.kode +"\n" ;
        obt += "Daftar Belanja : \n" ;
        for (Items itemses:this.itemses){
           obt += "\t" + itemses.getNama() + "(x" + itemses.getJumlah() + ") : " + itemses.getTotal() + "\n" ;
        }
        obt += "Total\t\t : " + this.total ;
        return obt ;
    }

}

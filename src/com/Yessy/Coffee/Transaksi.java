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
    private ArrayList<Items> items = new ArrayList<>();
    // variable total untuk menampilkan total pembelian minuman
    private float total ; 
    
    // Konstruktor
    public Transaksi(){
        this.kode = null;
    }
    public Transaksi (String kode , ArrayList<Items> items){
        this.kode = kode ;
        this.items = items;
        
    }
        
    // total setter
    public void setTotal () {
        float total = 0 ;
        for (Items items : this.items){
            total += items.getTotal();
        }
        this.total = total ;
    }
    
    // output transaksi
    public String Pembayaran() {
        setTotal () ;
        String obt = "" ;
        obt += "Kode\t\t : " + this.kode +"\n" ;
        obt += "Daftar Belanja : \n" ;
        for (Items items:this.items){
           obt += "\t" + items.getNama() + "(x" + items.getJumlah() + ") : " + items.getTotal() + "\n" ;
        }
        obt += "Total\t\t : " + this.total ;
        return obt ;
    }

}

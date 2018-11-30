/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Yessy.Coffee;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author YESSYNP
 */
public class ComboItems {
private HashMap<String , Float> itemses = new HashMap<>() ;
    
    public ComboItems() {
        this.itemses.put("Kopi" , new Float(30000)) ;
        this.itemses.put("Gula" , new Float(10000)) ;
        this.itemses.put("Susu" , new Float(20000)) ;
        this.itemses.put("Es Teh" , new Float(15000)) ;
        this.itemses.put("Matcha" , new Float(19000)) ;
        
    }
    
    public ArrayList <String> getJenisNama () {
        ArrayList<String> str = new ArrayList<> () ;
        for (String item : this.itemses.keySet()) {
            str.add(item) ;
        }
        return str ;
    }
    
    public ArrayList <Float> getSemuaHarga() {
        ArrayList<Float> flt = new ArrayList<> () ;
        for (float item : this.itemses.values()) {
            flt.add(item) ;
        }
        return flt ;
    }
    
    public void addItem(String nama , float harga) {
        this.itemses.put(nama , harga) ;
    }
}

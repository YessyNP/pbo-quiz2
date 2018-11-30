/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Yessy.Coffee;
import javax.swing.table.* ;
/**
 *
 * @author YESSYNP
 */
public class Table extends DefaultTableModel {
    //String array untuk menyimpan nama kolom
    private String[] kolom;
    
    // Constructor
    public Table(){
        this.kolom = new String[] {
             "Nama" , "Harga" , "Jumlah"
    };
    }
    public String[] getKolomNama () {
        return this.kolom  ;
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

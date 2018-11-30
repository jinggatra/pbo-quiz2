/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taufik.kuis2;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author J I N G G A
 */
public class ItemTable extends DefaultTableModel{

    public static int getKolom;
    
    private String[] kolom;//Kolom pada String array berfungsi sebagai penyimpana pada nama kolom

    //Konstruktor
    public ItemTable() {
        this.kolom = new String[]{
        "Nama","Harga","Jumlah"
        };
    }
    
    //Getter untuk Kolom
    public String[] getKolom() {
        return kolom;
    }
    
    @Override
    public void setRowCount(int i) {
        super.setRowCount(0) ;
    }
    
    @Override
    public void addRow(Object[] os) {
        super.addRow(os) ;
    }
    
    @Override
    public void removeRow(int i) {
        super.removeRow(i) ;
    }
}

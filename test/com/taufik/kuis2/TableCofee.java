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
public class TableCofee extends DefaultTableModel{
    private String[] kolom;

    public TableCofee() {
        this.kolom = new String[] {
            "Nama", "Harga", "Jumlah"
        };
    }
    
    public String[] getKolomNama(){
        return this.kolom;
    }
    
    @Override
    public void setRowCount(int i){
        super.setRowCount(0);
    }
    
    @Override
    public void addRow(Object[] os){
        super.addRow(os);
    }
    
    @Override
    public void removeRow(int i){
        super.removeRow(i);
    }
}

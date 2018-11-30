/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taufik.kuis2;

import java.util.*;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
/**
 *
 * @author J I N G G A
 */
public class Transaksi {
    private final String kode;
    private ArrayList<Item> items = new ArrayList<>();
    private float total;
    
    public Transaksi(String kode, ArrayList<Item> items){
        this.kode = kode;
        this.items = items;
    }
    
    public void setTotal(){
        float total = 0;
        for(Item item : this.items){
            total = item.getTotal();
        }
        this.total = total;
    }
    
    public String bayar(){
        setTotal();
        String out = "";
        out += "Kode\t\t : " + this.kode + "\n";
        out += "Daftar Belanja : \n";
        for(Item item : this.items){
            out += "\t" + item.getNama() + "(x" + item.getJumlah() + ") : " + item.getTotal() + "\n"; 
        }
        out += "Total\t\t : " + this.total;
        return out;
    }
}

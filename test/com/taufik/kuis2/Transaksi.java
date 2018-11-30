/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taufik.kuis2;

/**
 *
 * @author J I N G G A
 */
import java.util.* ;
import java.text.SimpleDateFormat ;
import java.util.ArrayList ;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;


public class Transaksi {
    private final String kode; // Variable kode untuk menampilkan kode pembayaran
    private ArrayList<Item> items = new ArrayList<>(); //Variable item untuk menampilkan item yang dibeli
    private double total; // Variable total untuk menampilkan total pembelian

    //Konstruktor
    public Transaksi(String kode, ArrayList<Item> items) {
        this.kode = kode;
        this.items = items;
    }
    
    //Setter untuk total
    public void setTotal(){
        double total = 0;
        for (Item item : items) {
            total = total + item.getTotal();
        }
        this.total = total;
    }
    
    //Hasil pada transaksi
    public String Bayar(){
        setTotal();
        String obt = "";
         obt += "Kode\t\t : " + this.kode +"\n" ;
        obt += "Daftar Belanja : \n" ;
        for (Item item : this.items) {
            obt += "\t" + item.getNama() + "(x" + item.getJumlah() + ") : " + item.getTotal() + "\n" ;
        }
        obt += "Total\t\t : "+ this.total;
        return obt;
    }
}

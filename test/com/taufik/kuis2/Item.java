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
public class Item {
    private String nama;
    private double harga;
    private int jumlah;

    public Item(String nama, int jumlah) {
        this.nama = nama;
        this.jumlah = jumlah;
    }

    public Item(String nama, int jumlah, double harga) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
        
        switch(nama){
            case "Kopi" : this.harga = 10000;
            break;
            case "Gula" : this.harga = 30000;
            break;
            case "Susu" : this.harga = 15000;
            break;
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    public double getTotal(){
        return this.harga * this.jumlah;
    }

    @Override
    public String toString() {
        return this.nama;
    }
}


package com.taufik.kuis2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author J I N G G A
 */
public class Item {
    private String nama;
    private int harga;
    private int jumlah;

    public Item(String nama, int jumlah) {
        this.nama = nama;
        this.jumlah = jumlah;
    }

    public Item(String nama, int harga, int jumlah) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
        switch (nama) {
            case "Kopi" : this.harga = 10000;
            break;
            case "Gula" : this.harga = 30000;
            break;
            case "Susu" : this.harga = 20000;
            break;
        }
    }

    public Item(String nama, int jumlah, int[] harga) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    public float getTotal(){
        return this.harga * this.jumlah;
    }
    public String toString(){
        return this.nama;
    }
}

package com.tatlicilar.sosyalmedyaapp;

import java.util.ArrayList;

/**
 * Created by dikacmaz on 6/11/2017.
 */

public class Kisi {
    private String isim;
    private String parola;
    private String email;
    private String cinsiyet;
    private String tarih;
    private ArrayList<Kisi> arkadaslarım;
    private String resim;
    private String url;

    public Kisi(String isim, String parola, String email, String cinsiyet, String tarih, String resim, String url) {
        this.isim = isim;
        this.parola = parola;
        this.email = email;
        this.cinsiyet = cinsiyet;
        this.tarih = tarih;
        this.resim = resim;
        this.url = url;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public ArrayList<Kisi> getArkadaslarım() {
        return arkadaslarım;
    }

    public void setArkadaslarım(ArrayList<Kisi> arkadaslarım) {
        this.arkadaslarım = arkadaslarım;
    }

    public String getResim() {
        return resim;
    }

    public void setResim(String resim) {
        this.resim = resim;
    }

    public void arkadasEkle(Kisi k){
        arkadaslarım.add(k);

    }
    public void arkadasCikar(Kisi k){
        arkadaslarım.remove(k);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

package com.tatlicilar.sosyalmedyaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {
    EditText name, password;
    ArrayList<Kisi> uyeler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        name = (EditText) findViewById(R.id.LoginName);
        password = (EditText) findViewById(R.id.password);
        KisileriOlustur();



    }

    public void onClick(View v){
        switch(v.getId()){ // hangi butona tıkladıysam onun id sini getirecek
            case R.id.GirisBttn:



                break;
            case R.id.UyeolBttn:
                break;

        }

    }


    public void KisileriOlustur(){

       Kisi k1 = new Kisi("Didem Kaçmaz","qwert","didem-kacmaz@hotmail.com","K","24.05.1991","Dosya1", "www.google.com.tr");
       Kisi k2 = new Kisi("Aslı Yakut","qwert","asasd@hotmail.com","K","24.05.1991","Dosya2", "www.google.com.tr");
       Kisi k3 = new Kisi("Hakan Demir","qwert","hkn-demir@hotmail.com","K","24.05.1991","Dosya3", "www.google.com.tr");
       Kisi k4 = new Kisi("Murat Kaçmaz","qwert","mrt-kacmaz@hotmail.com","K","24.05.1991","Dosya4", "www.google.com.tr");


        k1.arkadasEkle(k2);
        k1.arkadasEkle(k3);
        k2.arkadasEkle(k4);
        k2.arkadasEkle(k3);
        k3.arkadasEkle(k1);
        k4.arkadasEkle(k1);

        uyeler = new ArrayList<Kisi>();
        uyeler.add(k1);
        uyeler.add(k2);
        uyeler.add(k3);
        uyeler.add(k4);


    }

}

package com.example.bottomnavigation;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/*
        Tanggal: 12 Agustus 2021
        Nama: Sadam Mochamad Rifqi
        Nim: 10118366
        Kelas: IF-9
 */


public class SplashScreen extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent panggil = new Intent(SplashScreen.this, ViewPager.class);
                startActivity(panggil);
                finish();
            }
        },5000);
    }
}

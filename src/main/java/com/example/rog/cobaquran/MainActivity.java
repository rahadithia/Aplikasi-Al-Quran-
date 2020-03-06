package com.example.rog.cobaquran;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void baca(View view) {
        Intent intentbaca = new Intent(MainActivity.this, menu_membaca.class);
        startActivity(intentbaca);
    }

    public void pengaturan(View view) {
        Intent intentpengaturan = new Intent(MainActivity.this, pengaturan.class);
        startActivity(intentpengaturan);
    }
}

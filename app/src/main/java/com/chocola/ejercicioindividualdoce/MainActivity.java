package com.chocola.ejercicioindividualdoce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new java.util.Timer().schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                       Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                       startActivity(intent);
                    }
                },
                1000
        );
    }
}
package com.example.blueteashopmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnTea,btnJuice,btnMilk,btnLimited;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTea =(Button) findViewById(R.id.btnTea);
        btnJuice =(Button) findViewById(R.id.btnJuice);
        btnMilk =(Button) findViewById(R.id.btnMilk);
        btnLimited =(Button) findViewById(R.id.btnLimited);

        btnTea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTea = new Intent();
                intentTea.setClass(MainActivity.this ,OrderPageTea.class);
                startActivity(intentTea);
            }
        });

        btnJuice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentJuice = new Intent();
                intentJuice.setClass(MainActivity.this ,OrderPageJuice.class);
                startActivity(intentJuice);
            }
        });

        btnMilk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMilk = new Intent();
                intentMilk.setClass(MainActivity.this ,OrderPageMilk.class);
                startActivity(intentMilk);
            }
        });

        btnLimited.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLimited = new Intent();
                intentLimited.setClass(MainActivity.this ,OrderPageLimited.class);
                startActivity(intentLimited);
            }
        });


    }


}
package com.example.blueteashopmobile;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView nav_btm = findViewById(R.id.nav_btm);

        getSupportFragmentManager().beginTransaction().replace(R.id.nav_frg,new OrderFragment()).commit();

        nav_btm.setOnItemSelectedListener(item -> {
            Fragment selectFrg = null;
            switch (item.getItemId()){
                case R.id.nav_order:
                    selectFrg = new OrderFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.nav_frg,selectFrg).commit();
                    Log.d("switch","Order");
                    return true;
                case R.id.nav_shopping_cart:
                    selectFrg = new ShoppingCartFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.nav_frg,selectFrg).commit();
                    Log.d("switch","Shopping Cart");
                    return true;
                case R.id.nav_history:
                    selectFrg = new HistoryFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.nav_frg,selectFrg).commit();
                    Log.d("switch","History");
                    return true;
                case R.id.nav_account:
                    selectFrg = new AccountFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.nav_frg,selectFrg).commit();
                    Log.d("switch","Account");
                    return true;
            }


            return false;
        });

    }


}
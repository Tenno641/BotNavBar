package com.example.aliva.aliva.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;

import com.example.aliva.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    static String permissions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.botnav);

        if (savedInstanceState == null) {
            Intent intent = getIntent();

            String restrictions = intent.getStringExtra("permissions");
            if (restrictions != null) {
                permissions = restrictions;
            }

            String mode = intent.getStringExtra("mode");
            if (permissions.equals("user")) {
                bottomNavigationView.getMenu().removeItem(R.id.adminItem);
                if (mode == null) {
                    replaceFragment(new home_fragment());
                } else {
                    replaceFragment(new favfragment());
                    bottomNavigationView.getMenu().removeItem(R.id.adminItem);
                    bottomNavigationView.setSelectedItemId(R.id.favItem);
                }
            } else {
                if (mode == null) {
                    replaceFragment(new home_fragment());
                } else {
                    replaceFragment(new favfragment());
                    bottomNavigationView.setSelectedItemId(R.id.favItem);
                }
            }
        }

        bottomNavigationView.setOnItemSelectedListener(item -> {

            if (item.getItemId() == R.id.homeItem && !item.isChecked()) {
                replaceFragment(new home_fragment());
                return true;
            }


            if (item.getItemId() == R.id.favItem && !item.isChecked()) {
                replaceFragment(new favfragment());
                return true;
            }

            if (item.getItemId() == R.id.setItem && !item.isChecked()) {
                replaceFragment(new setFragment());
                return true;
            }

            return true;

        });

    }

    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .setReorderingAllowed(true)
                .replace(R.id.homeFrame, fragment)
                .commit();
    }

}
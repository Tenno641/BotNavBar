package com.example.aliva.aliva.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.aliva.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.homeFrame, home_fragment.class, null)
                    .commit();
        }

        bottomNavigationView = findViewById(R.id.botnav);
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
package com.example.aliva.aliva.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.aliva.R;

public class LoginActivity extends AppCompatActivity {

    Button loginButton;
    TextView signUpText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        loginButton = findViewById(R.id.loginPageButton);
        signUpText = findViewById(R.id.signUp_text);

        loginButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        });

        signUpText.setOnClickListener(v -> {
            Intent intent = new Intent(this, RegisterActivity.class);
            startActivity(intent);
            finish();
        });

    }
}
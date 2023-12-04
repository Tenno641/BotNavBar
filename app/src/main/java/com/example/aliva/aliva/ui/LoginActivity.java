package com.example.aliva.aliva.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.aliva.R;

public class LoginActivity extends AppCompatActivity {

    Button loginButton;
    TextView signUpText;

    EditText email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        loginButton = findViewById(R.id.loginPageButton);
        signUpText = findViewById(R.id.signUp_text);

        email = findViewById(R.id.emailEditText);
        password = findViewById(R.id.passwordEditText);

        loginButton.setOnClickListener(v -> {
            String mode;
            if (email.getText().toString().trim().equals("admin@example.com") && password.getText().toString().trim().equals("1234")) {
                mode = "admin";
            } else {
                mode = "user";
            }
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("permissions", mode);
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
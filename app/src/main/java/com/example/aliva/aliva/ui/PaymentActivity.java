package com.example.aliva.aliva.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.aliva.R;

public class PaymentActivity extends AppCompatActivity {

    TextView hotelPrice;

    ImageView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        hotelPrice = findViewById(R.id.price_text);
        backButton = findViewById(R.id.back_image);

        Intent intent = getIntent();
        String price = intent.getStringExtra("price");

        hotelPrice.setText(price);

        backButton.setOnClickListener(v -> finish());

    }
}
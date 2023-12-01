package com.example.aliva.aliva.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.aliva.R;

public class SelectedHotel extends AppCompatActivity {

    ImageView hotelImage;
    TextView hotelName, hotelLocation, hotelDescription, hotelRating, hotelPrice;
    Button backButton, favButton;
    boolean isFav = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_hotel_page);

        hotelImage = findViewById(R.id.image);
        hotelName = findViewById(R.id.hotelName);
        hotelLocation = findViewById(R.id.location);
        hotelDescription = findViewById(R.id.description);
        hotelRating = findViewById(R.id.ratingTV);
        hotelPrice = findViewById(R.id.price);
        backButton = findViewById(R.id.backBtn);
        favButton = findViewById(R.id.favBtn);

        Intent intent = getIntent();
        int image = intent.getIntExtra("image", 0);
        String name = intent.getStringExtra("name");
        String location = intent.getStringExtra("location");
        String description = intent.getStringExtra("description");
        String rating = intent.getStringExtra("rating");
        String price = intent.getStringExtra("price");

        hotelImage.setImageResource(image);
        hotelName.setText(name);
        hotelLocation.setText(location);
        hotelDescription.setText(description);
        hotelRating.setText(rating);
        hotelPrice.setText(price);

        backButton.setOnClickListener(v -> finish());
        favButton.setOnClickListener(v -> {

            // Associated with database

            if (isFav) {
                favButton.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_favorite_border_24, 0, 0, 0);
                isFav = false;
            }
            else {
                favButton.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_favorite_24, 0, 0, 0);
                isFav = true;
            }

        });

    }
}
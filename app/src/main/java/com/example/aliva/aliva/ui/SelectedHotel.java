package com.example.aliva.aliva.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.aliva.R;

public class SelectedHotel extends AppCompatActivity {

    ImageView hotelImage;
    TextView hotelName, hotelLocation, hotelDescription, hotelRating, hotelPrice;

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

        Intent intent = getIntent();
        int image = intent.getIntExtra("image", 0);
        String name = intent.getStringExtra("name");
        String location = intent.getStringExtra("location");
        String description = intent.getStringExtra("description");
        double rating = intent.getDoubleExtra("rating", 0);
        int price = intent.getIntExtra("price", 0);

        hotelImage.setImageResource(image);
        hotelName.setText(name);
        hotelLocation.setText(location);
        hotelDescription.setText(description);
        hotelRating.setText(String.valueOf(rating));
        hotelPrice.setText(String.valueOf(price));

    }
}
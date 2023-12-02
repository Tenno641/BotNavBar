package com.example.aliva.aliva.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.aliva.R;
import com.example.aliva.aliva.adapters.DataBaseAdapter;

import java.util.concurrent.atomic.AtomicBoolean;

public class SelectedHotel extends AppCompatActivity {

    ImageView hotelImage;
    TextView hotelName, hotelLocation, hotelDescription, hotelRating, hotelPrice;
    Button backButton, favButton;

    DataBaseAdapter dataBaseAdapter;

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
        String id = intent.getStringExtra("id");
        String name = intent.getStringExtra("name");
        String location = intent.getStringExtra("location");
        String description = intent.getStringExtra("description");
        String rating = intent.getStringExtra("rating");
        int isFav = intent.getIntExtra("isFav", 0);
        String price = intent.getStringExtra("price");

        hotelImage.setImageResource(image);
        hotelName.setText(name);
        hotelLocation.setText(location);
        hotelDescription.setText(description);
        hotelRating.setText(rating);
        hotelPrice.setText(price);

        AtomicBoolean IsFavCheck = new AtomicBoolean(false);
        IsFavCheck.set(isFav == 1);

        if (IsFavCheck.get()) {
            favButton.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_favorite_24, 0, 0, 0);
        }
        else {
            favButton.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_favorite_border_24, 0, 0, 0);
        }

        dataBaseAdapter = new DataBaseAdapter(this);

        backButton.setOnClickListener(v -> finish());
        favButton.setOnClickListener(v -> {

            // Associated with database

            if (IsFavCheck.get()) {
                favButton.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_favorite_border_24, 0, 0, 0);
                dataBaseAdapter.addToFavorites(id, 0);
                IsFavCheck.set(false);
            }
            else {
                favButton.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_favorite_24, 0, 0, 0);
                dataBaseAdapter.addToFavorites(id, 1);
                IsFavCheck.set(true);
            }

        });

    }
}
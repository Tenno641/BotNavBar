package com.example.aliva.aliva.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aliva.R;
import com.example.aliva.aliva.models.HotelModel;
import com.example.aliva.aliva.ui.SelectedHotel;

import java.util.List;

public class HomeRecyclerViewAdapter extends RecyclerView.Adapter<HomeSummerItemHolder> {

    List<HotelModel> hotels;
    Context context;

    public HomeRecyclerViewAdapter(Context context, List<HotelModel> hotels) {
        this.context = context;
        this.hotels = hotels;
    }

    @NonNull
    @Override
    public HomeSummerItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_summer_hotel_item, parent, false);
        return new HomeSummerItemHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull HomeSummerItemHolder holder, int position) {
        HotelModel hotel = hotels.get(position);

        holder.hotelImage.setImageResource(hotel.getImage());
        holder.hotelName.setText(hotel.getName());
        holder.HotelLocation.setText(hotel.getLocation());
        holder.HotelRating.setText(hotel.getRating());
        holder.HotelPrice.setText(String.valueOf(hotel.getPrice()));

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, SelectedHotel.class);
            intent.putExtra("image", hotel.getImage());
            intent.putExtra("name", hotel.getName());
            intent.putExtra("location", hotel.getLocation());
            intent.putExtra("description", hotel.getDescription());
            intent.putExtra("rating", hotel.getRating());
            intent.putExtra("price", hotel.getPrice());
            holder.itemView.getContext().startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return hotels.size();
    }
}

class HomeSummerItemHolder extends RecyclerView.ViewHolder {

    ImageView hotelImage;
    TextView hotelName;
    TextView HotelLocation;
    TextView HotelRating;
    TextView HotelPrice;

    public HomeSummerItemHolder(@NonNull View itemView) {
        super(itemView);

        hotelImage = itemView.findViewById(R.id.hotelImage);
        hotelName = itemView.findViewById(R.id.hotelName);
        HotelLocation = itemView.findViewById(R.id.locationTV);
        HotelRating = itemView.findViewById(R.id.ratingTV);
        HotelPrice = itemView.findViewById(R.id.price);

    }
}

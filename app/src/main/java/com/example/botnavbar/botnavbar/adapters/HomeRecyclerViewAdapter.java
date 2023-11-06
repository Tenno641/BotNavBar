package com.example.botnavbar.botnavbar.adapters;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.botnavbar.R;
import com.example.botnavbar.botnavbar.models.HotelModel;

import java.util.List;

public class HomeRecyclerViewAdapter extends RecyclerView.Adapter<ViewHolder> {

    List<HotelModel> hotels;

    public HomeRecyclerViewAdapter(List<HotelModel> hotels) {
        this.hotels = hotels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_item, parent, false);
        return new ViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        HotelModel hotel = hotels.get(position);

        holder.hotelImage.setImageResource(hotel.getImage());
        holder.hotelName.setText(hotel.getName());
        holder.HotelLocation.setText(hotel.getLocation());
        holder.HotelRating.setText(Double.toString(hotel.getRating()));
        holder.HotelPrice.setText(String.valueOf(hotel.getPrice()));



    }

    @Override
    public int getItemCount() {
        return hotels.size();
    }
}

class ViewHolder extends RecyclerView.ViewHolder {

    ImageView hotelImage;
    TextView hotelName;
    TextView HotelLocation;
    TextView HotelRating;
    TextView HotelPrice;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        hotelImage = itemView.findViewById(R.id.hotelImage);
        hotelName = itemView.findViewById(R.id.hotelName);
        HotelLocation = itemView.findViewById(R.id.LocationTV);
        HotelRating = itemView.findViewById(R.id.ratingTV);
        HotelPrice = itemView.findViewById(R.id.price);

    }
}

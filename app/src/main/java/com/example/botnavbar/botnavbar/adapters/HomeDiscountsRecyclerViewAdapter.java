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

public class HomeDiscountsRecyclerViewAdapter extends RecyclerView.Adapter<HomeDiscountItemHolder>{

    List<HotelModel> hotels;

    public HomeDiscountsRecyclerViewAdapter(List<HotelModel> hotels) {
        this.hotels = hotels;
    }

    @NonNull
    @Override
    public HomeDiscountItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_discounts_hotel_item, parent, false);
        return new HomeDiscountItemHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull HomeDiscountItemHolder holder, int position) {
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

class HomeDiscountItemHolder extends RecyclerView.ViewHolder {

    ImageView hotelImage;
    TextView hotelName;
    TextView HotelLocation;
    TextView HotelRating;
    TextView HotelPrice;

    public HomeDiscountItemHolder(@NonNull View itemView) {
        super(itemView);

        hotelImage = itemView.findViewById(R.id.hotelImage);
        hotelName = itemView.findViewById(R.id.hotelName);
        HotelLocation = itemView.findViewById(R.id.locationTV);
        HotelRating = itemView.findViewById(R.id.ratingTV);
        HotelPrice = itemView.findViewById(R.id.price);

    }
}

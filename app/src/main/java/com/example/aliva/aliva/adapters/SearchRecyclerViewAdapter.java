package com.example.aliva.aliva.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aliva.R;
import com.example.aliva.aliva.pojos.HotelModel;
import com.example.aliva.aliva.ui.SelectedHotel;

import java.util.List;

public class SearchRecyclerViewAdapter extends RecyclerView.Adapter<SearchItemHolder>{

    List<HotelModel> hotels;
    Context context;

    public SearchRecyclerViewAdapter(Context context, List<HotelModel> hotels) {
        this.context = context;
        this.hotels = hotels;
    }

    @NonNull
    @Override
    public SearchItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_search_item, parent, false);
        return new SearchItemHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull SearchItemHolder holder, int position) {
        HotelModel hotel = hotels.get(position);

        holder.hotelImage.setImageResource(hotel.getImage());
        holder.hotelName.setText(hotel.getName());
        holder.HotelLocation.setText(hotel.getLocation());
        holder.HotelRating.setText(hotel.getRating());
        holder.HotelPrice.setText(hotel.getPrice());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, SelectedHotel.class);
            intent.putExtra("id", hotel.getId());
            intent.putExtra("image", hotel.getImage());
            intent.putExtra("name", hotel.getName());
            intent.putExtra("location", hotel.getLocation());
            intent.putExtra("description", hotel.getDescription());
            intent.putExtra("rating", hotel.getRating());
            intent.putExtra("isFav", hotel.getIs_fav());
            intent.putExtra("price", hotel.getPrice());
            holder.itemView.getContext().startActivity(intent);
            Toast.makeText(context, hotel.getId(), Toast.LENGTH_SHORT).show();
        });

    }

    @Override
    public int getItemCount() {
        return hotels.size();
    }

    public void setFilterList(List<HotelModel> filterdList) {
        this.hotels = filterdList;
        notifyDataSetChanged();
    }

}

class SearchItemHolder extends RecyclerView.ViewHolder {

    ImageView hotelImage;
    TextView hotelName;
    TextView HotelLocation;
    TextView HotelRating;
    TextView HotelPrice;

    public SearchItemHolder(@NonNull View itemView) {
        super(itemView);

        hotelImage = itemView.findViewById(R.id.hotel_image);
        hotelName = itemView.findViewById(R.id.hotelName_text);
        HotelLocation = itemView.findViewById(R.id.hotelLocation_text);
        HotelRating = itemView.findViewById(R.id.ratingTV);
        HotelPrice = itemView.findViewById(R.id.price);

    }
}

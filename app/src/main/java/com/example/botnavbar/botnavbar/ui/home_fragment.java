package com.example.botnavbar.botnavbar.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.botnavbar.R;
import com.example.botnavbar.botnavbar.adapters.HomeRecyclerViewAdapter;
import com.example.botnavbar.botnavbar.models.HotelModel;

import java.util.ArrayList;
import java.util.List;

public class home_fragment extends Fragment {

    RecyclerView HomeSummerHotelsRV;
    HomeRecyclerViewAdapter HomeSummerHotelsAdapter;

    public home_fragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.home_fragment, container, false);

        List<HotelModel> PreMadeHotels = new ArrayList<>();
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        PreMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        
        HomeSummerHotelsRV = view.findViewById(R.id.summerHotelRV);
        HomeSummerHotelsAdapter = new HomeRecyclerViewAdapter(PreMadeHotels);
        HomeSummerHotelsRV.setAdapter(HomeSummerHotelsAdapter);

        return view;

    }
}
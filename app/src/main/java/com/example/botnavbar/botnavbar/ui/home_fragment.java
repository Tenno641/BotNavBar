package com.example.botnavbar.botnavbar.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.botnavbar.R;
import com.example.botnavbar.botnavbar.adapters.HomeDiscountsRecyclerViewAdapter;
import com.example.botnavbar.botnavbar.adapters.HomeRecyclerViewAdapter;
import com.example.botnavbar.botnavbar.models.HotelModel;

import java.util.ArrayList;
import java.util.List;

public class home_fragment extends Fragment {

    // HomeSummer RecyclerView and Adapter.
    RecyclerView HomeSummerHotelsRV;
    HomeRecyclerViewAdapter HomeSummerHotelsAdapter;

    // HomeDiscounts RecyclerView and Adapter.
    RecyclerView HomeDiscountsRV;
    HomeDiscountsRecyclerViewAdapter homeDiscountsAdapter;

    public home_fragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.home_fragment, container, false);

        List<HotelModel> preMadeHotels = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            preMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", 2.5, 2525));
        }

        HomeSummerHotelsRV = view.findViewById(R.id.summerHotelRV);
        HomeSummerHotelsAdapter = new HomeRecyclerViewAdapter(preMadeHotels);
        HomeSummerHotelsRV.setAdapter(HomeSummerHotelsAdapter);

        List<HotelModel> preMadeDiscounts = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            preMadeDiscounts.add(new HotelModel(R.drawable.backgroud, "Legendary Shit", "Hena Aw Henak", 7.5, 2560));
        }

        HomeDiscountsRV = view.findViewById(R.id.HomeDiscountsRV);
        homeDiscountsAdapter = new HomeDiscountsRecyclerViewAdapter(preMadeDiscounts);
        HomeDiscountsRV.setAdapter(homeDiscountsAdapter);

        return view;

    }
}
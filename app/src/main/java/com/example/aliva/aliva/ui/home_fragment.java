package com.example.aliva.aliva.ui;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aliva.R;
import com.example.aliva.aliva.adapters.HomeDiscountsRecyclerViewAdapter;
import com.example.aliva.aliva.adapters.HomeRecyclerViewAdapter;
import com.example.aliva.aliva.models.HotelModel;

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

        Context context = getContext();

        List<HotelModel> preMadeHotels = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            preMadeHotels.add(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak kda", "Bla Bla Bla Bla Bla Bla it's good we got service bla bla bla bla just come idiots",2.5, 2525));
        }

        HomeSummerHotelsRV = view.findViewById(R.id.summerHotelRV);
        HomeSummerHotelsAdapter = new HomeRecyclerViewAdapter(context, preMadeHotels);
        HomeSummerHotelsRV.setAdapter(HomeSummerHotelsAdapter);

        List<HotelModel> preMadeDiscounts = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            preMadeDiscounts.add(new HotelModel(R.drawable.backgroud, "Legendary Shit", "Hena Aw Henak", "Bla Bla Bla Bla Bla Bla it's good we got service bla bla bla bla just come idiots",7.5, 2560));
        }

        HomeDiscountsRV = view.findViewById(R.id.HomeDiscountsRV);
        homeDiscountsAdapter = new HomeDiscountsRecyclerViewAdapter(context, preMadeDiscounts);
        HomeDiscountsRV.setAdapter(homeDiscountsAdapter);

        return view;

    }
}
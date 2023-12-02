package com.example.aliva.aliva.ui;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aliva.R;
import com.example.aliva.aliva.adapters.DataBaseAdapter;
import com.example.aliva.aliva.adapters.HomeDiscountsRecyclerViewAdapter;
import com.example.aliva.aliva.adapters.HomeRecyclerViewAdapter;
import com.example.aliva.aliva.models.HotelModel;

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

        DataBaseAdapter dataBaseAdapter = new DataBaseAdapter(context);
//        dataBaseAdapter.insertRow(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak Kda", "Aho wa7ed Bla Bla", "2.5", "2500"));
//        dataBaseAdapter.insertRow(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak Kda", "Aho wa7ed Bla Bla", "2.5", "2500"));
//        dataBaseAdapter.insertRow(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak Kda", "Aho wa7ed Bla Bla", "2.5", "2500"));
//        dataBaseAdapter.insertRow(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak Kda", "Aho wa7ed Bla Bla", "2.5", "2500"));
//        dataBaseAdapter.insertRow(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak Kda", "Aho wa7ed Bla Bla", "2.5", "2500"));
//        dataBaseAdapter.insertRow(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak Kda", "Aho wa7ed Bla Bla", "2.5", "2500"));
//        dataBaseAdapter.insertRow(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak Kda", "Aho wa7ed Bla Bla", "2.5", "2500"));
//        dataBaseAdapter.insertRow(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak Kda", "Aho wa7ed Bla Bla", "2.5", "2500"));
//        dataBaseAdapter.insertRow(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak Kda", "Aho wa7ed Bla Bla", "2.5", "2500"));
//        dataBaseAdapter.insertRow(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak Kda", "Aho wa7ed Bla Bla", "2.5", "2500"));
//        dataBaseAdapter.insertRow(new HotelModel(R.drawable.backgroud, "Hotel1", "Henak Kda", "Aho wa7ed Bla Bla", "2.5", "2500"));

        List<HotelModel> preMadeHotels = dataBaseAdapter.getAllData();

        HomeSummerHotelsRV = view.findViewById(R.id.summerHotelRV);
        HomeSummerHotelsAdapter = new HomeRecyclerViewAdapter(context, preMadeHotels);
        HomeSummerHotelsRV.setAdapter(HomeSummerHotelsAdapter);

        HomeDiscountsRV = view.findViewById(R.id.HomeDiscountsRV);
        homeDiscountsAdapter = new HomeDiscountsRecyclerViewAdapter(context, preMadeHotels);
        HomeDiscountsRV.setAdapter(homeDiscountsAdapter);

        return view;

    }
}
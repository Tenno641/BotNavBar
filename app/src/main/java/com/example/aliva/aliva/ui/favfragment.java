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
import com.example.aliva.aliva.adapters.FavoritesRecyclerViewAdapter;
import com.example.aliva.aliva.pojos.HotelModel;

import java.util.List;

public class favfragment extends Fragment {

    RecyclerView favoritesRecyclerView;
    DataBaseAdapter dataBaseAdapter;

    FavoritesRecyclerViewAdapter favoritesRecyclerViewAdapter;

    public favfragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.favfragment, container, false);

        Context context = getContext();

        dataBaseAdapter = new DataBaseAdapter(context);

        List<HotelModel> favoriteHotels = dataBaseAdapter.getAllFavorites();

        favoritesRecyclerViewAdapter = new FavoritesRecyclerViewAdapter(context, favoriteHotels);

        favoritesRecyclerView = view.findViewById(R.id.favorites_list);
        favoritesRecyclerView.setAdapter(favoritesRecyclerViewAdapter);

        return view;

    }
}
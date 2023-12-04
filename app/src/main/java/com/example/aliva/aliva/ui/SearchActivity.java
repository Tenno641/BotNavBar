package com.example.aliva.aliva.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Toast;

import com.example.aliva.R;
import com.example.aliva.aliva.adapters.DataBaseAdapter;
import com.example.aliva.aliva.adapters.SearchRecyclerViewAdapter;
import com.example.aliva.aliva.pojos.HotelModel;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity {
    RecyclerView searchRecyclerView;
    EditText searchBar;
    List<HotelModel> allHotels;
    SearchRecyclerViewAdapter searchRecyclerViewAdapter;
    DataBaseAdapter dataBaseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        searchRecyclerView = findViewById(R.id.hotels_recycler);
        searchBar = findViewById(R.id.searchBar);

        dataBaseAdapter = new DataBaseAdapter(this);
        allHotels = dataBaseAdapter.getAllData();

        searchRecyclerViewAdapter = new SearchRecyclerViewAdapter(this, allHotels);
        searchRecyclerView.setAdapter(searchRecyclerViewAdapter);

        searchBar.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                filterList(editable.toString());
            }
        });

    }

    private void filterList(String text) {
        List<HotelModel> filterdList = new ArrayList<>();
        for (HotelModel hotel : allHotels) {
            if (hotel.getName().toLowerCase().contains(text.toLowerCase())) {
                filterdList.add(hotel);
            }
        }

        if (filterdList.isEmpty()) {
            Toast.makeText(this, "No Data Found", Toast.LENGTH_SHORT).show();
        } else {
            searchRecyclerViewAdapter.setFilterList(filterdList);
        }

    }
}
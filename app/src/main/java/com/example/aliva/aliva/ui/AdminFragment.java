package com.example.aliva.aliva.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.aliva.R;

public class AdminFragment extends Fragment {

    Button addButton, updateButton, deleteButton;
    LinearLayout addPage, updatePage, deletePage;

    boolean addVisible = false;
    boolean updateVisible = false;
    boolean deleteVisible = false;

    public AdminFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_admin, container, false);

        addButton = view.findViewById(R.id.addHotel_button);

        

        updateButton = view.findViewById(R.id.updateHotel_button);
        deleteButton = view.findViewById(R.id.deleteHotel_button);

        addPage = view.findViewById(R.id.addHotelPage_layout);
        updatePage = view.findViewById(R.id.updateHotelPage_layout);
        deletePage = view.findViewById(R.id.deleteHotelPage_layout);

        addButton.setOnClickListener(v -> {
            addPage.setVisibility(addVisible ? View.GONE : View.VISIBLE);
            addVisible = !addVisible;
            addButton.setCompoundDrawablesWithIntrinsicBounds(0, 0, addVisible ? R.drawable.baseline_keyboard_arrow_up_24 : R.drawable.baseline_keyboard_arrow_down_24, 0);
        });

        updateButton.setOnClickListener(v -> {
            updatePage.setVisibility(updateVisible ? View.GONE : View.VISIBLE);
            updateVisible = !updateVisible;
            updateButton.setCompoundDrawablesWithIntrinsicBounds(0, 0, updateVisible ? R.drawable.baseline_keyboard_arrow_up_24 : R.drawable.baseline_keyboard_arrow_down_24, 0);
        });

        deleteButton.setOnClickListener(v -> {
            deletePage.setVisibility(deleteVisible ? View.GONE : View.VISIBLE);
            deleteVisible = !deleteVisible;
            deleteButton.setCompoundDrawablesWithIntrinsicBounds(0, 0, deleteVisible ? R.drawable.baseline_keyboard_arrow_up_24 : R.drawable.baseline_keyboard_arrow_down_24, 0);
        });

        return view;

    }
}
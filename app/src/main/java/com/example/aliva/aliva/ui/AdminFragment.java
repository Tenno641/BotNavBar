package com.example.aliva.aliva.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.aliva.R;
import com.example.aliva.aliva.adapters.DataBaseAdapter;
import com.example.aliva.aliva.pojos.HotelModel;

public class AdminFragment extends Fragment {

    Button addMainButton, updateMainButton, deleteMainButton, addButton, updateButton, deleteButton;
    LinearLayout addPage, updatePage, deletePage;
    EditText hotelName, hotelLocation, hotelDescription, hotelPrice, updateHotelEditText, deleteHotelEditText;

    DataBaseAdapter dataBaseAdapter;
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

        dataBaseAdapter = new DataBaseAdapter(getContext());

        addMainButton = view.findViewById(R.id.addHotel_button);
        // add page views
        hotelName = view.findViewById(R.id.nameEditText);
        hotelLocation = view.findViewById(R.id.locationEditText);
        hotelDescription = view.findViewById(R.id.DescriptionEditText);
        hotelPrice = view.findViewById(R.id.priceEditText);
        addButton = view.findViewById(R.id.submitAddingHotel_button);

        updateMainButton = view.findViewById(R.id.updateHotel_button);
        // update page views
        updateButton = view.findViewById(R.id.updateHotelID_button);
        updateHotelEditText = view.findViewById(R.id.updateHotelID_editText);

        deleteMainButton = view.findViewById(R.id.deleteHotel_button);
        // delete page views
        deleteButton = view.findViewById(R.id.deleteHotelID_button);
        deleteHotelEditText = view.findViewById(R.id.deleteHotelID_editText);

        addPage = view.findViewById(R.id.addHotelPage_layout);
        updatePage = view.findViewById(R.id.updateHotelPage_layout);
        deletePage = view.findViewById(R.id.deleteHotelPage_layout);

        addMainButton.setOnClickListener(v -> {
            addPage.setVisibility(addVisible ? View.GONE : View.VISIBLE);
            addVisible = !addVisible;
            addMainButton.setCompoundDrawablesWithIntrinsicBounds(0, 0, addVisible ? R.drawable.baseline_keyboard_arrow_up_24 : R.drawable.baseline_keyboard_arrow_down_24, 0);
        });

        updateMainButton.setOnClickListener(v -> {
            updatePage.setVisibility(updateVisible ? View.GONE : View.VISIBLE);
            updateVisible = !updateVisible;
            updateMainButton.setCompoundDrawablesWithIntrinsicBounds(0, 0, updateVisible ? R.drawable.baseline_keyboard_arrow_up_24 : R.drawable.baseline_keyboard_arrow_down_24, 0);
        });

        deleteMainButton.setOnClickListener(v -> {
            deletePage.setVisibility(deleteVisible ? View.GONE : View.VISIBLE);
            deleteVisible = !deleteVisible;
            deleteMainButton.setCompoundDrawablesWithIntrinsicBounds(0, 0, deleteVisible ? R.drawable.baseline_keyboard_arrow_up_24 : R.drawable.baseline_keyboard_arrow_down_24, 0);
        });

        addButton.setOnClickListener(v -> {
            String name = hotelName.getText().toString();
            String location = hotelLocation.getText().toString();
            String description = hotelDescription.getText().toString();
            String price = hotelPrice.getText().toString();
            dataBaseAdapter.insertRow(new HotelModel(R.drawable.test, name, location, description, "0.0", price));

            hotelName.setText("");
            hotelLocation.setText("");
            hotelDescription.setText("");
            hotelPrice.setText("");

        });

        updateButton.setOnClickListener(v -> {

        });

        deleteButton.setOnClickListener(v -> {
            String hotelId = deleteHotelEditText.getText().toString();
            dataBaseAdapter.deleteHotelById(hotelId);
            deleteHotelEditText.setText("");
        });

        return view;

    }
}
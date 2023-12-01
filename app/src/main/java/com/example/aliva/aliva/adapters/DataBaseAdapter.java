package com.example.aliva.aliva.adapters;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.aliva.aliva.models.HotelModel;

import java.util.ArrayList;
import java.util.List;

public class DataBaseAdapter {

    static DataBaseHelper dataBaseHelper;

    public DataBaseAdapter(Context context) {
        dataBaseHelper = new DataBaseHelper(context);
    }

    public void insertRow(HotelModel hotelModel) {
        SQLiteDatabase readable = dataBaseHelper.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(DataBaseHelper.NAME_COL, hotelModel.getName());
        contentValues.put(DataBaseHelper.LOCATION_COL, hotelModel.getLocation());
        contentValues.put(DataBaseHelper.DESCRIPTION_COL, hotelModel.getDescription());
        contentValues.put(DataBaseHelper.RATING_COL, hotelModel.getRating());
        contentValues.put(DataBaseHelper.PRICE_COL, hotelModel.getPrice());

        readable.insertOrThrow(DataBaseHelper.TABLE_NAME, null, contentValues);

    }

    public List<HotelModel> getAllData() {
        SQLiteDatabase writable = dataBaseHelper.getWritableDatabase();
        List<HotelModel> hotels = new ArrayList<>();

        String[] cols = {DataBaseHelper.ID_COL, DataBaseHelper.NAME_COL, DataBaseHelper.LOCATION_COL, DataBaseHelper.DESCRIPTION_COL, DataBaseHelper.RATING_COL, DataBaseHelper.PRICE_COL};
        Cursor cursor = writable.query(DataBaseHelper.TABLE_NAME, cols, null, null, null, null, null);
        cursor.moveToFirst();

        if (cursor.move(0)) {
            do {
                String name = cursor.getString(1);
                String location = cursor.getString(2);
                String description = cursor.getString(3);
                String rating = cursor.getString(4);
                String price = cursor.getString(5);

                HotelModel hotel = new HotelModel(name, location, description, rating, price);
                hotels.add(hotel);
            } while (cursor.moveToNext());
        }
        cursor.close();
        return hotels;

    }

    public static class DataBaseHelper extends SQLiteOpenHelper {

        private static final int DATABASE_VERSION = 1;

        private static final String DATABASE_NAME = "HOTELS";

        private static final String TABLE_NAME = "TABLE_HOTELS";
        private static final String ID_COL = "id";
        private static final String NAME_COL = "name";
        private static final String LOCATION_COL = "locations";
        private static final String DESCRIPTION_COL = "description";
        private static final String RATING_COL = "rating";
        private static final String PRICE_COL = "price";

        String query = "CREATE TABLE " + TABLE_NAME + " ( " +
                ID_COL + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                NAME_COL + " TEXT, " +
                LOCATION_COL + " TEXT, " +
                DESCRIPTION_COL + " TEXT, " +
                RATING_COL + " TEXT, " +
                PRICE_COL + " TEXT );";

        public DataBaseHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            sqLiteDatabase.execSQL(query);
        }

        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        }
    }



}



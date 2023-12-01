package com.example.aliva.aliva.adapters;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseAdapter {

    static DataBaseHelper dataBaseHelper;

    public DataBaseAdapter(Context context) {
        dataBaseHelper = new DataBaseHelper(context);
    }

    public static class DataBaseHelper extends SQLiteOpenHelper {

        private static final int DATABASE_VERSION = 1;

        private static final String DATABASE_NAME = "TASKS";

        private static final String TABLE_NAME = "TABLE_TASKS";

        String query = "CREATE TABLE " + TABLE_NAME + " ( " +
                ID_COL + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                BODY_COL + " TEXT, " +
                TIME_COL + " TEXT, " +
                DATE_COL + " TEXT );";

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



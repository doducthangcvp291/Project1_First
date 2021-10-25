package com.example.myprj1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.myprj1.Contract.ContactEntry ;
import android.support.annotation.Nullable;

public class Dbhelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "todaycontact.db";
    public static final int DATABASE_VERSION =1 ;

    public Dbhelper( Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_TABLE = "CREATE TABLE "+ContactEntry.TABLE_NAME + " ("
                +ContactEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"//tự động tăng ID lên 1
                +ContactEntry.COLUMN_NAME + " TEXT NOT NULL, "
                +ContactEntry.COLUMN_EMAIL + "TEXT NOT NULL, "
                +ContactEntry.COLUMN_PHONENUMBER + " TEXT NOT NULL, "
                +ContactEntry.COLUMN_TYPEOFCONTACT + " TEXT NOT NULL, "
                +ContactEntry.COLUMN_PICTURE + " TEXT);";

        db.execSQL(SQL_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}

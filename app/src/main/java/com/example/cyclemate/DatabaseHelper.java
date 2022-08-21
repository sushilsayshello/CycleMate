package com.example.cyclemate;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final  String DATABASE_NAME = "UserJourney.db";
    public static final  String TABLE_NAME = "Journey";
    public static final  String COL_1 = "startAt";
    public static final  String COL_2 = "endAt";
    public static final  Integer COL_3 = Integer.valueOf("distance");
    public static final  Integer COL_4 = Integer.valueOf("time");
    public static final  Integer COL_5 = Integer.valueOf("obstacles");
    public static final  Integer COL_6 = Integer.valueOf("mateStory");

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table " + TABLE_NAME +" (startAt TEXT, endAt TEXT, distance Int, time Int, obstacles Text, mateStory Text )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(sqLiteDatabase);
    }

    public boolean insertData(String startAt, String endAt, Integer distance, Integer time, String obstacles, String mateStory){

        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1,startAt);
        contentValues.put(COL_2,endAt);
        contentValues.put(String.valueOf(COL_3),distance);
        contentValues.put(String.valueOf(COL_4),time);
        contentValues.put(COL_1,obstacles);
        contentValues.put(COL_2,mateStory);

        long success= db.insert(TABLE_NAME,null,contentValues);
        if(success == -1){
            return false;
        }
        else{
            return true;
        }
    }

    public Cursor getAllData(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor=db.rawQuery("select * from "+TABLE_NAME,null);
        return cursor;
    }

}

package com.example.coolweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper{
   //Province表示建表语句
    public static final String CREATE_PROVINCE="create table Province("
            +"id integer primary key autoincrement,"
            +"province_name text,"
            +"province_code text,)";
   //city表示建表语句
    public static final String CREATE_CITY="create table City("
            +"id integer primary key autoincrement,"
            +"city_name text,"
            +"city_code text,"
            +"province_id integer)";
   
    public static final String CREATE_COUNTY="create table County("
            +"id integer primary key autoincrement,"
            +"county_name text,"
            +"county_code text,"
            +"city_id integer)";
   //county表示建表语句
    public CoolWeatherOpenHelper(Context context,String name,CursorFactory factory,
            int version){       
        super (context,name,factory,version);   
    }
   
    @Override
    public void onCreate(SQLiteDatabase db){
    	// 数据库第一次被创建的时候被调用，最开始创建数据库时赋的版本号值是0
        db.execSQL(CREATE_CITY);//创建City表
        db.execSQL(CREATE_COUNTY);//创建County表
        db.execSQL(CREATE_PROVINCE);//创建Province表
        }
    
    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){
    	
    }

}

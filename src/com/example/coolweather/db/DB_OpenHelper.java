package com.example.coolweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DB_OpenHelper extends SQLiteOpenHelper {
	 // 类没有实例化，不能用作父类构造器的参数，必须声明为静态
	public DB_OpenHelper(Context context,String name,CursorFactory factory,
            int version){       
        super (context,name,factory,version);   
    }
	public void onCreate(SQLiteDatabase db){
		// 数据库第一次被创建的时候被调用，最开始创建数据库时赋的版本号值是0
	}
	public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){
		// 版本号升级的时候进行调用；如果数据库不存在就不调用
	}

}

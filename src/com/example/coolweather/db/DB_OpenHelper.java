package com.example.coolweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DB_OpenHelper extends SQLiteOpenHelper {
	 // ��û��ʵ�����������������๹�����Ĳ�������������Ϊ��̬
	public DB_OpenHelper(Context context,String name,CursorFactory factory,
            int version){       
        super (context,name,factory,version);   
    }
	public void onCreate(SQLiteDatabase db){
		// ���ݿ��һ�α�������ʱ�򱻵��ã��ʼ�������ݿ�ʱ���İ汾��ֵ��0
	}
	public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){
		// �汾��������ʱ����е��ã�������ݿⲻ���ھͲ�����
	}

}

package com.example.powerj;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import java.io.File;


public class CalendarScheduleShowActivity extends AppCompatActivity {
    //private TextView mv_calendar_schedule_show;
    private Button btn_calendar_schedule_show_delete;
    private TextView tv_calendar_schedule_show_date;
    private TextView tv_calendar_schedule_show_content1;
    private TextView tv_calendar_schedule_show_content2;
    private TextView tv_calendar_schedule_show_content3;
    //private TextView tv_calendar_schedule_show_gps;

    private String content1;
    private String content2;
    private String content3;

    private SQLiteDatabase sqliteDB;

    private String maddress, mdate;
    private int year, month, day;

    //private ReverseGeocoderClient reverseGeocoderClient;
    //private ReverseGeocoderInterface reverseGeocoderInterface;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_schedule_show);
        //날짜 표시

        init_intent();

        init_view();
        sqliteDB = init_DB();
        init_tables();

        tv_calendar_schedule_show_date.setText(mdate);
        tv_calendar_schedule_show_content1.setText(content1);
        tv_calendar_schedule_show_content2.setText(content2);
        tv_calendar_schedule_show_content3.setText(content3);
        //mv_calendar_schedule_show.onCreate(savedInstanceState);
        //mv_calendar_schedule_show.getMapAsync(this);

        delete_values();
    }

    private void init_view(){
        //mv_calendar_schedule_show = (MapView)findViewById(R.id.mv_calendar_schedule_show);
        btn_calendar_schedule_show_delete = (Button)findViewById(R.id.btn_calendar_schedule_show_delete);
        tv_calendar_schedule_show_date = (TextView)findViewById(R.id.tv_calendar_schedule_show_date);

        tv_calendar_schedule_show_content1 = (TextView)findViewById(R.id.tv_calendar_schedule_show_content1);
        tv_calendar_schedule_show_content2 = (TextView)findViewById(R.id.tv_calendar_schedule_show_content2);
        tv_calendar_schedule_show_content3 = (TextView)findViewById(R.id.tv_calendar_schedule_show_content3);

        //tv_calendar_schedule_show_gps = (TextView)findViewById(R.id.tv_calendar_schedule_show_gps);
    }

    private void init_intent(){
        Intent intent = getIntent();

        content1 = intent.getStringExtra("content1");
        content2 = intent.getStringExtra("content2");
        content3 = intent.getStringExtra("content3");

        year = intent.getIntExtra("year",1);
        month = intent.getIntExtra("month", 1);
        day = intent.getIntExtra("day",1);

        mdate = Integer.toString((year * 10000) + ((month+1) * 100) + day);
    }

    private SQLiteDatabase init_DB(){
        SQLiteDatabase db = null;

        File file = new File(getFilesDir(), "wgout1.db");
        try{
            db = SQLiteDatabase.openOrCreateDatabase(file,null);
        }catch (Exception e){
            e.printStackTrace();
        }

        return db;
    }

    private void init_tables(){
        if(sqliteDB != null) {
            String sqlCreateTbl = "CREATE TABLE IF NOT EXISTS SCHEDULE (" +
                    "DATE " + "TEXT," +
                    "CONTENT1 " + "TEXT," +
                    "CONTENT2 " + "TEXT," +
                    "CONTENT3 " + "TEXT" +
                    ")";
            sqliteDB.execSQL(sqlCreateTbl);
        }
    }

    private void delete_values(){
        btn_calendar_schedule_show_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sqliteDB.execSQL("DELETE FROM SCHEDULE WHERE CONTENT1 = '" + content1 + "'");
                sqliteDB.execSQL("DELETE FROM SCHEDULE WHERE CONTENT2 = '" + content2 + "'");
                sqliteDB.execSQL("DELETE FROM SCHEDULE WHERE CONTENT3 = '" + content3 + "'");
                setResult(100);
                finish();
            }
        });
    }
}
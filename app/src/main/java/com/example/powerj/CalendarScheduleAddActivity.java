package com.example.powerj;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.PointF;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

//import com.example.pjtodolist1.Data.Address;
//import com.naver.maps.geometry.LatLng;
//import com.naver.maps.map.CameraPosition;
//import com.naver.maps.map.MapView;
//import com.naver.maps.map.NaverMap;
//import com.naver.maps.map.OnMapReadyCallback;
//import com.naver.maps.map.overlay.Marker;

import java.io.File;

//import retrofit2.Call;
//import retrofit2.Callback;
//import retrofit2.Response;

public class CalendarScheduleAddActivity extends AppCompatActivity {
    private Button btn_calendar_schedule_add_ok;
    private Button mv_calendar_schedule_add;

    private EditText et_calendar_schedule_add_content1;
    private EditText et_calendar_schedule_add_content2;
    private EditText et_calendar_schedule_add_content3;

    private TextView tv_calendar_schedule_add_date;
    private TextView tv_calendar_schedule_add_address;

    //private ReverseGeocoderClient reverseGeocoderClient;
    //private com.example.pjtodolist1.ReverseGeocoderInterface reverseGeocoderInterface;

    private int year, month, day;
    private String key_id = "q618nmd8vn";
    private String key = "CgbDcAxj3Fz6yjNZvqhTbJRn5tjaG9N5TBTCnUPr";
    private String maddress, mdate = "hi";

    private SQLiteDatabase sqliteDB;

    //private Marker marker = new Marker();
    //private LatLng mlatlng = null;

    //private static NaverMap naverMap;

    //private com.example.wgout.GpsGetter gpsGetter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_schedule_add);

        init_intent();

        init_view();
        sqliteDB = init_DB();
        init_tables();

        save_values();
        //mv_calendar_schedule_add.onCreate(savedInstanceState);
        //mv_calendar_schedule_add.getMapAsync(this);

        mdate = Integer.toString((year * 10000) + ((month+1) * 100) + day);

        try {
            tv_calendar_schedule_add_date.setText(mdate);
        }catch (Exception e){
            tv_calendar_schedule_add_date.setText(e.getMessage());
        }

    }

    private void init_view(){
        btn_calendar_schedule_add_ok = (Button)findViewById(R.id.btn_calendar_schedule_add_ok);
        //mv_calendar_schedule_add = (Button) findViewById(R.id.mv_calendar_schedule_add);

        et_calendar_schedule_add_content1 = (EditText)findViewById(R.id.et_calendar_schedule_add_content1);
        et_calendar_schedule_add_content2 = (EditText)findViewById(R.id.et_calendar_schedule_add_content2);
        et_calendar_schedule_add_content3 = (EditText)findViewById(R.id.et_calendar_schedule_add_content3);


        tv_calendar_schedule_add_date = (TextView)findViewById(R.id.tv_calendar_schedule_add_date);
    }

    private void init_intent(){
        Intent intent = getIntent();
        year = intent.getIntExtra("year",1);
        month = intent.getIntExtra("month",1);
        day = intent.getIntExtra("day",1);
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

    private void save_values(){
        btn_calendar_schedule_add_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sqlInsert = "INSERT INTO SCHEDULE" +
                            "(DATE, CONTENT1, CONTENT2, CONTENT3) VALUES (" +
                            "'" + mdate + "'" + "," +
                            "'" + et_calendar_schedule_add_content1.getText().toString() + "'" + "," +
                            "'" + et_calendar_schedule_add_content2.getText().toString() + "'" + "," +
                            "'" + et_calendar_schedule_add_content3.getText().toString() + "'" +
                            ")";
                    sqliteDB.execSQL(sqlInsert);

                    et_calendar_schedule_add_content1.setText("");
                    et_calendar_schedule_add_content2.setText("");
                    et_calendar_schedule_add_content3.setText("");
                    setResult(100);
                    Toast.makeText(getApplicationContext(), "저장되었습니다.", Toast.LENGTH_SHORT).show();
                    finish();
                }catch (Exception e){
                    et_calendar_schedule_add_content1.setText(e.getMessage());
                    et_calendar_schedule_add_content2.setText(e.getMessage());
                    et_calendar_schedule_add_content3.setText(e.getMessage());
                }
            }
        });
    }
}

package com.example.powerj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SurveyMain extends AppCompatActivity{
    Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey_main);
        bt1=findViewById(R.id.surveybtn1);

        bt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent myintent0=new Intent(SurveyMain.this,SurveyExercise.class);
                startActivity(myintent0);
            }
        });
    }

}

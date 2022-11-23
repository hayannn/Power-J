package com.example.powerj;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class SurveyStudy extends AppCompatActivity{
    Button bt3;
    RadioGroup rg4,rg5,rg6;
    int score2=0;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey_study);
        bt3=findViewById(R.id.surveybtn3);
        rg4=findViewById(R.id.rg4);
        rg5=findViewById(R.id.rg5);
        rg6=findViewById(R.id.rg6);

        rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (1){
                    case(R.id.rbtn10):
                        score2=score2+3;
                        break;
                    case(R.id.rbtn11):
                        score2=score2+2;
                        break;
                    case(R.id.rbtn12):
                        score2=score2+1;
                        break;
                }
            }
        });

        rg5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (1){
                    case(R.id.rbtn13):
                        score2=score2+3;
                        break;
                    case(R.id.rbtn14):
                        score2=score2+2;
                        break;
                    case(R.id.rbtn15):
                        score2=score2+1;
                        break;
                }
            }
        });

        rg6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (1){
                    case(R.id.rbtn16):
                        score2=score2+3;
                        break;
                    case(R.id.rbtn17):
                        score2=score2+2;
                        break;
                    case(R.id.rbtn18):
                        score2=score2+1;
                        break;
                }
            }
        });

        bt3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent myintent1=new Intent(SurveyStudy.this,SurveyHobby.class);
                myintent1.putExtra("SCORE",score2);
                startActivity(myintent1);
            }
        });
    }
}
package com.example.powerj;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class SurveyHobby extends AppCompatActivity{
    Button bt4;
    RadioGroup rg7,rg8,rg9;
    int score3=0;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey_hobby);
        bt4=findViewById(R.id.surveybtn4);
        rg7=findViewById(R.id.rg7);
        rg8=findViewById(R.id.rg8);
        rg9=findViewById(R.id.rg9);
        rg7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (1){
                    case(R.id.rbtn19):
                        score3=score3+3;
                        break;
                    case(R.id.rbtn20):
                        score3=score3+2;
                        break;
                    case(R.id.rbtn21):
                        score3=score3+1;
                        break;
                }
            }
        });

        rg8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (1){
                    case(R.id.rbtn22):
                        score3=score3+3;
                        break;
                    case(R.id.rbtn23):
                        score3=score3+2;
                        break;
                    case(R.id.rbtn24):
                        score3=score3+1;
                        break;
                }
            }
        });

        rg9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (1){
                    case(R.id.rbtn25):
                        score3=score3+3;
                        break;
                    case(R.id.rbtn26):
                        score3=score3+2;
                        break;
                    case(R.id.rbtn27):
                        score3=score3+1;
                        break;
                }
            }
        });
        bt4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent myintent1=new Intent(SurveyHobby.this,SurveyLifestyle.class);
                myintent1.putExtra("SCORE",score3);
                startActivity(myintent1);
            }
        });

    }
}
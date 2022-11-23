package com.example.powerj;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class SurveyExercise extends AppCompatActivity{
    Button bt2;
    RadioGroup rg1,rg2,rg3;
    int score1=0;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey_exercise);
        bt2=findViewById(R.id.surveybtn2);
        rg1=findViewById(R.id.rg1);
        rg2=findViewById(R.id.rg2);
        rg3=findViewById(R.id.rg3);

        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (1){
                    case(R.id.rbtn1):
                        score1=score1+3;
                        break;
                    case(R.id.rbtn2):
                        score1=score1+2;
                        break;
                    case(R.id.rbtn3):
                        score1=score1+1;
                        break;
                }
            }
        });

        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (1){
                    case(R.id.rbtn4):
                        score1=score1+3;
                        break;
                    case(R.id.rbtn5):
                        score1=score1+2;
                        break;
                    case(R.id.rbtn6):
                        score1=score1+1;
                        break;
                }
            }
        });

        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (1){
                    case(R.id.rbtn7):
                        score1=score1+3;
                        break;
                    case(R.id.rbtn8):
                        score1=score1+2;
                        break;
                    case(R.id.rbtn9):
                        score1=score1+1;
                        break;
                }
            }
        });

        bt2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent myintent1=new Intent(SurveyExercise.this,SurveyStudy.class);
                myintent1.putExtra("SCORE",score1);
                startActivity(myintent1);
            }
        });
    }
}
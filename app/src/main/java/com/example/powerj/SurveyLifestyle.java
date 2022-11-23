package com.example.powerj;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class SurveyLifestyle extends AppCompatActivity{
    Button bt5;
    RadioGroup rg10,rg11,rg12;
    int score4=0;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey_lifestyle);
        bt5=findViewById(R.id.surveybtn5);
        rg10=findViewById(R.id.rg10);
        rg11=findViewById(R.id.rg11);
        rg12=findViewById(R.id.rg12);

        rg10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (1){
                    case(R.id.rbtn28):
                        score4=score4+3;
                        break;
                    case(R.id.rbtn29):
                        score4=score4+2;
                        break;
                    case(R.id.rbtn30):
                        score4=score4+1;
                        break;
                }
            }
        });

        rg11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (1){
                    case(R.id.rbtn31):
                        score4=score4+3;
                        break;
                    case(R.id.rbtn32):
                        score4=score4+2;
                        break;
                    case(R.id.rbtn33):
                        score4=score4+1;
                        break;
                }
            }
        });

        rg12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (1){
                    case(R.id.rbtn34):
                        score4=score4+3;
                        break;
                    case(R.id.rbtn35):
                        score4=score4+2;
                        break;
                    case(R.id.rbtn36):
                        score4=score4+1;
                        break;
                }
            }
        });

        bt5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent myintent0=new Intent(SurveyLifestyle.this,ResultExercise.class);
                startActivity(myintent0);
            }
        });
    }
}
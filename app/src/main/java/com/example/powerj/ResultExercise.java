package com.example.powerj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ResultExercise extends AppCompatActivity{
    Button sebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey_exercise_result);
        sebtn=findViewById(R.id.sebtn);

        sebtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent myintent0=new Intent(ResultExercise.this,MainActivity.class);
                startActivity(myintent0);
            }
        });
    }
}
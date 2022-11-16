package com.example.powerj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class SurveyExercise extends AppCompatActivity {
    Button bt2;
    RadioGroup rg1, rg2;
    RadioButton rb1, rb2;
    ArrayList<String> myscore;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey_exercise);
    }
}
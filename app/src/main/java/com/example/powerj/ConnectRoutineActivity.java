package com.example.powerj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ConnectRoutineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connectroutine);


        ImageButton btn_connect_exercise = (ImageButton) findViewById(R.id.btn_connect_exercise);

        btn_connect_exercise.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ConnectRoutineActivity.this, ConnectExerciseActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btn_connect_study = (ImageButton) findViewById(R.id.btn_connect_study);

        btn_connect_study.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ConnectRoutineActivity.this, ConnectStudyActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btn_connect_hobby = (ImageButton) findViewById(R.id.btn_connect_hobby);

        btn_connect_hobby.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ConnectRoutineActivity.this, ConnectHobbyActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btn_connect_habit = (ImageButton) findViewById(R.id.btn_connect_habit);

        btn_connect_habit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ConnectRoutineActivity.this, ConnectHabitActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btn_connect_etc = (ImageButton) findViewById(R.id.btn_connect_etc);

        btn_connect_etc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(ConnectRoutineActivity.this, ConnectEtcActivity.class);
                startActivity(intent);
            }
        });
    }
}
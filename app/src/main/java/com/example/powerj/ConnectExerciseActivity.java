package com.example.powerj;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import org.jetbrains.annotations.NotNull;

public class ConnectExerciseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connectexercise);

        ImageButton exercise_video1 = (ImageButton) findViewById(R.id.exercise_video1);

        exercise_video1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=gMaB-fG4u4g"));
                startActivity(intent);
            }
        });

        ImageButton exercise_video2 = (ImageButton) findViewById(R.id.exercise_video2);

        exercise_video2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=YahXKYnc8K8"));
                startActivity(intent);
            }
        });

        ImageButton exercise_video3 = (ImageButton) findViewById(R.id.exercise_video3);

        exercise_video3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=-GJMwcES45A"));
                startActivity(intent);
            }
        });

    }
}
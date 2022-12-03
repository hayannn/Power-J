package com.example.powerj;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ConnectHabitActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connecthabit);

        ImageButton habit_video1 = (ImageButton) findViewById(R.id.habit_video1);

        habit_video1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=bYTPGoqmqZs"));
                startActivity(intent);
            }
        });

        ImageButton habit_video2 = (ImageButton) findViewById(R.id.habit_video2);

        habit_video2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=YNO7dC650B8"));
                startActivity(intent);
            }
        });

        ImageButton habit_video3 = (ImageButton) findViewById(R.id.habit_video3);

        habit_video3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=RD3Ohl1Q7WQ"));
                startActivity(intent);
            }
        });

    }
}
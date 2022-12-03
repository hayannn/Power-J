package com.example.powerj;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ConnectStudyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connectstudy);

        ImageButton study_video1 = (ImageButton) findViewById(R.id.study_video1);

        study_video1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=TtzvIKaaW_8"));
                startActivity(intent);
            }
        });

        ImageButton study_video2 = (ImageButton) findViewById(R.id.study_video2);

        study_video2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=2wNyfpY9kCU&t=1s"));
                startActivity(intent);
            }
        });

        ImageButton study_video3 = (ImageButton) findViewById(R.id.study_video3);

        study_video3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=3WW3GcY34Bw"));
                startActivity(intent);
            }
        });

    }
}

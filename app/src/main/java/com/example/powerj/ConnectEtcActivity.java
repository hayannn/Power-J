package com.example.powerj;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ConnectEtcActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connectetc);

        ImageButton etc_video1 = (ImageButton) findViewById(R.id.etc_video1);

        etc_video1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=uvaeGbN2ZGA"));
                startActivity(intent);
            }
        });

        ImageButton etc_video2 = (ImageButton) findViewById(R.id.etc_video2);

        etc_video2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=5wJi1gLun7o"));
                startActivity(intent);
            }
        });

        ImageButton etc_video3 = (ImageButton) findViewById(R.id.etc_video3);

        etc_video3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=nkQOAqK6h0Y"));
                startActivity(intent);
            }
        });

    }
}
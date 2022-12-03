package com.example.powerj;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ConnectHobbyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connecthobby);
        ImageButton hobby_video1 = (ImageButton) findViewById(R.id.hobby_video1);

        hobby_video1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=4drvuDQpLUk"));
                startActivity(intent);
            }
        });

        ImageButton hobby_video2 = (ImageButton) findViewById(R.id.hobby_video2);

        hobby_video2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=pdm5yQNad-w"));
                startActivity(intent);
            }
        });

        ImageButton hobby_video3 = (ImageButton) findViewById(R.id.hobby_video3);

        hobby_video3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=wc9_eeKCeQw"));
                startActivity(intent);
            }
        });

    }
}
package com.example.powerj;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView emailTv, pwdTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        String email = intent.getStringExtra("email");
        String pwd = intent.getStringExtra("pwd");
        emailTv = (TextView) findViewById(R.id.emailTv);
        pwdTv = (TextView) findViewById(R.id.pwdTv);
        emailTv.setText(email);
        pwdTv.setText(pwd);
    }
}

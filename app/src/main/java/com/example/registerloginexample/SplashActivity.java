package com.example.registerloginexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);
        Log.d("SplashActivity", "SplashActivity is started");

        // Handler를 사용하여 일정 시간(예: 2초) 후에 MainActivity로 이동합니다.
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // MainActivity로 이동하는 Intent 생성
                Intent mainIntent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(mainIntent);
                finish(); // SplashActivity 종료
            }
        }, 2000);
    }
}

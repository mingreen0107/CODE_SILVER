package com.example.registerloginexample;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity1 extends AppCompatActivity {

    private ImageView imageViewLogo;
    private TextView textViewTitle;
    private Button buttonLogin, buttonSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        imageViewLogo = findViewById(R.id.imageViewLogo);
        textViewTitle = findViewById(R.id.textViewTitle);
        buttonLogin = findViewById(R.id.buttonLogin);
        buttonSignUp = findViewById(R.id.buttonSignUp);

        // 로고 이미지 설정
        // imageViewLogo.setImageResource(R.drawable.your_logo);

        // 버튼 이벤트 리스너 설정
        buttonLogin.setOnClickListener(v -> {
            // 로그인 로직 처리
        });

        buttonSignUp.setOnClickListener(v -> {
            // 회원가입 로직 처리
        });
    }
}

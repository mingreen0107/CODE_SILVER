package com.example.registerloginexample;

import androidx.appcompat.app.AppCompatActivity;
import android.os.CountDownTimer;
import android.widget.TextView;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private Button buttonNext, buttonResendCode;
    private EditText editTextPhoneNum, editTextAuthCode;
    private Switch switchBack;
    private SeekBar seekBarStep;
    private TextView tvCountdown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        buttonNext = findViewById(R.id.button);
        buttonResendCode = findViewById(R.id.oknum_button);
        editTextPhoneNum = findViewById(R.id.user_pnum);
        editTextAuthCode = findViewById(R.id.user_oknum);
        buttonNext = findViewById(R.id.backkey);
        seekBarStep = findViewById(R.id.step);
        tvCountdown = findViewById(R.id.tvCountdown);

        new CountDownTimer(210000,1000){
            public void onTick(long millisUntilFinished) {
                // 남은 시간을 분:초 형식으로 변환하여 표시
                long minutes = (millisUntilFinished / 1000) / 60;
                long seconds = (millisUntilFinished / 1000) % 60;
                String timeFormatted = String.format("%02d:%02d", minutes, seconds);
                tvCountdown.setText(timeFormatted);
            }
            public void onFinish() {
                // 타이머가 끝나면 텍스트 변경
                tvCountdown.setText("인증번호를 다시 발송해주세요.");
            }
        }.start();

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 다음 단계로 넘어가는 로직 구현
                Toast.makeText(MainActivity2.this, "다음 단계", Toast.LENGTH_SHORT).show();
            }
        });

        // '인증번호 재발송' 버튼 이벤트 처리
        buttonResendCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 인증번호 재발송 로직 구현
                Toast.makeText(MainActivity2.this, "인증번호 재발송", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
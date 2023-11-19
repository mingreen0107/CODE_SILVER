package com.example.registerloginexample;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;

public class agree extends AppCompatActivity {

    private CheckBox allCheck, check1, check2, checkM;
    private Button join;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agree);

        allCheck=findViewById(R.id.all_check);
        check1 = findViewById(R.id.check_1);
        check2 = findViewById(R.id.check_2);
        checkM = findViewById(R.id.check_m);

        join = findViewById(R.id.join);
        join.setEnabled(false);

        allCheck.setOnCheckedChangeListener((buttonView, isChecked) -> {
            check1.setChecked(isChecked);
            check2.setChecked(isChecked);
            checkM.setChecked(isChecked);

            join.setEnabled(isChecked || (check1.isChecked() && check2.isChecked()));
        });

        CompoundButton.OnCheckedChangeListener listener = (buttonView, isChecked) -> {
            join.setEnabled(check1.isChecked() && check2.isChecked());

            allCheck.setChecked(check1.isChecked()&& check2.isChecked() && checkM.isChecked());
        };

        // 초기에 join 버튼을 비활성화
        join.setEnabled(false);

        // 리스너를 각 체크박스에 설정
        check1.setOnCheckedChangeListener(listener);
        check2.setOnCheckedChangeListener(listener);
        checkM.setOnCheckedChangeListener(listener);
    }
}
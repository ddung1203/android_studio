package com.cookandroid.eventlistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class BtnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(), "버튼1이 눌렸습니다.", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.button1);
        ImageButton btn3 = (ImageButton) findViewById(R.id.button3);

        BtnClickListener btn1ClickListener = new BtnClickListener();
        btn1.setOnClickListener( btn1ClickListener );

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "버튼3이 눌렸습니다.", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void Btn2ClickListener(View v) {
        Toast.makeText(getApplicationContext(), "버튼2이 눌렸습니다", Toast.LENGTH_SHORT).show();
    }
}
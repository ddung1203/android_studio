package com.cookandroid.test4_9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
  Button btn1;
  ImageView img1;
  int turn = 0;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    btn1 = (Button) findViewById(R.id.btn1);
    img1 = (ImageView) findViewById(R.id.img1);

    btn1.setOnClickListener(new View.OnClickListener() {
      public void onClick(View v) {
        turn = turn+10;
        img1.setRotation(turn);
      }
    });


  }
}
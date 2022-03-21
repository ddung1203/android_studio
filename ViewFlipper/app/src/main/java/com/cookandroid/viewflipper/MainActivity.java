package com.cookandroid.viewflipper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    setTitle("뷰플리퍼_전중석");

    Button btnPrev, btnNext;
    final ViewFlipper vFlipper;

    btnPrev = (Button) findViewById(R.id.btn1);
    btnNext = (Button) findViewById(R.id.btn2);
    vFlipper = (ViewFlipper) findViewById(R.id.viewFlipper1);

    btnPrev.setOnClickListener(new View.OnClickListener() {
      public void onClick(View v) {
        vFlipper.showPrevious();
      }
    });

    btnNext.setOnClickListener(new View.OnClickListener() {
      public void onClick(View v) {
        vFlipper.showNext();
      }
    });
  }
}
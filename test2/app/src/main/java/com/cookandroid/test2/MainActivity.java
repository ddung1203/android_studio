package com.cookandroid.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {
  CheckBox chk1, chk2, chk3;
  Button btn1;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    chk1 = (CheckBox) findViewById(R.id.chk1);
    chk2 = (CheckBox) findViewById(R.id.chk2);
    chk3 = (CheckBox) findViewById(R.id.chk3);

    btn1 = (Button) findViewById(R.id.btn1);

    chk1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (chk1.isChecked() == true) {
          btn1.setEnabled(true);
        } else {
          btn1.setEnabled(false);
        }
      }
    });

    chk2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (chk2.isChecked() == true) {
          btn1.setClickable(true);
        } else {
          btn1.setClickable(false);
        }      }
    });

    chk3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (chk3.isChecked() == true) {
          btn1.setRotation(45);
        } else {
          btn1.setRotation(45);
        }      }
    });
  }
}
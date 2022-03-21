package com.cookandroid.test4_8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  EditText ed1;
  String result;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    ed1 = (EditText) findViewById(R.id.ed1);

    ed1.setOnKeyListener(new View.OnKeyListener() {
      public boolean onKey(View v, int keyCode, KeyEvent event) {
        result = ed1.getText().toString();
        Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
        return false;
      }
    });
  }
}
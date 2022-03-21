package com.cookandroid.project7_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

  LinearLayout baseLayout;
  Button btn1;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    setTitle("배경색 바꾸기");

    baseLayout = (LinearLayout) findViewById(R.id.baseLayeout);
    btn1 = (Button) findViewById(R.id.btn1);


  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    super.onCreateOptionsMenu(menu);
    MenuInflater mInflater = getMenuInflater();
    mInflater.inflate(R.menu.menu1, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(@NonNull MenuItem item) {
    super.onOptionsItemSelected(item);

    switch (item.getItemId()) {
      case R.id.itemYellow:
        baseLayout.setBackgroundColor(Color.YELLOW);
        return true;

      case R.id.itemGreen:
        baseLayout.setBackgroundColor(Color.GREEN);
        return true;

      case R.id.itemPink:
        baseLayout.setBackgroundColor(Color.MAGENTA);
        return true;

      case R.id.subRotate:
        btn1.setRotation(45);
        return true;

      case R.id.subSize:
        btn1.setScaleX(2);
        btn1.setScaleY(2);
        return true;

      default:return false;
    }
  }
}
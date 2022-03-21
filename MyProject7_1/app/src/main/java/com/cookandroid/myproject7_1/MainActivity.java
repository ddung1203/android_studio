package com.cookandroid.myproject7_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
  EditText editText;
  ImageView imgView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    setTitle("전중석 과제3 직접풀어보기7-1");

    editText = (EditText) findViewById(R.id.et1);
    imgView = (ImageView) findViewById(R.id.imgView);

  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    super.onCreateOptionsMenu(menu);

    MenuInflater mInflater = getMenuInflater();
    mInflater.inflate(R.menu.menu, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(@NonNull MenuItem item) {
    super.onOptionsItemSelected(item);

    switch(item.getItemId()) {
      case R.id.item1:
        item.setChecked(true);
        imgView.setImageResource(R.drawable.item1);
        imgView.setVisibility(View.VISIBLE);
        return true;

      case R.id.item2:
        item.setChecked(true);
        imgView.setImageResource(R.drawable.item2);
        imgView.setVisibility(View.VISIBLE);
        return true;

      case R.id.item3:
        item.setChecked(true);
        imgView.setImageResource(R.drawable.item3);
        imgView.setVisibility(View.VISIBLE);
        return true;

      case R.id.Rotate:
        item.setChecked(true);
        imgView.setRotation(Integer.parseInt(editText.getText().toString()));
        return true;

      default:
        return false;

    }
  }
}
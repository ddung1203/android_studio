package com.cookandroid.ratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  private RatingBar ratingBar;
  private TextView value;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    setTitle("레이팅바_전중석");

    SetupRatingBar();
  }

  public void SetupRatingBar() {
    ratingBar = (RatingBar) findViewById(R.id.RatingBar);
    value = (TextView) findViewById(R.id.tv1);

    ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
      @Override
      public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
        value.setText(Float.toString(v));
      }
    });
  }
}
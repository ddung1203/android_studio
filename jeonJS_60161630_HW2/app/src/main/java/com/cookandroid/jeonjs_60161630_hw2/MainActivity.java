package com.cookandroid.jeonjs_60161630_hw2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Chronometer;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
  Chronometer chrono;
  RadioButton rdoCal, rdoTime;
  DatePicker dPicker;
  TimePicker tPicker;
  TextView tv1, tv2, tvYear, tvMonth, tvDay, tvHour, tvMinute;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    setTitle("전중석 과제2 시간예약+자동완성");

    String[] items = {"class", "exam", "homework", "quiz", "meeting", "wake-up"};

    AutoCompleteTextView auto  = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, items);
    auto.setAdapter(adapter);

    chrono = (Chronometer) findViewById(R.id.chronometer1);

    rdoCal = (RadioButton) findViewById(R.id.rdoCal);
    rdoTime = (RadioButton) findViewById(R.id.rdoTime);

    dPicker = (DatePicker) findViewById(R.id.datePicker1);
    tPicker = (TimePicker) findViewById(R.id.timePicker1);

    tv1 = (TextView) findViewById(R.id.tv1);
    tv2 = (TextView) findViewById(R.id.tv2);
    tvYear = (TextView) findViewById(R.id.tvYear);
    tvMonth = (TextView) findViewById(R.id.tvMonth);
    tvDay = (TextView) findViewById(R.id.tvDay);
    tvHour = (TextView) findViewById(R.id.tvHour);
    tvMinute = (TextView) findViewById(R.id.tvMinute);

    dPicker.setVisibility(View.INVISIBLE);
    tPicker.setVisibility(View.INVISIBLE);

    rdoCal.setVisibility(View.INVISIBLE);
    rdoTime.setVisibility(View.INVISIBLE);

    chrono.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        rdoCal.setVisibility(View.VISIBLE);
        rdoTime.setVisibility(View.VISIBLE);
      }
    });

    rdoCal.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        tPicker.setVisibility(View.INVISIBLE);
        dPicker.setVisibility(View.VISIBLE);
      }
    });

    rdoTime.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        tPicker.setVisibility(View.VISIBLE);
        dPicker.setVisibility(View.INVISIBLE);
      }
    });

    chrono.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        chrono.setBase(SystemClock.elapsedRealtime());
        chrono.start();
        chrono.setTextColor(Color.RED);
        rdoCal.setVisibility(View.VISIBLE);
        rdoTime.setVisibility(View.VISIBLE);
      }
    });

    tvYear.setOnLongClickListener(new View.OnLongClickListener() {
      @Override
      public boolean onLongClick(View view) {
        chrono.stop();
        chrono.setTextColor(Color.BLUE);
        tv1.setText(auto.getText().toString());
        tv2.setVisibility(View.VISIBLE);
        tvYear.setText(Integer.toString(dPicker.getYear()));
        tvMonth.setText(Integer.toString(1+dPicker.getMonth()));
        tvDay.setText(Integer.toString(dPicker.getDayOfMonth()));
        tvHour.setText(Integer.toString(tPicker.getCurrentHour()));
        tvMinute.setText(Integer.toString(tPicker.getCurrentMinute()));
        rdoCal.setVisibility(View.INVISIBLE);
        rdoTime.setVisibility(View.INVISIBLE);
        dPicker.setVisibility(View.INVISIBLE);
        tPicker.setVisibility(View.INVISIBLE);

        return false;
      }
    });
  }
}
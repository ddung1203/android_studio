package com.cookandroid.jeonjs_60161630_midexam;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
  TextView a, b, c, d, e;
  ImageView img;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    registerForContextMenu(img);

    a = (TextView) findViewById(R.id.Nougat);
    b = (TextView) findViewById(R.id.Oreo);
    c = (TextView) findViewById(R.id.Pie);
    d = (TextView) findViewById(R.id.Q);
    e = (TextView) findViewById(R.id.R);

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

    a.setOnClickListener(new View.OnClickListener() {
      public void onClick(View v) {
        Toast.makeText(getApplicationContext(), "Nougat", Toast.LENGTH_SHORT).show();
      }
    });
    b.setOnClickListener(new View.OnClickListener() {
      public void onClick(View v) {
        Toast.makeText(getApplicationContext(), "Oreo", Toast.LENGTH_SHORT).show();
      }
    });
    c.setOnClickListener(new View.OnClickListener() {
      public void onClick(View v) {
        Toast.makeText(getApplicationContext(), "Pie", Toast.LENGTH_SHORT).show();
      }
    });
    d.setOnClickListener(new View.OnClickListener() {
      public void onClick(View v) {
        Toast.makeText(getApplicationContext(), "Q", Toast.LENGTH_SHORT).show();
      }
    });
    e.setOnClickListener(new View.OnClickListener() {
      public void onClick(View v) {
        Toast.makeText(getApplicationContext(), "R", Toast.LENGTH_SHORT).show();
      }
    });


  }

  @Override
  public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
    super.onCreateContextMenu(menu, v, menuInfo);

    MenuInflater mInflater = getMenuInflater();
    mInflater.inflate(R.menu.menu1, menu);

  }

  @Override
  public boolean onContextItemSelected(@NonNull MenuItem item) {
    switch (item.getItemId()) {
      case R.id.subSize:
        img.setScaleX(2);
        return true;
      case R.id.originSize:
        img.setScaleX(1);
        return true;
    }
    return false;
  }
}
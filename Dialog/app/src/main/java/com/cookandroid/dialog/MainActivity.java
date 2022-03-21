package com.cookandroid.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  TextView textView;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    setTitle("결제 대화상자_전중석");

    TextView textView = (TextView) findViewById(R.id.tv1);
    Button button = (Button) findViewById(R.id.btn1);

    button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        showMessage();
      }
    });
  }

  private void showMessage( ) {
    AlertDialog.Builder builder = new AlertDialog.Builder(this);
    builder.setTitle("알림");
    builder.setMessage("결제하시겠습니까?");
    builder.setIcon(R.mipmap.ic_launcher);

    builder.setPositiveButton("예", new DialogInterface.OnClickListener() {
      @Override
      public void onClick(DialogInterface dialogInterface, int i) {
        textView.setText("결제가 완료되었습니다.");
      }
    });

    builder.setNegativeButton("아니요", new DialogInterface.OnClickListener() {
      @Override
      public void onClick(DialogInterface dialogInterface, int i) {
        textView.setText("결제가 취소되었습니다.");
      }
    });

    builder.setNeutralButton("취소", new DialogInterface.OnClickListener() {
      @Override
      public void onClick(DialogInterface dialogInterface, int i) {
        textView.setText("취소 버튼이 눌렸습니다.");
      }
    });

    AlertDialog dialog = builder.create();
    dialog.show();
  }
}
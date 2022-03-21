package com.cookandroid.myproject4_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text1, text2;
    Switch swc;
    RadioGroup rGroup;
    Button btnExit, btnReset;
    ImageView imgPet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("전중석_직접 풀어보기 4-4");

        text1 = (TextView) findViewById(R.id.Text1);
        swc = (Switch) findViewById(R.id.Swc);

        text2 = (TextView) findViewById(R.id.Text2);
        rGroup = (RadioGroup) findViewById(R.id.Rgroup);

        imgPet = (ImageView) findViewById(R.id.ImgPet);
        btnExit = (Button) findViewById(R.id.BtnEXIT);
        btnReset = (Button) findViewById(R.id.BtnRESET);

        swc.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (swc.isChecked() == true) {
                    text2.setVisibility(View.VISIBLE);
                    rGroup.setVisibility(View.VISIBLE);
                    imgPet.setVisibility(View.VISIBLE);
                    btnExit.setVisibility(View.VISIBLE);
                    btnReset.setVisibility(View.VISIBLE);
                } else {
                    text2.setVisibility(View.INVISIBLE);
                    rGroup.setVisibility(View.INVISIBLE);
                    imgPet.setVisibility(View.INVISIBLE);
                    btnExit.setVisibility(View.INVISIBLE);
                    btnReset.setVisibility(View.INVISIBLE);
                }
            }
        });

        rGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(rGroup.getCheckedRadioButtonId()) {
                    case R.id.RadioCat:
                        imgPet.setImageResource(R.drawable.cat);
                        break;
                    case R.id.RadioDog:
                        imgPet.setImageResource(R.drawable.dog);
                        break;
                    case R.id.RadioKoalas:
                        imgPet.setImageResource(R.drawable.koalas);
                        break;
                }
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                swc.setChecked(false);
                rGroup.clearCheck();
                imgPet.setImageResource(0);
            }
        });
    }
}
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnRand;
    TextView txtRes;
    ImageView imgView;


    private void innitControl(){
        txtRes = (TextView) findViewById(R.id.txtRes);
        imgView = (ImageView) findViewById(R.id.imgOne);

        imgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int number = random.nextInt(6) + 1;
                switch (number){
                    case 1:
                        imgView.setImageResource(R.drawable.mot);
                        break;
                    case 2:
                        imgView.setImageResource(R.drawable.hai);
                        break;
                    case 3:
                        imgView.setImageResource(R.drawable.ba);
                        break;
                    case 4:
                        imgView.setImageResource(R.drawable.bon);
                        break;
                    case 5:
                        imgView.setImageResource(R.drawable.nam);
                        break;
                    case 6:
                        imgView.setImageResource(R.drawable.sau);
                        break;
                }
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        innitControl();
    }
}
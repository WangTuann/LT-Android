package com.example.xucxac;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btnRandom;
    TextView txtResult;
    private void innitControl(){
        btnRandom = (Button) findViewById(R.id.btnRandom);
        txtResult=(TextView) findViewById(R.id.txtResult);
        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int number=random.nextInt(6)+1;
                txtResult.setText(String.valueOf(number));
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
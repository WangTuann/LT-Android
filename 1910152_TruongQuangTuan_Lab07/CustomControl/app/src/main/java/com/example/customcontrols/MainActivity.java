package com.example.customcontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnBT1_2,btnBT3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InnitControl();
    }
    private void InnitControl(){
        btnBT1_2=(Button) findViewById(R.id.btn_BT1_2);
        btnBT3=(Button) findViewById(R.id.btn_BT3);
        btnBT1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent BT12=new Intent(MainActivity.this,CustomButton.class);
                startActivity(BT12);
            }
        });
        btnBT3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BT3=new Intent(MainActivity.this,SeekBarRGB.class);
                startActivity(BT3);
            }
        });
    }
}
package com.example.chuongtrinhdoitien;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnBt1, btnBt2;

    private void innitControl() {
        btnBt1 = (Button) findViewById(R.id.btn_BT1);
        btnBt2 = (Button) findViewById(R.id.btn_BT2);


        btnBt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BT1=new Intent(MainActivity.this,Main_DoiTien.class);
                startActivity(BT1);
            }
        });
        btnBt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BT2=new Intent(MainActivity.this,MainActivity_BT.class);
                startActivity(BT2);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        innitControl();
    }
}

package com.example.animalsound;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btnLT1,btnLT2, btnBT2;
private void InnitControl(){
    btnLT1=(Button) findViewById(R.id.btnLT1);
    btnLT2=(Button) findViewById(R.id.btnLT2);
    btnBT2=(Button)findViewById(R.id.btnBT2);


    btnLT1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent bai1LT=new Intent(MainActivity.this,bai1LT.class);
            startActivity(bai1LT);
        }
    });
    btnLT2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent bai2LT=new Intent(MainActivity.this,bai2LT.class);
            startActivity(bai2LT);
        }
    });
    btnBT2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent baiBT2=new Intent(MainActivity.this,BT2.class);
            startActivity(baiBT2);
        }
    });


}



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InnitControl();
    }
}
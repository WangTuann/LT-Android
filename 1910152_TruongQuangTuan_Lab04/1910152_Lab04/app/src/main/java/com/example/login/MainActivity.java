package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        Button btnBT1,btnBT2,btnBT3;
        private void InnitControl(){
            btnBT1=(Button) findViewById(R.id.btnBT1);
            btnBT2=(Button) findViewById(R.id.btnBT2);
            btnBT3=(Button) findViewById(R.id.btnBT3);

            btnBT1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent BT1=new Intent(MainActivity.this,BT1.class);
                    startActivity(BT1);
                }
            });
            btnBT2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent BT2=new Intent(MainActivity.this,BT2.class);
                    startActivity(BT2);
                }
            });
            btnBT3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent BT3=new Intent(MainActivity.this,MainAcivityBT3.class);
                    startActivity(BT3);
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



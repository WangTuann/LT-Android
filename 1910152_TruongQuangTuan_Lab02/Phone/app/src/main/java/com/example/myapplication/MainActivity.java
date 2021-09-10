package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageButton btnPhone;
    TextView txtPhone;

    public void InnitControl(){
        btnPhone=(ImageButton) findViewById(R.id.btn_Phone);
        txtPhone=(TextView) findViewById(R.id.number_phone);
        btnPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCall =new Intent();
                intentCall.setAction(Intent.ACTION_CALL);
                intentCall.setData(Uri.parse("tel:"+txtPhone.getText()));
                startActivity(intentCall);
            }
        });
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InnitControl();
    }
}
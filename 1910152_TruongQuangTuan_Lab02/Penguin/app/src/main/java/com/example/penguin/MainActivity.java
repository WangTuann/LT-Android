package com.example.penguin;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m001_act_splash);

        Random random =new Random();
             int color = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
             findViewById(android.R.id.content).setBackgroundColor(color);
             RandomIMG();
    }
    private void RandomIMG(){
        Random random=new Random();
        imageView=findViewById(R.id.imageView);
        int [] image={R.drawable.black_cat,R.drawable.penguin,R.drawable.elephant};
        imageView.setImageResource(image[random.nextInt(image.length)]);
    }
}
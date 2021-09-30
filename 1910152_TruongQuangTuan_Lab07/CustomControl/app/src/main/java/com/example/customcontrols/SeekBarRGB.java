package com.example.customcontrols;


import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SeekBarRGB extends AppCompatActivity  {
    private ImageView colorImageView,colorImageViewCMY;
    private int redValue =0;
    private int greenValue =0;
    private int blueValue =0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seekbar_layout);
        InnitControl();
    }
    private void InnitControl(){

        colorImageView=(ImageView)findViewById(R.id.colorImageView);
        colorImageViewCMY=(ImageView)findViewById(R.id.colorImageViewCMY);
        SeekBar sbR=(SeekBar) findViewById(R.id.RedSeekbar);
        sbR.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                TextView Rdisplay=(TextView) findViewById(R.id.RedValue);
                Rdisplay.setText(sbR.getProgress()+i+"");
                redValue=i;
                ImageColor();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        SeekBar sbG=(SeekBar) findViewById(R.id.GreenSeekbar);
        sbG.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                TextView Gdisplay=(TextView) findViewById(R.id.GreenValue);
                Gdisplay.setText(sbG.getProgress()+i+"");
                greenValue=i;
                ImageColor();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        SeekBar sbB=(SeekBar) findViewById(R.id.BlueSeekbar);
        sbB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                TextView Bdisplay=(TextView) findViewById(R.id.BlueValue);
                Bdisplay.setText(sbB.getProgress()+i+"");
                blueValue=i;
                ImageColor();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }
    private void ImageColor(){
        int color= Color.rgb(redValue,greenValue,blueValue);
        colorImageView.setBackgroundColor(color);
        int cmyColor=Color.rgb(255-redValue,255-greenValue,255-blueValue);
        colorImageViewCMY.setBackgroundColor(cmyColor);
    }
}

package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class BT2 extends AppCompatActivity  {
    private static final int[] ID_DRAWABLES = {R.drawable.ic_mess, R.drawable.ic_flight,
            R.drawable.ic_hopital,
            R.drawable.ic_hotel, R.drawable.ic_restaurant, R.drawable.ic_coctail,
            R.drawable.ic_store, R.drawable.ic_at_work, R.drawable.ic_time, R.drawable.ic_education,
            R.drawable.ic_movie};
    private static final int[] ID_TEXTS = {R.string.txt_mess, R.string.txt_flight, R.string.txt_hospital,
            R.string.txt_hotel, R.string.txt_restaurant, R.string.txt_coctail,
            R.string.txt_store, R.string.txt_work, R.string.txt_time, R.string.txt_education, R.string.txt_movie};
    public static ArrayList<String> arrWord;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m002_act_hoctienganh);
        initView();
    }
    private void initView() {
        LinearLayout lnMain = findViewById(R.id.ln_main);
        lnMain.removeAllViews();
        for (int i = 0; i < ID_DRAWABLES.length; i++) {
            View v = LayoutInflater.from(this).inflate(R.layout.item_topic, null);
            ImageView ivTopic = v.findViewById(R.id.iv_topic);
            TextView tvTopic = v.findViewById(R.id.tv_topic);
            ivTopic.setImageResource(ID_DRAWABLES[i]);
            tvTopic.setText(ID_TEXTS[i]);

            LinearLayout.LayoutParams param = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    1.0f
            );
            v.setLayoutParams(param);
            lnMain.addView(v);
           // tvTopic.setOnClickListener(this);
        }
    }
//    public void onClick(View view){
//        TextView tv=(TextView) view;
//        if(tv.getText().toString().compareTo("Essentials") == 0){
//            String[] word = getResources().getStringArray(R.array.Essentials);
//            arrWord = new ArrayList<>(Arrays.asList(word));
//            Intent intent = new Intent(Menu.this, act_word.class);
//            Bundle bundle = new Bundle();
//            bundle.putStringArrayList("arr_word", arrWord);
//            intent.putExtras(bundle);
//
//            startActivity(intent);
//    }

}

package com.example.animalsound;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class BT2 extends AppCompatActivity {
    TextView tvEng, tvVN,tvFR;

    private void initUI(){
        tvEng=findViewById(R.id.Eng);
        tvVN=findViewById(R.id.tv);
        tvFR=findViewById(R.id.fr);

        tvFR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeLanguage("fr","FR");
            }
        });
        tvVN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeLanguage("vi","VN");
            }
        });
        tvEng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeLanguage("en","US");
            }
        });
        }

    public void changeLanguage(String language, String lan){
        Locale locale = new Locale(language,lan);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(
                config, getBaseContext().getResources().getDisplayMetrics()
        );
        Intent intent = new Intent(BT2.this, BT2.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_m003_signin);
        initUI();

    }
}

package com.example.list;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity_1 extends AppCompatActivity {

    String[] title = new String[]{"Android","IOS","Window Phone"};
    String[] contents = new String[]{
            "Day la he dieu hanh android",
            "Day la he dieu hanh IOS",
            "Day la he dieu hanh Window Phone"
    };
    int[] imgs = new int[]{
            R.drawable.ic_android,
            R.drawable.ic_apple,
            R.drawable.ic_windows
    };
    ListView lvMain;
    TextView txtDisplay;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_1);
        InnitControl();
    }
    private void InnitControl(){
        lvMain = findViewById(R.id.lvMain);
        txtDisplay = findViewById(R.id.txtDisplay);
        ArrayList<Product> list = new ArrayList<>();
        for(int i = 0;i<title.length; i++){
            list.add(new Product(imgs[i], title[i], contents[i]));
        }
        ListViewAdapter adapter = new ListViewAdapter(list);
        lvMain.setAdapter(adapter);

        lvMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                txtDisplay.setText("Ban chon " + title[i]);
            }
        });
    }

}

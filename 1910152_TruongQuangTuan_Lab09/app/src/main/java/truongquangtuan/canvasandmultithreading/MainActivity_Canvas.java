package truongquangtuan.canvasandmultithreading;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity_Canvas extends AppCompatActivity {
        MyCanvas canvas;
        Button button;
        int[]colors=new int[]{Color.RED, Color.GREEN, Color.GRAY, Color.YELLOW, Color.CYAN, Color.WHITE};
        Random rd=new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_canvas);
        InnitControl();
    }
    protected void InnitControl(){
        MyCanvas canvas=findViewById(R.id.myCanvas);
        Button btnDraw=findViewById(R.id.btnDraw);
        btnDraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int colorIndex=rd.nextInt(colors.length);
                MyCanvas.color=colors[colorIndex];
                canvas.invalidate();
            }
        });
    }



}
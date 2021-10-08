package truongquangtuan.canvasandmultithreading;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnCanvas,btnBieuDo,btnGame;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InnitControl();
    }
    private void InnitControl(){
        btnCanvas=(Button) findViewById(R.id.btn_canvas);
        //btnBieuDo=(Button) findViewById(R.id.btn_Bieudo);
        btnBieuDo=(Button)findViewById(R.id.btn_Game);
        btnCanvas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btCanvas=new Intent(MainActivity.this,MainActivity_Canvas.class);
                startActivity(btCanvas);
            }
        });
        btnBieuDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnAnimal=new Intent(MainActivity.this,Activity_animal.class);
                startActivity(btnAnimal);
            }
        });
    }
}

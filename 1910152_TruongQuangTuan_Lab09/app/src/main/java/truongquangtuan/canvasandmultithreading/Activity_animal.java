package truongquangtuan.canvasandmultithreading;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Activity_animal extends AppCompatActivity {

    TextView txtDiem;
    CheckBox cbOne,cbTwo,cbThree;
    SeekBar skOne,skTwo,skThree;
    ImageButton ibtPlay;
    int soDiem=100;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animal_layout);
        InnitControl();
        txtDiem.setText(soDiem+"");
        CountDownTimer countDownTimer=new CountDownTimer(30000,300) {
            @Override
            public void onTick(long l) {
                int num = 5;
                Random rd = new Random();
//                int one=rd.nextInt(num);
//                int two=rd.nextInt(num);
//                int three=rd.nextInt(num);
                int goal = skOne.getMax();
                skOne.setProgress(skOne.getProgress() + rd.nextInt(10));
                skTwo.setProgress(skTwo.getProgress() + rd.nextInt(10));
                skThree.setProgress(skThree.getProgress() + rd.nextInt(10));
                if (skOne.getProgress()>=goal){
                    this.cancel();
                    ibtPlay.setVisibility(View.VISIBLE);
                    Toast.makeText(Activity_animal.this,"ONE WIN",Toast.LENGTH_SHORT).show();
                    //
                    if (cbOne.isChecked()){
                        soDiem+=10;
                        Toast.makeText(Activity_animal.this,"Ban doan chinh xac", Toast.LENGTH_SHORT).show();
                    }else {
                        soDiem-=5;
                        Toast.makeText(Activity_animal.this,"Ban doan sai roi", Toast.LENGTH_SHORT).show();
                    }
                    txtDiem.setText(soDiem+"");
                    Enable();
                }
                if (skTwo.getProgress()>=goal){
                    this.cancel();
                    ibtPlay.setVisibility(View.VISIBLE);
                    Toast.makeText(Activity_animal.this,"TWO WIN",Toast.LENGTH_SHORT).show();
                    //
                    if (cbTwo.isChecked()){
                        soDiem+=10;
                        Toast.makeText(Activity_animal.this,"Ban doan chinh xac", Toast.LENGTH_SHORT).show();
                    }else {
                        soDiem-=5;
                        Toast.makeText(Activity_animal.this,"Ban doan sai roi", Toast.LENGTH_SHORT).show();
                    }
                    txtDiem.setText(soDiem+"");
                    Enable();
                }

                if (skThree.getProgress()>=goal){
                    this.cancel();
                    ibtPlay.setVisibility(View.VISIBLE);
                    Toast.makeText(Activity_animal.this,"THREE WIN",Toast.LENGTH_SHORT).show();
                    //
                    if (cbThree.isChecked()){
                        soDiem+=10;
                        Toast.makeText(Activity_animal.this,"Ban doan chinh xac", Toast.LENGTH_SHORT).show();
                    }else {
                        soDiem-=5;
                        Toast.makeText(Activity_animal.this,"Ban doan sai roi", Toast.LENGTH_SHORT).show();
                    }
                    txtDiem.setText(soDiem+"");
                    Enable();
                }



                //KIEM TRA win
//                if (skOne.getProgress()>=skOne.getMax()){
//                    this.cancel();
//                    Toast.makeText(Activity_animal.this,"ONE WIN",Toast.LENGTH_SHORT).show();
//                }
//                if (skTwo.getProgress()>=skTwo.getMax()){
//                    this.cancel();
//                    Toast.makeText(Activity_animal.this,"TWO WIN",Toast.LENGTH_SHORT).show();
//                }
//                if (skThree.getMax()>=skThree.getMax()){
//                    this.cancel();
//                    Toast.makeText(Activity_animal.this,"THREE WIN",Toast.LENGTH_SHORT).show();
//                }
//                skOne.setProgress(skOne.getProgress()+one);
//                skTwo.setProgress(skTwo.getProgress()+two);
//                skThree.setProgress(skThree.getProgress()+three);
//            }
            }

            @Override
            public void onFinish() {

            }
        };
        ibtPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cbOne.isChecked()||cbTwo.isChecked()||cbThree.isChecked()){
                    skOne.setProgress(0);
                    skThree.setProgress(0);
                    skTwo.setProgress(0);
                    ibtPlay.setVisibility(View.INVISIBLE);
                    countDownTimer.start();
                    DisnableCheckbox();
                }
                else {
                    Toast.makeText(Activity_animal.this,"Vui long dat cuoc truoc khi choi",Toast.LENGTH_SHORT).show();
                }

            }
        });
        cbOne.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    cbTwo.setChecked(false);
                    cbThree.setChecked(false);
                }
            }
        });
        cbTwo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    cbThree.setChecked(false);
                    cbOne.setChecked(false);
                }
            }
        });
        cbThree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    cbOne.setChecked(false);
                    cbTwo.setChecked(false);
                }
            }
        });
    }
    private void InnitControl(){
        txtDiem=(TextView) findViewById(R.id.tvDiem);
        cbOne=(CheckBox) findViewById(R.id.checkbox1);
        cbTwo=(CheckBox) findViewById(R.id.checkbox2);
        cbThree=(CheckBox) findViewById(R.id.checkbox3);
        skOne=(SeekBar) findViewById(R.id.seekbar1);
        skTwo=(SeekBar) findViewById(R.id.seekbar2);
        skThree=(SeekBar) findViewById(R.id.seekbar3);
        ibtPlay=(ImageButton) findViewById(R.id.btnPlay);
    }
    private void Enable(){
        cbOne.setEnabled(true);
        cbTwo.setEnabled(true);
        cbThree.setEnabled(true);
    }
    private void DisnableCheckbox(){
        cbOne.setEnabled(false);
        cbTwo.setEnabled(false);
        cbThree.setEnabled(false);
    }
}

package deso2.truongquangtuan.dlu_mssv;

import androidx.appcompat.app.AppCompatActivity;

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
    EditText hoTen,gtX,gtY,gtZ;
    Button btnHoten,btnXoa,btnOk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }
    private void initUI(){
        hoTen=(EditText)findViewById(R.id.ho_va_ten);
        gtX=(EditText) findViewById(R.id.gtX);
        gtY=(EditText) findViewById(R.id.gtY);
        gtZ=(EditText) findViewById(R.id.gtZ);
//        gtY=(EditText) findViewById(R.id.gtY);
//        gtZ
        btnHoten=(Button) findViewById(R.id.ho_ten);
        btnXoa=(Button)findViewById(R.id.xoa) ;
        btnHoten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!hoTen.getText().toString().isEmpty()){
                showToast(hoTen.getText().toString());
                }
            }
        });
        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hoTen.getText().clear();
                gtY.getText().clear();
                gtX.getText().clear();
                gtZ.getText().clear();
            }
        });
    }
    private void showToast(String hoTen) {
        Toast toast = new Toast(this);
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.layout_custom_toast));
        TextView txtMess = view.findViewById(R.id.txtView);
        txtMess.setText("Họ và tên là: " + hoTen );
        toast.setView(view);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.show();
    }
}
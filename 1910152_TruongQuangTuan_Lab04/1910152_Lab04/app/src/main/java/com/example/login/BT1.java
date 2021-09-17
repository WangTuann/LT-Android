package com.example.login;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BT1 extends AppCompatActivity implements View.OnClickListener {
    EditText edtEmail, edtPass;
    TextView login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m001_act_login);
        initUI();
    }

    private void initUI() {
        edtEmail = (EditText) findViewById(R.id.edt_mail);
        edtPass = (EditText) findViewById(R.id.edt_pass);
        login = (TextView) findViewById(R.id.login);
        login.setOnClickListener(this);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.login:
                if (!edtEmail.getText().toString().isEmpty() && !edtPass.getText().toString().isEmpty()) {
                    showToast(edtEmail.getText().toString(), edtPass.getText().toString());

                }
                break;
        }
    }

    private void showToast(String email, String pass) {
        Toast toast = new Toast(this);
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.layout_custom_toast));
        TextView txtMess = view.findViewById(R.id.txtView);
        txtMess.setText("Email là: " + email + "\nMật khẩu là: " + pass);
        toast.setView(view);

        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.show();
    }
}

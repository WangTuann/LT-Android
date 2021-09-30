package com.example.customcontrols;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CustomButton extends AppCompatActivity {
    Button btnToast, btnDialog;
    final Context context = this;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_buttom_toast_dialog);
        initUI();
    }

    private void initUI() {
        btnDialog = (Button) findViewById(R.id.dialog);
        btnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.custom_dialog);
                dialog.setTitle("Day la Custom Dialog");

                // set the custom dialog components - text, image and button
                TextView text = (TextView) dialog.findViewById(R.id.text);
                text.setText("Truong Quang Tuan");
                ImageView image = (ImageView) dialog.findViewById(R.id.image);
                image.setImageResource(R.drawable.face);

                Button dialogButton = (Button) dialog.findViewById(R.id.dialogButtonOK);
                // if button is clicked, close the custom dialog
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        btnToast=(Button) findViewById(R.id.toast);
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(),"Custom toast",Toast.LENGTH_SHORT).show();
                setView();
            }
        });

    }
    private void setView(){
        Toast toast=new Toast(this);
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast,
                (ViewGroup) findViewById(R.id.custom_toast_container));

        TextView text = layout.findViewById(R.id.text);
        text.setText("Day la Custom toast");

        toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }
}




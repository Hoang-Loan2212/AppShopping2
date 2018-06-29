package com.example.dell.appbanhang;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class login extends AppCompatActivity {

    EditText edtuser,edtpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login3);

        edtuser = findViewById (R.id.edittextuser);
        edtpass = findViewById (R.id.edittextpass);


    }


    public void Onlogin(View view) {
        String username = edtuser.getText ().toString ().trim ();
        String password = edtpass.getText ().toString ().trim ();
        String type = "login";
        BackgroundWorker backgroundWorker = new BackgroundWorker (this);
        backgroundWorker.execute (type,username,password);
    }
    public void Openreg(View view){
        startActivity (new Intent(this,Register.class));
    }

    public void exit(View view){
        android.support.v7.app.AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(login.this, android.R.style.Theme_DeviceDefault_Dialog);
        builder.setTitle("Bạn có muốn thoát ứng dựng?");
        builder.setMessage("Lựa chọn để xác nhận");
        builder.setIcon(android.R.drawable.ic_dialog_alert);
        builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                onBackPressed();
            }
        });
        builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        builder.show();
    }

}

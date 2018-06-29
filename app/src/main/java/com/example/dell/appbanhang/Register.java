package com.example.dell.appbanhang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    EditText username, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        username = findViewById (R.id.edittk);
        password = findViewById (R.id.editmk);
    }
    public void Onreg(View view){
        String str_username = username.getText ().toString ().trim ();
        String str_password = password.getText ().toString ().trim ();
        String type = "register";
        BackgroundWorker backgroundWorker = new BackgroundWorker (this);
        backgroundWorker.execute (type,str_username,str_password);
    }

    public void huy(View view) {
        startActivity (new Intent(this,login.class));
    }
}


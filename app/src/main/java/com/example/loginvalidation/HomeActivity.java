package com.example.loginvalidation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    TextView txtuser,txtpass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        txtuser=findViewById(R.id.text1);
        txtpass=findViewById(R.id.text2);

        Intent intent=getIntent();
        String username=intent.getStringExtra("username");
        String password=intent.getStringExtra("password");

        txtuser.setText(username);
        txtpass.setText(password);
    }
}

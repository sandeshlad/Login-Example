package com.example.loginvalidation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        Thread thread=new Thread(){
            @Override
            public void run() {

                try {
                    sleep(1000);

                }catch(Exception e){
                    e.printStackTrace();

                }finally{
                    Intent intent=new Intent(MainActivity.this,LoginActivity.class);
                    startActivity(intent);

                }

            }
        };thread.start();
    }
}

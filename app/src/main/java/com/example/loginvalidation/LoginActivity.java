package com.example.loginvalidation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText username1,password1;
    Button login;
    TextView attempt;
    int count=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username1=findViewById(R.id.username);
        password1=findViewById(R.id.password);
        login=findViewById(R.id.btnlogin);
        attempt =findViewById(R.id.attempt);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String USERNAME=username1.getText().toString();
                String PASSWORD=password1.getText().toString();

                if(USERNAME.equals("admin")&& PASSWORD.equals("1234"))
                {

                    String USER=username1.getText().toString();
                    String PASS=password1.getText().toString();

                    Intent intent1=new Intent(LoginActivity.this,HomeActivity.class);
                    intent1.putExtra("username",USER);
                    intent1.putExtra("password",PASS);
                    startActivity(intent1);
                }
                else {
                    count--;
                    attempt.setText(String.valueOf(count));
                    Toast.makeText(LoginActivity.this, "Incorrect user or pass , " + String.valueOf(count), Toast.LENGTH_LONG).show();
                    if (count == 0) {
                        View b = findViewById(R.id.btnlogin);
                        b.setVisibility(View.GONE);
                    }
                }


            }
        });


    }
}

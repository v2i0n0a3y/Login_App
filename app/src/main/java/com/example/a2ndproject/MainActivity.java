package com.example.a2ndproject;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.recyclerview.R;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button loginbutton;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        loginbutton=findViewById(R.id.loginbutton);

        loginbutton.setOnClickListener(v -> {
            if(username.getText().toString().equals("vinay")&& password.getText().toString().equals("1234")){
                Toast.makeText(MainActivity.this, "Login successfull", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(MainActivity.this, "Login Failed..!", Toast.LENGTH_SHORT).show();


            }
        });
    }
}


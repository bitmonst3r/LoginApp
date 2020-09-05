package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText)findViewById(R.id.username_label);
        password = (EditText)findViewById(R.id.password_label);
        login = (Button)findViewById(R.id.log_in);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(username.getText().toString(), password.getText().toString(), password);
            }
        });

    }

    private void validate(final String userName, String userPassword, EditText password) {

        //Welcome Screen Login
        if((userName.equals("din_djarin")) && (userPassword.equals("baby_yoda_ftw"))){
            Intent intent = WelcomeScreen.getIntent(getApplicationContext(), userName);
            startActivity(intent);
        }
        if(!userPassword.equals("baby_yoda_ftw")){
            password.setError("Incorrect Password");
        }
    }
}
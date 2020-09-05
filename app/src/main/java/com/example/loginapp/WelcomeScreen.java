package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class WelcomeScreen extends AppCompatActivity {

    TextView welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);

        welcome = (TextView)findViewById(R.id.welcomeTextView);

        welcome.setText("Welcome " + getIntent().getStringExtra("USERNAME"));
    }
    public static Intent getIntent(Context context, String username) {
        Intent intent = new Intent(context, WelcomeScreen.class);
        intent.putExtra("USERNAME", username);
        return intent;
    }
}
package com.example.loginapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SuccessActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        TextView successMessage = findViewById(R.id.successMessage);
        successMessage.setText("Welcome, " + getIntent().getStringExtra("username") + "!");
    }
}
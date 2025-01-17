package com.example.college_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class computer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);
    }
    public void faculties(View v)
    {
        Intent intent = new Intent(computer.this,computer_faculties.class);
        startActivity(intent);
    }
}
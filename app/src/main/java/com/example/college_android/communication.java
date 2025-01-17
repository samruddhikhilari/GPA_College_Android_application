package com.example.college_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class communication extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_communication);
    }
    public void faculties(View v)
    {
        Intent intent = new Intent(communication.this, communication_faculties.class);
        startActivity(intent);
    }
}
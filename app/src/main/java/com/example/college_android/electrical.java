package com.example.college_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class electrical extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electrical);
    }
    public void faculties(View v)
    {
        Intent intent = new Intent(electrical.this, electrical_faculties.class);
        startActivity(intent);
    }
}
package com.example.college_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class automobile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_automobile);
    }
    public void faculties(View v)
    {
        Intent intent = new Intent(automobile.this,automobile_faculties.class);
        startActivity(intent);
    }
}
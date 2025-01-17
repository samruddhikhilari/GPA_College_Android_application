package com.example.college_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
public class departments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_departments);
    }
    public void information_technology(View v)
    {
        Intent intent = new Intent(departments.this,information_technology.class);
        startActivity(intent);
    }
    public void computer(View v)
    {
        Intent intent = new Intent(departments.this, computer.class);
        startActivity(intent);
    }
    public void electrical(View v)
    {
        Intent intent = new Intent(departments.this, electrical.class);
        startActivity(intent);
    }
    public void communication(View v)
    {
        Intent intent = new Intent(departments.this, communication.class);
        startActivity(intent);
    }
    public void automobile(View v)
    {
        Intent intent = new Intent(departments.this, automobile.class);
        startActivity(intent);
    }
    public void civil(View v)
    {
        Intent intent = new Intent(departments.this, civil.class);
        startActivity(intent);
    }
}
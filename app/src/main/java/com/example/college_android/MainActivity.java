package com.example.college_android;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.content.Intent;
import android.widget.MediaController;
public class MainActivity extends AppCompatActivity {
    ImageButton ib1,ib2,ib3,ib4;
    MediaController mcon;
    EditText etext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ib1 = findViewById(R.id.imageButton3);
        ib2 = findViewById(R.id.imageButton4);
        ib3 = findViewById(R.id.imageButton5);
        ib4 = findViewById(R.id.imageButton6);

        etext= findViewById(R.id.editTextText);
    }
    public void college(View v)
    {
        Intent intent = new Intent(MainActivity.this,college.class);
        startActivity(intent);
    }
    public void departments(View v)
    {
        Intent intent = new Intent(MainActivity.this, departments.class);
        startActivity(intent);
    }
    public void events(View v)
    {
        Intent intent = new Intent(MainActivity.this, events.class);
        startActivity(intent);
    }
    public void educational_details(View v)
    {
        Intent intent = new Intent(MainActivity.this, educational_details.class);
        startActivity(intent);
    }
    public void search(View v)
    {
        String search = etext.getText().toString();
        if(search.equalsIgnoreCase("if")||search.equalsIgnoreCase("information technology"))
        {
            Intent intent = new Intent(MainActivity.this, information_technology.class);
            startActivity(intent);
        }
        else if(search.equalsIgnoreCase("co")||search.equalsIgnoreCase("computer"))
        {
            Intent intent = new Intent(MainActivity.this, computer.class);
            startActivity(intent);
        }
        else if(search.equalsIgnoreCase("ee")||search.equalsIgnoreCase("electrical"))
        {
            Intent intent = new Intent(MainActivity.this, electrical.class);
            startActivity(intent);
        }
        else if(search.equalsIgnoreCase("au")||search.equalsIgnoreCase("automobile"))
        {
            Intent intent = new Intent(MainActivity.this, automobile.class);
            startActivity(intent);
        }
        else if(search.equalsIgnoreCase("ej")||search.equalsIgnoreCase("communication"))
        {
            Intent intent = new Intent(MainActivity.this, communication.class);
            startActivity(intent);
        }
        else if(search.equalsIgnoreCase("ce")||search.equalsIgnoreCase("civil"))
        {
            Intent intent = new Intent(MainActivity.this, civil.class);
            startActivity(intent);
        }
    }

}
package com.example.college_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
public class educational_details extends AppCompatActivity {

    ImageView cal,fview,sview,tview;
    Button b1,b2,b3,b4,c1,c2,c3,c4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_educational_details);

        cal=findViewById(R.id.imageView4);
        fview=findViewById(R.id.imageView5);
        sview=findViewById(R.id.imageView6);
        tview=findViewById(R.id.imageView8);

        c1=findViewById(R.id.button3);
        c2=findViewById(R.id.button4);
        c3=findViewById(R.id.button5);
        c4=findViewById(R.id.button6);

        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        b3=findViewById(R.id.btn3);
        b4=findViewById(R.id.btn4);

    }
    public void calendar(View v)
    {
        cal.setVisibility(View.VISIBLE);
        c1.setVisibility(View.VISIBLE);
    }
    public void one(View v)
    {
        fview.setVisibility(View.VISIBLE);
        c2.setVisibility(View.VISIBLE);
    }
    public void two(View v)
    {
        sview.setVisibility(View.VISIBLE);
        c3.setVisibility(View.VISIBLE);
    }
    public void three(View v)
    {
        tview.setVisibility(View.VISIBLE);
        c4.setVisibility(View.VISIBLE);
    }
    public void close1(View v)
    {
        cal.setVisibility(View.GONE);
        c1.setVisibility(View.GONE);
    }
    public void close2(View v)
    {
        fview.setVisibility(View.GONE);
        c2.setVisibility(View.GONE);
    }
    public void close3(View v)
    {
        sview.setVisibility(View.GONE);
        c3.setVisibility(View.GONE);
    }
    public void close4(View v)
    {
        tview.setVisibility(View.GONE);
        c4.setVisibility(View.GONE);
    }
}
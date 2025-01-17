package com.example.college_android;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;
import android.content.Intent;
import android.view.View;
public class information_technology extends AppCompatActivity {

    VideoView view;
    MediaController mcon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_technology);

        view = findViewById(R.id.videoView);
        mcon = new MediaController(this);

        String pvideo = "android.resource://com.example.college_android/"+R.raw.dep;
        Uri uri = Uri.parse(pvideo);
        view.setVideoURI(uri);

        view.setMediaController(mcon);
        mcon.setAnchorView(view);
        view.start();
    }
    public void faculties(View v)
    {
        Intent intent = new Intent(information_technology.this,faculties.class);
        startActivity(intent);
    }
}
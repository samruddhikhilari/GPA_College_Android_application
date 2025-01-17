package com.example.college_android;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class events extends AppCompatActivity {
    private static final String CHANNEL_ID = "first channel";
    private static final int NOTIFICATION_ID = 10;
    TextView textView,details;
    EditText tdetails;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        textView = findViewById(R.id.textView17);
        imageView =findViewById(R.id.imageView3);

        details = findViewById(R.id.textView28);
        tdetails =findViewById(R.id.editTextText2);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, "My notification", NotificationManager.IMPORTANCE_HIGH);
            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
        }
    }
    public void show(View v) {

        Intent icamera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(icamera,100);

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==RESULT_OK)
        {
            if(requestCode==100)
            {
                Bitmap img = (Bitmap) data.getExtras().get("data");
                imageView.setImageBitmap(img);
            }

            textView.setText(tdetails.getText());

            tdetails.setVisibility(View.INVISIBLE);
            details.setVisibility(View.INVISIBLE);

            textView.setVisibility(View.VISIBLE);
            imageView.setVisibility(View.VISIBLE);

            NotificationCompat.Builder builder = new NotificationCompat.Builder(events.this, CHANNEL_ID);
            builder.setContentTitle("Event Notification");
            builder.setContentText(tdetails.getText());
            builder.setSmallIcon(R.drawable.logo);
            builder.setAutoCancel(true);

            NotificationManagerCompat managerCompat = NotificationManagerCompat.from(events.this);
            if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
                return;
            }
            managerCompat.notify(10, builder.build());
        }
    }
}

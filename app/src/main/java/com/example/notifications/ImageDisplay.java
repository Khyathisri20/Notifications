package com.example.notifications;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageDisplay extends AppCompatActivity {
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_display);

        image = findViewById(R.id.image_notif);

        Bitmap large = BitmapFactory.decodeResource(getResources(), R.drawable.large);
        image.setImageBitmap(large);
    }
}
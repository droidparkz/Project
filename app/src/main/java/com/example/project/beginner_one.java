package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class beginner_one extends AppCompatActivity {

    ImageButton imgsettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner_one);

        imgsettings = findViewById(R.id.iconsettings);

        imgsettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(beginner_one.this, settings.class);
                startActivity(intent);
            }
        });


    }
}

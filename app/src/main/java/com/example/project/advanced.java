package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class advanced extends AppCompatActivity {

    ImageButton imgsettings;
    Button passge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced);

        imgsettings = findViewById(R.id.iconsettings);
        passge = findViewById(R.id.adv1);

        imgsettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(advanced.this,settings.class);
                startActivity(intent);
            }
        });

        passge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(advanced.this,Passages.class);
                startActivity(intent);
            }
        });
    }
}

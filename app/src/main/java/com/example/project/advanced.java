package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import static com.example.project.lang_selection.MY_PREFS_NAME;

public class advanced extends AppCompatActivity {

    ImageButton imgsettings;
    Button passge,video;

    TextView t1;

    String language;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced);

        SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);

        language = prefs.getString("langchoosen", null);

        t1 = (TextView) findViewById(R.id.advancedlanguage);

        t1.setText(language);


        imgsettings = findViewById(R.id.iconsettings);
        passge = findViewById(R.id.adv1);
        video = (Button) findViewById(R.id.adv2);

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

        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(advanced.this,Videos.class);
                startActivity(intent);
            }
        });
    }
}

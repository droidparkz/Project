package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class lang_selection extends AppCompatActivity implements View.OnClickListener {

    public static final String MY_PREFS_NAME = "MyPrefsFile";

    Button beginner,advanced;

    Spinner spinner1,spinner2;

    String begin ="beginner";
    String advan ="advanced";

    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lang_selection);

        editor = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();

        beginner = (Button) findViewById(R.id.beg);
        advanced = (Button) findViewById(R.id.adv);

        addItemsOnSpinner1();
        addItemsOnSpinner2();

        beginner.setOnClickListener(this);

    }

    public void addItemsOnSpinner1() {

        spinner1 = (Spinner) findViewById(R.id.chooselang);
        List<String> list3 = new ArrayList<String>();
        list3.add("Choose your Language");
        list3.add("English");
        list3.add("French");
        list3.add("German");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list3);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(dataAdapter);
    }

    public void addItemsOnSpinner2() {

        spinner2 = (Spinner) findViewById(R.id.sel_lang);
        List<String> list3 = new ArrayList<String>();
        list3.add("Select your Language");
        list3.add("English");
        list3.add("French");
        list3.add("Spanish");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list3);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(dataAdapter);
    }

    @Override
    public void onClick(View view) {

        if(view == beginner)
        {
            String clang = String.valueOf(spinner1.getSelectedItem());
            String slang = String.valueOf(spinner2.getSelectedItem());
            editor.putString("langchoosen",clang);
            editor.putString("langselected",slang);
            editor.putString("langdifficulty",begin);
            editor.apply();
            Intent intent = new Intent(lang_selection.this,beginner_one.class);
            startActivity(intent);
        }
        if (view == advanced)
        {
            String clang = String.valueOf(spinner1.getSelectedItem());
            String slang = String.valueOf(spinner2.getSelectedItem());
            editor.putString("langchoosen",clang);
            editor.putString("langselected",slang);
            editor.putString("langdifficulty", advan);
            editor.apply();
            Intent intent = new Intent(lang_selection.this,advanced.class);
            startActivity(intent);
        }
    }
}

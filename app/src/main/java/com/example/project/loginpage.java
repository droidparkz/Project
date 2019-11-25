package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;

import static com.example.project.lang_selection.MY_PREFS_NAME;


public class loginpage extends AppCompatActivity implements View.OnClickListener {


    RelativeLayout google;

    GoogleSignInClient mGoogleSignInClient;

    int RC_SIGN_IN = 0;

    String langcse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);

        langcse = prefs.getString("langdifficulty", null);

        if (langcse != null && langcse.equals("beginner"))
        {
            Intent intent = new Intent(loginpage.this,beginner_one.class);
            startActivity(intent);

        }

        else if (langcse != null && langcse.equals("advanced"))
        {
            Intent intent = new Intent(loginpage.this,advanced.class);
            startActivity(intent);

        }

        google = (RelativeLayout) findViewById(R.id.logingwithgoogle);

        google.setOnClickListener(this);

    }

     @Override
     public void onClick(View view) {

         if (view == google)
         {
             Intent intent = new Intent(loginpage.this,lang_selection.class);
             startActivity(intent);
         }
     }
}


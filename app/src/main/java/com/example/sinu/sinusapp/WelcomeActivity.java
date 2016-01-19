package com.example.sinu.sinusapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Bundle loginData = getIntent().getExtras();
        if(loginData == null){
            return;
        }
        else{
            String userName = loginData.getString("userName");
            final TextView welcomeUser = (TextView) findViewById(R.id.welcomeUser);
            welcomeUser.setText("Welcome! " + userName);
        }
    }

}

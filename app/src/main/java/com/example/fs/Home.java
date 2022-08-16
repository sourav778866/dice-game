package com.example.fs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.widget.TextView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        TextView b=findViewById(R.id.bt);
        b.setOnClickListener(view -> {
            Intent i = new Intent(Home.this, MainActivity2.class);
            startActivity(i);
        });

            // This method will be executed once the timer is over



    }
}
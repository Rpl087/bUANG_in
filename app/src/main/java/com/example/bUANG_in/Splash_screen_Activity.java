package com.example.bUANG_in;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Splash_screen_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        ImageView imageView = logoImageView(R.id.ImageView);
        imageView.setImageResource(R.drawable.fresh__1_);

    }
}
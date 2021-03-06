package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class EnterActivity extends AppCompatActivity implements View.OnClickListener {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter);
        Button toWeatherBtn;
        Button toMapBtn;
        toWeatherBtn = findViewById(R.id.toWeatherBtn);
        toWeatherBtn.setOnClickListener(this);
        toMapBtn = findViewById(R.id.toMapBtn);
        toMapBtn.setOnClickListener(this);
    }


    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.toWeatherBtn:
                goToWeather();
                break;
            case R.id.toMapBtn:
                gotoMap();
                break;
        }
    }

    private void goToWeather(){
        Intent switchActivityIntent = new Intent(this, MainActivity.class);
        startActivity(switchActivityIntent);
    }

    private void gotoMap(){
        Intent switchActivityIntent = new Intent(this, MapsActivity.class);
        startActivity(switchActivityIntent);
    }
}
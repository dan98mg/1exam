package com.example.a1exam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blinker blinking = new blinker(5000, 1000);

        blinking.image();
        Intent nextscrn = new Intent(this, nextScreen.class);
        startActivity(nextscrn);
    }


}
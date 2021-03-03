package com.example.a1exam;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class nextScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

    }

    public void btnClick(){
        TextView feeInput = (TextView) findViewById(R.id.feeStartInput);
        TextView distanceInput = (TextView) findViewById(R.id.disInput);
        TextView kmInput = (TextView) findViewById(R.id.feeKMInput);
        TextView finalFee = (TextView) findViewById(R.id.feeFinal);

        int feeFinal = (Integer.parseInt(distanceInput.toString()) * Integer.parseInt(kmInput.toString()))
                + Integer.parseInt(feeInput.toString());

        finalFee.setText("$" + feeFinal);
    }
}

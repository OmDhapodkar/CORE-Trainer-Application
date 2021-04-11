package com.TeamProNoobs.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Intent b1=getIntent();

    public void composeMessage(View v) {
        Intent i = new Intent(this, BMI2.class);
        startActivity(i);
    }

    public void next3(View view) {
    }

    public void back2t1(View view) {
    }
}
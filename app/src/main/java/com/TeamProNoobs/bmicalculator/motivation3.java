package com.TeamProNoobs.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class motivation3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motivation3);
        Intent m3=getIntent();
    }
    public void work3(View view){
        Intent w3=new Intent(this,video3.class);
        startActivity(w3);
    }
    public void diet3(View view){
        Intent d3=new Intent(this,diet1.class);
        startActivity(d3);
    }
}
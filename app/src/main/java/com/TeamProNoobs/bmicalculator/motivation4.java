package com.TeamProNoobs.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class motivation4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motivation4);
        Intent m4=getIntent();
    }
    public void work4(View view){
        Intent w4=new Intent(this,video4.class);
        startActivity(w4);
    }
    public void diet4(View view){
        Intent d4=new Intent(this,diet1.class);
        startActivity(d4);
    }
}
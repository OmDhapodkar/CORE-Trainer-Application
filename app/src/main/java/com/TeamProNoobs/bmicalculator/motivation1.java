package com.TeamProNoobs.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class motivation1 extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motivation1);
        Intent i=getIntent();
    }
    public void video1(View view){
        Intent n=new Intent(this,video1.class);
        startActivity(n);
    }
    public void work1(View view){
        Intent w1=new Intent(this,video1.class);
        startActivity(w1);
    }
    public void diet1(View view){
        Intent d1=new Intent(this,diet1.class);
        startActivity(d1);
    }


}
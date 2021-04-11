package com.TeamProNoobs.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        Intent j=getIntent();
    }
    public void next1(View view){
        Intent k=new Intent(this, obese.class);
        startActivity(k);
    }
    public void moti1(View view){
        Intent i=new Intent(this,motivation1.class);
        startActivity(i);
    }
    public void moti2(View view){
        Intent m2=new Intent(this,motivation2.class);
        startActivity(m2);
    }
    public void moti3(View view){
        Intent m3=new Intent(this,motivation3.class);
        startActivity(m3);
    }
    public void moti4(View view){
        Intent m4=new Intent(this,motivation4.class);
        startActivity(m4);
    }
}
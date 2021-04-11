package com.TeamProNoobs.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class motivation2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motivation2);
        Intent m2=getIntent();
    }
    public void work2(View view){
        Intent w2=new Intent(this,video2.class);
        startActivity(w2);
    }
    public void diet2(View view){
        Intent d2=new Intent(this,diet1.class);
        startActivity(d2);
    }

}
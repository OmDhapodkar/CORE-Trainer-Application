package com.TeamProNoobs.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class diet1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet1);
        Intent d1=getIntent();
    }
    public void breakfast1(View view){
        Intent b1=new Intent(this,breakfast.class);
        startActivity(b1);
    }
    public void lunch1(View view){
        Intent l1=new Intent(this,lunch.class);
        startActivity(l1);
    }
    public void dinner1(View view){
        Intent di1=new Intent(this,dinner.class);
        startActivity(di1);
    }
    public void final1(View view){
        Intent f1=new Intent(this,final1.class);
        startActivity(f1);
    }
}
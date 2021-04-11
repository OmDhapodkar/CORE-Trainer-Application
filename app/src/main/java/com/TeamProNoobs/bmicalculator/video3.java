package com.TeamProNoobs.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class video3 extends AppCompatActivity {
    public void pic1(View View){
        ImageView image = (ImageView) findViewById(R.id.def1);

        image.setImageResource(R.drawable.toetouchcrunchleft);
    }
    public void pic2(View View){
        ImageView image = (ImageView) findViewById(R.id.def1);

        image.setImageResource(R.drawable.fluttertouch);
    }
    public void pic3(View View){
        ImageView image = (ImageView) findViewById(R.id.def1);

        image.setImageResource(R.drawable.heeltouch);
    }
    public void pic4(View View){
        ImageView image = (ImageView) findViewById(R.id.def1);

        image.setImageResource(R.drawable.obliquevright);
    }
    public void pic5(View View){
        ImageView image = (ImageView) findViewById(R.id.def1);

        image.setImageResource(R.drawable.obliquevleft);
    }
    public void pic6(View View){
        ImageView image = (ImageView) findViewById(R.id.def1);

        image.setImageResource(R.drawable.lyingtwist);
    }
    Intent w3=getIntent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video3);
    }
}
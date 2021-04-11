package com.TeamProNoobs.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

public class video1 extends AppCompatActivity {
    public void pic1(View View){
        ImageView image = (ImageView) findViewById(R.id.def1);

        image.setImageResource(R.drawable.russiantwist);
    }
    public void pic2(View View){
        ImageView image = (ImageView) findViewById(R.id.def1);

        image.setImageResource(R.drawable.lyingtwist);
    }
    public void pic3(View View){
        ImageView image = (ImageView) findViewById(R.id.def1);

        image.setImageResource(R.drawable.fluttertouch);
    }
    public void pic4(View View){
        ImageView image = (ImageView) findViewById(R.id.def1);

        image.setImageResource(R.drawable.heeltouch);
    }
    public void pic5(View View){
        ImageView image = (ImageView) findViewById(R.id.def1);

        image.setImageResource(R.drawable.tortouchcrunch);
    }
    public void pic6(View View){
        ImageView image = (ImageView) findViewById(R.id.def1);

        image.setImageResource(R.drawable.dumbellcrunchplus);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video1);
        Intent n=getIntent();
    }
}
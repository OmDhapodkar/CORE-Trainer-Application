package com.TeamProNoobs.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class video4 extends AppCompatActivity {
    public void pic1(View View){
        ImageView image = (ImageView) findViewById(R.id.def1);

        image.setImageResource(R.drawable.cobrastretch);
    }
    public void pic2(View View){
        ImageView image = (ImageView) findViewById(R.id.def1);

        image.setImageResource(R.drawable.lyingleft);
    }
    public void pic3(View View){
        ImageView image = (ImageView) findViewById(R.id.def1);

        image.setImageResource(R.drawable.dumbellcrunchpunch);
    }
    public void pic4(View View){
        ImageView image = (ImageView) findViewById(R.id.def1);

        image.setImageResource(R.drawable.fluttertouch);
    }
    public void pic5(View View){
        ImageView image = (ImageView) findViewById(R.id.def1);

        image.setImageResource(R.drawable.russiantwist);
    }
    public void pic6(View View){
        ImageView image = (ImageView) findViewById(R.id.def1);

        image.setImageResource(R.drawable.plank);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video4);
    }
}
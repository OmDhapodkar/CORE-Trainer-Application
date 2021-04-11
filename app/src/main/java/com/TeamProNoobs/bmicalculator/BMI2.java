package com.TeamProNoobs.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BMI2 extends AppCompatActivity {
    private EditText height;
    private EditText weight;
    private Button bmi;
    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_m_i2);
        Intent i = getIntent();


            height = (EditText) findViewById(R.id.etheight);
            weight = (EditText) findViewById(R.id.etweight);
            bmi = (Button) findViewById(R.id.calcbmi);
            result = (TextView) findViewById(R.id.bmianswer);

            bmi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    float heeight = Float.parseFloat(height.getText().toString());
                    float weeight = Float.parseFloat(weight.getText().toString());
                    float bmii = (float) (weeight * 10000 / (heeight * heeight));
                    result.setText(String.valueOf(bmii));
                    if(bmii>=25 && bmii<30){
                        Toast.makeText(BMI2.this, "You are OverWeight", Toast.LENGTH_SHORT).show();
                    }
                    else if(bmii<=18){
                        Toast.makeText(BMI2.this, "You are Underweight", Toast.LENGTH_SHORT).show();
                    }
                    else if(bmii>=30){
                        Toast.makeText(BMI2.this, "OBESE", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(BMI2.this, "Ideal BMI", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
        public void next3(View view){
        Intent j=new Intent(this, Activity3.class);
        startActivity(j);
        }
    public void back2t1(View view){
        Intent b1=new Intent(this, MainActivity.class);
        startActivity(b1);
    }
    }

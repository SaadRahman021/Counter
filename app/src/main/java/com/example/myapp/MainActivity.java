package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button inc,dec,reset;
    TextView text;
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inc=findViewById(R.id.btn_inc);
        dec=findViewById(R.id.btn_dec);
        reset=findViewById(R.id.btn_reset);

        text=findViewById(R.id.textView);

        inc.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                counter++;
                text.setText(Integer.toString(counter));
            }
        });

        reset.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                counter = 0;
                text.setText(Integer.toString(counter));
            }

        });

        dec.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                counter--;
                if(counter < 0) {
                    counter=0;
                    text.setText(Integer.toString(counter));
                }
                else
                    text.setText(Integer.toString(counter));

            }

        });
    }
}
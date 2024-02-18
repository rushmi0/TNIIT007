package com.example.tniit007;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class week3_B extends AppCompatActivity {

    //Step 1
    Button bradleyBtn, m551Btn, challengerBtn, object279Btn, vikarBtn;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week3_b);
    //Step 2
        bradleyBtn = findViewById(R.id.bradBtn);
        m551Btn = findViewById(R.id.m551Btn);
        challengerBtn = findViewById(R.id.chaBtn);
        object279Btn = findViewById(R.id.objectBtn);
        vikarBtn = findViewById(R.id.vikarBtn);
        img = findViewById(R.id.imgV);
    //Step 3
        bradleyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),
                        R.drawable.r2));
            }
        });

        m551Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),
                        R.drawable.m551));
            }
        });

        challengerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),
                        R.drawable.challenger2));
            }
        });

        object279Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),
                        R.drawable.object));
            }
        });

        vikarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),
                        R.drawable.vikar));
            }
        });

    }
}
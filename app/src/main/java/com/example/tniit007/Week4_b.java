package com.example.tniit007;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Week4_b extends AppCompatActivity {
    Button toPageC, toHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week4_b);

        toPageC = findViewById(R.id.toPageCBtn);
        toHome = findViewById(R.id.homeBtn);
        toPageC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pageCIntent = new Intent(getApplicationContext(), Week4_c.class);
                startActivity(pageCIntent);
            }
        });

        toHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String geoCode = "http://maps.google.com/maps?saddr=13.834744492975005,100.72426170448703&daddr=13.73800056536123,100.6283831783411";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(geoCode));
                startActivity(intent);
            }
        });

    }
}
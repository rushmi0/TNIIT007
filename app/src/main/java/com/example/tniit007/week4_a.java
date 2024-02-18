package com.example.tniit007;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URI;

public class week4_a extends AppCompatActivity {

    Button toPageB, viewAddr, showMapImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week4_a);

        toPageB = findViewById(R.id.toPageBBtn);
        viewAddr = findViewById(R.id.addrBtn);
        showMapImg = findViewById(R.id.mapImg);

        toPageB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigate to another page
                Intent pageBIntent = new Intent(getApplicationContext(), Week4_b.class);
                startActivity(pageBIntent);
            }
        });

        viewAddr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String geoCode = "geo:0,0?q=18 60+east+18th+street+cleveland+oh”";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(geoCode));
                startActivity(intent);
            }
        });

        showMapImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String geoCode = "http://maps.google.com/maps?saddr=13.738019718473057,100.62838954091971&daddr=13.69440567879926,100.64830259704642";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(geoCode));
                startActivity(intent);
            }
        });
    }
}
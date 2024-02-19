package com.example.tniit007;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Week6 extends AppCompatActivity {

    // Step 1
    Button myOpen6A, myOpen6B, mySave;
    EditText myScore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week6);


        // Step 2
        myOpen6A = findViewById(R.id.open6a);
        myOpen6B = findViewById(R.id.open6b);
        mySave = findViewById(R.id.save6);
        myScore = findViewById(R.id.score);

        myOpen6A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myInt = new Intent(getApplicationContext(), Week6_a.class);
                startActivity(myInt);
            }
        });

        myOpen6B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myInt = new Intent(getApplicationContext(), Week6_b.class);
                startActivity(myInt);
            }
        });


        // Connect DB
        final SharedPreferences sp = this.getSharedPreferences(
                "shared_name",
                Context.MODE_PRIVATE
        );

        final SharedPreferences.Editor editor = sp.edit();


        // Step 3
        mySave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Step 4
                int score = Integer.parseInt(myScore.getText().toString());
                editor.putInt("score", score);
                editor.commit();

                Toast.makeText(getApplicationContext(), "OK! OK! OK!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
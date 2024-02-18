package com.example.tniit007;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class Week5_a extends AppCompatActivity {

    TextView showName, showScore;
    Button backBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week5_a);

        showName = findViewById(R.id.resultText);
        showScore = findViewById(R.id.scoreText);
        backBtn = findViewById(R.id.backTo5B);

        Bundle getExtras = getIntent().getExtras(); //retrieve data from extra

        String getName = getExtras.getString("name"); // get value from extra in String
        showName.setText("Hi! " + getName);

        Intent i = getIntent();
        String score = i.getStringExtra("score");
        showScore.setText("You got: " + score);



//        Intent intent = getIntent(); // get value from intent
//        String temp1 = intent.getStringExtra(); // store intent value to temp1 getStringExtra("variable name");



        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(getApplicationContext(), Week5.class);
                startActivity(back);
            }
        });
    }
}
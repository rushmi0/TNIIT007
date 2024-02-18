package com.example.tniit007;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Week5 extends AppCompatActivity {

    EditText nameEnter, scoreEnter;
    Button  mysendC, mySendBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week5);

        nameEnter = findViewById(R.id.nameInput2);
        scoreEnter = findViewById(R.id.scoreInput);
        mysendC = findViewById(R.id.C);
        mySendBtn = findViewById(R.id.sendbtn);

        mySendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent page5bIntent = new Intent(getApplicationContext(), Week5_a.class);
                String sendName = nameEnter.getText().toString(); //get value from nameInput
                String sendScore = scoreEnter.getText().toString();
                page5bIntent.putExtra("name", sendName); // send value with Inter using putExtra(variable name, value to send);
                page5bIntent.putExtra("score", sendScore); // send value with Inter using putExtra(variable name, value to send);
                startActivity(page5bIntent);
            }
        });

        mysendC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Week5_b.class);
                startActivity(i);
                overridePendingTransition(R.anim.in, R.anim.in);
            }
        });
    }
}
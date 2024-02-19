package com.example.tniit007;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class Week6_a extends AppCompatActivity {

    TextView myResult6a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week6_a);

        myResult6a = findViewById(R.id.result6a);

        // Connect DB
        final SharedPreferences sp = this.getSharedPreferences(
                "shared_name",
                Context.MODE_PRIVATE
        );

        final SharedPreferences.Editor editor = sp.edit();

        myResult6a.setText("Result is " + sp.getInt("score", 0));

    }

}
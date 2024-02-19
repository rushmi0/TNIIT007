package com.example.tniit007;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Week6_c extends AppCompatActivity {

    EditText myN1, myN2;

    Button myCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week6_c);

        myN1 = findViewById(R.id.n1);
        myN2 = findViewById(R.id.n2);
        myCheck = findViewById(R.id.checkN1);


        myCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String n1 = myN1.getText().toString();
                String n2 = myN2.getText().toString();

                if (n1.equals("")) {
                    myN1.setError("N1 is null");

                } else if (n2.equals("")) {
                    myN1.setError("N2 is null");
                } else if (n1.equals(n2)){
                    Toast.makeText(getApplicationContext(), "OK!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "N1 is not match N2", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}
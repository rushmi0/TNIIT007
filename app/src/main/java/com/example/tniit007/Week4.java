package com.example.tniit007;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Week4 extends AppCompatActivity {

    //Step 1
    EditText n1, n2;
    Button plusBtn, minusBtn, multiplyBtn, devideBtn;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week4);
    //Step 2
        n1 = findViewById(R.id.num1);
        n2 = findViewById(R.id.num2);
        plusBtn = findViewById(R.id.plus);
        minusBtn = findViewById(R.id.minus);
        multiplyBtn = findViewById(R.id.multiply);
        devideBtn = findViewById(R.id.devide);
        result = findViewById(R.id.showText2);

        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(n1.getText().toString().isEmpty()) {
                    n1.setError("Please enter number to calculate the outcome!");
//                    Toast.makeText(getApplicationContext(), "Please enter number to calculate the outcome!", Toast.LENGTH_SHORT).show();
                } else if (n2.getText().toString().isEmpty()){
                    n2.setError("Please enter number to calculate the outcome!");
                } else {
                    String number1 = n1.getText().toString();
                    String number2 = n2.getText().toString();
                    int num1 = Integer.parseInt(number1);
                    int num2 = Integer.parseInt(number2);
                    int total = num1 + num2;
                    result.setText("result = " + total);
                }



            }
        });

        multiplyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(n1.getText().toString().isEmpty()) {
                    n1.setError("Please enter number to calculate the outcome!");
//                    Toast.makeText(getApplicationContext(), "Please enter number to calculate the outcome!", Toast.LENGTH_SHORT).show();
                } else if (n2.getText().toString().isEmpty()){
                    n2.setError("Please enter number to calculate the outcome!");
                } else {
                    String number1 = n1.getText().toString();
                    String number2 = n2.getText().toString();
                    int num1 = Integer.parseInt(number1);
                    int num2 = Integer.parseInt(number2);
                    int total = num1 * num2;
                    result.setText("result = " + total);
                }
            }
        });

        devideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(n1.getText().toString().isEmpty()) {
                    n1.setError("Please enter number to calculate the outcome!");
//                    Toast.makeText(getApplicationContext(), "Please enter number to calculate the outcome!", Toast.LENGTH_SHORT).show();
                } else if (n2.getText().toString().isEmpty()){
                    n2.setError("Please enter number to calculate the outcome!");
                } else {
                    String number1 = n1.getText().toString();
                    String number2 = n2.getText().toString();
                    float num1 = Float.parseFloat(number1);
                    float num2 = Float.parseFloat(number2);
                    float total = num1 / num2;
                    result.setText("result = " + String.format("%.2f", total) );
                }
            }
        });

        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(n1.getText().toString().isEmpty()) {
                    n1.setError("Please enter number to calculate the outcome!");
//                    Toast.makeText(getApplicationContext(), "Please enter number to calculate the outcome!", Toast.LENGTH_SHORT).show();
                } else if (n2.getText().toString().isEmpty()){
                    n2.setError("Please enter number to calculate the outcome!");
                } else {
                    String number1 = n1.getText().toString();
                    String number2 = n2.getText().toString();
                    int num1 = Integer.parseInt(number1);
                    int num2 = Integer.parseInt(number2);
                    int total = num1 - num2;
                    result.setText("result = " + total);
                }
            }
        });
    }
}
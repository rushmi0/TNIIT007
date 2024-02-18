package com.example.tniit007;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Week3 extends AppCompatActivity {

    //Step 1 Declare variable
    EditText toText, subText,msgText;
    Button sendBtn;
    TextView showText;
    Spinner spin1, spin2;

    CheckBox cb1, cb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week3);


        // Step 2
        toText = findViewById(R.id.ToText);
        subText = findViewById(R.id.SubjectText);
        msgText = findViewById(R.id.MsgText);
        sendBtn = findViewById(R.id.SendBtn);
        showText = findViewById(R.id.showText);
        spin1 = findViewById(R.id.spinner);
        spin2 = findViewById(R.id.spinner2);
        cb1 = findViewById(R.id.CB1);
        cb2 = findViewById(R.id.CB2);



        // Step 3 for cb1
        cb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Step 4
                String cb1Text = cb1.getText().toString();
                boolean checked = cb1.isChecked();
//                showText.setText(cb1Text + " is " + checked);
                if (cb1.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Congratualation! You are " + cb1Text + ".", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(getApplicationContext(), "You still gay tho.", Toast.LENGTH_SHORT).show();

                }
            }
        });

        cb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cb2Text = cb2.getText().toString();
                boolean checked = cb2.isChecked();
//                showText.setText(cb2Text + " is " + checked);
                if (cb2.isChecked()) {
                    Toast.makeText(getApplicationContext(), "You lying! You are definitely " + cb2Text + ".", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Glad you admit it! " + cb2Text + ".", Toast.LENGTH_SHORT).show();

                }
            }
        });

        // Step 3
        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Step 4
                String msg1 = toText.getText().toString();
                String msg2 = subText.getText().toString();
                String msg3 = msgText.getText().toString();
                String spinMsg = spin1.getSelectedItem().toString();
                String spinMsg2 = spin2.getSelectedItem().toString();


                showText.setText("Mr." + msg1
                        + ", Subject: " + msg2
                        + ", Grade: " + msg3
                        + " Team " + spinMsg
                        + "; Bro: " + spinMsg2);
            }
        });
    }


}
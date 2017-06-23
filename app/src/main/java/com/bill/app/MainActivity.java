package com.bill.app;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
    {
        Button LOGIN, CANCEL;
        EditText Username, Phone;
        TextView Attempt;
        int counter = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LOGIN = (Button) findViewById(R.id.loginbtn);
        CANCEL = (Button) findViewById(R.id.cancelbtn);
        Username = (EditText) findViewById(R.id.inputusername);
        Phone = (EditText) findViewById(R.id.inputphone);
        Attempt = (TextView) findViewById(R.id.numofattempts);
        Attempt.setVisibility(View.GONE);

        LOGIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Username.getText().toString().equals("bill") && Phone.getText().toString().equals("pass")) {
                    Toast.makeText(getApplicationContext(), "Redirecting...", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Incorrect Username and Phone", Toast.LENGTH_LONG).show();
                    Attempt.setVisibility(View.VISIBLE);
                    Attempt.setBackgroundColor(Color.RED);
                    counter--;
                    Attempt.setText(Integer.toString(counter));

                    if (counter == 0) {
                        LOGIN.setEnabled(false);
                    }
                }
            };
        });}}

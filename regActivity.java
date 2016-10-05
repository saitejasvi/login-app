package com.tejasvi7.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class regActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
    }

    public void submit(View view) {

        EditText username = (EditText) findViewById(R.id.uname1);
        EditText password = (EditText) findViewById(R.id.password1);
        EditText cPassword = (EditText) findViewById(R.id.cPassword);
        EditText email = (EditText) findViewById(R.id.email);
        EditText mNumber = (EditText) findViewById(R.id.mNumber);
        RadioButton male = (RadioButton) findViewById(R.id.radioButton);
        RadioButton female = (RadioButton) findViewById(R.id.radioButton2);

        if (!(cPassword.getText().toString().equals(password.getText().toString()))) {
            Toast.makeText(getApplicationContext(), "Passwords not matching", Toast.LENGTH_SHORT).show();

        } else if(!(male.isChecked()||female.isChecked())) {
            Toast.makeText(getApplicationContext(), "Enter gender", Toast.LENGTH_SHORT).show();
        }
         else if(mNumber.length()!=10){
            Toast.makeText(getApplicationContext(), "Enter 10 digits", Toast.LENGTH_SHORT).show();
        }
        else if(!(email.getText().toString().contains("@gmail.com"))){
            Toast.makeText(getApplicationContext(), "Email is invalid", Toast.LENGTH_SHORT).show();
        }
        else if(username.length()==0){
            Toast.makeText(getApplicationContext(), "Enter username", Toast.LENGTH_SHORT).show();
        }
        else {
            Intent activity2 = new Intent(regActivity.this, MainActivity.class);
            startActivity(activity2);

        }

    }
}

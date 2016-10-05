package com.tejasvi7.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void login(View view){

            EditText username = (EditText) findViewById(R.id.uname);
            EditText password = (EditText) findViewById(R.id.password);
            if (username.getText().toString().equals("tejasvi") && password.getText().toString().equals("tejasvi")) {
                Intent activity = new Intent(MainActivity.this, WelcomeActivity.class);
                startActivity(activity);
                Log.d("login", "login successful");

            }  else {
                Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();
            }
        }

        public void Register(View view) {


            Intent activity1 = new Intent(MainActivity.this, regActivity.class);
            startActivity(activity1);


        }



    }





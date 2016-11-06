package com.testapp.anantprsd5.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClicked(View v)
    {
        switch (v.getId()) {
            case R.id.button:
                Toast.makeText(MainActivity.this, "This launches Poplular movies", Toast.LENGTH_LONG).show();
                break;
            case R.id.button1:
                Toast.makeText(MainActivity.this, "This launches Stock Hawk", Toast.LENGTH_LONG).show();
                break;
            case R.id.button2:
                Toast.makeText(MainActivity.this, "This launches Build it bigger", Toast.LENGTH_LONG).show();
                break;
            case R.id.button3:
                Toast.makeText(MainActivity.this, "This launches Go ubiquitous", Toast.LENGTH_LONG).show();
                break;
            case R.id.button4:
                Toast.makeText(MainActivity.this, "This launches Make your app material", Toast.LENGTH_LONG).show();
                break;
            case R.id.button5:
                Toast.makeText(MainActivity.this, "This launches Capstone", Toast.LENGTH_LONG).show();
                break;

        }
    }

    public void MessageBox(String message)
    {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
package com.example.zerodegree;

import  androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void userEnter1 ( View v )
    {
        EditText enterTemp;
        String userInputString;
        double userInputDouble;
        double output;
        String outputString;

        enterTemp = (EditText) findViewById(R.id.enterTemp);
        userInputString = enterTemp.getText().toString();
        userInputDouble = Double.parseDouble(userInputString);
        output = (userInputDouble * 1.8)+32;
        outputString = Double.toString(output);

        Context context = getApplicationContext();
        CharSequence text = outputString;
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context , text , duration);
        toast.show();
    }

    public void userEnter2 ( View v )
    {

        EditText enterTemp;
        String userInputString;
        double userInputDouble;
        double output;
        String outputString;


        enterTemp = (EditText) findViewById(R.id.enterTemp);
        userInputString = enterTemp.getText().toString();
        userInputDouble = Double.parseDouble(userInputString);
        output = (userInputDouble - 32)/1.8;
        outputString = Double.toString(output);

        Context context = getApplicationContext();
        CharSequence text = outputString;
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context , text , duration);
        toast.show();
    }

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}

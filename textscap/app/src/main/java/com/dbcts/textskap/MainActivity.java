package com.dbcts.textskap;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

public void registrationScreen(View view){
        Intent nextScreen = new Intent(MainActivity.this,RegistrationScreen.class);
        startActivity(nextScreen);
}
    public void logInScreen(View view){
        Intent nextScreen = new Intent(MainActivity.this,LogInScreen.class);
        startActivity(nextScreen);
    }

}
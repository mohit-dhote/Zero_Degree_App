package com.dbcts.textskap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class FlashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash_screen);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                Intent nextScreen = new Intent(FlashScreen.this,MainActivity.class);
                startActivity(nextScreen);

                finish();


            }
        },1000);


    }
}
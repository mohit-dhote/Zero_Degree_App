package com.example.rockroll;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class FlashScreen extends AppCompatActivity {


    ImageView radioImageView;
    ImageView logoTextView;
    Animation flashScreenAnimation;

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
        },3000);


        radioImageView = findViewById(R.id.radioImage);
        logoTextView = findViewById(R.id.textLogo);

        flashScreenAnimation = AnimationUtils.loadAnimation(this,R.anim.flashscreenanim);


        radioImageView.setAnimation(flashScreenAnimation);

        logoTextView.setAnimation(flashScreenAnimation);

    }
}
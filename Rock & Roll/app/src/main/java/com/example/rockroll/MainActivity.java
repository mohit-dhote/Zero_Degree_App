package com.example.rockroll;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    MediaPlayer soundPlay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void soundPlayButton(View view){

        ImageView buttonsOnScreen = (ImageView) view;
        int tagValue = Integer.parseInt(buttonsOnScreen.getTag().toString());

        playSound(tagValue);

    }




    public void playSound(int tagValueInput){

        if(tagValueInput == 0){

            soundPlay = MediaPlayer.create(this,R.raw.cartton);


            soundPlay.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    soundPlay.start();
                }
            });

            soundPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    releaseAndStop();
                }
            });







          }else if(tagValueInput == 1){

            soundPlay = MediaPlayer.create(this,R.raw.disneymickey);


            soundPlay.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    soundPlay.start();
                }
            });

            soundPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    releaseAndStop();
                }
            });




        }else if(tagValueInput == 2){

            soundPlay = MediaPlayer.create(this,R.raw.manwhistle);


            soundPlay.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    soundPlay.start();
                }
            });

            soundPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                   releaseAndStop();
                }
            });



        }else if(tagValueInput ==3){

            soundPlay = MediaPlayer.create(this,R.raw.mustanghot);


            soundPlay.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    soundPlay.start();
                }
            });

            soundPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                releaseAndStop();
                }
            });




        } else if(tagValueInput == 4){

            soundPlay = MediaPlayer.create(this,R.raw.ohtoodles);


            soundPlay.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    soundPlay.start();
                }
            });

            soundPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    releaseAndStop();
                }
            });



        } else if (tagValueInput == 5){

            soundPlay = MediaPlayer.create(this,R.raw.popoye);


            soundPlay.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    soundPlay.start();
                }
            });

            soundPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    releaseAndStop();
                }
            });



                        } else if(tagValueInput ==6){

            soundPlay = MediaPlayer.create(this,R.raw.woody);


            soundPlay.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    soundPlay.start();
                }
            });

            soundPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                   releaseAndStop();
                }
            });




        } else if(tagValueInput ==7){

            soundPlay = MediaPlayer.create(this,R.raw.tintin);


            soundPlay.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    soundPlay.start();
                }
            });

            soundPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    releaseAndStop();
                }
            });





        } else if(tagValueInput == 8){

            soundPlay = MediaPlayer.create(this,R.raw.tomandjerry);


            soundPlay.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    soundPlay.start();
                }
            });

            soundPlay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    releaseAndStop();
                }
            });




        }


    }




@Override
protected void onStop() {

        releaseAndStop();

    super.onStop();
}


    public void releaseAndStop(){

        if(soundPlay != null){

            soundPlay.stop();
            soundPlay.release();


        }







    }



}
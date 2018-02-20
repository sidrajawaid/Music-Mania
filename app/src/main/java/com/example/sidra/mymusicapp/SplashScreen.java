package com.example.sidra.mymusicapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

import static java.lang.Thread.sleep;

public class SplashScreen extends AppCompatActivity {

    private int progressStatus = 0;
    private Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        final ProgressBar pb = (ProgressBar) findViewById(R.id.pb);
        Thread thread=new Thread(){
            public void run(){
                try{
                    sleep(3000);
                    Intent i=new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(i);
                    finish();
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                while (progressStatus<100)
                {
                    progressStatus+=1;
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            pb.setProgress(progressStatus);

                        }
                    });
                }
            }

        };

        thread.start();
    }
    }


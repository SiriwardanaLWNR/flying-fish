package com.example.theflyingfishgameapp;

import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity
{
    private FlyingFishView gameView;
    private final Handler handler = new Handler();
    private final static long Interval = 30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



            gameView = new FlyingFishView(this);
            setContentView(gameView);

            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run()
                {

                    handler.post(() -> gameView.invalidate());
                }
            },0,Interval);

    }
}
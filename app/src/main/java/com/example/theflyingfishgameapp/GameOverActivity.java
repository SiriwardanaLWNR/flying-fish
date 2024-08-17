package com.example.theflyingfishgameapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GameOverActivity extends AppCompatActivity {
    private Button StartGameAgain;

    private TextView DisplayScore;

    private String Score;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_game_over);


        Score = getIntent().getExtras().get("Score").toString();
        StartGameAgain = (Button) findViewById(R.id.play_again_btn);
        DisplayScore = (TextView) findViewById(R.id.displayScore);

        StartGameAgain.setOnClickListener(v -> {
            Intent mainIntent = new Intent(GameOverActivity.this,MainActivity.class);
            startActivity(mainIntent);
        });
        DisplayScore.setText("Score = "+Score);
    }
}
package com.example.scorekeeper;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int scoreblue = 0;
    int scorered = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addscoreblue(View A){
        scoreblue = scoreblue + 1;
        displayblue(scoreblue);
    }
    public void addscorered(View A){
        scorered = scorered + 1;
        displayred(scorered);
    }
    public void displayblue(int number){
        TextView score = findViewById(R.id.bluescore);
        score.setText("" + number);
    }
    public void displayred(int number){
        TextView score = findViewById(R.id.redscore);
        score.setText("" + number);
    }
    public void reset(View A){
        scoreblue = 0;
        scorered = 0;
        displayred(scorered);
        displayblue(scoreblue);
    }
}

package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Basket extends AppCompatActivity {
    TextView score;
    TextView score2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basket);
        score=(TextView)findViewById(R.id.score);
        score2=(TextView)findViewById(R.id.scoreb);
        Button btn1A=findViewById(R.id.score1);
        Button btn2A=findViewById(R.id.score2);
        Button btn3A=findViewById(R.id.score3);
        Button btn1B=findViewById(R.id.scoreb1);
        Button btn2B=findViewById(R.id.scoreb2);
        Button btn3B=findViewById(R.id.scoreb3);
        Button re=findViewById(R.id.reset);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreb);
        scoreView.setText(String.valueOf(score));
    }
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    public void threePointA(View v) {
        if (v.getId() == R.id.score3) {
            scoreTeamA = scoreTeamA + 3;
            displayForTeamA(scoreTeamA);
        }else{
            scoreTeamB = scoreTeamB + 3;
            displayForTeamB(scoreTeamB);
        }
    }
    public void twoPointA(View v) {
        if (v.getId() == R.id.score2) {
            scoreTeamA = scoreTeamA + 2;
            displayForTeamA(scoreTeamA);
        }else{
            scoreTeamB = scoreTeamB + 2;
            displayForTeamB(scoreTeamB);
        }
    }
    public void onePointA(View v) {
        if (v.getId() == R.id.score1) {
            scoreTeamA = scoreTeamA + 1;
            displayForTeamA(scoreTeamA);
        }else{
            scoreTeamB = scoreTeamB + 1;
            displayForTeamB(scoreTeamB);
        }
    }
    public void reset(View v) {
        scoreTeamA=0;
        scoreTeamB=0;
    }
}

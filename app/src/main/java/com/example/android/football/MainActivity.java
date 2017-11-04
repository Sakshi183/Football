package com.example.android.football;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulA = 0;
    int foulB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pointTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        String s = "Points: " + scoreTeamA;
        displayForTeamA(s);
    }

    public void foulTeamA(View w) {
        foulA = foulA + 1;
        String a = "Fouls: " +foulA;
        foulForTeamA(a);
    }
    public void foulTeamB(View w) {
        foulB = foulB + 1;
        String a = "Fouls: " +foulB;
        foulForTeamB(a);
    }

    public void pointTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        String s = "Points: " + scoreTeamB;
        displayForTeamB(s);
    }

    public void displayForTeamA(String i) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(i);
    }

    public void foulForTeamA(String i) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(i);
    }

    public void foulForTeamB(String i) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(i);
    }

    public void displayForTeamB(String i) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(i);
    }
    public void resetGame(View v)
    {
        scoreTeamA =0;
        scoreTeamB =0;
        foulA=0;
        foulB=0;
        String s = "Points: " + scoreTeamA;
        displayForTeamA(s);
        s = "Points: " + scoreTeamB;
        displayForTeamB(s);
        String a = "Fouls: " +foulA;
        foulForTeamA(a);
        a = "Fouls: " +foulB;
        foulForTeamB(a);

    }

}

package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }

    /*
     * Declare and Initialize Global Variables here
     */

    int scoreTeamA = 0;


    /**
     * Adds three points for team A
     */

    public void addThreeForTeamA(View v){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);

    }

    /**
     * Adds two points for team A
     */

    public void addTwoForTeamA(View v){
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);

    }

    /**
     * Adds 1 point (free throw) for team A
     */

    public void addFreeThrowForTeamA(View v){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);

    }




    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    /*
     * Declare and Initialize Global Variables here
     */

    int scoreTeamB = 0;

    /**
     * Adds three points for team B
     */

    public void addThreeForTeamB(View v){
        scoreTeamB = scoreTeamB + 3;
        displayForTeamA(scoreTeamB);

    }

    /**
     * Adds two points for team B
     */

    public void addTwoForTeamB(View v){
        scoreTeamB = scoreTeamB + 2;
        displayForTeamA(scoreTeamB);

    }

    /**
     * Adds 1 point (free throw) for team B
     */

    public void addFreeThrowForTeamB(View v){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamA(scoreTeamB);

    }


    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }





}
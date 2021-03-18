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
     * Adds three points
     */

    public void addThreeForTeamA(View v){
    displayForTeamA(3);

    }

    /**
     * Adds two points
     */

    public void addTwoForTeamA(View v){
        displayForTeamA(2);

    }

    /**
     * Adds 1 point (free throw)
     */

    public void addFreeThrowForTeamA(View v){
        displayForTeamA(1);

    }




    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }









}
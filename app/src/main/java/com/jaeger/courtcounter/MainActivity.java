package com.jaeger.courtcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int puntuacionTeamA = 0;
    int puntuacionTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void agregarUnoTeamA(View v) {
        puntuacionTeamA = puntuacionTeamA + 1;
        displayForTeamA(puntuacionTeamA);
    }


    public void agregarDosTeamA(View v) {
        puntuacionTeamA = puntuacionTeamA + 2;
        displayForTeamA(puntuacionTeamA);
    }


    public void agregarTresTeamA(View v) {
        puntuacionTeamA = puntuacionTeamA + 3;
        displayForTeamA(puntuacionTeamA);
    }


    public void agregarUnoTeamB(View v) {
        puntuacionTeamB = puntuacionTeamB + 1;
        displayForTeamB(puntuacionTeamB);
    }


    public void agregarDosTeamB(View v) {
        puntuacionTeamB = puntuacionTeamB + 2;
        displayForTeamB(puntuacionTeamB);
    }


    public void agregarTresTeamB(View v) {
        puntuacionTeamB = puntuacionTeamB + 3;
        displayForTeamB(puntuacionTeamB);
    }


    public void resetScore(View v) {
        puntuacionTeamA = 0;
        puntuacionTeamB = 0;
        displayForTeamA(puntuacionTeamA);
        displayForTeamB(puntuacionTeamB);
    }



}
package com.example.cyclemate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class study extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study);
    }
    public void main(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void game(View view) {
        Intent i = new Intent(this, game.class);
        startActivity(i);
    }
}
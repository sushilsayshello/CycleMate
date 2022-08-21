package com.example.cyclemate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class journey extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journey);
    }

    public void alert(View view) {
        Intent i = new Intent(this, alert.class);
        startActivity(i);
    }
    public void end(View view) {
        Intent i = new Intent(this, end.class);
        startActivity(i);
    }

}
package com.mmabas77.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    private final int SPLASH_DURATION=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* delay starting next activty */
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this,HomePage.class));
            }
            /*duration*/
        },SPLASH_DURATION);
    }
}
package com.example.homepage;

import android.os.Bundle;
import android.widget.Button;

import java.util.Random;

public class level1 extends basicsection {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level1);
        Random rand = new Random();
        //Button a= (Button) findViewById(R.id.lev1);

        // Generate random integers in range 0 to 999
        int a = rand.nextInt(1000);
        int b = rand.nextInt(1000);
        int c;
        c= a+b;



    }
}

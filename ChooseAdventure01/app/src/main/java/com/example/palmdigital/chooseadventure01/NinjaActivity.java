package com.example.palmdigital.chooseadventure01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NinjaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninja);

        TextView textView_story    = (TextView) findViewById(R.id.textView_story);
        textView_story.setText("Awesome dude!  You live out the rest of your " +
                "life fighting crimes and eating pizza!");
    }
}

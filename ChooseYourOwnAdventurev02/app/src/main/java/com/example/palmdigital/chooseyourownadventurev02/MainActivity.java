package com.example.palmdigital.chooseyourownadventurev02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    Button leftButton;
    Button rightButton;
    Button wakeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView_story    = (TextView) findViewById(R.id.textView_story);
        TextView textView_question = (TextView) findViewById(R.id.textView_question);

        textView_story.setText("One morning the Tortoise woke up in a dream.");
        textView_question.setText("Do you want to 'wake up' or 'explore' the dream?");

        leftButton = (Button) findViewById(R.id.button_left);
        rightButton = (Button) findViewById(R.id.button_right);


        leftButton.setText("Wake Up");
        rightButton.setText("Explore");

        leftButton.setOnClickListener(this);
        rightButton.setOnClickListener(this);

    }
    public void onClick(View view)
    {
        if(view.getId() == R.id.button_left)
        {
            setContentView(R.layout.activity_wakeup);
            TextView textView_story    = (TextView) findViewById(R.id.textView_story);

            textView_story.setText("You wake up and have a boring day");
            wakeButton = (Button) findViewById(R.id.button_wake);
            wakeButton.setText("Back");
            wakeButton.setOnClickListener(this);
        }
        if (view.getId() == R.id.button_wake)
        {
            setContentView(R.layout.activity_main);

            TextView textView_story    = (TextView) findViewById(R.id.textView_story);
            TextView textView_question = (TextView) findViewById(R.id.textView_question);

            textView_story.setText("One morning the Tortoise woke up in a dream.");
            textView_question.setText("Do you want to 'wake up' or 'explore' the dream?");

            leftButton = (Button) findViewById(R.id.button_left);
            rightButton = (Button) findViewById(R.id.button_right);

            leftButton.setText("Wake Up");
            rightButton.setText("Explore");

            leftButton.setOnClickListener(this);
            rightButton.setOnClickListener(this);
        }
        else if(view.getId() == R.id.button_right)
        {
            setContentView(R.layout.activity_explore);

            TextView textView_story    = (TextView) findViewById(R.id.textView_story);
            TextView textView_question = (TextView) findViewById(R.id.textView_question);

            textView_story.setText("As you walk into the backyard a net scoops you up " +
                    "and a giant takes you to a boiling pot of water.");
            textView_question.setText("As the man starts to prepare you as soup, " +
                    "do you...'Scream' or 'Faint'?");

            leftButton = (Button) findViewById(R.id.button_left);
            rightButton = (Button) findViewById(R.id.button_right);

            leftButton.setText("Backyard");
            rightButton.setText("Toilet");

            leftButton.setOnClickListener(this);
            rightButton.setOnClickListener(this);

        }

    }
}
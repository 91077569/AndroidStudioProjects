package org.palmdigital.madlibspizza;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void makeStory(View view) {

        EditText adjective01 = (EditText) findViewById(R.id.editText_adjective1);
        EditText nationality01 = (EditText) findViewById(R.id.editText_nationality1);
        EditText person01 = (EditText) findViewById(R.id.editText_person1);
        EditText noun01 = (EditText) findViewById(R.id.editText_noun1);
        EditText adjective02 = (EditText) findViewById(R.id.editText_adjective2);
        EditText noun02 = (EditText) findViewById(R.id.editText_noun2);
        EditText adjective03 = (EditText) findViewById(R.id.editText_adjective3);
        EditText adjective04 = (EditText) findViewById(R.id.editText_adjective4);
        EditText pluralnoun01 = (EditText) findViewById(R.id.editText_pluralnoun1);
        TextView tv_story = (TextView) findViewById(R.id.textView_story);

        String str_adjective = adjective01.getText().toString();
        String str_nationality = nationality01.getText().toString();
        String str_person = person01.getText().toString();
        String str_noun = noun01.getText().toString();
        String str_adjective2 = adjective02.getText().toString();
        String str_noun2 = noun02.getText().toString();
        String str_adjective3 = adjective03.getText().toString();
        String str_adjective4 = adjective04.getText().toString();
        String str_pluralnoun = pluralnoun01.getText().toString();


                String story = "Pizza was invented by a ";
                story = story + str_adjective + " " + str_nationality + " chef named " + str_person +
                        ". To make pizza, you need a big lump of " + str_noun + ", and make a thin," +
                        " round " + str_adjective2 + " " + str_noun2 + " then you cover it with " +
                        str_adjective3 + " sauce " + str_adjective4 + " cheese, and fresh chopped " +
                        str_pluralnoun;
                tv_story.setText(story);

        }
    }

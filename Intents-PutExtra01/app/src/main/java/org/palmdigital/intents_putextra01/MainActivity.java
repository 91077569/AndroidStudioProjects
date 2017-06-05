package org.palmdigital.intents_putextra01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void next01(View view)
    {
        EditText et_adj01 = (EditText) findViewById(R.id.editText_adjective1);
        EditText et_national01 = (EditText) findViewById(R.id.editText_national1);
        EditText et_name = (EditText) findViewById(R.id.editText_name1);
        EditText et_noun = (EditText) findViewById(R.id.editText_noun1);
        EditText et_adj2 = (EditText) findViewById(R.id.editText_adjective2);

        String str_adj01 = et_adj01.getText().toString();
        String str_national01 = et_national01.getText().toString();
        String str_name = et_name.getText().toString();
        String str_noun = et_noun.getText().toString();
        String str_adj2 = et_adj2.getText().toString();

        String story = "Pizza was invented by a " + str_adj01;
        story = story + " " + str_national01 + " chef named ";
        story = story + str_name + ".To make pizza, you need to take a lump of ";
        story = story + str_noun;
        story = story + ", and make a thin, round " + str_adj2;

        Intent i = new Intent(this, Main3Activity.class);
        i.putExtra("STORY_SO_FAR", story);

        startActivity(i);
    }
}

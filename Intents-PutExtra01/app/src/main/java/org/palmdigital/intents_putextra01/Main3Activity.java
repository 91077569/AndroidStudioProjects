package org.palmdigital.intents_putextra01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    String oldString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView tv_story = (TextView) findViewById(R.id.textView_story1);

        if(savedInstanceState == null)
        {
            Bundle extras = getIntent().getExtras();
            if (extras == null)
            {
                oldString = null;
            }
            else
            {
                oldString = extras.getString("STORY_SO_FAR");
            }
        }
        else
        {
            oldString = (String) savedInstanceState.getSerializable("STORY_SO_FAR");
        }

    }
    public void next02(View view)
    {
        EditText et_noun2 = (EditText) findViewById(R.id.editText_noun2);
        EditText et_adj3 = (EditText) findViewById(R.id.editText_adjective3);
        EditText et_adj4 = (EditText) findViewById(R.id.editText_adjective4);
        EditText et_plural = (EditText) findViewById(R.id.editText_pluralnoun);
        EditText et_noun3 = (EditText) findViewById(R.id.editText_noun3);

        String str_noun2 = et_noun2.getText().toString();
        String str_adj3 = et_adj3.getText().toString();
        String str_adj4 = et_adj4.getText().toString();
        String str_plural = et_plural.getText().toString();
        String str_noun3 = et_noun3.getText().toString();

       String story2 = " " + str_noun2;
        story2 = story2 + ".Then you cover it with "  + str_adj3;
        story2 = story2 + " sauce, " + str_adj4;
        story2 = story2 + " cheese, and fresh chopped ";
        story2 = story2 + str_plural;
        story2 = story2 + ".Next you have to bake it in a very hot ";
        story2 = story2 + str_noun3;
        story2 = story2 + ".When its done, cut it into";


        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("STORY_SO_FAR2", story2);
        i.putExtra("STORY_SO_FAR", oldString);

        startActivity(i);
    }
}

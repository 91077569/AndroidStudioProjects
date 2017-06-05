package org.palmdigital.madlibspuppy;

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
    public void makeStory(View view)
    {
        EditText color01 = (EditText) findViewById(R.id.editText_color1);
        EditText bodypart01 = (EditText) findViewById(R.id.editText_bodypart1);
        EditText nouns01 = (EditText) findViewById(R.id.editText_nouns1);
        EditText verb01 = (EditText) findViewById(R.id.editText_verb1);
        EditText adjective01 = (EditText) findViewById(R.id.editText_adjective1);
        EditText adjective02 = (EditText) findViewById(R.id.editText_adjective2);
        EditText verbs01 = (EditText) findViewById(R.id.editText_verbs1);
        TextView tv_story = (TextView) findViewById(R.id.textView_story);
        EditText noun01 = (EditText) findViewById(R.id.editText_noun1);

        String story = "Today I saw him again. When he looks at me with those ";
        String str_color01 = color01.getText().toString();
        String str_body01 = bodypart01.getText().toString();
        String str_nouns01 = nouns01.getText().toString();
        String str_verb01 = verb01.getText().toString();
        String str_adjective = adjective01.getText().toString();
        String str_adjective2 = adjective02.getText().toString();
        String str_verbs01 = verbs01.getText().toString();
        String str_noun01 = noun01.getText().toString();

        story = story + str_color01 + " eyes, it makes my " + str_body01 + " go pitterpat, and " +
                "feel as if I have " + str_nouns01 + " in my stomach. When he scrunches his nose" +
                ", I want to " + str_verb01 + " him softly. He is so " + str_adjective + " and " +
                str_adjective2 + ". Tomorrow he will be mine. For now he " + str_verbs01 + " in " +
                "the store " + str_noun01 + " looking at me.";

        tv_story.setText(story);

    }
}

package org.palmdigital.intents_putextra01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity
{
    String newString;
    String oldString;
    int number;
    int number2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        if(savedInstanceState == null)
        {
            Bundle extras = getIntent().getExtras();
            if (extras == null)
            {
                newString = null;
            }
            else
            {
                newString = extras.getString("STORY_SO_FAR");
            }
        }
        else
        {
            newString = (String) savedInstanceState.getSerializable("STORY_SO_FAR");
        }

        if(savedInstanceState == null)
        {
            Bundle extras = getIntent().getExtras();
            if (extras == null)
            {
                oldString = null;
            }
            else
            {
                oldString = extras.getString("STORY_SO_FAR2");
            }
        }
        else
        {
            oldString = (String) savedInstanceState.getSerializable("STORY_SO_FAR2");
        }
    }
    public void finishStory(View view)
    {

        EditText et_number = (EditText) findViewById(R.id.editText_number);
        EditText et_shape = (EditText) findViewById(R.id.editText_shape);
        EditText et_food = (EditText) findViewById(R.id.editText_food);
        EditText et_food2 = (EditText) findViewById(R.id.editText_food2);
        EditText et_number2 = (EditText) findViewById(R.id.editText_number2);

        String str_number = et_number.getText().toString();
        String str_shape = et_shape.getText().toString();
        String str_food = et_food.getText().toString();
        String str_food2 = et_food2.getText().toString();
        String str_number2 = et_number2.getText().toString();

        number = Integer.parseInt(str_number);
        number2 = Integer.parseInt(str_number2);

        String story3 = " " + str_number;
        story3 = story3 + " " + str_shape;
        story3 = story3 + ".Some kids like ";
        story3 = story3 + str_food;
        story3 = story3 + " pizza the best, but my favorite is the ";
        story3 = story3 + str_food2;
        story3 = story3 + " pizza.If I could, I will eat pizza ";
        story3 = story3 + str_number2;
        story3 = story3 + " times a day!";

        TextView tv_story = (TextView) findViewById(R.id.textView_story);
        String endStory = newString + oldString + story3;
        tv_story.setText(endStory);
    }
}

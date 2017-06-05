package org.palmdigital.hilow01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int randomNum;
    int tries = 3;
    int attempts = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        randomNum = 1 + (int) (Math.random() * 10);
        TextView test = (TextView) findViewById(R.id.textView2);
        String correct = Integer.toString(randomNum);
        test.setText(correct);
    }
    public void check(View view) {
        TextView display = (TextView) findViewById(R.id.textView_display);
        EditText number = (EditText) findViewById(R.id.editText_number);
        String input_str = number.getText().toString();
        int input_num = Integer.parseInt(input_str);

        if (tries != attempts){
            attempts++;
            if (randomNum == input_num) {
                display.setText("You won!");
            }
            if (randomNum < input_num) {
                display.setText("You are too high");
            }
            if (randomNum > input_num) {
                display.setText("You are too low");
            }
        }
        if(tries == attempts){
            display.setText("You Lost");
        }
    }
}
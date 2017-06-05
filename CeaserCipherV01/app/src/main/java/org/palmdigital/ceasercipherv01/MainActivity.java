package org.palmdigital.ceasercipherv01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    static int shift1;

    TextView input;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void encrypt1(View view)
    {
        EditText message_input = (EditText) findViewById(R.id.editText_message);
        TextView display = (TextView) findViewById(R.id.textView2);
        EditText shift_et = (EditText) findViewById(R.id.editText_shift);


        String shift_str = shift_et.getText().toString();
        input = message_input;
        String input_str = input.getText().toString();


        if(shift_str.isEmpty() || input_str.isEmpty())
        {
            shift1 = 0;
            display.setText(input_str);

        }
        else
        {
            shift1 = Integer.parseInt(shift_str);
            String result = encrypt(input_str);
            display.setText(result);

        }

    }
    public void decrypt1(View view)
    {
        EditText message_input = (EditText) findViewById(R.id.editText_message);
        TextView display = (TextView) findViewById(R.id.textView2);
        EditText shift_et = (EditText) findViewById(R.id.editText_shift);


        String shift_str = shift_et.getText().toString();
        input = message_input;
        String input_str = input.getText().toString();


        if(shift_str.isEmpty() || input_str.isEmpty())
        {
            shift1 = 0;
            display.setText(input_str);

        }
        else
        {
            shift1 = Integer.parseInt(shift_str);
            String result = decrypt(input_str);
            display.setText(result);

        }
    }
    public void reset(View view)
    {
        EditText message_input = (EditText) findViewById(R.id.editText_message);
        TextView display = (TextView) findViewById(R.id.textView2);
        EditText shift_et = (EditText) findViewById(R.id.editText_shift);

        shift_et.setText(" ");

        display.setText(" ");
        message_input.setText(" ");

    }
    public static String encrypt(String input)
    {
        int size = 26;
        char[] alphabet = new char[size];
        alphabet[0] = 'A';
        alphabet[1] = 'B';
        alphabet[2] = 'C';
        alphabet[3] = 'D';
        alphabet[4] = 'E';
        alphabet[5] = 'F';
        alphabet[6] = 'G';
        alphabet[7] = 'H';
        alphabet[8] = 'I';
        alphabet[9] = 'J';
        alphabet[10] = 'K';
        alphabet[11] = 'L';
        alphabet[12] = 'M';
        alphabet[13] = 'N';
        alphabet[14] = 'O';
        alphabet[15] = 'P';
        alphabet[16] = 'Q';
        alphabet[17] = 'R';
        alphabet[18] = 'S';
        alphabet[19] = 'T';
        alphabet[20] = 'U';
        alphabet[21] = 'V';
        alphabet[22] = 'W';
        alphabet[23] = 'X';
        alphabet[24] = 'Y';
        alphabet[25] = 'Z';
        int shift = shift1;
        int shiftCharIndex;
        int fixedCharIndex;
        String output = "";
        String toUpperCase = input.toUpperCase();
        for (int i = 0; i < input.length(); i++)
        {
            for (int j = 0; j < alphabet.length; j++)
            {
                if (toUpperCase.charAt(i) == alphabet[j])
                {
                    shiftCharIndex = j + shift;
                    fixedCharIndex = shiftCharIndex % 26; // now this can only be  0 through 25
                    output = output + alphabet[fixedCharIndex];
                } // end of if statement
            } // end of inner loop
            if (input.charAt(i) == ' ')
            {
                output += " ";
            }
        } // end of outer for loop
        return output;
    }
    public static String decrypt(String input)
    {
        int size = 26;
        char[] alphabet = new char[size];
        alphabet[0] = 'A';
        alphabet[1] = 'B';
        alphabet[2] = 'C';
        alphabet[3] = 'D';
        alphabet[4] = 'E';
        alphabet[5] = 'F';
        alphabet[6] = 'G';
        alphabet[7] = 'H';
        alphabet[8] = 'I';
        alphabet[9] = 'J';
        alphabet[10] = 'K';
        alphabet[11] = 'L';
        alphabet[12] = 'M';
        alphabet[13] = 'N';
        alphabet[14] = 'O';
        alphabet[15] = 'P';
        alphabet[16] = 'Q';
        alphabet[17] = 'R';
        alphabet[18] = 'S';
        alphabet[19] = 'T';
        alphabet[20] = 'U';
        alphabet[21] = 'V';
        alphabet[22] = 'W';
        alphabet[23] = 'X';
        alphabet[24] = 'Y';
        alphabet[25] = 'Z';
        int shift = shift1;
        int shiftCharIndex;
        int fixedCharIndex;
        String output = "";
        String toUpperCase = input.toUpperCase();
        for (int i = 0; i < input.length(); i++)
        {
            for (int j = 0; j < alphabet.length; j++)
            {
                if (toUpperCase.charAt(i) == alphabet[j])
                {
                    shiftCharIndex = j - shift;
                    fixedCharIndex = shiftCharIndex % -26; // now this can only be  0 through 25
                    output = output + alphabet[fixedCharIndex];
                } // end of if statement
            } // end of inner loop
            if (input.charAt(i) == ' ')
            {
                output += " ";
            }
        } // end of outer for loop
        return output;
    }
}

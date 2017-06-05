package com.example.palmdigital.simplecalculatorv04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    TextView textViewTop;
    TextView textViewMiddle;
    TextView textViewDisplayBottom;
    ImageView addition;
    ImageView subtraction;
    ImageView division;
    ImageView multiplication;
    ImageView equals;
    ImageView clear;
    double sum;
    double num1;
    double num2;
    String error;
    int operator;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewTop = (TextView) findViewById(R.id.textView);
        textViewMiddle = (TextView) findViewById(R.id.textView2);
        textViewDisplayBottom = (TextView) findViewById(R.id.textView3);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
        ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);
        ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
        ImageView imageView6 = (ImageView) findViewById(R.id.imageView6);
        ImageView imageView7 = (ImageView) findViewById(R.id.imageView7);
        ImageView imageView8 = (ImageView) findViewById(R.id.imageView8);
        ImageView imageView9 = (ImageView) findViewById(R.id.imageView9);

        addition = (ImageView) findViewById(R.id.imageView10);
        subtraction = (ImageView) findViewById(R.id.imageView11);
        division = (ImageView) findViewById(R.id.imageView23);
        multiplication = (ImageView) findViewById(R.id.imageView24);
        equals = (ImageView) findViewById(R.id.imageView22);
        clear = (ImageView) findViewById(R.id.imageView25);

        ImageView imageView12 = (ImageView) findViewById(R.id.imageView12);
        ImageView imageView13 = (ImageView) findViewById(R.id.imageView13);
        ImageView imageView14 = (ImageView) findViewById(R.id.imageView14);
        ImageView imageView15 = (ImageView) findViewById(R.id.imageView15);
        ImageView imageView16 = (ImageView) findViewById(R.id.imageView16);
        ImageView imageView17 = (ImageView) findViewById(R.id.imageView17);
        ImageView imageView18 = (ImageView) findViewById(R.id.imageView18);
        ImageView imageView19 = (ImageView) findViewById(R.id.imageView19);
        ImageView imageView20 = (ImageView) findViewById(R.id.imageView20);
        ImageView imageView21 = (ImageView) findViewById(R.id.imageView21);

        imageView.setOnClickListener(this);
        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);
        imageView5.setOnClickListener(this);
        imageView6.setOnClickListener(this);
        imageView7.setOnClickListener(this);
        imageView8.setOnClickListener(this);
        imageView9.setOnClickListener(this);

        addition.setOnClickListener(this);
        subtraction.setOnClickListener(this);
        equals.setOnClickListener(this);
        division.setOnClickListener(this);
        multiplication.setOnClickListener(this);
        clear.setOnClickListener(this);

        imageView12.setOnClickListener(this);
        imageView13.setOnClickListener(this);
        imageView14.setOnClickListener(this);
        imageView15.setOnClickListener(this);
        imageView16.setOnClickListener(this);
        imageView17.setOnClickListener(this);
        imageView18.setOnClickListener(this);
        imageView19.setOnClickListener(this);
        imageView20.setOnClickListener(this);
        imageView21.setOnClickListener(this);

    }
    public void onClick(View view)
    {
        if (view.getId() == R.id.imageView)
        {
            String str = textViewTop.getText().toString();
            if(str != "" )
            {
                num1 = Integer.parseInt(str);
                num1 = 0;
                str = str + "0";
                textViewTop.setText(str);
            }
        }
        else if (view.getId() == R.id.imageView1)
        {
            String str = textViewTop.getText().toString();
            str = str + "1";
            textViewTop.setText(str);
            num1 = 1;
            num1 = Integer.parseInt(str);
        }
        else if (view.getId() == R.id.imageView2)
        {
             String str = textViewTop.getText().toString();
            str = str + "2";
            textViewTop.setText(str);
            num1 = 2;
            num1 = Integer.parseInt(str);
        }
        else if (view.getId() == R.id.imageView3)
        {
            String str = textViewTop.getText().toString();
            str = str + "3";
            textViewTop.setText(str);
            num1 = 3;
            num1 = Integer.parseInt(str);
        }
        else if (view.getId() == R.id.imageView4)
        {
            String str = textViewTop.getText().toString();
            str = str + "4";
            textViewTop.setText(str);
            num1 = 4;
            num1 = Integer.parseInt(str);
        }
        else if (view.getId() == R.id.imageView5)
        {
            String str = textViewTop.getText().toString();
            str = str + "5";
            textViewTop.setText(str);
            num1 = 5;
            num1 = Integer.parseInt(str);
        }
        else if (view.getId() == R.id.imageView6)
        {
            String str = textViewTop.getText().toString();
            str = str + "6";
            textViewTop.setText(str);
            num1 = 6;
            num1 = Integer.parseInt(str);
        }
        else if (view.getId() == R.id.imageView7)
        {
            String str = textViewTop.getText().toString();
            str = str + "7";
            textViewTop.setText(str);
            num1 = 7;
            num1 = Integer.parseInt(str);
        }
        else if (view.getId() == R.id.imageView8)
        {
            String str = textViewTop.getText().toString();
            str = str + "8";
            textViewTop.setText(str);
            num1 = 8;
            num1 = Integer.parseInt(str);
        }
        else if (view.getId() == R.id.imageView9)
        {
            String str = textViewTop.getText().toString();
            str = str + "9";
            textViewTop.setText(str);
            num1 = 9;
            num1 = Integer.parseInt(str);
        }


        else if (view.getId() == R.id.imageView12)
        {
            String str = textViewMiddle.getText().toString();
            if(str != "")
            {
                str = str + "0";
                textViewMiddle.setText(str);
                num2 = 0;
                num2 = Integer.parseInt(str);
            }
        }
        else if (view.getId() == R.id.imageView13)
        {
            String str = textViewMiddle.getText().toString();
            str = str + "1";
            textViewMiddle.setText(str);
            num2 = 1;
            num2 = Integer.parseInt(str);
        }
        else if (view.getId() == R.id.imageView14)
        {
            String str = textViewMiddle.getText().toString();
            str = str + "2";
            textViewMiddle.setText(str);
            num2 = 2;
            num2 = Integer.parseInt(str);
        }
        else if (view.getId() == R.id.imageView15)
        {
            String str = textViewMiddle.getText().toString();
            str = str + "3";
            textViewMiddle.setText(str);
            num2 = 3;
            num2 = Integer.parseInt(str);
        }
        else if (view.getId() == R.id.imageView16)
        {
            String str = textViewMiddle.getText().toString();
            str = str + "4";
            textViewMiddle.setText(str);
            num2 = 4;
            num2 = Integer.parseInt(str);
        }
        else if (view.getId() == R.id.imageView17)
        {
            String str = textViewMiddle.getText().toString();
            str = str + "5";
            textViewMiddle.setText(str);
            num2 = 5;
            num2 = Integer.parseInt(str);
        }
        else if (view.getId() == R.id.imageView18)
        {
            String str = textViewMiddle.getText().toString();
            str = str + "6";
            textViewMiddle.setText(str);
            num2 = 6;
            num2 = Integer.parseInt(str);
        }
        else if (view.getId() == R.id.imageView19)
        {
            String str = textViewMiddle.getText().toString();
            str = str + "7";
            textViewMiddle.setText(str);
            num2 = 7;
            num2 = Integer.parseInt(str);
        }
        else if (view.getId() == R.id.imageView20)
        {
            String str = textViewMiddle.getText().toString();
            str = str + "8";
            textViewMiddle.setText(str);
            num2 = 8;
            num2 = Integer.parseInt(str);
        }
        else if (view.getId() == R.id.imageView21)
        {
            String str = textViewMiddle.getText().toString();
            str = str + "9";
            textViewMiddle.setText(str);
            num2 = Integer.parseInt(str);
        }
        else if (view.getId() == R.id.imageView10)
        {
            operator = 1;
            addition.setBackgroundColor(0xffff00ff);
            subtraction.setBackgroundColor(0);
            division.setBackgroundColor(0);
            multiplication.setBackgroundColor(0);
        }
        else if (view.getId() == R.id.imageView11)
        {
            operator = 2;
            subtraction.setBackgroundColor(0xffff00ff);
            addition.setBackgroundColor(0);
            division.setBackgroundColor(0);
            multiplication.setBackgroundColor(0);
        }
        else if (view.getId() == R.id.imageView23)
        {
            operator = 4;
            division.setBackgroundColor(0xffff00ff);
            addition.setBackgroundColor(0);
            multiplication.setBackgroundColor(0);
            subtraction.setBackgroundColor(0);

        }
        else if (view.getId() == R.id.imageView24)
        {
            operator = 3;
            multiplication.setBackgroundColor(0xffff00ff);
            addition.setBackgroundColor(0);
            division.setBackgroundColor(0);
            subtraction.setBackgroundColor(0);

        }
        else if (view.getId() == R.id.imageView25)
        {
            textViewTop.setText("");
            textViewMiddle.setText("");
            textViewDisplayBottom.setText("");
            num1 = 0;
            num2 = 0;
            addition.setBackgroundColor(0);
            division.setBackgroundColor(0);
            subtraction.setBackgroundColor(0);
            multiplication.setBackgroundColor(0);
        }
        else if(view.getId() == R.id.imageView22)
        {
            if(operator == 4)
            {
                sum = (num1 / num2);
                division.setBackgroundColor(0xffff00ff);
                addition.setBackgroundColor(0);
                multiplication.setBackgroundColor(0);
                subtraction.setBackgroundColor(0);
                if(num2 == 0)
                {
                    error = "Error";
                    textViewDisplayBottom.setText(error);
                }
                if(num2 != 0)
                {
                    textViewDisplayBottom.setText("" + sum);
                }
            }
            else if(operator == 3)
            {
                sum = num1 * num2;
                textViewDisplayBottom.setText("" + sum);
            }
            else if(operator == 2)
            {
                sum = num1 - num2;
                textViewDisplayBottom.setText("" + sum);
            }
            else if(operator == 1)
            {
                sum = num1 + num2;
                textViewDisplayBottom.setText("" + sum);
            }

        }
    }
}

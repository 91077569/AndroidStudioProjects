package com.example.palmdigital.simplecalculatorv02;

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
    int sum;
    int num1;
    int num2;
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
        ImageView imageView22 = (ImageView) findViewById(R.id.imageView22);

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
        imageView22.setOnClickListener(this);

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
            textViewTop.setText("0");
            num1 = 0;
        }
       else if (view.getId() == R.id.imageView1)
        {
            textViewTop.setText("1");
            num1 = 1;
        }
       else if (view.getId() == R.id.imageView2)
        {
            textViewTop.setText("2");
            num1 = 2;
        }
       else if (view.getId() == R.id.imageView3)
        {
            textViewTop.setText("3");
            num1 = 3;
        }
       else if (view.getId() == R.id.imageView4)
        {
            textViewTop.setText("4");
            num1 = 4;
        }
       else if (view.getId() == R.id.imageView5)
        {
            textViewTop.setText("5");
            num1 = 5;
        }
       else if (view.getId() == R.id.imageView6)
        {
            textViewTop.setText("6");
            num1 = 6;
        }
        else if (view.getId() == R.id.imageView7)
        {
            textViewTop.setText("7");
            num1 = 7;
        }
        else if (view.getId() == R.id.imageView8)
        {
            textViewTop.setText("8");
            num1 = 8;
        }
       else if (view.getId() == R.id.imageView9)
        {
            textViewTop.setText("9");
            num1 = 9;
        }


        else if (view.getId() == R.id.imageView12)
        {
            textViewMiddle.setText("0");
            num2 = 0;
        }
       else if (view.getId() == R.id.imageView13)
        {
            textViewMiddle.setText("1");
            num2 = 1;
        }
       else if (view.getId() == R.id.imageView14)
        {
            textViewMiddle.setText("2");
            num2 = 2;
        }
       else if (view.getId() == R.id.imageView15)
        {
            textViewMiddle.setText("3");
            num2 = 3;
        }
       else if (view.getId() == R.id.imageView16)
        {
            textViewMiddle.setText("4");
            num2 = 4;
        }
        else if (view.getId() == R.id.imageView17)
        {
            textViewMiddle.setText("5");
            num2 = 5;
        }
        else if (view.getId() == R.id.imageView18)
        {
            textViewMiddle.setText("6");
            num2 = 6;
        }
        else if (view.getId() == R.id.imageView19)
        {
            textViewMiddle.setText("7");
            num2 = 7;
        }
        else if (view.getId() == R.id.imageView20)
        {
            textViewMiddle.setText("8");
            num2 = 8;
        }
       else if (view.getId() == R.id.imageView21)
        {
            textViewMiddle.setText("9");
            num2 = 9;
        }
        else if (view.getId() == R.id.imageView10)
        {
            colorSwitchSubtract();
            sum = num1 + num2;
        }
        else if (view.getId() == R.id.imageView11)
        {
            colorSwitchAdd();
            sum = num1 - num2;
        }
        else if(view.getId() == R.id.imageView22)
        {
            textViewDisplayBottom.setText("" + sum);
        }
    }
    public void colorSwitchAdd()
    {
        addition.setBackgroundColor(0);
        subtraction.setBackgroundColor(0xffff00ff);
    }
    public void colorSwitchSubtract()
    {
        addition.setBackgroundColor(0xffff00ff);
        subtraction.setBackgroundColor(0);
    }
}

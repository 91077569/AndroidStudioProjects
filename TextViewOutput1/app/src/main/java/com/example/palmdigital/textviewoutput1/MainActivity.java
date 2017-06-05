package com.example.palmdigital.textviewoutput1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    int num1;
    int num2;
    TextView textViewDisplayTop;
    TextView textViewDisplayMiddle;
    TextView textViewDisplayBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView1 = (ImageView) findViewById(R.id.imageView);
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
        ImageView imageView10 = (ImageView) findViewById(R.id.imageView10);
        ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
        ImageView imageView6 = (ImageView) findViewById(R.id.imageView6);
        ImageView imageView7 = (ImageView) findViewById(R.id.imageView7);

        textViewDisplayTop = (TextView) findViewById(R.id.textView);
        textViewDisplayMiddle = (TextView) findViewById(R.id.textView2);
        textViewDisplayBottom = (TextView) findViewById(R.id.textView3);

        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView5.setOnClickListener(this);
        imageView6.setOnClickListener(this);
        imageView7.setOnClickListener(this);
        imageView10.setOnClickListener(this);
    }
    public void onClick(View view)
    {
        if (view.getId() == R.id.imageView)
        {
            textViewDisplayTop.setText("1");
            num1 = 1;
        }
       else if (view.getId() == R.id.imageView2)
        {
            textViewDisplayTop.setText("2");
            num1 = 2;
        }
       else if (view.getId() == R.id.imageView3)
        {
            textViewDisplayTop.setText("3");
            num1 = 3;
        }
        else if (view.getId() == R.id.imageView5)
        {
            textViewDisplayMiddle.setText("4");
            num2 = 4;
        }
        else if (view.getId() == R.id.imageView6)
        {
            textViewDisplayMiddle.setText("5");
            num2 = 5;
        }
        else if (view.getId() == R.id.imageView7)
        {
            textViewDisplayMiddle.setText("6");
            num2 = 6;
        }
        else if (view.getId() == R.id.imageView10)
        {
            int sum = num1 + num2;
            textViewDisplayBottom.setText("" + sum);

        }

    }
}

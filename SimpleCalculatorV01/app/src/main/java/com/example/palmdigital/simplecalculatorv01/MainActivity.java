package com.example.palmdigital.simplecalculatorv01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    ImageView imageView_1;
    ImageView imageView_2;
    ImageView imageView_3;

    TextView textViewTop;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView_1 = (ImageView) findViewById(R.id.imageView1);
        imageView_2 = (ImageView) findViewById(R.id.imageView2);
        imageView_3 = (ImageView) findViewById(R.id.imageView3);

        imageView_1.setOnClickListener(this);
        imageView_2.setOnClickListener(this);
        imageView_3.setOnClickListener(this);

        textViewTop = (TextView) findViewById(R.id.textViewTop);
    }
    public void onClick(View view)
    {
        if (view.getId() == R.id.imageView1)
        {
            textViewTop.setText("1");
        }
        else if(view.getId() == R.id.imageView2)
        {
            textViewTop.setText("2");
        }
        else if(view.getId() == R.id.imageView3)
        {
            textViewTop.setText("3");
        }
    }
}

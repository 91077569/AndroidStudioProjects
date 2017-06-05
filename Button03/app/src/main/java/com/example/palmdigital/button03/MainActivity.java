package com.example.palmdigital.button03;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonObject01 = (Button) findViewById(R.id.buttonMyButton01);
        buttonObject01.setText("The Blue Pill");
        Button buttonObject02 = (Button) findViewById(R.id.buttonMyButton02);
        buttonObject02.setText("The Red Pill");

        buttonObject01.setOnClickListener(this);
        buttonObject02.setOnClickListener(this);

        buttonObject01.setBackgroundColor(Color.rgb(50,50,255));
        buttonObject02.setBackgroundColor(Color.rgb(255,50,50));
    }

    public void onClick(View view)
    {
        if (view.getId() == R.id.buttonMyButton01)
        {
            Toast.makeText(this, "You took The Blue Pill", Toast.LENGTH_SHORT).show();
            Log.i("info", "You took the Blue Pill");
        }
        if (view.getId() == R.id.buttonMyButton02)
        {
            Toast.makeText(this, "You took The Red Pill", Toast.LENGTH_SHORT).show();
            Log.i("info", "You took the Red Pill");
        }
    }
}

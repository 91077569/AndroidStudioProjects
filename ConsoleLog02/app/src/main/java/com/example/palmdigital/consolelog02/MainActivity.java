package com.example.palmdigital.consolelog02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity
{
    // fields - class level variables
    private int myInt;
    private double myDouble;
    private String myString;
    private boolean myBoolean;
    private float myFloat;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myInt = setIntValue();
        Log.i("info", "myInt = " + myInt);

        double myDouble = setDoubleValue();
        Log.i("info", "myDouble = " + myDouble);

        myBoolean = setBooleanValue();
        Log.i("info", "myBoolean = " + myBoolean);

        myFloat = setFloatValue();
        Log.i("info", "myFloat = " + myFloat);
    }

    public double setDoubleValue()
    {
        return 10.987;
    }

    public float setFloatValue()
    {
        return 4.5f + 2.3f;
    }

    public int setIntValue()
    {
        return 10;
    }

    public boolean setBooleanValue()
    {
        return true;
    }
}

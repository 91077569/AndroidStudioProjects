package com.example.palmdigital.imagebutton01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton buttonObject1 = (ImageButton) findViewById(R.id.imageButton1);
        buttonObject1.setOnClickListener(this);
    }
    public void onClick(View view)
    {
        if(view.getId() == R.id.imageButton1)
        {
            
        }

    }
}

package org.palmdigital.buttonclicks_v01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button button = (Button) findViewById(R.id.button);
    }

    public void getName(View PurpleGiraffe)
    {
        Toast.makeText(this, "This button works", Toast.LENGTH_LONG).show();

    }
    public void PurpleGiraffe(View PinkGiraffe)
    {
            Toast.makeText(this, "This button has a giraffe", Toast.LENGTH_LONG).show();

    }
    public void PinkGiraffe(View BlueGiraffe)
    {
        Toast.makeText(this, "This button has 2 giraffes", Toast.LENGTH_LONG).show();

    }
}

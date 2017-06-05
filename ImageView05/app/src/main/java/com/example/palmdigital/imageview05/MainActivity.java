package com.example.palmdigital.imageview05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView1.setOnClickListener(this);

        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView2.setOnClickListener(this);

        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView3.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        if(view.getId() == R.id.imageView1)
        {
            Toast.makeText(this, "You pressed Contacts", Toast.LENGTH_SHORT).show();
        }

        if(view.getId() == R.id.imageView2)
        {
            Toast.makeText(this, "You pressed Messages", Toast.LENGTH_SHORT).show();
        }

        if(view.getId() == R.id.imageView3)
        {
            Toast.makeText(this, "You pressed Email", Toast.LENGTH_SHORT).show();
        }
    }
}

package com.example.palmdigital.toastpractice02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "My name is Kevin!",
                Toast.LENGTH_LONG).show();
        Toast.makeText(MainActivity.this, "My favorite animal is a Giraffe",
                Toast.LENGTH_LONG).show();
    }
}

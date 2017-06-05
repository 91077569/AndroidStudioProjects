package com.example.palmdigital.scope01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

//outside mainactivity and
// any methods

//understanding how scope works is very important

public class MainActivity extends AppCompatActivity
{
    //inside mainactivity but no method

    //field class wide scope any code can seeeee and use variables up here
    String myString;
    double enemyHealth;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inside oncreate which is inside
        //main activity

        //when we declare of define a variable we use this format
        // dataType varibleName    this is method declaration
        int myInt;// this is declaring a variable of datatype int and named myint
        double myDouble; //this is declaring a variable of dataType double name myDouble
        TextView textView_story; //this is declaring a variable of datatype textview named
                                   // textview_story
        ImageView imageView_ex; // this is declaring imageview variable nname is imageview_ex

        // assigning a value to a declared variable
        // after we declare a variable we can assign a value to it
        // variablename = someValueOfTheSameDataTypeHastTheVariable;
        //some examples:
        myInt = 10; // setting the value of myInt to an int,myInt has dataType int & 10 is an int
        myDouble = 20.12; // mydouble gets 20.12
        textView_story = (TextView) findViewById(R.id.textView_st); // set value of textviewstory
                                                                    // to the id element
                                                                    //R.id.textview_st
        imageView_ex = (ImageView) findViewById(R.id.androidDude);

        //you can declare and sign in the same step
        // datatype variablename = someValueOfTheSameDataTypeHastTheVariable;
        //some examples;
        int myInt2 = 25; // this is declaration and assignment
        myInt2 = 50; //  this is assignment
        //the difference is the dataType name int
        myString = "this is a string"; // declaration and assignment
        myString = "this is anotherr strihng";//this ius just an assingmnet

        // wherever you declare a variable determines that variables scope
        // if i declare a varibale on oncreate only code in oncreate method can see it
        // nothing outside of oncreat can see this lest prove oit
        enemyHealth = 1.6;



    }//end of oncreate

    public void myawesomeMethod01()
    {
        myString = ("Que paso???");
        enemyHealth = 1.2;
    }//end of awesomemethod
    public void myawesomeMethod02()
    {
        enemyHealth = 9999999.9;
    }//end of awesomemethod2

}// end of class

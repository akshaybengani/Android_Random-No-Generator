package com.akshaybengani.randomnumbergenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.*;

public class MainActivity extends AppCompatActivity {

    Random r=new Random(); //Random is a class which generates random values
    int RandomNumber=r.nextInt(20)+1;

    public void toastCheck(String check){  //This function calls toast function
        Toast.makeText(MainActivity.this,check, Toast.LENGTH_SHORT).show();
    }

    public void guess(View view)
    {

        EditText value;
        value=(EditText)findViewById(R.id.value);
        int number=Integer.parseInt(value.getText().toString());
        if(RandomNumber > number)       // If Random number is bigger then entered value then this statement will execute  
        {
            toastCheck("Higher Try Again !!");
        }
        else if(RandomNumber < number)  
        {
            toastCheck("Lower Try Again !!");
        }
        else
        {
            toastCheck("Correct Choice try Again !!");
            RandomNumber = r.nextInt(20)+1;
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {        // On create function creates or run the activity when the MainActivity.java executes
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

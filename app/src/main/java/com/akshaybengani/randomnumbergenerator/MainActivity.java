package com.akshaybengani.randomnumbergenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.*;

public class MainActivity extends AppCompatActivity {

    Random r=new Random();
    int RandomNumber=r.nextInt(20)+1;

    public void toastCheck(String check){
        Toast.makeText(MainActivity.this,check, Toast.LENGTH_SHORT).show();
    }

    public void guess(View view)
    {

        EditText value;
        value=(EditText)findViewById(R.id.value);
        int number=Integer.parseInt(value.getText().toString());
        if(RandomNumber > number)
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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

package com.kaisar.com.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {


    Button bt;
    EditText et;
    TextView tv;
    CheckBox ch1,ch2;


    protected void onCreate(Bundle saveInstantState)
    {
        super.onCreate(saveInstantState);
        setContentView(R.layout.activity_main);
        bt=(Button)findViewById(R.id.bt);
        et=(EditText)findViewById(R.id.et);
        tv=(TextView)findViewById(R.id.tv);
        ch1=(CheckBox)findViewById(R.id.ch1);
        ch2=(CheckBox)findViewById(R.id.ch2);
        bt.setOnClickListener(new View.OnClickListener(){
         public void onClick(View view)
         {
             try
             {
                 int a= Integer.parseInt(et.getText().toString());
                 if(ch1.isChecked())
                 {
                     int f=(9*a+160)/5;
                     tv.setText(String.valueOf(f));
                 }
                 if(ch2.isChecked())
                 {
                     int c = (5*a-160)/9;
                     tv.setText(String.valueOf(c));
                 }

             }
             catch(Exception e)
             {
                 Toast.makeText(MainActivity.this, "Enter Correct Value", Toast.LENGTH_SHORT).show();
             }
         }


        });


    }
}

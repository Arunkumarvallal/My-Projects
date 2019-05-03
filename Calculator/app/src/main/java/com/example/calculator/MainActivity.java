package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.concurrent.atomic.AtomicBoolean;

public class MainActivity extends AppCompatActivity {
    Button one,two,three,four,five,six,seven,eight,nine,plus,minus,equal;
    EditText editText;
    public String op="";
    public float val1=0,val2=0,res=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editText);
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
    }

    public void show(View view) {
        Button b=(Button)view;
        String set=b.getText().toString();
        editText.setText(set);

    }


    public void calc(View view) {
        Button b=(Button)view;
        op=b.getText().toString();
        val1=Float.parseFloat(editText.getText().toString());
        editText.setText("");
    }

    public void equal(View view) {
        val2=Float.parseFloat(editText.getText().toString());
        switch (op){
            case "+":
                    res=val1+val2;
                    editText.setText(String.valueOf(res));
                    break;
            case "-":
                    res=val1-val2;
                    editText.setText(String.valueOf(res));
                    break;

        }
    }
}

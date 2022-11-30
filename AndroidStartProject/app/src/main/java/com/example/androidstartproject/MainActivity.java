package com.example.androidstartproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   /* @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colkulator);

//        TextView textView = (TextView) findViewById(R.id.normal);
//        textView.setText("Текст из Java кода");
//        textView.setTextColor(Color.BLACK);


        *//*ConstraintLayout constraintLayout = new ConstraintLayout(this);
        TextView textView = new TextView(this);
        textView.setText("Hello world!");
        textView.setTextSize(26);

        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT,
                ConstraintLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID;

        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        textView.setLayoutParams(layoutParams);
        constraintLayout.addView(textView);*//*

//        setContentView(constraintLayout);
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colkulator);

        final Button colculator = (Button) findViewById(R.id.collc);
        colculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CalculateAnswe();
            }
        });
    }

    private void CalculateAnswe() {
        EditText numOne = (EditText) findViewById(R.id.editTextNumberDecimal1);
        EditText numTo = (EditText) findViewById(R.id.editTextNumberDecimal2);

        RadioButton add = (RadioButton) findViewById(R.id.add);
        RadioButton sub = (RadioButton) findViewById(R.id.subtract);
        RadioButton multi = (RadioButton) findViewById(R.id.multiple);
        RadioButton divide = (RadioButton) findViewById(R.id.divide);

        TextView answer = (TextView) findViewById(R.id.result);

        float numberOne = Integer.parseInt(numOne.getText().toString());
        float numberTo = Integer.parseInt(numTo.getText().toString());
        float solution = 0;

        if (add.isChecked()){
            solution = numberOne + numberTo;
        }
        if (sub.isChecked()){
            solution = numberOne - numberTo;
        }
        if (multi.isChecked()){
            solution = numberOne * numberTo;
        }
        if (divide.isChecked()){
            if (numberTo == 0){
                Toast.makeText(this, "Второе число равно нулю", Toast.LENGTH_SHORT).show();
                return;
            }
            solution = numberOne / numberTo;
        }
        answer.setText("Итого: " + solution);
    }

}
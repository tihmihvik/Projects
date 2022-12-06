package com.example.androidstartproject;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.security.PublicKey;

import kotlin.jvm.Throws;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

   /* @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colkulator);

//        TextView textView = (TextView) findViewById(R.id.normal);
//        textView.setText("Текст из Java кода");
//        textView.setTextColor(Color.BLACK);


        */
    /*ConstraintLayout constraintLayout = new ConstraintLayout(this);
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

    private static final String LogcatTag = "Colculator_Activiti";
    private static final String LifeCycleTeg = "Tad LifeCycle";

    private static final int REQ_C = 1;
    EditText et;
    private TextView tv;
    ActivityResultLauncher<Intent> mStartActivityForResult = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    Intent intent = result.getData();
                    tv.setText(intent.getStringExtra("tv"));
                    Log.d(LifeCycleTeg, "Тут всё нормально.");

                }
            }
    );
    private View v;

//    Интент

/*
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LifeCycleTeg, "Я OnStarted and Stated");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LifeCycleTeg, "Я OnStop and Started");
    }

    protected void onPause() {
        super.onPause();
        Log.d(LifeCycleTeg, "Я OnPause and Stated");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LifeCycleTeg, "Я OnDestroy and Started");
    }

    protected void onResume() {
        super.onResume();
        Log.d(LifeCycleTeg, "Я OnResume and Started");
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LifeCycleTeg, "Я OnCreated и Started");
        setContentView(R.layout.activity_colkulator);

        et = (EditText) findViewById(R.id.et);


        final Button colculator = (Button) findViewById(R.id.collc);
        colculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(LogcatTag, "Кнопка нажата");

                try {
                    CalculateAnswe();
                } catch (ArithmeticException e){
                    Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();;
                    finish();
                }


                //Intent i = new Intent(MainActivity.this, ColkulatorActivity.class); // Написать письмо
                //startActivity(i); // Отправить письмо
            }
        });
    }

    private void CalculateAnswe() throws ArithmeticException{
        EditText numOne = (EditText) findViewById(R.id.editTextNumberDecimal1);
        EditText numTo = (EditText) findViewById(R.id.editTextNumberDecimal2);

        RadioButton add = (RadioButton) findViewById(R.id.add);
        RadioButton sub = (RadioButton) findViewById(R.id.subtract);
        RadioButton multi = (RadioButton) findViewById(R.id.multiple);
        RadioButton divide = (RadioButton) findViewById(R.id.divide);

        TextView answer = (TextView) findViewById(R.id.result);

        Log.d(LogcatTag, "Все вьюхи на месте.");

        float numberOne = Integer.parseInt(numOne.getText().toString());
        float numberTo = Integer.parseInt(numTo.getText().toString());
        Log.d(LogcatTag, "Данные введены.");
        Log.d(LogcatTag, "Переменные: " + numberOne + " " + numberTo);
        float solution = 0;





        if (add.isChecked()){
            solution = numberOne + numberTo;
            Log.d(LogcatTag, "Операция сложения выполнена.");
        }
        if (sub.isChecked()){
            solution = numberOne - numberTo;
            Log.d(LogcatTag, "Операция вычитания выполнена.");
        }
        if (multi.isChecked()){
            solution = numberOne * numberTo;
            Log.d(LogcatTag, "Операция умножения выполнена.");
        }
        if (divide.isChecked()){
            if (numberTo == 0){
                Toast.makeText(this, "Второе число равно нулю", Toast.LENGTH_SHORT).show();
                return;
            }
            solution = numberOne / numberTo;
            Log.d(LogcatTag, "Операция деления выполнена.");
        }
        answer.setText("Итого: " + solution);
        Log.d(LogcatTag, "Результат выведен на экран.");

    }


    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.button1:
                i = new Intent(this, MainActivity2.class);
                Log.d(LifeCycleTeg, "Кнопка нажата");
                startActivity(i);
                break;
            case R.id.button2:
                i = new Intent(this, ToInfActivity.class);
                String etText = et.getText().toString();
                i.putExtra("Et", etText);
                Log.d(LifeCycleTeg, "Кнопка нажата");
                startActivity(i);
                break;
            case R.id.button3:
                i = new Intent(this, CommBackActivity.class);                ;
                mStartActivityForResult.launch(i);
                break;
        }


    }

}
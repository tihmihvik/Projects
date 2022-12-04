package ru.tihonov.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editText = (EditText) findViewById(R.id.et2);
        button = (Button) findViewById(R.id.b2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("tv", editText.getText().toString());
                finish();
            }
        });
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent();
        intent.putExtra("tv", editText.getText().toString());
        finish();

    }
}
package com.example.androidstartproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CommBackActivity extends AppCompatActivity {

    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comm_back);

        editText = (EditText)findViewById(R.id.backTv);
        button = (Button)findViewById(R.id.sandback);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("tv", editText.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            }
        });


    }
}
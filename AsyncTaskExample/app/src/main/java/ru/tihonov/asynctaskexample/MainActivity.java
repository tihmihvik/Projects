package ru.tihonov.asynctaskexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.content.AsyncTaskLoader;

import android.content.Intent;
import android.os.Bundle;
import android.os.Trace;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonClick(View view){
        Intent intent = null;
        switch(view.getId()){
            case R.id.asynctask:
                intent = new Intent(this, AsynckTaskExample.class);
                startActivity(intent);
                break;
            case R.id.thread:
                intent = new Intent(this, TreadExample.class);
                startActivity(intent);
                break;
            default: return;

        }
    }
}
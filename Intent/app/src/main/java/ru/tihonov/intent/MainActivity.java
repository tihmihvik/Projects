package ru.tihonov.intent;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText et;
    TextView tv1;
    Intent i;
    static final String AGE_KEY = "AGE";
    static final String ACCESS_MESSAGE = "ACCESS_MESSAGE";

    ActivityResultLauncher<Intent> mStart = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    Intent intent = result.getData();

                    tv1.setText(intent.getStringExtra(ACCESS_MESSAGE));
                }
            }
    );



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View view) {
        i = new Intent(this, MainActivity2.class);
        mStart.launch(i);

    }
}
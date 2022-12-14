package ru.tihonov.asynctaskexample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TreadExample extends AppCompatActivity {

    ExecutorService service = Executors.newFixedThreadPool(3);
    int mCounter;

    Handler handler = new Handler(){
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            TextView forTextView = (TextView) findViewById(R.id.textInfo);
            forTextView.setText("Сегодня ворон было " + mCounter++ + " штук.");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tread_example);
    }
    /*private Runnable doInBackgrounProcessing = new Runnable() {
        @Override
        public void run() {
            BackgrounThreadProcessing();
        }
    }
    private void BackgrounThreadProcessing(){
        // Трудоёмкие операции.
    }


    private void mainProdsing(){
        Thread thread = new Thread(null, doInBackgrounProcessing);
    }*/

public void OnClick(View view){
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            long andTime = System.currentTimeMillis() + 20*1000;
            while (System.currentTimeMillis() < andTime){
                synchronized (this){
                    try {
                        wait(andTime - System.currentTimeMillis());
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                Log.i("sperols", ("Сегодня ворон было " + mCounter++ + " штук."));
                handler.sendEmptyMessage(0);
            }



        }
    };

//Thread thread = new Thread(runnable);
//thread.start();
    service.execute(runnable);

}
}

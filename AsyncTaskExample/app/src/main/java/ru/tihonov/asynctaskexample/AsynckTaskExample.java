package ru.tihonov.asynctaskexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class AsynckTaskExample extends AppCompatActivity {

    private TextView mInfo;
    private ProgressBar mProgressBar;
    private Button mStartButton;
    private ProgressBar mHorizontalPB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asynck_task_example);

        mInfo = (TextView) findViewById(R.id.textinfo);
        mStartButton = (Button) findViewById(R.id.buttonstart);
        mHorizontalPB = (ProgressBar) findViewById(R.id.horizontalPB);

    }
    public void OnClick(View view){
CurierTask curierTask = new CurierTask();
curierTask.execute();
    }

    class CurierTask extends AsyncTask<Void, Integer, View>{
        @Override
        protected void onPreExecute() {
            mInfo.setText("Доставщик зашёл в ваш дом");
            mStartButton.setVisibility(View.INVISIBLE);

        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            mInfo.setText("Этаж " + values[0]);
            mHorizontalPB.setProgress(values[0]);
        }

        @Override
        protected View doInBackground(Void... voids) {
            try {
                int numberFlor = 14;
                int counter = 0;
                for (int i = 0; i < 14; i++) {
                    getFlor(counter);
                    publishProgress(++counter);
                }
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            return null;

        }

        @Override
        protected void onPostExecute(View view) {
            mInfo.setText("Звонок в дверь. Заберите вашу питцу.");
            mStartButton.setVisibility(View.VISIBLE);
            mHorizontalPB.setProgress(0);
        }

        private void getFlor(int counter) throws InterruptedException{
            TimeUnit.SECONDS.sleep(1);
        }
    }


}



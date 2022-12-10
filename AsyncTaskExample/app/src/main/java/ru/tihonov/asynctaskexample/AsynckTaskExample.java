package ru.tihonov.asynctaskexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;

public class AsynckTaskExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asynck_task_example);
        MyAsyncTask asyncTask = new MyAsyncTask();
        asyncTask.execute("Hello mikhail");
    }
    public void OnClick(View view){
        //Todo
    }
}

class MyAsyncTask extends AsyncTask<String, Integer, Integer> {

    @Override
    protected void onPostExecute(Integer integer) {
        int myProgress = 0;
        publishProgress(myProgress);
        return;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected Integer doInBackground(String... strings) {
        return null;
    }
}
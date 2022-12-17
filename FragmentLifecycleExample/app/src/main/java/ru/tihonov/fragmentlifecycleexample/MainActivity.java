package ru.tihonov.fragmentlifecycleexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ru.tihonov.fragmentlifecycleexample.fragments.FirstFragment;
import ru.tihonov.fragmentlifecycleexample.fragments.SecondFragment;

public class MainActivity extends AppCompatActivity {
    Button fragmentButton1, fragmentButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentButton1 = (Button) findViewById(R.id.buttonFragment1);
        fragmentButton2 = (Button) findViewById(R.id.buttonFragment2);

        //fragment specific
        // get fragment manager to work with fragment's
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        //add fragment to the screen
        FirstFragment firstFragment = FirstFragment.newInstance("1", "2");
        fragmentTransaction.add(R.id.container, firstFragment);
        fragmentTransaction.commit();


        fragmentButton1.setOnClickListener(onButtonClickListener);
        fragmentButton2.setOnClickListener(onButtonClickListener);
    }
    View.OnClickListener onButtonClickListener = new Button.OnClickListener() {

        @Override
        public void onClick(View v) {
            Fragment newFragment = null;
            if (fragmentButton1.equals(v)) {
                newFragment = new FirstFragment();
            } else if (fragmentButton2.equals(v)) {
                newFragment = new SecondFragment();
            }

            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

            fragmentTransaction.replace(R.id.container, newFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    };
}
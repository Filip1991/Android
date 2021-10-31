package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.SearchView;

import static android.util.Log.v;

public class MainActivity extends AppCompatActivity {

    private Button buton1;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v("lifecycle", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        v("Lifecycle", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        v("Lifecycle", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        v("Lifecycle", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        v("Lifecycle", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        v("Lifecycle", "onDestroy");
    }
}
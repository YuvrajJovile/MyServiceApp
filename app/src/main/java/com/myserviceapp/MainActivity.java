package com.myserviceapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    private final String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showLog("Gona Start Service");
        Intent lServiceIntent = new Intent(this, ForegroundService.class);
        lServiceIntent.setAction("This is a message from MainActivity");
        startService(lServiceIntent);


        showLog("onStop is Called");
        stopService(lServiceIntent);
    }

    private void showLog(String pMessage) {
        Log.d(TAG, pMessage);
    }
}

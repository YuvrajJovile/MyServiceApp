package com.myserviceapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class ForegroundService extends Service {

    private final String TAG = getClass().getSimpleName();

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        showLog("onStartService");
        String lData = intent.getAction();
        showLog(lData);
        return START_NOT_STICKY;
    }

    private void showLog(String pMessage) {
        Log.d(TAG,pMessage);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        showLog("onDestroy");
        super.onDestroy();
    }
}

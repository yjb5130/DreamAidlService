package com.dream.dreamaidlservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import com.dream.dreamaidlservice.stub.DreamSDKManagerStub;

public class DreamAidlService extends Service {

    private final static String TAG = "DreamAidlService";

    private DreamSDKManagerStub mBinder = null;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "========= onCreate ========");
        if (mBinder == null) {
            mBinder = new DreamSDKManagerStub(getApplicationContext());
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "========= onDestroy ========");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "========= onStartCommand ========");
        if (mBinder == null) {
            mBinder = new DreamSDKManagerStub(getApplicationContext());
        }
        return START_STICKY;
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.d(TAG, "========= onUnbind ========");
        return super.onUnbind(intent);
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.d(TAG, "========= onBind ========");
        if (mBinder == null) {
            mBinder = new DreamSDKManagerStub(getApplicationContext());
        }
        return mBinder;
    }
}

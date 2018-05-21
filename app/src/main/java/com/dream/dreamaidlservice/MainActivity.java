package com.dream.dreamaidlservice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

    private Intent aidlService = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aidlService = new Intent(this, DreamAidlService.class);
        startService(aidlService);
        finish();
    }

    @Override
    protected void onDestroy() {
        //stopService(aidlService);
        super.onDestroy();
    }
}

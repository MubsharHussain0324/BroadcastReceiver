package com.example.mubasharhussain.BroadcastReceiver;

/**
 * Created by MubasharHussain on 1/7/2018.
 */

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

class MyReceiver1 extends BroadcastReceiver {

    private static final String TAG ="MTAG" ;

    @Override
    public void onReceive(Context context, Intent intent) {

        Log.d(TAG, "onReceive: BroadCast Received");
        // TODO: This method is called when the BroadcastReceiver is receiving
        Toast.makeText(context, "Received", Toast.LENGTH_SHORT).show();
        // an Intent broadcast.
        throw new UnsupportedOperationException("Not yet implemented");

    }
}
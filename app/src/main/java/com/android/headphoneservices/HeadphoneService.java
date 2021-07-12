package com.android.headphoneservices;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class HeadphoneService extends BroadcastReceiver {

    @Override public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Intent.ACTION_HEADSET_PLUG)) {
            int state = intent.getIntExtra("state", -1);
            switch (state) {
                case 0:
                    MainActivity.isHeadphoneConnected = false;
                    Toast.makeText(context,"Head",Toast.LENGTH_LONG).show();
                    break;
                case 1:
                    MainActivity.isHeadphoneConnected = true;
                    Toast.makeText(context,"Head",Toast.LENGTH_LONG).show();
                    break;
            }
        }
    }
}
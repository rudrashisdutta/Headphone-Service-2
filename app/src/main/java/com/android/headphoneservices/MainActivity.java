package com.android.headphoneservices;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    public static boolean isHeadphoneConnected;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
    }
    private HeadphoneService hs;
    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter fil=new IntentFilter(Intent.ACTION_HEADSET_PLUG);
        registerReceiver(hs,fil);
    }
}
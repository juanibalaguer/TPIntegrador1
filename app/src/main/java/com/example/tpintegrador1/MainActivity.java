package com.example.tpintegrador1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.Toast;

import static android.Manifest.permission.CALL_PHONE;

public class MainActivity extends AppCompatActivity {
    private CambioUSB cambioUSB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        this.cambioUSB = new CambioUSB();
        registerReceiver(this.cambioUSB, new IntentFilter("android.hardware.usb.action.USB_STATE"));
    }

    @Override
    protected void onStop() {
        unregisterReceiver(cambioUSB);
        super.onStop();
    }

}
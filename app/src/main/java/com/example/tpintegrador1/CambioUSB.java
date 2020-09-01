package com.example.tpintegrador1;

import android.Manifest;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.widget.Toast;

import androidx.core.app.ActivityCompat;

import static android.Manifest.permission.CALL_PHONE;

public class CambioUSB extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        boolean conectado = intent.getExtras().getBoolean("connected");
        int bandera = 0;
        if(conectado && bandera == 0) {
            bandera ++;
            Intent i = new Intent(context, LlamadaActivity.class);
            context.startActivity(i);
        } else {
            bandera = 0;
        }

    }


}

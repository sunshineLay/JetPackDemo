package com.example.jetpackdemo.lifecycler;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/**
 * @TODO:
 * @Date: 2021/11/22 10:56
 * @User: lay
 */
public class GPSObserver implements LifecycleEventObserver {
    private Context context;
    private GPSListener gpsListener;
    private LocationManager locationManager;

    public GPSObserver(Context context) {
        this.context = context;
    }

    @Override
    public void onStateChanged(@NonNull LifecycleOwner source, @NonNull Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            locationManager = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
            gpsListener = new GPSListener();
            if (ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                return;
            }
            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 3000, 1, gpsListener);
        }else if(event == Lifecycle.Event.ON_DESTROY){
            locationManager.removeUpdates(gpsListener);
        }
    }

    static class GPSListener implements LocationListener{

        @Override
        public void onLocationChanged(@NonNull Location location) {
            Log.d("GPS", "onLocationChanged: " + location.toString());
        }

        @Override
        public void onStatusChanged(String provider, int status, Bundle extras) {
            Log.d("GPS", "onStatusChanged: " + status);
        }
    }
}

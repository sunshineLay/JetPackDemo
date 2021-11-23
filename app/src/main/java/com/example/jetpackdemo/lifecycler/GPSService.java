package com.example.jetpackdemo.lifecycler;

import android.util.Log;

import androidx.lifecycle.LifecycleService;

/**
 * @TODO:
 * @Date: 2021/11/22 10:51
 * @User: lay
 */
public class GPSService extends LifecycleService {
    public GPSService(){
        Log.d("GPS", "GPSService");
        GPSObserver gpsObserver = new GPSObserver(this);
        getLifecycle().addObserver(gpsObserver);
    }
}

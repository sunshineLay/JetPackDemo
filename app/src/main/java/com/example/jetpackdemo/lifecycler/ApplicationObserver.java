package com.example.jetpackdemo.lifecycler;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/**
 * @TODO:
 * @Date: 2021/11/23 10:18
 * @User: lay
 */
public class ApplicationObserver implements LifecycleEventObserver {
    private static final ApplicationObserver instance = new ApplicationObserver();
    private ApplicationObserver(){

    }
    public static ApplicationObserver getInstance(){
        return instance;
    }
    @Override
    public void onStateChanged(@NonNull LifecycleOwner source, @NonNull Lifecycle.Event event) {
        switch (event) {
            case ON_CREATE:
                Log.d("Application", "onStateChanged: ON_CREATE");
                break;
            case ON_START:
                Log.d("Application", "onStateChanged: ON_START");
                break;
            case ON_RESUME:
                Log.d("Application", "onStateChanged: ON_RESUME");
                break;
            case ON_PAUSE:
                Log.d("Application", "onStateChanged: ON_PAUSE");
                break;
            case ON_STOP:
                Log.d("Application", "onStateChanged: ON_STOP");
                break;
            case ON_DESTROY:
                Log.d("Application", "onStateChanged: ON_DESTROY");
                break;
            default:
                break;
        }
    }
}

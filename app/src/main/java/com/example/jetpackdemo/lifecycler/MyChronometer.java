package com.example.jetpackdemo.lifecycler;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.widget.Chronometer;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/**
 * @TODO:
 * @Date: 2021/11/19 10:44
 * @User: lay
 */
public class MyChronometer extends Chronometer implements LifecycleEventObserver {

    private long elapsedTime;

    public MyChronometer(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onStateChanged(@NonNull LifecycleOwner source, @NonNull Lifecycle.Event event) {
        if(event == Lifecycle.Event.ON_RESUME){
            setBase(SystemClock.elapsedRealtime() - elapsedTime);
            start();
        }else if(event == Lifecycle.Event.ON_PAUSE){
            elapsedTime = SystemClock.elapsedRealtime() - getBase();
            stop();
        }
    }
}

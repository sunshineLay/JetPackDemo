package com.example.jetpackdemo.lifecycler;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.jetpackdemo.R;

/**
 * @TODO: 使用Lifecycler解耦Service和组件。
 *      Service + GPS。
 * @Date: 2021/11/19 12:01
 * @User: lay
 */
public class Demo02Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.life02_gps_activity);
    }

    //停止
    public void stopGPS(View view) {
        stopService(new Intent(this,GPSService.class));
    }
    //启动
    public void startGPS(View view) {
        startService(new Intent(this,GPSService.class));
    }
}

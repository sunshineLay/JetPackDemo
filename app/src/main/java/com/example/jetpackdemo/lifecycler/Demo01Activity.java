package com.example.jetpackdemo.lifecycler;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.jetpackdemo.R;

/**
 * @TODO:
 * @Date: 2021/11/18 17:16
 * @User: lay
 */
public class Demo01Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo01_life_activity);
    }
}

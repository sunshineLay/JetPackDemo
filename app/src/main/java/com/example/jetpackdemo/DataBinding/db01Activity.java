package com.example.jetpackdemo.DataBinding;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.jetpackdemo.R;

/**
 * @TODO: 简单使用：单向绑定（从A到xml）
 * @Date: 2021/11/23 16:43
 * @User: lay
 */
public class db01Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.databinding_activity);
    }
}

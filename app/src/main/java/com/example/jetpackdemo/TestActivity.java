package com.example.jetpackdemo;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

/**
 * @TODO:
 * @Date: 2021/10/28 16:21
 * @User: lay
 */
public class TestActivity extends AppCompatActivity {
    private MutableLiveData<String> phoneNum = new MutableLiveData<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
    }

    private void initData() {
        phoneNum.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String data) {
                Log.e("onChanged", "onChanged: 02"+data);
            }
        });
        Log.e("onChanged", "onChanged: 01");
        phoneNum.postValue("加油");
    }
}

package com.example.jetpackdemo.dataBinding;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.jetpackdemo.R;
import com.example.jetpackdemo.databinding.Db06ActivityBinding;

/**
 * @TODO: DataBinding + ViewModel + LiveData
 * @Date: 2021/11/29 11:32
 * @User: lay
 */
public class db06Activity extends AppCompatActivity {

    private Db06ActivityBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initBind();
    }

    private void initBind() {
        binding = (Db06ActivityBinding) DataBindingUtil.setContentView(this, R.layout.db06_activity);
    }
}

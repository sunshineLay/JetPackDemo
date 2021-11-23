package com.example.jetpackdemo.viewModel;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.jetpackdemo.R;

/**
 * @TODO:
 *      1、ViewModel的应用：屏幕旋转之后数据存在。
 *      2、ViewModel的生命周期特性
 *
 * @Date: 2021/11/23 10:43
 * @User: lay
 */
public class Vm01Activity extends AppCompatActivity {

    private TextView tvNum;
    private Vm01ViewModel vm01ViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vm01_activity);
        vm01ViewModel = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(Vm01ViewModel.class);
        tvNum = (TextView) findViewById(R.id.tv_num);
        tvNum.setText(String.valueOf(vm01ViewModel.num));
    }

    public void addOne(View view) {
        tvNum.setText(String.valueOf(++vm01ViewModel.num));
    }
}

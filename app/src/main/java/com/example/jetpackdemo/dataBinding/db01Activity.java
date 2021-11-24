package com.example.jetpackdemo.dataBinding;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.databinding.DataBindingUtil;

import com.example.jetpackdemo.R;
import com.example.jetpackdemo.databinding.DatabindingActivityBinding;

/**
 * @TODO:   简单使用：单向绑定（从A到xml）
 *          DataBinding:import 标签和事件绑定
 * @Date: 2021/11/23 16:43
 * @User: lay
 *
 * 1. @{person.age} 单向绑定 （person 到xml）
 */
public class db01Activity extends AppCompatActivity {

    private DatabindingActivityBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initBind();
    }

    private void initBind() {
        binding = (DatabindingActivityBinding) DataBindingUtil.setContentView(this, R.layout.databinding_activity);
        Person person = new Person("刘德华", 58,66, ResourcesCompat.getDrawable(getResources(), R.drawable.zore, null));
        binding.setPerson(person);
    }
}

package com.example.jetpackdemo.dataBinding;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.databinding.DataBindingUtil;

import com.example.jetpackdemo.R;
import com.example.jetpackdemo.databinding.DatabindingActivityBinding;

/**
 * @TODO:   简单使用：单向单次赋值（从A到xml）
 *          DataBinding:import 标签和事件绑定
 * @Date: 2021/11/23 16:43
 * @User: lay
 *
 * 1. @{person.age} 单向单次赋值（person 到xml）
 * 2. 点击事件changeConten(View view)改变了Data的内容，但是UI不会改变。所以这个例子不是单向绑定。
 */
public class db01Activity extends AppCompatActivity {

    private DatabindingActivityBinding binding;
    private Person person;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initBind();
    }

    private void initBind() {
        binding = (DatabindingActivityBinding) DataBindingUtil.setContentView(this, R.layout.databinding_activity);
        person = new Person("刘德华", 58, 66, ResourcesCompat.getDrawable(getResources(), R.drawable.zore, null));
        binding.setPerson(person);
    }

    public void changeContent(View view) {
        person.name = "张学友";
        person.age = 55;
        person.type = 1;
        Log.e("db01Activity", "changeContent: "+ person.toString() );
    }
}

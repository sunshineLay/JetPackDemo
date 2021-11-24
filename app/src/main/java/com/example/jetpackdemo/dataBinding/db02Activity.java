package com.example.jetpackdemo.dataBinding;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.databinding.DataBindingUtil;

import com.example.jetpackdemo.R;
import com.example.jetpackdemo.databinding.Db02ActivityBinding;

/**
 * @TODO: 二级页面绑定:<include>标签关联的二级页面
 * @Date: 2021/11/24 9:04
 * @User: lay
 *
 * 1.
 */
public class db02Activity extends AppCompatActivity {
    private Db02ActivityBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initBind();
    }
    private void initBind() {
        binding = (Db02ActivityBinding) DataBindingUtil.setContentView(this, R.layout.db02_activity);
        Person person = new Person("刘德华", 58,3, ResourcesCompat.getDrawable(getResources(), R.drawable.zore, null));
        binding.setPerson(person);
    }
}

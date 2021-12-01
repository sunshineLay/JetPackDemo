package com.example.jetpackdemo.dataBinding;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.example.jetpackdemo.R;
import com.example.jetpackdemo.databinding.Db06ActivityBinding;

/**
 * @TODO: DataBinding + ViewModel + LiveData
 * @Date: 2021/11/29 11:32
 * @User: lay
 *
 * 案例：比赛积分程序。
 * 优化点：
 * 1. 实现百分比布局；横竖屏切换不会影响内容完整展示。
 * 2. undo 功能实现前后回撤，并且提示前后回撤到头的时候的处理。
 */
public class db06Activity extends AppCompatActivity {

    private Db06ActivityBinding binding;
    private Db06ViewModel db06ViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initBind();
    }

    private void initBind() {
        binding = (Db06ActivityBinding) DataBindingUtil.setContentView(this, R.layout.db06_activity);
        db06ViewModel = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(Db06ViewModel.class);
        binding.setVm(db06ViewModel);
        binding.setLifecycleOwner(this);
    }
}

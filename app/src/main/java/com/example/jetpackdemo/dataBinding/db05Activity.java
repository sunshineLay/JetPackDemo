package com.example.jetpackdemo.dataBinding;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.jetpackdemo.R;
import com.example.jetpackdemo.databinding.Db05ActivityBinding;

/**
 * @TODO: RecyclerView 的绑定
 * @Date: 2021/11/29 9:09
 * @User: lay
 */
public class db05Activity extends AppCompatActivity {

    private Db05ActivityBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initBind();

    }

    private void initBind() {
        binding = (Db05ActivityBinding) DataBindingUtil.setContentView(this, R.layout.db05_activity);
        binding.recycler.setLayoutManager(new LinearLayoutManager(this));
        binding.recycler.setAdapter(new IdolRecyclerViewAdapter(IdolsUtils.getData()));
    }
}

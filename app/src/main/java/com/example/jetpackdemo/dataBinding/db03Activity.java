package com.example.jetpackdemo.dataBinding;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.jetpackdemo.R;
import com.example.jetpackdemo.databinding.Db03ActivityBinding;

/**
 * @TODO: 自定义BindingAdapter : 加载网络图片
 *         将普通xml 转换成layout-databinding的快捷键：点击根布局——>Alt + Enter
 * @Date: 2021/11/24 11:16
 * @User: lay
 */
public class db03Activity extends AppCompatActivity {

    private Db03ActivityBinding binding;
    private String imgUrl = "https://uploadfile.huiyi8.com/2013/0814/20130814104134302.jpg";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initBind();
    }

    private void initBind() {
        binding = (Db03ActivityBinding) DataBindingUtil.setContentView(this, R.layout.db03_activity);
        ImageBean imageBean = new ImageBean(imgUrl, R.drawable.zore, this);
        binding.setImage(imageBean);
    }
}

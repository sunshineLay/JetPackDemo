package com.example.jetpackdemo.dataBinding;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.jetpackdemo.R;
import com.example.jetpackdemo.databinding.Databinding02ActivityBinding;
import com.example.jetpackdemo.databinding.Db0403ActivityBinding;
import com.example.jetpackdemo.databinding.Db04ActivityBinding;

/**
 * @TODO: 单向绑定和双向绑定: BaseObservable 和ObservableField
 *      单向绑定是（Data->xml）数据变化，UI变化。
 *      双向绑定是（Data->xml + xml—>Data）数据变化，UI变化。
 * @Date: 2021/11/24 11:38
 * @User: lay
 *
 * 单向绑定例子Demo1：只要数据改变内容就改变。
 *  数据首先是刘德华，点击事件变成张学友+点击次数i。技术重点：BaseObserver
 *  此时，只要数据内容改变。UI立刻改变。
 *
 *  单向绑定例子Demo2：只要UI改变数据就改变。技术重点：@={}
 *
 * 双向绑定例子：输入框内容改变，导致Data数据改变。Data数据改变导致UI改变。技术重点：【方案一】@={} + BaseObserver
 *
 */
public class db04Activity extends AppCompatActivity {
    //Demo1
    private Databinding02ActivityBinding binding;
    private PersonViewModel personViewModel;
    private int i;
    //Demo2
    private Db04ActivityBinding binding1;
    private String name = "";
    //Demo03
    private Db0403ActivityBinding binding2;
    private NameBean nameBean;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        initDemo01();
//        initDemo02();
        initDemo03();

    }

    //Demo03 - 双向绑定
    private void initDemo03() {
        binding2 = (Db0403ActivityBinding) DataBindingUtil.setContentView(this, R.layout.db04_03_activity);
        nameBean = new NameBean();
        binding2.setName(nameBean);
    }

    //Demo2 - 单向绑定 - UI改变导致数据改变。
    // 由于使用同一个数据源，当数据源改变的时候，另一个UI又会天然改变。所以，从结果上来讲，@={}直接就能完成双向绑定效果。（说法错误）
    //单向绑定是指无论从Data到UI还是从UI到Data都是单向的。在这样的使用中。如果，我们改变了Data的值。我们不会触发UI的改变。因此，依然是单向绑定。
    private void initDemo02() {
        binding1 = (Db04ActivityBinding) DataBindingUtil.setContentView(this, R.layout.db04_activity);
        binding1.setName(name);
    }

    //Demo1 - 单向绑定 - 数据改变导致UI改变
    private void initDemo01() {
        binding = (Databinding02ActivityBinding) DataBindingUtil.setContentView(this, R.layout.databinding02_activity);
        personViewModel = new PersonViewModel(this);
        binding.setPerson(personViewModel);
    }

    public void changeContent2(View view) {
        personViewModel.setUserName("张学友"+ i++);
        Log.e("db04Activity", "changeContent: "+ personViewModel.getPerson().toString());
    }

    public void changeCon(View view) {
        name = "周星驰"+ i++;
        Log.e("db04Activity", "changeCon: "+ name);
    }
    //Demo03 - 双向绑定
    public void changeCon2(View view) {
        nameBean.setName("周星驰"+nameBean.getName());
        Log.e("db04Activity", "changeCon: "+ nameBean.getName());
    }


}

package com.example.jetpackdemo.lifecycler;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.jetpackdemo.R;

/**
 * @TODO: 使用Lifecycler解耦页面和组件 - 使用Lifecycler的Demo
 * @Date: 2021/11/19 10:41
 * @User: lay
 * 1.优点：解耦了Activity和普通组件（View、广播、内容提供者）的关系。
 *          Activity只负责订阅普通组件。UI功能由View自行完成。此时，符合了单一职责原则。
 */
public class Demo01LifeActivity extends AppCompatActivity {

    private MyChronometer myChronometer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.life01_new_activity);
        initUI();
    }

    private void initUI() {
        myChronometer = (MyChronometer) findViewById(R.id.chronometer);
        getLifecycle().addObserver(myChronometer);
    }
}

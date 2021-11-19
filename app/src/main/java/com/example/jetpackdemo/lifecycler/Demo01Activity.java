package com.example.jetpackdemo.lifecycler;

import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Chronometer;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.jetpackdemo.R;

/**
 * @TODO: 使用Lifecycler解耦页面和组件 - 没有使用前的Demo
 * @Date: 2021/11/18 17:16
 * @User: lay
 *
 * 1.缺点：一切UI功能强耦合于Activity。Activity既要管理生命周期，又要负责处理UI业务逻辑。违反单一职责原则。
 */
public class Demo01Activity extends AppCompatActivity {

    private Chronometer chronView;
    private long elapsedTime;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.life01_activity);
        initUI();
    }

    private void initUI() {
        chronView = (Chronometer) findViewById(R.id.chronometer);
    }

    @Override
    protected void onResume() {
        super.onResume();
        chronView.setBase(SystemClock.elapsedRealtime() - elapsedTime);//这一步是为了在点击home按键离开当前App的时候，这个时间控件不再继续向前执行。
        chronView.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        elapsedTime = SystemClock.elapsedRealtime() - chronView.getBase();
        chronView.stop();
    }
}

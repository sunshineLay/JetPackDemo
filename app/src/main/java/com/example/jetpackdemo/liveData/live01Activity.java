package com.example.jetpackdemo.liveData;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.jetpackdemo.R;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @TODO: 简单应用: 倒计时更新（LiveData和ViewModel）
 * @Date: 2021/11/23 11:39
 * @User: lay
 */
public class live01Activity extends AppCompatActivity {

    private TimeViewModel timeViewModel;
    private TextView tvNum;
    private Timer timer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.live01_activity);
        timeViewModel = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(TimeViewModel.class);
        tvNum = (TextView)findViewById(R.id.tv_num);
        if(timeViewModel.isStartTime){
            startTime();
        }
        timeViewModel.getNum().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer value) {
                if(value >= 0){
                    tvNum.setText(String.valueOf(value));
                }else{
                    Toast.makeText(live01Activity.this,"Game Over!",Toast.LENGTH_SHORT).show();
                    timer.cancel();
                }

            }
        });

    }

    //定时器的使用
    private void startTime() {
        timeViewModel.isStartTime = false;
        timeViewModel.getNum().postValue(10);
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Integer value = timeViewModel.getNum().getValue();
                timeViewModel.getNum().postValue(--value);
            }
        },1000,1000);
    }

}

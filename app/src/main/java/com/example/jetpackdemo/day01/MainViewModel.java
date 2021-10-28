package com.example.jetpackdemo.day01;

import android.Manifest;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;

import com.example.jetpackdemo.MainActivity;

/**
 * @TODO: 管理 UI Data
 * @Date: 2021/10/25 9:54
 * @User: lay
 */
//Demo：拨打电话号码
public class MainViewModel extends AndroidViewModel {
//    private String phoneNum;
    //LiveData: 感应改变数据
    //主要使用方法：setValue() 和 getValue()
    private MutableLiveData<String> phoneNum;
    private Context mContext;

    public MainViewModel(@NonNull Application application) {
        super(application);
        mContext = application;
    }

    public MutableLiveData<String> getPhoneNum() {
        if(phoneNum == null){
            phoneNum = new MutableLiveData<>();
        }
        return phoneNum;
    }

    //直接拨打电话
    public void callPhone() {
        //判断
        if(phoneNum.getValue().isEmpty()){
            phoneNum.setValue("");
        }
        Intent intent = new Intent(Intent.ACTION_CALL);
        Uri data = Uri.parse("tel:" + phoneNum.getValue());
        Log.e("Main", "callPhone: " + phoneNum.getValue());//找到问题，这个地方是空。继续往后面看。
        intent.setData(data);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mContext.startActivity(intent);
    }

}

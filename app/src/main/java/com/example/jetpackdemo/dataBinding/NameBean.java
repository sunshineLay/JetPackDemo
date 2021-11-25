package com.example.jetpackdemo.dataBinding;

import android.text.TextUtils;
import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;

/**
 * @TODO:
 * @Date: 2021/11/25 17:20
 * @User: lay
 */
public class NameBean extends BaseObservable {
    private String name;

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!TextUtils.isEmpty(name)&&!name.equals(this.name)){
            this.name = name;
            Log.e("db04Activity", "setName: Success"+ name);
            notifyPropertyChanged(BR.name);
        }else{
            Log.e("db04Activity", "setName: Failure"+ name);
        }

    }
}

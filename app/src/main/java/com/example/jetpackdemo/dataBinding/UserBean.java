package com.example.jetpackdemo.dataBinding;

import android.util.Log;

import androidx.databinding.ObservableField;

import java.util.Observable;

/**
 * @TODO:
 * @Date: 2021/11/29 9:11
 * @User: lay
 */
public class UserBean {
    private ObservableField<String> name;

    public UserBean(String nameStr) {
        name = new ObservableField<String>();
        name.set(nameStr);
    }

    public ObservableField<String> getName() {
        Log.e("db04Activity", "getName: "+ name.get() );
        return name;
    }

    public void setName(ObservableField<String> name) {
        this.name = name;
        Log.e("db04Activity", "setName: "+ name.get() );
    }
}

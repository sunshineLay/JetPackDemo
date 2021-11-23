package com.example.jetpackdemo.liveData;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * @TODO:
 * @Date: 2021/11/23 11:47
 * @User: lay
 */
public class TimeViewModel extends ViewModel {
    public boolean isStartTime = true;
    public MutableLiveData<Integer> num = new MutableLiveData<>();

    public MutableLiveData<Integer> getNum() {
        if(num == null){
            num = new MutableLiveData<>();
            num.postValue(10);
        }
        return num;
    }

}

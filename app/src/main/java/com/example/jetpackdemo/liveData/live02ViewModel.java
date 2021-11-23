package com.example.jetpackdemo.liveData;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * @TODO:
 * @Date: 2021/11/23 16:08
 * @User: lay
 */
public class live02ViewModel extends ViewModel {
    public MutableLiveData<Integer> progress;

    public MutableLiveData<Integer> getProgress() {
        if(progress == null){
            progress = new MutableLiveData<>();
            progress.postValue(0);
        }
        return progress;
    }
}

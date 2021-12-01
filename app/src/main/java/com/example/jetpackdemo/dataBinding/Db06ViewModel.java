package com.example.jetpackdemo.dataBinding;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * @TODO:
 * @Date: 2021/11/30 8:12
 * @User: lay
 */
public class Db06ViewModel extends ViewModel {
    public MutableLiveData<Integer> aTeamScore;
    public MutableLiveData<Integer> bTeamScore;
    private int aLast;
    private int bLast;

    public MutableLiveData<Integer> getaTeamScore() {
        if(aTeamScore == null){
           aTeamScore = new MutableLiveData<>();
           aTeamScore.setValue(0);
        }
        return aTeamScore;
    }

    public MutableLiveData<Integer> getbTeamScore() {
        if(bTeamScore == null){
            bTeamScore = new MutableLiveData<>();
            bTeamScore.setValue(0);
        }
        return bTeamScore;
    }

    public void addATeamScore(int i){
        setLastValue();
        aTeamScore.setValue(aTeamScore.getValue()+i);
    }
    public void addBTeamScore(int i){
        setLastValue();
        bTeamScore.setValue(bTeamScore.getValue()+i);
    }
    private void setLastValue(){
        aLast = aTeamScore.getValue();
        bLast = bTeamScore.getValue();
    }
    //撤回
    public void undo(){
        aTeamScore.setValue(aLast);
        bTeamScore.setValue(bLast);
    }
    //刷新
    public void update(){
        setLastValue();
        aTeamScore.setValue(0);
        bTeamScore.setValue(0);
    }
}

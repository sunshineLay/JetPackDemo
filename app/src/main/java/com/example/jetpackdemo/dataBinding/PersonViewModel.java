package com.example.jetpackdemo.dataBinding;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;

import androidx.core.content.res.ResourcesCompat;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.jetpackdemo.BR;
import com.example.jetpackdemo.R;

/**
 * @TODO:
 * @Date: 2021/11/25 15:57
 * @User: lay
 */
public class PersonViewModel extends BaseObservable {
   private Person person;

    public PersonViewModel(Context context) {
        this.person = new Person("刘德华", 58, 66, ResourcesCompat.getDrawable(context.getResources(), R.drawable.zore, null));;
    }

    public Person getPerson() {
        return person;
    }

    @Bindable
    public String getPersonName(){
        return person.name;
    }

    public void setUserName(String userName){
        if(!TextUtils.isEmpty(userName)&&!userName.equals(person.name)){
            person.name = userName;
            Log.e("db04Activity", "setUserName: "+userName);
            notifyPropertyChanged(BR.personName);//改变UI的通知
//            notifyChange();//改变全体的通知
        }else{
            Log.e("db04Activity", "setUserName: 空");
        }
    }
    @Bindable
    public int getType() {
        return person.type;
    }

    public void setType(int type) {
        person.type = type;
    }
    @Bindable
    public int getAge() {
        return person.age;
    }

    public void setAge(int age) {
        person.age = age;
    }
    @Bindable
    public Drawable getImg() {
        return person.img;
    }

    public void setImg(Drawable img) {
        person.img = img;
    }


}

package com.example.jetpackdemo.dataBinding;


import android.graphics.drawable.Drawable;

/**
 * @TODO:
 * @Date: 2021/11/23 17:00
 * @User: lay
 */
public class Person {
    public String name;
    public int type;
    public int age;
    public Drawable img;

    public Person(String name, int age,int type,Drawable img) {
        this.name = name;
        this.age = age;
        this.img = img;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", age=" + age +
                ", img=" + img +
                '}';
    }


}

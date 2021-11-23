package com.example.jetpackdemo.DataBinding;


import android.graphics.Bitmap;

/**
 * @TODO:
 * @Date: 2021/11/23 17:00
 * @User: lay
 */
public class Person {
    private String name;
    private int age;
    private Bitmap img;

    public Person(String name, int age, Bitmap img) {
        this.name = name;
        this.age = age;
        this.img = img;
    }
}

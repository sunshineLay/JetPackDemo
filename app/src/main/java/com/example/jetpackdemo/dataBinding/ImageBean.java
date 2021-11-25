package com.example.jetpackdemo.dataBinding;

import android.content.Context;

/**
 * @TODO:
 * @Date: 2021/11/25 9:58
 * @User: lay
 */
public class ImageBean {
    public String url;
    public int placeholder;
    public Context context;

    public ImageBean(String url, int placeholder, Context context) {
        this.url = url;
        this.placeholder = placeholder;
        this.context = context;
    }
}

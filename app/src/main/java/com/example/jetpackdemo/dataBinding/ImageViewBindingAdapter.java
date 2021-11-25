package com.example.jetpackdemo.dataBinding;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.DrawableRes;
import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.example.jetpackdemo.R;

/**
 * @TODO: @BindingAdapter 的多种写法
 * @Date: 2021/11/25 8:58
 * @User: lay
 */
public class ImageViewBindingAdapter {
    //第一种，只有一个额外的属性
//    @BindingAdapter("image")
//    public static void setNetImageView(ImageView view){
//
//
//    }
//    //第二种，多个额外的属性
//    @BindingAdapter({"image","hahah"})
//    public static void setImageView(ImageView view){
//
//    }
    //第三种，一个或者多个额外的属性，外加希望所有地方都生效【requireAll=false】，requireAll=true【默认是true】只有同时存在这两个额外属性的地方才起作用。
    @BindingAdapter(value={"imageUrl", "placeholder","context"}, requireAll=false)
    public static void setImageViewPlace(ImageView view, String url, @DrawableRes int placeholder, Context context){
        if(TextUtils.isEmpty(url)){
            view.setImageResource(placeholder);
        }else{
            Glide.with(context).load(url).into(view);
        }
    }
    //第四种，覆盖已有的xml属性功能。注意：单个属性直接会被覆盖，多个已有的xml属性值可以通过requireAll属性来控制。
    //android:text
    @BindingAdapter(value = {"android:text","title"})
    public static void setText(TextView view,String text,String title){
        view.setText(text+"-Text"+title);
    }

}

package com.example.jetpackdemo.lifecycler;

import androidx.annotation.NonNull;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

/**
 * @TODO: 测试使用DefaultLifecycleObserver
 * @Date: 2021/12/3 15:29
 * @User: lay
 *
 * 使用这种方式必须依赖于：
 *      // alternately - if using Java8, use the following instead of lifecycle-compiler
 *     implementation "androidx.lifecycle:lifecycle-common-java8:$lifecycle_version"
 */
public class TestObserver implements DefaultLifecycleObserver {
    @Override
    public void onStart(@NonNull LifecycleOwner owner) {

    }

    @Override
    public void onStop(@NonNull LifecycleOwner owner) {

    }
}

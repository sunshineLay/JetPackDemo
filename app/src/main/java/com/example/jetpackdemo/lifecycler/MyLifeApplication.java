package com.example.jetpackdemo.lifecycler;

import android.app.Application;

import androidx.lifecycle.ProcessLifecycleOwner;

/**
 * @TODO: 使用ProcessLifecleOwner监听整个应用程序生命周期。——Demo3
 * @Date: 2021/11/23 9:55
 * @User: lay
 *
 * 特点：
 * Application的ON_CREATE只会被调用一次。ON_DESTROY永远不会被调用。
 *
 * 当应用程序从后台回到前台，或者应用程序首次打开，会依次调用Lifecycle.Event.ON_START，Lifecycle.Event.ON_RESUME。
 *
 * 当应用程序从前台退到后台（用户按下home键或任务菜单键），会依次调用Lifecycle.Event.ON_PAUSE，Lifecycle.Event.ON_STOP。
 * 需要注意的是，这两个方法的调用会有一定的延后，因为系统需要为屏幕旋转，配置发生变化导致Activity重新创建预留一些时间，
 * 也就是说，系统需要保证由于屏幕旋转，导致Activity重新创建时，这两个事件不会被调用到。旋转屏幕，你的应用程序并没有退到后台，它只是进入了横/竖屏模式而已。
 *
 * 场景：适用于监控APP的前后台切换。
 *
 * 总结：Lifecycler 支持Activity（6个生命周期方法）、Fragment(11个（4（连接A，创建F，创建V，A创建完成）+4x1+3(销毁View，销毁F，脱离A)）)、Service、Application(6个生命周期方法).
 */
public class MyLifeApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ProcessLifecycleOwner.get().getLifecycle().addObserver(ApplicationObserver.getInstance());
    }
}

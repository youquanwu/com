package com.youquan.demo.demo20181125.Inject;


import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    Context context();//提供Application的context

    ThreadExecutor threadExecutor();//线程池

    ApiService apiService();//所有Api请求的管理类

    SpfManager spfManager();//所有的spf缓冲管理类
}

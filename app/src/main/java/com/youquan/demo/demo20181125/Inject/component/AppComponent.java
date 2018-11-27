package com.youquan.demo.demo20181125.Inject.component;


import android.content.Context;

import com.youquan.demo.demo20181125.Executor.ThreadExecutor;
import com.youquan.demo.demo20181125.Inject.ApiService;
import com.youquan.demo.demo20181125.db.SpfManager;
import com.youquan.demo.demo20181125.Inject.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * application级别下的Component
 *
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    Context context();//提供Application的context

    ThreadExecutor threadExecutor();//线程池

    ApiService apiService();//所有Api请求的管理类

    SpfManager spfManager();//所有的spf缓冲管理类
}

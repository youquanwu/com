package com.youquan.demo.demo20181125.Inject;


import android.content.Context;

import com.youquan.demo.demo20181125.core.MyApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * dragger2中moudle相关
 */
@Module
public class AppModule {
    private final MyApplication application;

    public AppModule(MyApplication application){
        this.application=application;
    }

    /**
     * Provides表示是方法
     * Singleton单例
     * @return
     */
    @Provides
    @Singleton
    Context provideApplicationContext(){
        return application;
    }

    @Provides
    @Singleton
    ThreadExecutor provideThreadExecutor(JobExecutor jobExecutor){
        return jobExecutor;
    }

    ApiService provudeSpfmanager(RetrofitManager retrofitManager){

        return retrofitManager.getService();
    }

}

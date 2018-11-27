package com.youquan.demo.demo20181125.Inject.module;


import android.content.Context;

import com.youquan.demo.demo20181125.Executor.JobExecutor;
import com.youquan.demo.demo20181125.Executor.ThreadExecutor;
import com.youquan.demo.demo20181125.Inject.ApiService;
import com.youquan.demo.demo20181125.Inject.RetrofitManager;
import com.youquan.demo.demo20181125.db.SpfManager;
import com.youquan.demo.demo20181125.core.MyApplication;
import com.youquan.demo.demo20181125.db.DBManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * dragger2中application级别下的moudle相关
 */
@Module
public class AppModule {
    private final MyApplication application;

    public AppModule(MyApplication application) {
        this.application = application;
    }

    /**
     * Provides表示是方法
     * Singleton单例
     *
     * @return
     */
    @Provides
    @Singleton
    Context provideApplicationContext() {
        return application;
    }

    @Provides
    @Singleton
    ThreadExecutor provideThreadExecutor(JobExecutor jobExecutor) {
        return jobExecutor;
    }

    @Provides
    @Singleton
    ApiService provudeSpfmanager(RetrofitManager retrofitManager) {

        return retrofitManager.getService();
    }
    @Provides
    @Singleton
    SpfManager provideSpfManager() {
        return new SpfManager(application);
    }

    @Provides
    @Singleton
    DBManager provideDBManager() {
        return new DBManager(application);
    }
}

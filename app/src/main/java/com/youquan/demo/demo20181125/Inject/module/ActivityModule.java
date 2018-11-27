package com.youquan.demo.demo20181125.Inject.module;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;

/**
 * Activity级别的ActivitryModule
 */
@Module
public class ActivityModule {
    private final Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
   // @ActivityScope自定义注解
    Activity activity() {
        return this.activity;
    }
}

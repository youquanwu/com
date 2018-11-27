package com.youquan.demo.demo20181125.Inject.component;

import android.app.Activity;

import com.youquan.demo.demo20181125.Inject.module.ActivityModule;

import dagger.Component;

@Component(dependencies = AppComponent.class,modules = ActivityModule.class)
public interface ActivityComponent {

    void inject();
}

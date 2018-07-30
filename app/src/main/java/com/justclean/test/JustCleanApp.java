package com.justclean.test;

import android.app.Application;

import com.justclean.test.di.component.AppComponent;
import com.justclean.test.di.component.DaggerAppComponent;
import com.justclean.test.di.modules.ApplicationModule;

public class JustCleanApp extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent= DaggerAppComponent.builder().applicationModule
                (new ApplicationModule(this)).build();

    }
}

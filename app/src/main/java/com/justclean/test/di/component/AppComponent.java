package com.justclean.test.di.component;


import com.justclean.test.di.modules.ApplicationModule;
import com.justclean.test.view.SplashScreenActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by ajwan on 7/9/16.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface AppComponent {

    void inject(SplashScreenActivity splashScreenActivity);

}

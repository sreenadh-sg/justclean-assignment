package com.justclean.test.di.modules;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;

import com.justclean.test.JustCleanApp;

import dagger.Module;


/**
 * Created by ajwan on 7/9/16.
 */
@Module
public class ApplicationModule {


    JustCleanApp mApplication;

    public ApplicationModule(JustCleanApp application) {
        mApplication = application;
    }
    /*@Provides
    @Singleton
    DaoMaster provideDaoMaster(){
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(mApplication,
                "mpos-db", null);
        SQLiteDatabase db = helper.getWritableDatabase();
        return  new DaoMaster(db);
    }*/




}

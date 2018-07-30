package com.justclean.test.di.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by ajwan on 7/9/16.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface AppScope {

}

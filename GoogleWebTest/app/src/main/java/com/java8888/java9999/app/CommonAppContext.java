package com.java8888.java9999.app;

import android.app.Application;
import android.content.Context;

public class CommonAppContext extends Application {
    public static CommonAppContext sInstance;
    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
    }
    public static Context getAppContext() {
        return sInstance;
    }
}

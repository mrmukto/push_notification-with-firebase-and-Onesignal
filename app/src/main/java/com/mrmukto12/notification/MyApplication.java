package com.mrmukto12.notification;

import android.app.Application;

import com.onesignal.OneSignal;

public class MyApplication  extends Application {
    private static final String ONESIGNAL_APP_ID = "21216876-0d13-47c6-a981-bed51c9e2a0e";

    @Override
    public void onCreate() {
        super.onCreate();

        // Enable verbose OneSignal logging to debug issues if needed.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        // OneSignal Initialization
        OneSignal.initWithContext(this);
        OneSignal.setAppId(ONESIGNAL_APP_ID);
    }
}

package com.architecture.paging;

import android.app.Application;

import com.facebook.stetho.Stetho;

public class PaginationApplication extends Application {

    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}

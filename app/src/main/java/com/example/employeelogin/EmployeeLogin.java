package com.example.employeelogin;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

public class EmployeeLogin extends Application {
    @SuppressLint("StaticFieldLeak")
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    public static Context getApplicationInstance() {
        return context;
    }
}

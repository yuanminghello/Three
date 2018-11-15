package com.test.yuan.dian8;

import android.app.Application;

import com.umeng.socialize.PlatformConfig;
import com.umeng.socialize.UMShareAPI;

/**
 * date:2018/11/15
 * author:y(123)
 * function:
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        UMShareAPI.get(this);
    }
    {
        PlatformConfig.setQQZone("1106036236","mjFCi0oxXZKZEWJs");
    }

}

package com.example.a14161.oschina.application;

import android.app.Application;

import com.itheima.retrofitutils.ItheimaHttp;

/**
 * Created by 14161 on 2018/3/11.
 */

public class OsChinaApp extends Application {

    @Override
    public void onCreate(){
        super.onCreate();
        ItheimaHttp.init(this,Urls.getBaseUrl());
    }

}

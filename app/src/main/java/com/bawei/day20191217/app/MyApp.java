package com.bawei.day20191217.app;

import android.app.Application;
import android.content.Context;

/*
 *@Auther:祁壮壮
 *@Date: 2019/12/17
 *@Time:8:44
 *@Description功能: * */
// TODO: 2019/12/17  建一个MyApp类
public class MyApp extends Application {
    // TODO: 2019/12/17  私有上下文
    private Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        // TODO: 2019/12/17
        context = this;
    }
}

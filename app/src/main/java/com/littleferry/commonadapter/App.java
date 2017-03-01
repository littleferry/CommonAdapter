package com.littleferry.commonadapter;

import android.app.Application;

import com.blankj.utilcode.utils.Utils;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.umeng.analytics.MobclickAgent;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(getApplicationContext());
        MobclickAgent.setScenarioType(getApplicationContext(),
                MobclickAgent.EScenarioType.E_UM_NORMAL);
        Fresco.initialize(getApplicationContext());
    }

    @Override
    public String getPackageName() {
        return BuildConfig.APPLICATION_ID;
    }
}
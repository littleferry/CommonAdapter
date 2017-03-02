package com.littleferry.commonadapter;

import android.app.Application;

import com.blankj.utilcode.utils.Utils;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.umeng.analytics.MobclickAgent;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(getApplicationContext());
        MobclickAgent.setScenarioType(getApplicationContext(),
                MobclickAgent.EScenarioType.E_UM_NORMAL);
        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(this)
                .defaultDisplayImageOptions(new DisplayImageOptions.Builder()
                        .showImageOnLoading(R.mipmap.ic_launcher)
                        .showImageOnFail(R.mipmap.ic_launcher)
                        .showImageForEmptyUri(R.mipmap.ic_launcher)
                        .build())
                .build();
        ImageLoader.getInstance().init(config);
    }

    @Override
    public String getPackageName() {
        return BuildConfig.APPLICATION_ID;
    }
}
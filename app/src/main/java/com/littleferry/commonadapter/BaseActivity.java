package com.littleferry.commonadapter;

import android.support.v7.app.AppCompatActivity;

import com.umeng.analytics.MobclickAgent;

/**
 * Created by Administrator on 2017/2/24.
 */

public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onResume() {
        super.onResume();
        MobclickAgent.onResume(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        MobclickAgent.onPause(this);
    }
}

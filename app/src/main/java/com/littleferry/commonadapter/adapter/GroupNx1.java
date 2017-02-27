package com.littleferry.commonadapter.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by luozefeng on 2016/11/15.
 */

public class GroupNx1 extends GroupBase implements View.OnClickListener {
    private TextView mTextView;

    public GroupNx1(Context context, ViewGroup parent) {
        init(context, parent);
    }

    private void init(Context context, ViewGroup parent) {
        initView(context, parent);
    }

    protected void initView(Context context, ViewGroup parent) {
        view = new LinearLayout(context);
        Random myRandom = new Random();
        int color = 0xff000000 | myRandom.nextInt(0x00ffffff);
        view.setBackgroundColor(color);
        view.setOnClickListener(this);

        LinearLayout ll = (LinearLayout) view;
        mTextView = new TextView(context);
        ll.addView(mTextView);
    }

    @Override
    public void setData(CellDataBase d) {
        data = d;
        if (d != null) {
            mTextView.setText("类型：\n" + d.type);
        } else {
            view.setVisibility(View.GONE);
        }
    }

    @Override
    public void onClick(View v) {
        if (data != null) {
        }
    }
}

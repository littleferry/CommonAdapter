package com.littleferry.commonadapter.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.blankj.utilcode.utils.ScreenUtils;

import java.util.ArrayList;

/**
 * Created by luozefeng on 2016/11/15.
 */

public class CellGroupNx1 extends CellGroupBase {
    private static final int COUNT = 2;
    private int mCount = COUNT;
    private ArrayList<GroupNx1> mGroupList = new ArrayList<>();

    public CellGroupNx1(ViewGroup parent, int count) {
        initView(parent, count);
    }

    protected void initView(ViewGroup parent, int count) {
        mCount = count;
        view = new LinearLayout(parent.getContext());
        int sw = ScreenUtils.getScreenWidth();
        int w = sw / mCount;
        int h = w;
        if (mCount == 1) {
            // 如果是一行，屏幕宽度的五分之一
            h = h / 5;
        }

        LinearLayout ll = (LinearLayout) view;
        ll.setOrientation(LinearLayout.HORIZONTAL);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(w, h);

        for (int i = 0; i < mCount; i++) {
            GroupNx1 group = new GroupNx1(parent.getContext(), parent);
            mGroupList.add(group);
            ll.addView(group.getView());
            group.getView().setLayoutParams(lp);
        }
    }

    @Override
    public void setData(CellListDataBase d) {
        data = d;
        if (data != null && data.mList.size() > 0) {
            for (int i = 0; i < mCount; i++) {
                if (data.mList.size() > i) {
                    mGroupList.get(i).setData(data.mList.get(i));
                } else {
                    mGroupList.get(i).setData(null);
                }
            }
        } else {
            view.setVisibility(View.GONE);
        }
    }
}

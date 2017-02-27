package com.littleferry.commonadapter.adapter.celllistgroup;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.blankj.utilcode.utils.ScreenUtils;
import com.littleferry.commonadapter.adapter.celldata.CellDataBase;
import com.littleferry.commonadapter.adapter.cellgroup.CellGroupBase;
import com.littleferry.commonadapter.adapter.celllistdata.CellListDataBase;

import java.util.ArrayList;

/**
 * Created by luozefeng on 2016/11/15.
 * 列表Cell布局类基类
 */

public abstract class CellListGroupBase {
    protected View view;
    protected CellListDataBase data;

    protected static final int COUNT = 1;
    protected int mCount = COUNT;
    protected ArrayList<CellGroupBase> mGroupList = new ArrayList<>();

    public CellListDataBase getData() {
        return data;
    }

    public View getView() {
        return view;
    }

    protected abstract CellGroupBase newGroup(ViewGroup parent, CellDataBase cdb);

    protected void initView(ViewGroup parent, int count) {
        mCount = count;
        view = new LinearLayout(parent.getContext());
        int sw = ScreenUtils.getScreenWidth();
        int w = sw / mCount;
        int h = w;

        LinearLayout ll = (LinearLayout) view;
        ll.setOrientation(LinearLayout.HORIZONTAL);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(w, h);

        for (int i = 0; i < mCount; i++) {
            CellDataBase cdb = null;
            if (getData() != null && i < getData().mList.size()) {
                cdb = getData().mList.get(i);
            }
            CellGroupBase group = newGroup(parent, cdb);
            mGroupList.add(group);
            ll.addView(group.getView());
            group.getView().setLayoutParams(lp);
        }
    }

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

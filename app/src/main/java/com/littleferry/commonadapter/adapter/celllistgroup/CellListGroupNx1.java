package com.littleferry.commonadapter.adapter.celllistgroup;

import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.blankj.utilcode.utils.ScreenUtils;
import com.littleferry.commonadapter.adapter.celldata.CellDataBase;
import com.littleferry.commonadapter.adapter.cellgroup.CellGroupBase;
import com.littleferry.commonadapter.adapter.cellgroup.CellGroupNx1;

/**
 * Created by luozefeng on 2016/11/15.
 */

public class CellListGroupNx1 extends CellListGroupBase {
    protected static final int COUNT = 1;
    protected int mCount = COUNT;

    public CellListGroupNx1(ViewGroup parent, int count) {
        initView(parent, count);
    }

    private void initView(ViewGroup parent, int count) {
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

    @Override
    protected int getXCount() {
        return mCount;
    }

    @Override
    protected CellGroupBase newGroup(ViewGroup parent, CellDataBase cdb) {
        if (cdb != null) {
            return cdb.newGroup(parent);
        }
        return new CellGroupNx1(parent);
    }
}

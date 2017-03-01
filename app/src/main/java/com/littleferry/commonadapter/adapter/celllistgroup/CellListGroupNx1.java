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

        LinearLayout ll = (LinearLayout) view;
        ll.setOrientation(LinearLayout.HORIZONTAL);

        for (int i = 0; i < mCount; i++) {
            CellDataBase cdb = null;
            if (getData() != null && i < getData().mList.size()) {
                cdb = getData().mList.get(i);
            }
            CellGroupBase group = newGroup(parent, cdb);
            mGroupList.add(group);
            ll.addView(group.getView());
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

    @Override
    protected void calculateLayout() {
        if (data != null) {
            for (int i = 0; i < data.mList.size(); i++) {
                CellDataBase cdb = data.mList.get(i);
                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(cdb.width, cdb.height);
                mGroupList.get(i).getView().setLayoutParams(lp);
            }
        }
    }
}

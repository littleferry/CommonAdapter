package com.littleferry.commonadapter.adapter.celllistgroup;

import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.blankj.utilcode.utils.ScreenUtils;
import com.littleferry.commonadapter.adapter.celldata.CellDataBase;
import com.littleferry.commonadapter.adapter.cellgroup.CellGroupBase;
import com.littleferry.commonadapter.adapter.cellgroup.CellGroupNx1;
import com.littleferry.commonadapter.adapter.cellgroup.CellGroupTitle;

/**
 * Created by luozefeng on 2016/11/15.
 */

public class CellListGroupTitle extends CellListGroupBase {
    public CellListGroupTitle(ViewGroup parent) {
        initView(parent);
    }

    private void initView(ViewGroup parent) {
        view = new LinearLayout(parent.getContext());
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        // view.setLayoutParams(lp);

        int sw = ScreenUtils.getScreenWidth();
        int w = sw;
        int h = w / 5;

        LinearLayout ll = (LinearLayout) view;
        ll.setOrientation(LinearLayout.HORIZONTAL);
        // lp = new LinearLayout.LayoutParams(w, h);

        CellDataBase cdb = null;
        if (getData() != null && 0 < getData().mList.size()) {
            cdb = getData().mList.get(0);
        }
        CellGroupBase group = newGroup(parent, cdb);
        mGroupList.add(group);
        ll.addView(group.getView());
        group.getView().setLayoutParams(lp);
    }

    @Override
    protected int getXCount() {
        return 1;
    }

    @Override
    protected CellGroupBase newGroup(ViewGroup parent, CellDataBase cdb) {
        if (cdb != null) {
            return cdb.newGroup(parent);
        }
        return new CellGroupTitle(parent);
    }
}

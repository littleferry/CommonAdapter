package com.littleferry.commonadapter.adapter.celldata;

import android.view.View;
import android.view.ViewGroup;

import com.littleferry.commonadapter.adapter.cellgroup.CellGroupBase;
import com.littleferry.commonadapter.adapter.celllistdata.CellListDataBase;

/**
 * Created by Administrator on 2017/2/27.
 */

public abstract class CellDataBase {
    protected int mIndex;
    public CellListDataBase.LayoutType type;
    protected View.OnClickListener mOnClick;

    public abstract CellGroupBase newGroup(ViewGroup parent);

    public void setOnClickListener(View.OnClickListener onClick) {
        mOnClick = onClick;
    }

    public int getIndex() {
        return mIndex;
    }

    public void setIndex(int mIndex) {
        this.mIndex = mIndex;
    }

    public abstract void onClick(View v);
}

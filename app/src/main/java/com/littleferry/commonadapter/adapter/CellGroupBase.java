package com.littleferry.commonadapter.adapter;

import android.view.View;

/**
 * Created by luozefeng on 2016/11/15.
 * 列表Cell布局类基类
 */

public abstract class CellGroupBase {
    protected View view;
    protected BaseCellListData data;

    abstract public void setData(BaseCellListData bean);

    public BaseCellListData getData() {
        return data;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }
}

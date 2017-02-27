package com.littleferry.commonadapter.adapter;

import android.view.View;

/**
 * Created by luozefeng on 2016/11/15.
 * 列表Cell布局类基类
 */

public abstract class CellGroupBase {
    protected View view;
    protected CellListDataBase data;

    abstract public void setData(CellListDataBase bean);

    public CellListDataBase getData() {
        return data;
    }
    public View getView() {
        return view;
    }
}

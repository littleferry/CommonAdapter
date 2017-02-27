package com.littleferry.commonadapter.adapter;

import android.view.View;

/**
 * Created by luozefeng on 2016/11/15.
 * 控件布局类基类
 */

public abstract class GroupBase {
    protected CellDataBase data;
    protected View view;

    abstract public void setData(CellDataBase bean);

    public CellDataBase getData() {
        return data;
    }

    public View getView() {
        return view;
    }

}

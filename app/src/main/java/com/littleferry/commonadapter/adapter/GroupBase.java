package com.littleferry.commonadapter.adapter;

import android.view.View;

/**
 * Created by luozefeng on 2016/11/15.
 * 控件布局类基类
 */

public abstract class GroupBase {
    protected BaseCellData data;
    protected View view;

    abstract public void setData(BaseCellData bean);

    public BaseCellData getData() {
        return data;
    }

    public View getView() {
        return view;
    }

}

package com.littleferry.commonadapter.adapter.cellgroup;

import android.view.View;

import com.littleferry.commonadapter.adapter.celldata.CellDataBase;

/**
 * Created by luozefeng on 2016/11/15.
 * 控件布局类基类
 */

public abstract class CellGroupBase {
    protected CellDataBase data;
    protected View view;

    abstract public void setData(CellDataBase bean);

    public CellDataBase getData() {
        return data;
    }

    public View getView() {
        return view;
    }

    public void onClick(View v) {
        if (data != null) {
            data.onClick(v);
        }
    }
}

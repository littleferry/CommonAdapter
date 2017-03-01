package com.littleferry.commonadapter.adapter.cellgroup;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

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

    public void calculateLayout() {
        if (data != null) {
            ViewGroup.LayoutParams lp = view.getLayoutParams();
            if (lp.width != data.width || lp.height != data.height) {
                view.setLayoutParams(new LinearLayout.LayoutParams(data.width, data.height));
            }
        }
    }

    public void onClick(View v) {
        if (data != null) {
            data.onClick(v);
        }
    }
}

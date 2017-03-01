package com.littleferry.commonadapter.adapter.celllistgroup;

import android.view.View;
import android.view.ViewGroup;

import com.littleferry.commonadapter.adapter.celldata.CellDataBase;
import com.littleferry.commonadapter.adapter.cellgroup.CellGroupBase;
import com.littleferry.commonadapter.adapter.celllistdata.CellListDataBase;

import java.util.ArrayList;

/**
 * Created by luozefeng on 2016/11/15.
 * 列表Cell布局类基类
 */

public abstract class CellListGroupBase {
    protected View view;
    protected CellListDataBase data;

    protected ArrayList<CellGroupBase> mGroupList = new ArrayList<>();

    public CellListDataBase getData() {
        return data;
    }

    public View getView() {
        return view;
    }

    /**
     * 获取一行最多支持多少列
     * @return
     */
    protected abstract int getXCount();
    protected abstract CellGroupBase newGroup(ViewGroup parent, CellDataBase cdb);
    protected abstract void calculateLayout();

    public void setData(CellListDataBase d) {
        data = d;
        if (data != null && data.mList.size() > 0) {
            for (int i = 0; i < getXCount(); i++) {
                if (data.mList.size() > i) {
                    mGroupList.get(i).setData(data.mList.get(i));
                } else {
                    mGroupList.get(i).setData(null);
                }
            }
        } else {
            view.setVisibility(View.GONE);
        }
        calculateLayout();
    }
}

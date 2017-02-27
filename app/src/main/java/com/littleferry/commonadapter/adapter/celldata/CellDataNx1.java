package com.littleferry.commonadapter.adapter.celldata;

import android.view.View;
import android.view.ViewGroup;

import com.blankj.utilcode.utils.ToastUtils;
import com.littleferry.commonadapter.adapter.cellgroup.CellGroupBase;
import com.littleferry.commonadapter.adapter.cellgroup.CellGroupNx1;
import com.littleferry.commonadapter.adapter.celllistdata.CellListDataBase;

/**
 * Created by Administrator on 2017/2/27.
 */

public class CellDataNx1 extends CellDataBase {
    protected CellDataNx1() {

    }

    public CellDataNx1(CellListDataBase.LayoutType type) {
        this.type = type;
    }

    @Override
    public CellGroupBase newGroup(ViewGroup parent) {
        return new CellGroupNx1(parent);
    }

    @Override
    public void onClick(View v) {
        if (mOnClick != null) {
            mOnClick.onClick(v);
        } else {
            ToastUtils.showLongToast(type + " " + mIndex + " 被点击");
        }
    }
}

package com.littleferry.commonadapter.adapter.celldata;

import android.view.View;

import com.blankj.utilcode.utils.ToastUtils;
import com.littleferry.commonadapter.adapter.celllistdata.CellListDataBase;

/**
 * Created by Administrator on 2017/2/27.
 */

public abstract class CellDataNx1 extends CellDataBase {
    public CellDataNx1(CellListDataBase.LayoutType type) {
        this.type = type;
    }

    @Override
    public void onClick(View v) {
        if (mOnClick != null) {
            mOnClick.onClick(v);
        } else {
            ToastUtils.showLongToast(type + " 第" + (mIndexY + 1) + "行 第" + mIndexX + "列被点击");
        }
    }
}

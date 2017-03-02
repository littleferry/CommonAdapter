package com.littleferry.commonadapter.adapter.celldata;

import android.view.View;
import android.view.ViewGroup;

import com.blankj.utilcode.utils.ToastUtils;
import com.littleferry.commonadapter.adapter.cellgroup.CellGroupBanner;
import com.littleferry.commonadapter.adapter.cellgroup.CellGroupBase;
import com.littleferry.commonadapter.adapter.cellgroup.CellGroupNx1;
import com.littleferry.commonadapter.adapter.celllistdata.CellListDataBase;

/**
 * Created by Administrator on 2017/2/27.
 */

public class CellDataBanner extends CellData1x1 {
    public String imageUrl;

    public CellDataBanner(CellListDataBase.LayoutType type) {
        super(type);
    }

    @Override
    public CellGroupBase newGroup(ViewGroup parent) {
        return new CellGroupBanner(parent);
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

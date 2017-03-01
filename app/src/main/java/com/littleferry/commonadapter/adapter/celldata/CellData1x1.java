package com.littleferry.commonadapter.adapter.celldata;

import android.view.View;
import android.view.ViewGroup;

import com.blankj.utilcode.utils.ToastUtils;
import com.littleferry.commonadapter.adapter.cellgroup.CellGroup1x1;
import com.littleferry.commonadapter.adapter.cellgroup.CellGroupBase;
import com.littleferry.commonadapter.adapter.cellgroup.CellGroupNx1;
import com.littleferry.commonadapter.adapter.celllistdata.CellListDataBase;

/**
 * Created by Administrator on 2017/2/27.
 */

public class CellData1x1 extends CellDataNx1 {
    public CellData1x1(CellListDataBase.LayoutType type) {
        super(type);
    }

    @Override
    public CellGroupBase newGroup(ViewGroup parent) {
        return new CellGroup1x1(parent);
    }
}

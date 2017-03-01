package com.littleferry.commonadapter.adapter.celllistdata;

import android.view.ViewGroup;

import com.littleferry.commonadapter.adapter.celllistgroup.CellListGroup1x1;
import com.littleferry.commonadapter.adapter.celllistgroup.CellListGroup3x1;
import com.littleferry.commonadapter.adapter.celllistgroup.CellListGroupBase;

/**
 * Created by Administrator on 2017/2/27.
 */

public class CellListData3x1 extends CellListDataNx1 {
    public CellListData3x1() {
        mType = LayoutType.EType3x1;
    }

    @Override
    protected CellListGroupBase newCellGroup(ViewGroup parent) {
        return new CellListGroup3x1(parent);
    }
}

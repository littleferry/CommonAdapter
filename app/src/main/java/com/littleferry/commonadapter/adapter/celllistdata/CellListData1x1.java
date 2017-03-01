package com.littleferry.commonadapter.adapter.celllistdata;

import android.view.ViewGroup;

import com.littleferry.commonadapter.adapter.celllistgroup.CellListGroup1x1;
import com.littleferry.commonadapter.adapter.celllistgroup.CellListGroupBase;
import com.littleferry.commonadapter.adapter.celllistgroup.CellListGroupNx1;

/**
 * Created by Administrator on 2017/2/27.
 */

public class CellListData1x1 extends CellListDataNx1 {
    public CellListData1x1() {
        mType = LayoutType.EType1x1;
    }

    @Override
    protected CellListGroupBase newCellGroup(ViewGroup parent) {
        return new CellListGroup1x1(parent);
    }
}

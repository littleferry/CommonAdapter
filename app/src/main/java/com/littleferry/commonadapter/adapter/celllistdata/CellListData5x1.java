package com.littleferry.commonadapter.adapter.celllistdata;

import android.view.ViewGroup;

import com.littleferry.commonadapter.adapter.celllistgroup.CellListGroup1x1;
import com.littleferry.commonadapter.adapter.celllistgroup.CellListGroup5x1;
import com.littleferry.commonadapter.adapter.celllistgroup.CellListGroupBase;

/**
 * Created by Administrator on 2017/2/27.
 */

public class CellListData5x1 extends CellListDataNx1 {
    public CellListData5x1() {
        mType = LayoutType.EType5x1;
    }

    @Override
    protected CellListGroupBase newCellGroup(ViewGroup parent) {
        return new CellListGroup5x1(parent);
    }
}

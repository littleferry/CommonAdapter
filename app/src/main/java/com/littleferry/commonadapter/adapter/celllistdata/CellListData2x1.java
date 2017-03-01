package com.littleferry.commonadapter.adapter.celllistdata;

import android.view.ViewGroup;

import com.littleferry.commonadapter.adapter.celllistgroup.CellListGroup1x1;
import com.littleferry.commonadapter.adapter.celllistgroup.CellListGroup2x1;
import com.littleferry.commonadapter.adapter.celllistgroup.CellListGroupBase;

/**
 * Created by Administrator on 2017/2/27.
 */

public class CellListData2x1 extends CellListDataNx1 {
    public CellListData2x1() {
        mType = LayoutType.EType2x1;
    }

    @Override
    protected CellListGroupBase newCellGroup(ViewGroup parent) {
        return new CellListGroup2x1(parent);
    }
}

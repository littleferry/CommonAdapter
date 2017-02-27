package com.littleferry.commonadapter.adapter.celllistdata;

import android.view.ViewGroup;

import com.littleferry.commonadapter.adapter.celllistgroup.CellListGroupBase;
import com.littleferry.commonadapter.adapter.celllistgroup.CellListGroupNx1;

/**
 * Created by Administrator on 2017/2/27.
 */

public class CellListDataNx1 extends CellListDataBase {
    protected CellListDataNx1() {
    }

    public CellListDataNx1(LayoutType type) {
        mType = type;
    }

    @Override
    protected CellListGroupBase newCellGroup(ViewGroup parent) {
        return new CellListGroupNx1(parent, mType.ordinal());
    }
}

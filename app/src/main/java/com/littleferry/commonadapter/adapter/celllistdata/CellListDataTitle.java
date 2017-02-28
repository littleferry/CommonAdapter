package com.littleferry.commonadapter.adapter.celllistdata;

import android.view.ViewGroup;

import com.littleferry.commonadapter.adapter.celllistgroup.CellListGroupBase;
import com.littleferry.commonadapter.adapter.celllistgroup.CellListGroupNx1;
import com.littleferry.commonadapter.adapter.celllistgroup.CellListGroupTitle;

/**
 * Created by Administrator on 2017/2/27.
 */

public class CellListDataTitle extends CellListDataBase {

    public CellListDataTitle() {
        mType = LayoutType.ETypeTitle;
    }

    @Override
    protected CellListGroupBase newCellGroup(ViewGroup parent) {
        return new CellListGroupTitle(parent);
    }
}

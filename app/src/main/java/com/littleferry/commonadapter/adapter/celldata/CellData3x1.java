package com.littleferry.commonadapter.adapter.celldata;

import android.view.ViewGroup;

import com.littleferry.commonadapter.adapter.cellgroup.CellGroup1x1;
import com.littleferry.commonadapter.adapter.cellgroup.CellGroup3x1;
import com.littleferry.commonadapter.adapter.cellgroup.CellGroupBase;
import com.littleferry.commonadapter.adapter.celllistdata.CellListDataBase;

/**
 * Created by Administrator on 2017/2/27.
 */

public class CellData3x1 extends CellDataNx1 {
    public CellData3x1(CellListDataBase.LayoutType type) {
        super(type);
    }

    @Override
    public CellGroupBase newGroup(ViewGroup parent) {
        return new CellGroup3x1(parent);
    }
}

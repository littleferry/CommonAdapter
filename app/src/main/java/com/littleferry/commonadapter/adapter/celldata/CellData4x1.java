package com.littleferry.commonadapter.adapter.celldata;

import android.view.ViewGroup;

import com.littleferry.commonadapter.adapter.cellgroup.CellGroup1x1;
import com.littleferry.commonadapter.adapter.cellgroup.CellGroup4x1;
import com.littleferry.commonadapter.adapter.cellgroup.CellGroupBase;
import com.littleferry.commonadapter.adapter.celllistdata.CellListDataBase;

/**
 * Created by Administrator on 2017/2/27.
 */

public class CellData4x1 extends CellDataNx1 {
    public CellData4x1(CellListDataBase.LayoutType type) {
        super(type);
    }

    @Override
    public CellGroupBase newGroup(ViewGroup parent) {
        return new CellGroup4x1(parent);
    }
}

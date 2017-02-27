package com.littleferry.commonadapter.adapter.celllistgroup;

import android.view.ViewGroup;

import com.littleferry.commonadapter.adapter.celldata.CellDataBase;
import com.littleferry.commonadapter.adapter.cellgroup.CellGroupBase;
import com.littleferry.commonadapter.adapter.cellgroup.CellGroupNx1;

/**
 * Created by luozefeng on 2016/11/15.
 */

public class CellListGroupNx1 extends CellListGroupBase {
    public CellListGroupNx1(ViewGroup parent, int count) {
        initView(parent, count);
    }

    @Override
    protected CellGroupBase newGroup(ViewGroup parent, CellDataBase cdb) {
        if (cdb != null) {
            return cdb.newGroup(parent);
        }
        return new CellGroupNx1(parent);
    }
}

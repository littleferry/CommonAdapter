package com.littleferry.commonadapter.adapter.celllistgroup;

import android.view.ViewGroup;

import com.littleferry.commonadapter.adapter.celldata.CellDataBase;
import com.littleferry.commonadapter.adapter.cellgroup.CellGroupBase;
import com.littleferry.commonadapter.adapter.cellgroup.CellGroupTitle;

/**
 * Created by luozefeng on 2016/11/15.
 */

public class CellListGroupTitle extends CellListGroup1x1 {
    public CellListGroupTitle(ViewGroup parent) {
        super(parent);
    }

    @Override
    protected CellGroupBase newGroup(ViewGroup parent, CellDataBase cdb) {
        if (cdb != null) {
            return cdb.newGroup(parent);
        }
        return new CellGroupTitle(parent);
    }
}

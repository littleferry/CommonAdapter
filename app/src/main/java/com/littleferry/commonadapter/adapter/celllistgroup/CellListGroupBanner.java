package com.littleferry.commonadapter.adapter.celllistgroup;

import android.view.ViewGroup;

import com.littleferry.commonadapter.adapter.celldata.CellDataBase;
import com.littleferry.commonadapter.adapter.cellgroup.CellGroupBanner;
import com.littleferry.commonadapter.adapter.cellgroup.CellGroupBase;

/**
 * Created by luozefeng on 2016/11/15.
 */

public class CellListGroupBanner extends CellListGroup1x1 {
    public CellListGroupBanner(ViewGroup parent) {
        super(parent);
    }

    @Override
    protected CellGroupBase newGroup(ViewGroup parent, CellDataBase cdb) {
        if (cdb != null) {
            return cdb.newGroup(parent);
        }
        return new CellGroupBanner(parent);
    }
}

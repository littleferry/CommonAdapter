package com.littleferry.commonadapter.adapter.celllistdata;

import android.view.ViewGroup;

import com.littleferry.commonadapter.adapter.celllistgroup.CellListGroup1x1;
import com.littleferry.commonadapter.adapter.celllistgroup.CellListGroupBanner;
import com.littleferry.commonadapter.adapter.celllistgroup.CellListGroupBase;

/**
 * Created by Administrator on 2017/2/27.
 */

public class CellListDataBanner extends CellListData1x1 {
    public CellListDataBanner() {
        super();
        mType = LayoutType.ETypeBanner;
    }

    @Override
    protected CellListGroupBase newCellGroup(ViewGroup parent) {
        return new CellListGroupBanner(parent);
    }
}

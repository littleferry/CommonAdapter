package com.littleferry.commonadapter.adapter;

import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2017/2/27.
 */

public class CellListDataNx1 extends CellListDataBase {
    protected CellGroupBase mCellGroup;

    protected CellListDataNx1() {
    }

    public CellListDataNx1(LayoutType type) {
        mType = type;
    }

    @Override
    public CellGroupBase getCellGroup(ViewGroup parent, View convertView) {
        if (convertView == null) {
            mCellGroup = new CellGroupNx1(parent, mType.ordinal());
            mCellGroup.getView().setTag(mCellGroup);
        } else {
            mCellGroup = (CellGroupBase) convertView.getTag();
        }
        mCellGroup.setData(this);
        return mCellGroup;
    }
}

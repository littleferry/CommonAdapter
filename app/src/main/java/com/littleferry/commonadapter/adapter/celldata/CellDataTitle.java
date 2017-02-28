package com.littleferry.commonadapter.adapter.celldata;

import android.view.View;
import android.view.ViewGroup;

import com.blankj.utilcode.utils.ToastUtils;
import com.littleferry.commonadapter.adapter.cellgroup.CellGroupBase;
import com.littleferry.commonadapter.adapter.cellgroup.CellGroupNx1;
import com.littleferry.commonadapter.adapter.celllistdata.CellListDataBase;

/**
 * Created by Administrator on 2017/2/27.
 */

public class CellDataTitle extends CellDataBase {
    private String title;
    private String subTitle;

    protected CellDataTitle() {

    }

    public CellDataTitle(CellListDataBase.LayoutType type) {
        this.type = type;
    }

    @Override
    public CellGroupBase newGroup(ViewGroup parent) {
        return new CellGroupNx1(parent);
    }

    @Override
    public void onClick(View v) {
        if (mOnClick != null) {
            mOnClick.onClick(v);
        } else {
            ToastUtils.showLongToast(type + " 第" + mIndexY + "行 第" + mIndexX + "列被点击");
        }
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

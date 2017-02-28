package com.littleferry.commonadapter.adapter.celldata;

import android.view.View;
import android.view.ViewGroup;

import com.littleferry.commonadapter.adapter.cellgroup.CellGroupBase;
import com.littleferry.commonadapter.adapter.celllistdata.CellListDataBase;

import java.util.Random;

/**
 * Created by Administrator on 2017/2/27.
 */

public abstract class CellDataBase {
    public int mIndexX;
    public int mIndexY;

    public CellListDataBase.LayoutType type;
    protected View.OnClickListener mOnClick;

    public abstract CellGroupBase newGroup(ViewGroup parent);

    public void setOnClickListener(View.OnClickListener onClick) {
        mOnClick = onClick;
    }

    public abstract void onClick(View v);

    // 随机颜色，测试用
    protected Random mRandom = new Random();
    public int getRandomColor() {
        return 0xff000000 | mRandom.nextInt(0x00ffffff);
    }
}

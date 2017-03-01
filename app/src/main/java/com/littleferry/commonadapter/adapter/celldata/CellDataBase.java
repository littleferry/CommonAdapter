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

    // 数据对象对应的View宽和高
    public int width = ViewGroup.LayoutParams.WRAP_CONTENT;
    public int height = ViewGroup.LayoutParams.WRAP_CONTENT;

    public CellListDataBase.LayoutType type;
    protected View.OnClickListener mOnClick;

    public abstract CellGroupBase newGroup(ViewGroup parent);

    public void setOnClickListener(View.OnClickListener onClick) {
        mOnClick = onClick;
    }

    public abstract void onClick(View v);

    public String getInfo() {
        return "Type: " + type + " \nLine: " + (mIndexY + 1) + ",Col: " + (mIndexX + 1) + "" +
                "\nWxH: " + width + "x" + height;
    }

    // 随机颜色，测试用
    protected Random mRandom = new Random();

    public int getRandomColor() {
        return 0xff000000 | mRandom.nextInt(0x00ffffff);
    }
}

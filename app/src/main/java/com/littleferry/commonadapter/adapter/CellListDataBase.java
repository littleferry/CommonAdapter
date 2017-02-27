package com.littleferry.commonadapter.adapter;

import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/2/27.
 */

public abstract class CellListDataBase {
    // 通用ListViewAdapter的Type枚举值，可自由扩展
    public enum LayoutType {
        EType_None,
        EType1x1, // 1x1风格
        EType2x1, // 2x1风格
        EType3x1, // 3x1风格
        EType4x1, // 4x1风格
        EType5x1, // 5x1风格
        ETypeCount // 通用布局的总数
    }

    public LayoutType mType = LayoutType.EType_None;

    // 数据数组，二维数组
    public ArrayList<CellDataBase> mList = new ArrayList<>();

    public abstract CellGroupBase getCellGroup(ViewGroup parent, View convertView);
}

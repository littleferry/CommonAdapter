package com.littleferry.commonadapter.adapter.celllistdata;

import android.view.View;
import android.view.ViewGroup;

import com.littleferry.commonadapter.adapter.celllistgroup.CellListGroupBase;
import com.littleferry.commonadapter.adapter.celldata.CellDataBase;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/2/27.
 */

public abstract class CellListDataBase {
    // 通用ListViewAdapter的Type枚举值，可自由扩展
    public enum LayoutType {
        ETypeNone,
        EType1x1, // 1x1风格
        EType2x1, // 2x1风格
        EType3x1, // 3x1风格
        EType4x1, // 4x1风格
        EType5x1, // 5x1风格
        ETypeTitle, // Title风格
        ETypeBanner, // Banner风格
        ETypeCount // 通用布局的总数
    }

    public LayoutType mType = LayoutType.ETypeNone;

    // 数据数组，二维数组
    public ArrayList<CellDataBase> mList = new ArrayList<>();

    /**
     *
     * @param parent
     * @param convertView
     * @return
     */
    public CellListGroupBase getCellGroup(ViewGroup parent, View convertView){
        CellListGroupBase cellGroup;
        if (convertView == null) {
            cellGroup = newCellGroup(parent);
            cellGroup.getView().setTag(cellGroup);
        } else {
            cellGroup = (CellListGroupBase) convertView.getTag();
        }
        cellGroup.setData(this);
        return cellGroup;
    }

    /**
     * 派生类必须实现此函数，创建一个新的 CellGroupBase 实例返回
     * @param parent
     * @return
     */
    protected abstract CellListGroupBase newCellGroup(ViewGroup parent);
}

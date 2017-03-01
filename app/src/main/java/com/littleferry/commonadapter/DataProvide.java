package com.littleferry.commonadapter;

import android.view.ViewGroup;

import com.blankj.utilcode.utils.ScreenUtils;
import com.littleferry.commonadapter.adapter.celldata.CellDataNx1;
import com.littleferry.commonadapter.adapter.celldata.CellDataTitle;
import com.littleferry.commonadapter.adapter.celllistdata.CellListDataBase;
import com.littleferry.commonadapter.adapter.celllistdata.CellListDataNx1;
import com.littleferry.commonadapter.adapter.celllistdata.CellListDataTitle;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Administrator on 2017/3/1.
 */

public class DataProvide {
    public static ArrayList<CellListDataBase> getList() {
        ArrayList<CellListDataBase> list = new ArrayList<>();
        Random random = new Random();

        int index = 0;
        for (int i = CellListDataBase.LayoutType.ETypeTitle.ordinal() - 1; i < 100; i++) {
            CellListDataBase.LayoutType type;
            CellListDataBase cldb;
            int t = (random.nextInt(0x00ffffff) % CellListDataBase.LayoutType.ETypeCount.ordinal());
            if (t == CellListDataBase.LayoutType.ETypeTitle.ordinal()) {
                index++;
                type = CellListDataBase.LayoutType.ETypeTitle;
                cldb = new CellListDataTitle();
                list.add(cldb);
                CellDataTitle cdt = new CellDataTitle(type);
                cdt.mIndexY = index;
                cdt.mIndexX = 0;
                cdt.width = ViewGroup.LayoutParams.MATCH_PARENT;
                cdt.height = ViewGroup.LayoutParams.WRAP_CONTENT;
                cdt.setTitle("我是标题 " + index);
                cdt.setSubTitle("我是副标题 " + index);
                cdt.setText("WxH: " + cdt.width + "x" + cdt.height);
                cldb.mList.add(cdt);
            } else if (t >= CellListDataBase.LayoutType.EType1x1.ordinal() && t <= CellListDataBase.LayoutType.EType5x1.ordinal()) {
                if (t == CellListDataBase.LayoutType.EType1x1.ordinal()) {
                    type = CellListDataBase.LayoutType.EType1x1;
                } else if (t == CellListDataBase.LayoutType.EType2x1.ordinal()) {
                    type = CellListDataBase.LayoutType.EType2x1;
                } else if (t == CellListDataBase.LayoutType.EType3x1.ordinal()) {
                    type = CellListDataBase.LayoutType.EType3x1;
                } else if (t == CellListDataBase.LayoutType.EType4x1.ordinal()) {
                    type = CellListDataBase.LayoutType.EType4x1;
                } else if (t == CellListDataBase.LayoutType.EType5x1.ordinal()) {
                    type = CellListDataBase.LayoutType.EType5x1;
                } else {
                    continue;
                }
                cldb = new CellListDataNx1(type);
                list.add(cldb);
                for (int j = 0; j < type.ordinal(); j++) {
                    CellDataNx1 cd = new CellDataNx1(type);
                    cd.mIndexY = i - CellListDataBase.LayoutType.ETypeTitle.ordinal() + 1;
                    cd.mIndexX = j;
                    cd.width = ScreenUtils.getScreenWidth() / type.ordinal();
                    cd.height = cd.width * (j + 1);
                    if (type == CellListDataBase.LayoutType.EType1x1) {
                        cd.height = cd.width / 2;
                    }

                    cd.setText("类型：" + cd.type + " \n第" +
                            (cd.mIndexY + 1) + "行第" + cd.mIndexX + "列" +
                            "\nWxH: " + cd.width + "x" + cd.height);
                    cldb.mList.add(cd);
                }
            }
        }
        return list;
    }
}

package com.littleferry.commonadapter;

import android.view.ViewGroup;

import com.blankj.utilcode.utils.ScreenUtils;
import com.littleferry.commonadapter.adapter.celldata.CellData1x1;
import com.littleferry.commonadapter.adapter.celldata.CellData2x1;
import com.littleferry.commonadapter.adapter.celldata.CellData3x1;
import com.littleferry.commonadapter.adapter.celldata.CellData4x1;
import com.littleferry.commonadapter.adapter.celldata.CellData5x1;
import com.littleferry.commonadapter.adapter.celldata.CellDataBanner;
import com.littleferry.commonadapter.adapter.celldata.CellDataTitle;
import com.littleferry.commonadapter.adapter.celllistdata.CellListData1x1;
import com.littleferry.commonadapter.adapter.celllistdata.CellListData2x1;
import com.littleferry.commonadapter.adapter.celllistdata.CellListData3x1;
import com.littleferry.commonadapter.adapter.celllistdata.CellListData4x1;
import com.littleferry.commonadapter.adapter.celllistdata.CellListData5x1;
import com.littleferry.commonadapter.adapter.celllistdata.CellListDataBanner;
import com.littleferry.commonadapter.adapter.celllistdata.CellListDataBase;
import com.littleferry.commonadapter.adapter.celllistdata.CellListDataTitle;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/3/1.
 */

public class DataProvide {
    public static ArrayList<CellListDataBase> getList() {
        ArrayList<CellListDataBase> list = new ArrayList<>();

        int sw = ScreenUtils.getScreenWidth();
        int count = CellListDataBase.LayoutType.ETypeCount.ordinal();
        for (int i = 0; i < 10 * count; i++) {
            CellListDataBase.LayoutType type;
            CellListDataBase cldb;
            int t = (i % (count - 1)) + 1;
            if (t == CellListDataBase.LayoutType.ETypeTitle.ordinal()) {
                type = CellListDataBase.LayoutType.ETypeTitle;
                cldb = new CellListDataTitle();
                list.add(cldb);
                CellDataTitle d = new CellDataTitle(type);
                d.mIndexY = i;
                d.mIndexX = 0;
                d.width = ViewGroup.LayoutParams.MATCH_PARENT;
                d.height = ViewGroup.LayoutParams.WRAP_CONTENT;
                d.setTitle("Title");
                d.setSubTitle("SubTitle");
                cldb.mList.add(d);
            } else if (t == CellListDataBase.LayoutType.ETypeBanner.ordinal()) {
                type = CellListDataBase.LayoutType.ETypeBanner;
                cldb = new CellListDataBanner();
                list.add(cldb);
                CellDataBanner d = new CellDataBanner(type);
                d.mIndexY = i;
                d.mIndexX = 0;
                d.width = ViewGroup.LayoutParams.MATCH_PARENT;
                d.height = sw / 2;
                cldb.mList.add(d);
            } else if (t == CellListDataBase.LayoutType.EType1x1.ordinal()) {
                type = CellListDataBase.LayoutType.EType1x1;
                cldb = new CellListData1x1();
                list.add(cldb);
                for (int j = 0; j < type.ordinal(); j++) {
                    CellData1x1 d = new CellData1x1(type);
                    d.mIndexY = i;
                    d.mIndexX = j;
                    d.width = sw / type.ordinal();
                    d.height = d.width / 2;
                    cldb.mList.add(d);
                }
            } else if (t == CellListDataBase.LayoutType.EType2x1.ordinal()) {
                type = CellListDataBase.LayoutType.EType2x1;
                cldb = new CellListData2x1();
                list.add(cldb);
                for (int j = 0; j < type.ordinal(); j++) {
                    CellData2x1 d = new CellData2x1(type);
                    d.mIndexY = i;
                    d.mIndexX = j;
                    d.width = sw / type.ordinal();
                    d.height = d.width * (j + 1);
                    cldb.mList.add(d);
                }
            } else if (t == CellListDataBase.LayoutType.EType3x1.ordinal()) {
                type = CellListDataBase.LayoutType.EType3x1;
                cldb = new CellListData3x1();
                list.add(cldb);
                for (int j = 0; j < type.ordinal(); j++) {
                    CellData3x1 d = new CellData3x1(type);
                    d.mIndexY = i;
                    d.mIndexX = j;
                    d.width = sw / type.ordinal();
                    d.height = d.width * (j + 1);
                    cldb.mList.add(d);
                }
            } else if (t == CellListDataBase.LayoutType.EType4x1.ordinal()) {
                type = CellListDataBase.LayoutType.EType4x1;
                cldb = new CellListData4x1();
                list.add(cldb);
                for (int j = 0; j < type.ordinal(); j++) {
                    CellData4x1 d = new CellData4x1(type);
                    d.mIndexY = i;
                    d.mIndexX = j;
                    d.width = sw / type.ordinal();
                    d.height = d.width * (j + 1);
                    cldb.mList.add(d);
                }
            } else if (t == CellListDataBase.LayoutType.EType5x1.ordinal()) {
                type = CellListDataBase.LayoutType.EType5x1;
                cldb = new CellListData5x1();
                list.add(cldb);
                for (int j = 0; j < type.ordinal(); j++) {
                    CellData5x1 d = new CellData5x1(type);
                    d.mIndexY = i;
                    d.mIndexX = j;
                    d.width = sw / type.ordinal();
                    d.height = d.width * (j + 1);
                    cldb.mList.add(d);
                }
            }
        }
        return list;
    }
}

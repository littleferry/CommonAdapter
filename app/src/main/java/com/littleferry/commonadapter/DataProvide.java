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
import java.util.Random;

/**
 * Created by Administrator on 2017/3/1.
 */

public class DataProvide {
    public static final String ImageUrl[] = {"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1488424680437&di=d11ca73da0fa7f7aa376b570901a7af2&imgtype=0&src=http%3A%2F%2Fimg.club.pchome.net%2Fkdsarticle%2F2014%2F03small%2F18%2Fbfcbc9c9a0d3cc8b57c1523af28193cc_1000x750.jpg",
    "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1488424680436&di=4ccf380d4b91e2ef7d10bc33286676b2&imgtype=0&src=http%3A%2F%2Fimage89.360doc.com%2FDownloadImg%2F2015%2F10%2F1117%2F60080978_51.jpg",
    "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1488424680435&di=51541a1e3f0a3a6ab340462787268ad1&imgtype=0&src=http%3A%2F%2Fimg.sj33.cn%2Fuploads%2Fallimg%2F201503%2F7-150303234610.jpg",
    "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1488424680471&di=a7c85b5f128e5551be7c595fb51a5bc7&imgtype=0&src=http%3A%2F%2Fpic2.ooopic.com%2F12%2F13%2F96%2F42bOOOPICb2_1024.jpg"};
    public static ArrayList<CellListDataBase> getList() {
        ArrayList<CellListDataBase> list = new ArrayList<>();
        Random random = new Random();

        int sw = ScreenUtils.getScreenWidth();
        int count = CellListDataBase.LayoutType.ETypeCount.ordinal();
        for (int i = 0; i < 100 * count; i++) {
            CellListDataBase.LayoutType type;
            CellListDataBase cldb;
            int t = (i % (count + 1)) + 1;
            // t = CellListDataBase.LayoutType.ETypeBanner.ordinal();
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
                d.height = ViewGroup.LayoutParams.WRAP_CONTENT;
                d.imageUrl = ImageUrl[i % ImageUrl.length];
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
                    d.height = d.width * (random.nextInt(type.ordinal()) + 1);
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
                    d.height = d.width * (random.nextInt(type.ordinal()) + 1);
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
                    d.height = d.width * (random.nextInt(type.ordinal()) + 1);
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
                    d.height = d.width * (random.nextInt(type.ordinal()) + 1);
                    cldb.mList.add(d);
                }
            }
        }
        return list;
    }
}

package com.littleferry.commonadapter.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.littleferry.commonadapter.adapter.celllistdata.CellListDataBase;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/2/27.
 */

public class CommonAdapter extends BaseAdapter {

    private ArrayList<CellListDataBase> mList = new ArrayList<>();

    public ArrayList<CellListDataBase> getList() {
        return mList;
    }

    /**
     * 替换list数据
     * @param list
     */
    public void replaceList(ArrayList<CellListDataBase> list) {
        mList = list;
        notifyDataSetChanged();
    }

    /**
     * 重新设置list数据，adapter复制了一份数据放到新的数组中
     * @param list
     */
    public void resetList(ArrayList<CellListDataBase> list) {
        if (mList == null) {
            mList = new ArrayList<>();
        } else {
            mList.clear();
        }
        mList.addAll(list);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int i) {
        return mList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return mList.get(position).getCellGroup(parent, convertView).getView();
    }

    @Override
    public int getItemViewType(int position) {
        if (mList == null || position >= mList.size() || mList.get(position) == null) {
            return 0;
        }
        return mList.get(position).mType.ordinal();
    }

    @Override
    public int getViewTypeCount() {
        return CellListDataBase.LayoutType.ETypeCount.ordinal();
    }
}

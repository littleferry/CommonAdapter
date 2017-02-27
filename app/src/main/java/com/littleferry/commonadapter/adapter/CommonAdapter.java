package com.littleferry.commonadapter.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/2/27.
 */

public class CommonAdapter extends BaseAdapter {

    private ArrayList<BaseCellListData> mList = new ArrayList<>();

    public ArrayList<BaseCellListData> getList() {
        return mList;
    }

    public void setList(ArrayList<BaseCellListData> list) {
        this.mList.clear();
        this.mList.addAll(list);
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
        BaseCellListData bcld = mList.get(position);
        View view = convertView;
        CellGroupBase cgb = null;
        if (view == null) {
            switch (bcld.mType) {
                case EType1x1:
                case EType2x1:
                case EType3x1:
                case EType4x1:
                case EType5x1: {
                    cgb = new CellGroupNx1(parent.getContext(), parent, bcld.mType.ordinal());
                    break;
                }
                default:
                    break;
            }
            view = cgb.getView();
            view.setTag(cgb);
        } else {
            cgb = (CellGroupBase) convertView.getTag();
            cgb.setData(bcld);
        }
        return view;
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
        return BaseCellListData.LayoutType.ETypeCount.ordinal();
    }
}

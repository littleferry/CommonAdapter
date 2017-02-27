package com.littleferry.commonadapter.adapter.cellgroup;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.littleferry.commonadapter.adapter.celldata.CellDataBase;

import java.util.Random;

/**
 * Created by luozefeng on 2016/11/15.
 */

public class CellGroupNx1 extends CellGroupBase implements View.OnClickListener {
    private TextView mTextView;

    public CellGroupNx1(ViewGroup parent) {
        init(parent);
    }

    private void init(ViewGroup parent) {
        initView(parent);
    }

    protected void initView(ViewGroup parent) {
        view = new LinearLayout(parent.getContext());
        Random myRandom = new Random();
        int color = 0xff000000 | myRandom.nextInt(0x00ffffff);
        view.setBackgroundColor(color);
        view.setOnClickListener(this);

        LinearLayout ll = (LinearLayout) view;
        mTextView = new TextView(parent.getContext());
        ll.addView(mTextView);

        view.setOnClickListener(this);
    }

    @Override
    public void setData(CellDataBase d) {
        data = d;
        if (d != null) {
            mTextView.setText("类型：" + d.type + " \n编号：" + d.getIndex());
        } else {
            view.setVisibility(View.GONE);
        }
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
    }
}

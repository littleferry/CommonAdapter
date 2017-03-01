package com.littleferry.commonadapter.adapter.cellgroup;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.littleferry.commonadapter.adapter.celldata.CellDataBase;
import com.littleferry.commonadapter.adapter.celldata.CellDataTitle;

/**
 * Created by luozefeng on 2016/11/15.
 */

public class CellGroupTitle extends CellGroup1x1 implements View.OnClickListener {
    private TextView mTitleTv;
    private TextView mSubTitleTv;
    private TextView mTextTv;

    public CellGroupTitle(ViewGroup parent) {
        super(parent);
    }

    protected void initView(ViewGroup parent) {
        view = new LinearLayout(parent.getContext());
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        view.setOnClickListener(this);

        LinearLayout ll = (LinearLayout) view;
        ll.setOrientation(LinearLayout.VERTICAL);
        mTitleTv = new TextView(parent.getContext());
        mSubTitleTv = new TextView(parent.getContext());
        mTextTv = new TextView(parent.getContext());
        ll.addView(mTitleTv, lp);
        ll.addView(mSubTitleTv, lp);
        ll.addView(mTextTv, lp);

        mTitleTv.setTextSize(30);
        mSubTitleTv.setTextSize(20);
        mTextTv.setTextSize(20);

        view.setOnClickListener(this);
    }

    @Override
    public void setData(CellDataBase d) {
        data = d;
        if (d != null && d instanceof CellDataTitle) {
            view.setBackgroundColor(Color.LTGRAY);
            mTitleTv.setTextColor(Color.WHITE);
            mSubTitleTv.setTextColor(Color.WHITE);
            mTextTv.setTextColor(Color.WHITE);
            CellDataTitle cdt = (CellDataTitle) d;
            mTitleTv.setText(cdt.getTitle());
            mSubTitleTv.setText(cdt.getSubTitle());
            mTextTv.setText(cdt.getInfo());
        } else {
            view.setVisibility(View.GONE);
        }
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
    }
}

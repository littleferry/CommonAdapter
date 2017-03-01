package com.littleferry.commonadapter.adapter.cellgroup;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.littleferry.commonadapter.adapter.celldata.CellDataBase;
import com.littleferry.commonadapter.adapter.celldata.CellDataTitle;

import java.util.Random;

/**
 * Created by luozefeng on 2016/11/15.
 */

public class CellGroupTitle extends CellGroupBase implements View.OnClickListener {
    private TextView mTitleTv;
    private TextView mSubTitleTv;
    private TextView mTextTv;

    public CellGroupTitle(ViewGroup parent) {
        init(parent);
    }

    private void init(ViewGroup parent) {
        initView(parent);
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
            view.setBackgroundColor(d.getRandomColor());
            mTitleTv.setTextColor(d.getRandomColor());
            mSubTitleTv.setTextColor(d.getRandomColor());
            mTextTv.setTextColor(d.getRandomColor());
            CellDataTitle cdt = (CellDataTitle) d;
            mTitleTv.setText(cdt.getTitle());
            mSubTitleTv.setText(cdt.getSubTitle());
            mTextTv.setText(cdt.getText());
        } else {
            view.setVisibility(View.GONE);
        }
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
    }
}

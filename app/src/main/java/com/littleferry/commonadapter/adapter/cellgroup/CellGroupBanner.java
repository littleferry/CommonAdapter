package com.littleferry.commonadapter.adapter.cellgroup;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.littleferry.commonadapter.adapter.celldata.CellDataBanner;
import com.littleferry.commonadapter.adapter.celldata.CellDataBase;
import com.nostra13.universalimageloader.core.ImageLoader;

/**
 * Created by luozefeng on 2016/11/15.
 */

public class CellGroupBanner extends CellGroup1x1 implements View.OnClickListener {
    private ImageView mImageView;

    public CellGroupBanner(ViewGroup parent) {
        super(parent);
    }

    protected void initView(ViewGroup parent) {
        view = new LinearLayout(parent.getContext());
        view.setOnClickListener(this);

        LinearLayout ll = (LinearLayout) view;
        ll.setOrientation(LinearLayout.VERTICAL);
        mImageView = new ImageView(parent.getContext());
        // mImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ll.addView(mImageView);

        view.setOnClickListener(this);
    }

    @Override
    public void setData(CellDataBase d) {
        data = d;
        if (d != null) {
            // view.setBackgroundColor(d.getRandomColor());

            CellDataBanner cdb = (CellDataBanner) d;
            ImageLoader imageLoader = ImageLoader.getInstance(); // Get singleton instance
            imageLoader.displayImage(cdb.imageUrl, mImageView);
        } else {
            view.setVisibility(View.GONE);
        }
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
    }
}

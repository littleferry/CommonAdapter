package com.littleferry.commonadapter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.blankj.utilcode.utils.Utils;
import com.littleferry.commonadapter.adapter.CellListDataBase;
import com.littleferry.commonadapter.adapter.CellListDataNx1;
import com.littleferry.commonadapter.adapter.CellDataNx1;
import com.littleferry.commonadapter.adapter.CommonAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private CommonAdapter mAdapter;
    private ArrayList<CellListDataBase> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Utils.init(this);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        mListView = new ListView(this);
        RelativeLayout content_main = (RelativeLayout) findViewById(R.id.content_main);
        content_main.addView(mListView);
        mListView.setDividerHeight(0);

        mAdapter = new CommonAdapter();
        mListView.setAdapter(mAdapter);
        mList = new ArrayList<>();

        // 测试代码数据开始
        for (int i = 0; i < 100; i++) {
            CellListDataBase.LayoutType type = CellListDataBase.LayoutType.EType1x1;
            int t = i% CellListDataBase.LayoutType.ETypeCount.ordinal() + 1;
            if (t == CellListDataBase.LayoutType.EType2x1.ordinal()) {
                type = CellListDataBase.LayoutType.EType2x1;
            } else if (t == CellListDataBase.LayoutType.EType3x1.ordinal()) {
                type = CellListDataBase.LayoutType.EType3x1;
            } else if (t == CellListDataBase.LayoutType.EType4x1.ordinal()) {
                type = CellListDataBase.LayoutType.EType4x1;
            } else if (t == CellListDataBase.LayoutType.EType5x1.ordinal()) {
                type = CellListDataBase.LayoutType.EType5x1;
            }
            CellListDataNx1 data = new CellListDataNx1(type);
            mList.add(data);
            for (int j = 0; j < type.ordinal(); j++) {
                data.mList.add(new CellDataNx1(type));
            }
        }
        //测试代码数据结束

        mAdapter.resetList(mList);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

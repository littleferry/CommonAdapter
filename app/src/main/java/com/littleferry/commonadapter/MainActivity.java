package com.littleferry.commonadapter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.blankj.utilcode.utils.ActivityUtils;
import com.blankj.utilcode.utils.ToastUtils;
import com.blankj.utilcode.utils.Utils;
import com.littleferry.commonadapter.adapter.CommonAdapter;
import com.littleferry.commonadapter.adapter.celllistdata.CellListDataBase;

import java.util.ArrayList;

public class MainActivity extends BaseActivity implements View.OnClickListener {

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
                ActivityUtils.launchActivity(MainActivity.this,
                        getPackageName(),
                        DemoListViewActivity.class.getName());
            }
        });

        mListView = new ListView(this);
        RelativeLayout content_main = (RelativeLayout) findViewById(R.id.content_main);
        content_main.addView(mListView);
        mListView.setDividerHeight(0);

        mAdapter = new CommonAdapter();
        mListView.setAdapter(mAdapter);
        mList = DataProvide.getList();

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

    @Override
    public void onClick(View view) {
        ToastUtils.showLongToast(view + " 被点击");
    }
}

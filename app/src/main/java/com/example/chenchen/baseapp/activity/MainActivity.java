package com.example.chenchen.baseapp.activity;

import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TabHost;
import android.widget.TextView;

import com.example.chenchen.baseapp.R;
import com.example.chenchen.baseapp.fragment.ControlFragmentFragment;
import com.example.chenchen.baseapp.fragment.EnvirFragmentFragment;
import com.example.chenchen.baseapp.fragment.HistoryFragmentFragment;

public class MainActivity extends AppCompatActivity {
    private FragmentTabHost tabHost;
    private String[] tags = { "Fragment1", "Fragment2", "Fragment3",  };
    private Class[] fragments = { EnvirFragmentFragment.class, ControlFragmentFragment.class,
            HistoryFragmentFragment.class };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        initView();
    }



    private void initView() {
        // TODO Auto-generated method stub
        tabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        tabHost.setup(this, getSupportFragmentManager(),R.id.realtabcontent);
        addTab();
        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {

            @Override
            public void onTabChanged(String arg0) {
                // TODO Auto-generated method stub


            }
        });
    }
    private void addTab() {
        // TODO Auto-generated method stub
        for (int i = 0; i < tags.length; i++) {
            TabHost.TabSpec spec=tabHost.newTabSpec(tags[i]).setIndicator(getItemView(i));
            tabHost.addTab(spec, fragments[i], null);
            tabHost.getTabWidget().getChildAt(i).setBackgroundResource(R.drawable.ic_tab_bg);
        }


    }
    public View getItemView(int index){
        LayoutInflater mInflater=LayoutInflater.from(this);
        View view=mInflater.inflate(R.layout.tab_indicator, tabHost.getTabWidget(),false);
        TextView textView=(TextView) view.findViewById(R.id.nav_text);
        textView.setText(tags[index]);
        return view;
    }
}

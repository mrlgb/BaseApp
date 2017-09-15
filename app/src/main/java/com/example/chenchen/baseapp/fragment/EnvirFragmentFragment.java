package com.example.chenchen.baseapp.fragment;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import com.example.chenchen.baseapp.R;
import com.example.chenchen.baseapp.activity.ActivityTestActivity;
import com.example.chenchen.baseapp.adapter.GridItmeAdapter;

import java.util.ArrayList;

public class EnvirFragmentFragment extends Fragment implements AdapterView.OnItemClickListener {

    private GridView sensorGridView;
    private GridItmeAdapter myAdapter;
    private ArrayList<String> datas;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.envir_fragment, null);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        sensorGridView = (GridView) view.findViewById(R.id.sensor_grid_view);
        init();
    }

    public void init() {
        datas = new ArrayList<String>();
        getData(10);
        myAdapter = new GridItmeAdapter(getActivity(), datas);
        sensorGridView.setAdapter(myAdapter);
        sensorGridView.setOnItemClickListener(this);

    }

    public void getData(int i) {
        for (int j = 0; j < i; j++) {
            datas.add("按钮" + j);
        }
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        switch (position){
            case 0:
                Intent intent=new Intent(getActivity(),ActivityTestActivity.class);
               intent.putExtra("shuju" ,"按钮"+position+"开启的Activity");
                startActivity(intent);

                break;
            case 1:
                Intent intent1=new Intent(getActivity(),ActivityTestActivity.class);
                intent1.putExtra("shuju" ,"按钮"+position+"开启的Activity");
                startActivity(intent1);
                break;
            default:
                Intent intent2=new Intent(getActivity(),ActivityTestActivity.class);
                intent2.putExtra("shuju" ,"按钮"+position+"开启的Activity");
                startActivity(intent2);
                break;
        }
    }
}

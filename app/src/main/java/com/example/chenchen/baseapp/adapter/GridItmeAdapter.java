package com.example.chenchen.baseapp.adapter;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

import com.example.chenchen.baseapp.R;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class GridItmeAdapter extends BaseAdapter {

    private List<String> datas;

    private Context context;
    private LayoutInflater layoutInflater;

    public GridItmeAdapter(Context context, ArrayList<String> datas) {
        this.context = context;
        this.datas = datas;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return datas.size();
    }

    @Override
    public Object getItem(int position) {
        return datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.grid_itme, null);
            convertView.setTag(new ViewHolder(convertView));
        }
        initializeViews((String) getItem(position), (ViewHolder) convertView.getTag());
        return convertView;
    }

    private void initializeViews(String object, ViewHolder holder) {
        //TODO implement
        holder.button.setText(object);
    }

    protected class ViewHolder {
        private Button button;

        public ViewHolder(View view) {
            button = (Button) view.findViewById(R.id.button);
        }
    }
}

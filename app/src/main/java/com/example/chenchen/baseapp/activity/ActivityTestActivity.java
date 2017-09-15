package com.example.chenchen.baseapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

import com.example.chenchen.baseapp.R;


public class ActivityTestActivity extends Activity  {


    private TextView test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        test = (TextView) findViewById(R.id.test);

        Intent intent=getIntent();//getIntent将该项目中包含的原始intent检索出来，将检索出来的intent赋值给一个Intent类型的变量intent
        Bundle bundle=intent.getExtras();//.getExtras()得到intent所附带的额外数据
        String str=bundle.getString("shuju");//getString()返回指定key的值
       test.setText(str);
    }


}

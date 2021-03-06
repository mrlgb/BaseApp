package com.example.chenchen.baseapp.activity;

import android.os.Build;
import android.os.Bundle;

import android.view.Menu;


import com.example.chenchen.baseapp.R;


public class ActivityTestActivity extends BaseSaveActivity  {
    private static final String TAG = ActivityTestActivity.class.getSimpleName();

    protected int getLayoutResId() {
        return 0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int layoutResId = getLayoutResId();
        if (layoutResId == 0) {
            finish();
        }

        setContentView(layoutResId);

        initActivity(savedInstanceState);

    }

    protected void initActivity(Bundle savedInstanceState) {
    }

    /**
     * animate the views if we close the activity
     */
    public void onBackPressed() {
//        for (int i = mRowContainer.getChildCount() - 1; i > 0; i--)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            finishAfterTransition();
        } else {
            finish();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_save,menu);
        return true;
    }


}

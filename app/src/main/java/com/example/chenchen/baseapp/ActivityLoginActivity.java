package com.example.chenchen.baseapp;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

import com.example.chenchen.baseapp.activity.MainActivity;

public class ActivityLoginActivity extends Activity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findViewById(R.id.login).setOnClickListener(this);
        findViewById(R.id.register).setOnClickListener(this);
    }

    private EditText getUser(){
        return (EditText) findViewById(R.id.user);
    }

    private EditText getPassword(){
        return (EditText) findViewById(R.id.password);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.login:
                //TODO implement
                Intent intent=new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.register:
                //TODO implement
                break;
        }
    }
}

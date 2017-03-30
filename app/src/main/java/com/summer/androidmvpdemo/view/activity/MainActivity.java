package com.summer.androidmvpdemo.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.summer.androidmvpdemo.R;
import com.summer.androidmvpdemo.presenter.MainPresenter;
import com.summer.androidmvpdemo.view.iview.IMainView;

public class MainActivity extends AppCompatActivity implements IMainView {
    private TextView mluck;
    private MainPresenter mMainPresenter;
    private EditText mEdqq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mluck= (TextView) findViewById(R.id.luck);
        mEdqq= (EditText) findViewById(R.id.ed_qq);
        mMainPresenter=new MainPresenter(this);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.send:
                if(TextUtils.isEmpty(mEdqq.getText().toString())){
                    return;
                }
                mMainPresenter.load(Integer.parseInt(mEdqq.getText().toString()));
                break;

        }

    }

    @Override
    public void showInfo(String response) {
        mluck.setText(response);
    }
}

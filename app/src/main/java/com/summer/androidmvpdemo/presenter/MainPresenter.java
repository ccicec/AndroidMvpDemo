package com.summer.androidmvpdemo.presenter;

import com.summer.androidmvpdemo.bean.QqluckData;
import com.summer.androidmvpdemo.model.MainModel;
import com.summer.androidmvpdemo.view.iview.IMainView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by xuyang on 2017/3/29.
 */

public class MainPresenter {
    public IMainView mIMainView;
    public MainModel mMainModel;

    public MainPresenter(IMainView IMainView) {
        mIMainView = IMainView;
        mMainModel=new MainModel();
    }

    public void load(int qq){//加载数据。通过model 来获取
        String appkey="34865d1e2ff7170f";
        mMainModel.getData(qq, appkey, new Callback<QqluckData>() {
            @Override
            public void onResponse(Call<QqluckData> call, Response<QqluckData> response) {
                //获取到数据
                QqluckData body = response.body();
                //发送给view。展示给用户看
                mIMainView.showInfo("luck:"+body.getResult().getLuck()+"\ncontent:"+body.getResult().getContent());
            }

            @Override
            public void onFailure(Call<QqluckData> call, Throwable t) {

            }
        });

    }
}

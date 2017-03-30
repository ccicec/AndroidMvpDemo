package com.summer.androidmvpdemo.model;

import com.summer.androidmvpdemo.api.DemoApi;
import com.summer.androidmvpdemo.api.MyService;
import com.summer.androidmvpdemo.bean.QqluckData;

import retrofit2.Call;
import retrofit2.Callback;

/**
 * Created by xuyang on 2017/3/29.
 */

public class MainModel {

    public void getData( int qq, String appkey,  Callback<QqluckData> mCallback) {

        DemoApi api = MyService.getApi(DemoApi.class);
        Call<QqluckData> qqluckDataCall = api.loadqQuery(qq, appkey);
        qqluckDataCall.enqueue(mCallback);

    }
}

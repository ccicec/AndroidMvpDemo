package com.summer.androidmvpdemo.api;

import com.summer.androidmvpdemo.bean.QqluckData;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by xuyang on 2017/3/29.
 */

public interface DemoApi {
    @POST("query")
    Call<QqluckData> loadqQuery(@Query("qq") int qq, @Query("appkey") String appkey);

}

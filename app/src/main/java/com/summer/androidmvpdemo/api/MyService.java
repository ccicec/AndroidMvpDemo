package com.summer.androidmvpdemo.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by xuyang on 2017/3/29.
 */

public class MyService {

    public static String baseUrl="http://api.jisuapi.com/qqluck/";
    public static Retrofit mRetrofit=new Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    public static <T> T getApi(Class<T> mClass){
        return mRetrofit.create(mClass);

    }
}

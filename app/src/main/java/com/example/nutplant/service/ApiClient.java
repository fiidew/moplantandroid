package com.example.nutplant.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
//    public final static String BASE_URL = "http://192.168.0.105:3000/";
    public final static String BASE_URL = "http://192.168.1.101:3000/";

    static Gson gson = new GsonBuilder()
            .setLenient()
            .create();

    public static Retrofit getClient(){
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }
}

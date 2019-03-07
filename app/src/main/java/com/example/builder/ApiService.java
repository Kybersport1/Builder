package com.example.builder;

import android.util.Log;

public class ApiService {
    public static final ApiService INST = new ApiService();
    private ApiService(){}
    public void method(){
        Log.i("Log" , "Hi!");
    }
}

package com.example.myapplication.ws;

import com.example.myapplication.pojo.RegisterRequest;
import com.example.myapplication.pojo.RegisterResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface APIService {
    @POST("Register")
    Call<RegisterResponse> register(@Body RegisterRequest registerRequest);
}

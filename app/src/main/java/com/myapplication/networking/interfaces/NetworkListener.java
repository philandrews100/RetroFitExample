package com.myapplication.networking.interfaces;

import com.google.gson.JsonElement;

import retrofit2.Call;
import retrofit2.Response;

/**
 * Created by Phil on 14/12/2016.
 */

public interface NetworkListener<A> {
    void onResponse(Call<A> call, Response<A> response);
    void onFailure(Call<A> call, Throwable t);
}

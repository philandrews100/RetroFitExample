package com.myapplication.networking.interfaces;

import com.myapplication.networking.formats.Photo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Phil on 14/12/2016.
 */

public interface RetrofitClient {
    @GET("photos/")
    Call<List<Photo>> getAllPhotos(@Query("client_id") String clientId, @Query("per_page") String perPage);
}

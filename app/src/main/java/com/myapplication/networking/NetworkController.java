package com.myapplication.networking;

import com.myapplication.networking.clients.ApiClient;
import com.myapplication.networking.formats.Photo;
import com.myapplication.networking.interfaces.NetworkInterface;
import com.myapplication.networking.interfaces.NetworkListener;
import com.myapplication.networking.interfaces.RetrofitClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Phil on 14/12/2016.
 */

public class NetworkController implements NetworkInterface {

    private RetrofitClient retrofitClient;
    private String clientId;
    private String perPage;

    public NetworkController(String baseUrl, String clientId, String perPage) {
        retrofitClient = ApiClient.getClient(baseUrl).create(RetrofitClient.class);
        this.clientId = clientId;
        this.perPage = perPage;
    }

    @Override
    public void getAllPhotos(final NetworkListener<List<Photo>> networkListener) {
        Call<List<Photo>> networkGetAllPhotos = retrofitClient.getAllPhotos(this.clientId, this.perPage);
        networkGetAllPhotos.enqueue(new Callback<List<Photo>>() {
            @Override
            public void onResponse(Call<List<Photo>> call, Response<List<Photo>> response) {
                networkListener.onResponse(call, response);
            }

            @Override
            public void onFailure(Call<List<Photo>> call, Throwable t) {
                networkListener.onFailure(call, t);
            }
        });
    }
}

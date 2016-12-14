package com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.myapplication.adapters.PhotosAdapter;
import com.myapplication.networking.NetworkController;
import com.myapplication.networking.formats.Photo;
import com.myapplication.networking.interfaces.NetworkListener;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.rv_photos)
    RecyclerView rvPhotos;

    private NetworkController apiController;
    private PhotosAdapter photosAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setupApiController();
        setupRecyclerView();
        getPhotoData();

    }

    private void setupApiController() {
        apiController = new NetworkController(getResources().getString(R.string.mainUrl),
                getResources().getString(R.string.applicationId),
                getResources().getString(R.string.defaultPerPage));
    }

    private void setupRecyclerView() {
        rvPhotos.setHasFixedSize(true);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        rvPhotos.setLayoutManager(mLayoutManager);

    }

    private void getPhotoData() {
        apiController.getAllPhotos(new NetworkListener<List<Photo>>() {
            @Override
            public void onResponse(Call<List<Photo>> call, Response<List<Photo>> response) {
                photosAdapter = new PhotosAdapter(response.body(), MainActivity.this);
                rvPhotos.setAdapter(photosAdapter);
            }

            @Override
            public void onFailure(Call<List<Photo>> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }
}

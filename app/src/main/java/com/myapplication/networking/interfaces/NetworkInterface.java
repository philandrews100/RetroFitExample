package com.myapplication.networking.interfaces;

import com.myapplication.networking.formats.Photo;

import java.util.List;

/**
 * Created by Phil on 14/12/2016.
 */

public interface NetworkInterface {
    void getAllPhotos(NetworkListener<List<Photo>> networkListener);
}

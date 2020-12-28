package com.router.maskinfo.repository;

import com.router.maskinfo.model.StoreInfo;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MaskService {
    String BASE_URL = "https://gist.githubusercontent.com/junsuk5/";

    @GET("bb7485d5f70974deee920b8f0cd1e2f0/raw/")
    Call<StoreInfo> fetchStoreInfo();

}

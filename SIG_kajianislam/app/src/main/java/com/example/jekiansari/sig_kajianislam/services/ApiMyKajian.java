package com.example.jekiansari.sig_kajianislam.services;

import com.example.jekiansari.sig_kajianislam.Model.ListLocationModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiMyKajian {
    @GET("My_marker.php")
    Call<ListLocationModel> getAllLocation();

}

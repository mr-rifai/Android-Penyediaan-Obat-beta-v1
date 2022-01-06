package com.frn.penyediaanobat;

import com.frn.penyediaanobat.model.Covid;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {
    @GET("indonesia")
    Call <List<Covid>> getData();
}

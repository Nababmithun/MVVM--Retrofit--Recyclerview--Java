package com.example.mvvm__retrofit__recyclerview__java.Network;

import com.example.mvvm__retrofit__recyclerview__java.Model.MovieModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {
    @GET("volley_array.json")
    Call<List<MovieModel>> getMovieList();
}

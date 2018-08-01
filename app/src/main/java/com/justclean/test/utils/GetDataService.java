package com.justclean.test.utils;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GetDataService {

    @GET(AppConstants.API_VERSION+"/movie/latest?api_key="+AppConstants.API_KEY+"&language=en-US")
    Call<Movie> getMovies();
}

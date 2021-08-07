package com.example

import android.provider.SyncStateContract
import com.example.movie_app.helper.Constants
import com.example.movie_app.models.TvShowResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET(Constants.END_POINT)
    suspend fun getTvShow():Response<TvShowResponse>
}
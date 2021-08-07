package com.example.movie_app.repository

import com.example.ApiService
import javax.inject.Inject

class TvShowRepository
@Inject
constructor(private val apiService: ApiService){
    suspend fun getTvShow() = apiService.getTvShow()
}
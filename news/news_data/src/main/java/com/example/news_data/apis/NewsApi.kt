package com.example.news_data.apis

import com.example.news_domain.models.NewsModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {

    @GET("v2/everything")
    fun getNews(
        @Query("q") q: String = "tesla",
        @Query("apiKey") apiKey: String = "5bc8f27a8cd74ccbbf7a5d678cb7b9cd"
    ): Call<NewsModel>
}
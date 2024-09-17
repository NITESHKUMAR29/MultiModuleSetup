package com.example.news_data.repositories

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.news_data.apis.NewsApi
import com.example.news_domain.models.NewsModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class NotesRepository @Inject constructor(private val notesRestApi: NewsApi) {


    fun getNotes(data: MutableLiveData<NewsModel>, error: MutableLiveData<Throwable>) {
        notesRestApi.getNews().enqueue(object : Callback<NewsModel?> {
            override fun onResponse(
                call: Call<NewsModel?>,
                response: Response<NewsModel?>
            ) {
                Log.d("Notess", "${response.body()}")
                data.value = response.body()
            }

            override fun onFailure(call: Call<NewsModel?>, t: Throwable) {
                Log.d("Notess", "${t.message}")
                error.value = t
            }
        })
    }
}
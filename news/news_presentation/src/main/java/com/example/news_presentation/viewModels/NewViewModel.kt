package com.example.news_presentation.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.news_data.repositories.NotesRepository
import com.example.news_domain.models.NewsModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NewViewModel @Inject constructor(private val notesRepository: NotesRepository) : ViewModel() {

    private val error = MutableLiveData<Throwable>()

    fun getNotes(): MutableLiveData<NewsModel> {
        val response = MutableLiveData<NewsModel>()
        notesRepository.getNotes(response, error)
        return response
    }
}
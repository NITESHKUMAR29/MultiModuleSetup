package com.example.news_domain.models

data class NewsModel(
    val articles: List<Article>?=null,
    val status: String,
    val totalResults: Int
)
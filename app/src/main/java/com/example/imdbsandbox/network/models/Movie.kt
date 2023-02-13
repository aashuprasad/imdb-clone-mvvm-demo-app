package com.example.imdbsandbox.network.models

import com.google.gson.annotations.SerializedName

data class Movie(
    @SerializedName("@context")val context: String,
    @SerializedName("@type")val type: String,
    val actor: List<Actor>,
    val aggregateRating: AggregateRating,
    val contentRating: String,
    val creator: List<Creator>,
    val datePublished: String,
    val description: String,
    val director: List<Director>,
    val duration: String,
    val genre: List<String>,
    val image: String,
    val keywords: String,
    val name: String,
    val trailer: Trailer,
    @SerializedName("url") val imgSrcUrl: String
):java.io.Serializable
package com.example.imdbsandbox.network.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
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
    @SerializedName("image") val imgSrcUrl: String,
    val keywords: String,
    val name: String,
    val trailer: Trailer,
    val url: String
) : Parcelable
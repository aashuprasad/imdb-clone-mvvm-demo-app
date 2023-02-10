package com.example.imdbsandbox.network.models

import com.google.gson.annotations.SerializedName

data class Director(
    @SerializedName("@type")val type: String,
    val name: String,
    val url: String
):java.io.Serializable
package com.codingwithmitch.mviexample.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class BlogPost(
    @Expose
    @SerializedName("pk")
    val pk: Int? = null,
    @Expose
    @SerializedName("tittle")
    val tittle: String? = null,
    @Expose
    @SerializedName("body")
    val body: String? = null,
    @Expose
    @SerializedName("image")
    val image: String? = null
) {

    override fun toString(): String {
        return "BlogPost(pk=$pk, tittle=$tittle, body=$body, image=$image)"
    }
}
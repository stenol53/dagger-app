package com.abdrakhmanovartem.daggerpapp.screens.model

import com.google.gson.annotations.SerializedName

data class DataItem(
    @SerializedName("Id")
    val id: Int,

    @SerializedName("Name")
    val name: String
)

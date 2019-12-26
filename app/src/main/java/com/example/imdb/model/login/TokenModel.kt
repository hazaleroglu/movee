package com.example.imdb.model.login

import androidx.annotation.Keep
import com.example.imdb.model.BaseRequestModel
import com.google.gson.annotations.SerializedName

@Keep
data class TokenModel(
    @SerializedName("request_token") var requestToken: String? = null
) : BaseRequestModel()
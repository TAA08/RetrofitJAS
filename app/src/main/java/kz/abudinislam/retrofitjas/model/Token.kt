package kz.abudinislam.retrofitjas.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Token(

//    @SerializedName("success")
//    @Expose
//    val success: Boolean,
//    @SerializedName("expires_at")
//    @Expose
//    val expires_at: String,
    @SerializedName("request_token")
    @Expose
    val request_token: String
)
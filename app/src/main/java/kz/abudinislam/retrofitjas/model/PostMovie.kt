package kz.abudinislam.retrofitjas.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class PostMovie(

    @SerializedName("media_type")
    @Expose
    val media_type: String = "movie",
    @SerializedName("media_id")
    @Expose
    var media_id: Int,
    @SerializedName("favorite")
    @Expose
    var favorite: Boolean
)

package com.example.appblog.data.model

data class Post(
    val profile_picture: String = "",
    val profile_name: String = "",
    val post_timestamp: com.google.firebase.Timestamp,
    val post_image: String = ""
)
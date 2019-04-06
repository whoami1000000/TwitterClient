package com.example.twitterclient

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_user_info.*

class UserInfoActivity : AppCompatActivity() {
    companion object {
        private const val IMAGE_URL =
            "https://static.life.ru/posts/2018/07/1132166/gr/north/be8e63e33390c9fd0eff2072999c8384__1440x.jpg"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_info)

        Picasso.get().load(IMAGE_URL).into(profile_image_view)
    }
}

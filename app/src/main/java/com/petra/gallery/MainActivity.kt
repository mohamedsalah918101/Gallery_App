package com.petra.gallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.FrameLayout
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val frameLayout = findViewById(R.id.frameLayout) as FrameLayout

        val imageIds = listOf(
            R.id.image1, R.id.image2, R.id.image3, R.id.image4, R.id.image5,
            R.id.image6, R.id.image7, R.id.image8, R.id.image9, R.id.image10
        )

        for (imageId in imageIds) {
            findViewById<ImageView>(imageId).setOnClickListener {
                val fragment = viewImage()
                val fragmentTransaction: FragmentTransaction = supportFragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.frameLayout, fragment).commit()
            }
        }
    }
}

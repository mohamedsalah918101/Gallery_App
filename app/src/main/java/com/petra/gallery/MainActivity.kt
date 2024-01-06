package com.petra.gallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.ImageView
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image1 = findViewById(R.id.image1) as ImageView
        val image2 = findViewById(R.id.image2) as ImageView
        val image3 = findViewById(R.id.image3) as ImageView
        val image4 = findViewById(R.id.image4) as ImageView
        val image5 = findViewById(R.id.image5) as ImageView
        val image6 = findViewById(R.id.image6) as ImageView
        val image7 = findViewById(R.id.image7) as ImageView
        val image8 = findViewById(R.id.image8) as ImageView
        val image9 = findViewById(R.id.image9) as ImageView
        val image10 = findViewById(R.id.image10) as ImageView

        val frameLayout = findViewById(R.id.frameLayout) as FrameLayout

        image1.setOnClickListener(){
            val fragment = viewImage()
            val fragmentTransaction:FragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frameLayout, fragment).commit()
        }
        image2.setOnClickListener(){
            val fragment = viewImage()
            val fragmentTransaction:FragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frameLayout, fragment).commit()
        }
        image3.setOnClickListener(){
            val fragment = viewImage()
            val fragmentTransaction:FragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frameLayout, fragment).commit()
        }
        image4.setOnClickListener(){
            val fragment = viewImage()
            val fragmentTransaction:FragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frameLayout, fragment).commit()
        }
        image5.setOnClickListener(){
            val fragment = viewImage()
            val fragmentTransaction:FragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frameLayout, fragment).commit()
        }
        image6.setOnClickListener(){
            val fragment = viewImage()
            val fragmentTransaction:FragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frameLayout, fragment).commit()
        }
        image7.setOnClickListener(){
            val fragment = viewImage()
            val fragmentTransaction:FragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frameLayout, fragment).commit()
        }
        image8.setOnClickListener(){
            val fragment = viewImage()
            val fragmentTransaction:FragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frameLayout, fragment).commit()
        }
        image9.setOnClickListener(){
            val fragment = viewImage()
            val fragmentTransaction:FragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frameLayout, fragment).commit()
        }
        image10.setOnClickListener(){
            val fragment = viewImage()
            val fragmentTransaction:FragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frameLayout, fragment).commit()
        }

    }
}
package com.dhani.paymentmethod

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {

    lateinit var viewPager: ViewPager
    lateinit var viewPagerAdapter: ViewPagerAdapter
    lateinit var imageList: List<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        viewPager = findViewById(R.id.idViewPager)

        imageList = ArrayList<Int>()
        imageList = imageList + R.drawable.creditcard
        imageList = imageList + R.drawable.paypal
        imageList = imageList + R.drawable.paypal_paylater

        viewPagerAdapter = ViewPagerAdapter(this@MainActivity, imageList)

        viewPager.adapter = viewPagerAdapter

    }

}
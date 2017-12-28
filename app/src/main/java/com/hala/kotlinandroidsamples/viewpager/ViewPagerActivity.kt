package com.hala.kotlinandroidsamples.viewpager

import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import com.hala.kotlinandroidsamples.R

class ViewPagerActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager
    private lateinit var pagerAdapter: PagerAdapter


    // Use the keyword lateinit to avoid making the view nullable if you want to initialize it later.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)
        viewPager = findViewById(R.id.activity_view_pager_holder)
        pagerAdapter = PagerAdapter(supportFragmentManager)
        viewPager.adapter = pagerAdapter
    }
}

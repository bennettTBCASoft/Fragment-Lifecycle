package com.example.fragmentlifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2

private  const val NUM_PAGES = 3

class MainActivity : AppCompatActivity() {

    private  lateinit var  viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("MainActivity", "onCreate")

        // declare viewPage
        viewPager = findViewById(R.id.viewPage)

        // connect Adapter，讓畫面(Fragment)與ViewPager建立關聯
        val pagerAdapter = ScreenSlidePagerAdapter(this)
        viewPager.adapter = pagerAdapter

    }

    override fun onRestart() {
        super.onRestart()
        Log.e("MainActivity", "onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.e("MainActivity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("MainActivity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("MainActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("MainActivity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("MainActivity", "onDestroy")
    }

    private inner class ScreenSlidePagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
        override fun getItemCount(): Int {
            return NUM_PAGES
        }

        override fun createFragment(position: Int): Fragment {
            when (position) {
                0 -> return FirstFragment()
                1 -> return SecondFragment()
                else -> return ThirdFragment()
            }
        }
    }
}

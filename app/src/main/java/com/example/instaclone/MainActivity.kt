package com.example.instaclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        vp.adapter = MainAdapter(supportFragmentManager)
        vp.addOnPageChangeListener(object: ViewPager.OnPageChangeListener{
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
                nav_view.menu.getItem(position).isChecked = true

            }

            override fun onPageScrollStateChanged(state: Int) {
            }

        })
        nav_view.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.menu_home_icon -> {
                    vp.currentItem = 0
                }
                R.id.menu_profile_icon -> {
                    vp.currentItem = 1
                }

            }
            true
        }


    }
}
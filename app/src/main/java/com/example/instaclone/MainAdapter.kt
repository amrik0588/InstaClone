package com.example.instaclone

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MainAdapter(fm:FragmentManager):FragmentPagerAdapter(fm) {
    override fun getCount(): Int =2

    override fun getItem(position: Int): Fragment {
        when(position){
            0->{
                return HomeFragment()
            }
            else->{
                return ProfileFragment()
            }

        }
    }
}
package com.akiramenaide.capstoneproject.ui.main

import android.content.Context
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.akiramenaide.capstoneproject.R
import com.akiramenaide.capstoneproject.ui.detail.DetailFragment
import com.akiramenaide.capstoneproject.ui.home.HomeFragment
import com.akiramenaide.capstoneproject.ui.profile.ProfileFragment

class SectionsPagerAdapter(private val mContext: Context, fm: FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    companion object {
        @StringRes
        private val TAB_TITLES = intArrayOf(R.string.home, R.string.detail, R.string.profile)
    }

    override fun getItem(position: Int): Fragment =
        when (position) {
            0 -> HomeFragment()
            1 -> DetailFragment()
            2 -> ProfileFragment()
            else -> Fragment()
        }

    override fun getPageTitle(position: Int): CharSequence = mContext.resources.getString(TAB_TITLES[position])

    override fun getCount(): Int = TAB_TITLES.size

}
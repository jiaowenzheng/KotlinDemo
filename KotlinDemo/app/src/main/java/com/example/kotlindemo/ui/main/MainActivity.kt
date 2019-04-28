package com.example.kotlindemo.ui.main

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import com.example.kotlindemo.R
import com.example.kotlindemo.ui.category.CategoryFragment
import com.example.kotlindemo.ui.mine.MineFragment
import com.example.kotlindemo.ui.notice.NoticeFragment
import com.example.kotlindemo.ui.recommend.RecommendFragment
import com.example.kotlindemo.ui.shopping.ShoppingCarFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val tabTitleResId: IntArray = intArrayOf(
        R.string.index,
        R.string.category,
        R.string.shopping_cart,
        R.string.notice,
        R.string.me
    )

    private val tabIconResIds: IntArray = intArrayOf(
        R.drawable.selector_tab_choice,
        R.drawable.selector_tab_category,
        R.drawable.selector_tab_shopping_car,
        R.drawable.selector_tab_notice,
        R.drawable.selector_tab_me
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabAdapter = TabAdapter(supportFragmentManager,this)
        tabAdapter.addFragment(RecommendFragment(),tabTitleResId[0])
        tabAdapter.addFragment(CategoryFragment(),tabTitleResId[1])
        tabAdapter.addFragment(ShoppingCarFragment(),tabTitleResId[2])
        tabAdapter.addFragment(NoticeFragment(),tabTitleResId[3])
        tabAdapter.addFragment(MineFragment(),tabTitleResId[4])

        viewPager.adapter = tabAdapter
        tab.setupWithViewPager(viewPager)

        for (i in 0..4){
            updateTab(i)
        }
    }

    /**
     *
     * 创建tab
     *
     */
    private fun updateTab(position: Int){
        val tabView = tab.getTabAt(position)
        tabView?.setCustomView(R.layout.main_bottom_tab)
        val icon = tabView?.customView?.findViewById<ImageView>(R.id.icon)
        val iconText = tabView?.customView?.findViewById<TextView>(R.id.icon_text)

        icon?.setImageResource(tabIconResIds[position])
        iconText?.text = getString(tabTitleResId[position])
    }

    class TabAdapter(fm: FragmentManager,context: Context) : FragmentPagerAdapter(fm){

        private val mFragments = arrayListOf<Fragment>()
        private val mFragmentTitle = arrayListOf<Int>()

        private val mContext = context

        fun addFragment(fragment: Fragment,titleRes: Int){
            mFragments.add(fragment)
            mFragmentTitle.add(titleRes)
        }

        override fun getItem(p0: Int): Fragment {
            return mFragments[p0]
        }

        override fun getCount(): Int {
            return mFragments.size
        }

        override fun getPageTitle(position: Int): CharSequence? {
            return mContext.getString(mFragmentTitle[position])
        }
    }


}

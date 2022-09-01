package com.application.app.modules.iphone13promaxtwenty1.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import com.application.app.modules.iphone13promaxnineteen.ui.Iphone13ProMaxNineteenFragment
import com.application.app.modules.iphone13promaxtwenty.ui.Iphone13ProMaxTwentyFragment
import kotlin.Int
import kotlin.String
import kotlin.collections.List

class Iphone13ProMaxTwenty1ActivityPagerAdapter(
    val fragmentManager: FragmentManager,
    val lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int = viewPages.size

    override fun createFragment(position: Int): Fragment = viewPages[position]

    companion object AdapterConstant {
        val title: List<String> =
                listOf(MyApp.getInstance().resources.getString(R.string.lbl_sides),MyApp.getInstance().resources.getString(R.string.lbl_starter),MyApp.getInstance().resources.getString(R.string.lbl_salads),MyApp.getInstance().resources.getString(R.string.lbl_mains),MyApp.getInstance().resources.getString(R.string.lbl_dessert),MyApp.getInstance().resources.getString(R.string.lbl_drinks))

        val viewPages: List<Fragment> =
                listOf(Iphone13ProMaxTwentyFragment(),Iphone13ProMaxNineteenFragment(),Iphone13ProMaxNineteenFragment(),Iphone13ProMaxNineteenFragment(),Iphone13ProMaxNineteenFragment(),Iphone13ProMaxNineteenFragment())

    }
}

package com.application.app.modules.iphone13promaxtwenty1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone13ProMaxTwenty1Binding
import com.application.app.modules.iphone13promaxtwenty1.`data`.viewmodel.Iphone13ProMaxTwenty1VM
import com.google.android.material.tabs.TabLayoutMediator
import kotlin.String
import kotlin.Unit

class Iphone13ProMaxTwenty1Activity :
    BaseActivity<ActivityIphone13ProMaxTwenty1Binding>(R.layout.activity_iphone_13_pro_max_twenty1)
    {
  private val viewModel: Iphone13ProMaxTwenty1VM by viewModels<Iphone13ProMaxTwenty1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone13ProMaxTwenty1VM = viewModel
    val adapter = Iphone13ProMaxTwenty1ActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerViewpager.adapter = adapter
    TabLayoutMediator(binding.tabLayoutFrame49,binding.viewPagerViewpager) { tab, position ->
      tab.text = Iphone13ProMaxTwenty1ActivityPagerAdapter.title[position]
      }.attach()
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "IPHONE13PRO_MAX_TWENTY1ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, Iphone13ProMaxTwenty1Activity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }

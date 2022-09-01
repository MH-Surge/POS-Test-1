package com.application.app.modules.iphone13promaxelevenone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone13ProMaxElevenOneBinding
import com.application.app.modules.iphone13promaxelevenone.`data`.viewmodel.Iphone13ProMaxElevenOneVM
import kotlin.String
import kotlin.Unit

class Iphone13ProMaxElevenOneActivity :
    BaseActivity<ActivityIphone13ProMaxElevenOneBinding>(R.layout.activity_iphone_13_pro_max_eleven_one)
    {
  private val viewModel: Iphone13ProMaxElevenOneVM by viewModels<Iphone13ProMaxElevenOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone13ProMaxElevenOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "IPHONE13PRO_MAX_ELEVEN_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone13ProMaxElevenOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

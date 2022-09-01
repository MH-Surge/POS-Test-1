package com.application.app.modules.iphone13promaxfourteenone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone13ProMaxFourteenOneBinding
import com.application.app.modules.iphone13promaxfourteenone.`data`.viewmodel.Iphone13ProMaxFourteenOneVM
import kotlin.String
import kotlin.Unit

class Iphone13ProMaxFourteenOneActivity :
    BaseActivity<ActivityIphone13ProMaxFourteenOneBinding>(R.layout.activity_iphone_13_pro_max_fourteen_one)
    {
  private val viewModel: Iphone13ProMaxFourteenOneVM by viewModels<Iphone13ProMaxFourteenOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone13ProMaxFourteenOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "IPHONE13PRO_MAX_FOURTEEN_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone13ProMaxFourteenOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

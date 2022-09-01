package com.application.app.modules.iphone13promaxfiveone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone13ProMaxFiveOneBinding
import com.application.app.modules.iphone13promaxfiveone.`data`.viewmodel.Iphone13ProMaxFiveOneVM
import kotlin.String
import kotlin.Unit

class Iphone13ProMaxFiveOneActivity :
    BaseActivity<ActivityIphone13ProMaxFiveOneBinding>(R.layout.activity_iphone_13_pro_max_five_one)
    {
  private val viewModel: Iphone13ProMaxFiveOneVM by viewModels<Iphone13ProMaxFiveOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone13ProMaxFiveOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "IPHONE13PRO_MAX_FIVE_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone13ProMaxFiveOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

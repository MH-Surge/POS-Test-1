package com.application.app.modules.iphone13promaxtwelve.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone13ProMaxTwelveBinding
import com.application.app.modules.iphone13promaxseven.ui.Iphone13ProMaxSevenActivity
import com.application.app.modules.iphone13promaxseventeen.ui.Iphone13ProMaxSeventeenActivity
import com.application.app.modules.iphone13promaxtwelve.`data`.viewmodel.Iphone13ProMaxTwelveVM
import kotlin.String
import kotlin.Unit

class Iphone13ProMaxTwelveActivity :
    BaseActivity<ActivityIphone13ProMaxTwelveBinding>(R.layout.activity_iphone_13_pro_max_twelve) {
  private val viewModel: Iphone13ProMaxTwelveVM by viewModels<Iphone13ProMaxTwelveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone13ProMaxTwelveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangleSixtySix.setOnClickListener {
      val destIntent = Iphone13ProMaxSeventeenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnCancel.setOnClickListener {
      val destIntent = Iphone13ProMaxSevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "IPHONE13PRO_MAX_TWELVE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone13ProMaxTwelveActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

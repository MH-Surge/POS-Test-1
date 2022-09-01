package com.application.app.modules.iphone13promaxnine.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone13ProMaxNineBinding
import com.application.app.modules.iphone13promaxnine.`data`.viewmodel.Iphone13ProMaxNineVM
import com.application.app.modules.iphone13promaxseventeen.ui.Iphone13ProMaxSeventeenActivity
import com.application.app.modules.iphone13promaxthirteen.ui.Iphone13ProMaxThirteenActivity
import kotlin.String
import kotlin.Unit

class Iphone13ProMaxNineActivity :
    BaseActivity<ActivityIphone13ProMaxNineBinding>(R.layout.activity_iphone_13_pro_max_nine) {
  private val viewModel: Iphone13ProMaxNineVM by viewModels<Iphone13ProMaxNineVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone13ProMaxNineVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnConfirm.setOnClickListener {
      val destIntent = Iphone13ProMaxThirteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleSixtySix.setOnClickListener {
      val destIntent = Iphone13ProMaxSeventeenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "IPHONE13PRO_MAX_NINE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone13ProMaxNineActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

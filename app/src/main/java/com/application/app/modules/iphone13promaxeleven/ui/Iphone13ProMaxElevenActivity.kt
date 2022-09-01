package com.application.app.modules.iphone13promaxeleven.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone13ProMaxElevenBinding
import com.application.app.modules.iphone13promaxeleven.`data`.viewmodel.Iphone13ProMaxElevenVM
import com.application.app.modules.iphone13promaxseventeen.ui.Iphone13ProMaxSeventeenActivity
import com.application.app.modules.iphone13promaxthirteen.ui.Iphone13ProMaxThirteenActivity
import kotlin.String
import kotlin.Unit

class Iphone13ProMaxElevenActivity :
    BaseActivity<ActivityIphone13ProMaxElevenBinding>(R.layout.activity_iphone_13_pro_max_eleven) {
  private val viewModel: Iphone13ProMaxElevenVM by viewModels<Iphone13ProMaxElevenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone13ProMaxElevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangleSixtySix.setOnClickListener {
      val destIntent = Iphone13ProMaxSeventeenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnConfirm.setOnClickListener {
      val destIntent = Iphone13ProMaxThirteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "IPHONE13PRO_MAX_ELEVEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone13ProMaxElevenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

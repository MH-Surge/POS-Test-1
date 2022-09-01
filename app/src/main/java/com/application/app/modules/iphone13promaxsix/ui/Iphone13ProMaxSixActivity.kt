package com.application.app.modules.iphone13promaxsix.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone13ProMaxSixBinding
import com.application.app.modules.iphone13promaxfour.ui.Iphone13ProMaxFourActivity
import com.application.app.modules.iphone13promaxseven.ui.Iphone13ProMaxSevenActivity
import com.application.app.modules.iphone13promaxseventeen.ui.Iphone13ProMaxSeventeenActivity
import com.application.app.modules.iphone13promaxsix.`data`.viewmodel.Iphone13ProMaxSixVM
import kotlin.String
import kotlin.Unit

class Iphone13ProMaxSixActivity :
    BaseActivity<ActivityIphone13ProMaxSixBinding>(R.layout.activity_iphone_13_pro_max_six) {
  private val viewModel: Iphone13ProMaxSixVM by viewModels<Iphone13ProMaxSixVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone13ProMaxSixVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnCheckout.setOnClickListener {
      val destIntent = Iphone13ProMaxSevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageIcbaselinerec.setOnClickListener {
      val destIntent = Iphone13ProMaxFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleSixtySix.setOnClickListener {
      val destIntent = Iphone13ProMaxSeventeenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "IPHONE13PRO_MAX_SIX_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone13ProMaxSixActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

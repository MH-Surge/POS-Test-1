package com.application.app.modules.iphone13promaxtwentytwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone13ProMaxTwentytwoBinding
import com.application.app.modules.iphone13promaxfour.ui.Iphone13ProMaxFourActivity
import com.application.app.modules.iphone13promaxseventeen.ui.Iphone13ProMaxSeventeenActivity
import com.application.app.modules.iphone13promaxthree.ui.Iphone13ProMaxThreeActivity
import com.application.app.modules.iphone13promaxtwentyfour.ui.Iphone13ProMaxTwentyfourActivity
import com.application.app.modules.iphone13promaxtwentytwo.`data`.viewmodel.Iphone13ProMaxTwentytwoVM
import kotlin.String
import kotlin.Unit

class Iphone13ProMaxTwentytwoActivity :
    BaseActivity<ActivityIphone13ProMaxTwentytwoBinding>(R.layout.activity_iphone_13_pro_max_twentytwo)
    {
  private val viewModel: Iphone13ProMaxTwentytwoVM by viewModels<Iphone13ProMaxTwentytwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone13ProMaxTwentytwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.etGroup161.setOnClickListener {
      val destIntent = Iphone13ProMaxTwentyfourActivity.getIntent(this, null)
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
    binding.linearRowarrowone.setOnClickListener {
      val destIntent = Iphone13ProMaxThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "IPHONE13PRO_MAX_TWENTYTWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone13ProMaxTwentytwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

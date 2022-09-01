package com.application.app.modules.iphone13promaxtwentyone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone13ProMaxTwentyoneBinding
import com.application.app.modules.iphone13promaxfour.ui.Iphone13ProMaxFourActivity
import com.application.app.modules.iphone13promaxseventeen.ui.Iphone13ProMaxSeventeenActivity
import com.application.app.modules.iphone13promaxthree.ui.Iphone13ProMaxThreeActivity
import com.application.app.modules.iphone13promaxtwentyone.`data`.viewmodel.Iphone13ProMaxTwentyoneVM
import com.application.app.modules.iphone13promaxtwentythree.ui.Iphone13ProMaxTwentythreeActivity
import kotlin.String
import kotlin.Unit

class Iphone13ProMaxTwentyoneActivity :
    BaseActivity<ActivityIphone13ProMaxTwentyoneBinding>(R.layout.activity_iphone_13_pro_max_twentyone)
    {
  private val viewModel: Iphone13ProMaxTwentyoneVM by viewModels<Iphone13ProMaxTwentyoneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone13ProMaxTwentyoneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowarrowone.setOnClickListener {
      val destIntent = Iphone13ProMaxThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageIcbaselinerec.setOnClickListener {
      val destIntent = Iphone13ProMaxFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.etGroup161.setOnClickListener {
      val destIntent = Iphone13ProMaxTwentythreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleSixtySix.setOnClickListener {
      val destIntent = Iphone13ProMaxSeventeenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "IPHONE13PRO_MAX_TWENTYONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone13ProMaxTwentyoneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

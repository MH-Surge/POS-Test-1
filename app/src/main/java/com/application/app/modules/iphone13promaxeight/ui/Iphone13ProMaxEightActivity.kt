package com.application.app.modules.iphone13promaxeight.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.appcomponents.views.ImagePickerFragmentDialog
import com.application.app.databinding.ActivityIphone13ProMaxEightBinding
import com.application.app.modules.iphone13promaxeight.`data`.viewmodel.Iphone13ProMaxEightVM
import com.application.app.modules.iphone13promaxseventeen.ui.Iphone13ProMaxSeventeenActivity
import com.application.app.modules.iphone13promaxsix.ui.Iphone13ProMaxSixActivity
import kotlin.String
import kotlin.Unit

class Iphone13ProMaxEightActivity :
    BaseActivity<ActivityIphone13ProMaxEightBinding>(R.layout.activity_iphone_13_pro_max_eight) {
  private val viewModel: Iphone13ProMaxEightVM by viewModels<Iphone13ProMaxEightVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone13ProMaxEightVM = viewModel
  }

  override fun setUpClicks(): Unit {


    binding.imageCamera.setOnClickListener {
      ImagePickerFragmentDialog().show(supportFragmentManager)
      { path ->//TODO HANDLE DATA
      }

    }
    binding.imageRectangleSixtySix.setOnClickListener {
      val destIntent = Iphone13ProMaxSeventeenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnCancel.setOnClickListener {
      val destIntent = Iphone13ProMaxSixActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "IPHONE13PRO_MAX_EIGHT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone13ProMaxEightActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

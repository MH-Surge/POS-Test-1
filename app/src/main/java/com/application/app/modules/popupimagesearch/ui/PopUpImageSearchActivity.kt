package com.application.app.modules.popupimagesearch.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityPopUpImageSearchBinding
import com.application.app.modules.popupimagesearch.`data`.viewmodel.PopUpImageSearchVM
import kotlin.String
import kotlin.Unit

class PopUpImageSearchActivity :
    BaseActivity<ActivityPopUpImageSearchBinding>(R.layout.activity_pop_up_image_search) {
  private val viewModel: PopUpImageSearchVM by viewModels<PopUpImageSearchVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.popUpImageSearchVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "POP_UP_IMAGE_SEARCH_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PopUpImageSearchActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

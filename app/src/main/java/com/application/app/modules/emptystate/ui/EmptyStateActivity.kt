package com.application.app.modules.emptystate.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityEmptyStateBinding
import com.application.app.modules.emptystate.`data`.viewmodel.EmptyStateVM
import kotlin.String
import kotlin.Unit

class EmptyStateActivity : BaseActivity<ActivityEmptyStateBinding>(R.layout.activity_empty_state) {
  private val viewModel: EmptyStateVM by viewModels<EmptyStateVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.emptyStateVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "EMPTY_STATE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EmptyStateActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

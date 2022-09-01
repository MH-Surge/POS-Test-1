package com.application.app.modules.onboardingtwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityOnboardingTwoBinding
import com.application.app.modules.onboardingtwo.`data`.model.OnboardingTwoRowModel
import com.application.app.modules.onboardingtwo.`data`.viewmodel.OnboardingTwoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class OnboardingTwoActivity :
    BaseActivity<ActivityOnboardingTwoBinding>(R.layout.activity_onboarding_two) {
  private val viewModel: OnboardingTwoVM by viewModels<OnboardingTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val onboardingTwoAdapter =
    OnboardingTwoAdapter(viewModel.onboardingTwoList.value?:mutableListOf())
    binding.recyclerOnboardingTwo.adapter = onboardingTwoAdapter
    onboardingTwoAdapter.setOnItemClickListener(
    object : OnboardingTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : OnboardingTwoRowModel) {
        onClickRecyclerOnboardingTwo(view, position, item)
      }
    }
    )
    viewModel.onboardingTwoList.observe(this) {
      onboardingTwoAdapter.updateData(it)
    }
    binding.onboardingTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerOnboardingTwo(
    view: View,
    position: Int,
    item: OnboardingTwoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ONBOARDING_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OnboardingTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

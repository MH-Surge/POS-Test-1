package com.application.app.modules.onboardingone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityOnboardingOneBinding
import com.application.app.modules.onboardingone.`data`.model.OnboardingOneRowModel
import com.application.app.modules.onboardingone.`data`.viewmodel.OnboardingOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class OnboardingOneActivity :
    BaseActivity<ActivityOnboardingOneBinding>(R.layout.activity_onboarding_one) {
  private val viewModel: OnboardingOneVM by viewModels<OnboardingOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val onboardingOneAdapter =
    OnboardingOneAdapter(viewModel.onboardingOneList.value?:mutableListOf())
    binding.recyclerOnboardingOne.adapter = onboardingOneAdapter
    onboardingOneAdapter.setOnItemClickListener(
    object : OnboardingOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : OnboardingOneRowModel) {
        onClickRecyclerOnboardingOne(view, position, item)
      }
    }
    )
    viewModel.onboardingOneList.observe(this) {
      onboardingOneAdapter.updateData(it)
    }
    binding.onboardingOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerOnboardingOne(
    view: View,
    position: Int,
    item: OnboardingOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ONBOARDING_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OnboardingOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

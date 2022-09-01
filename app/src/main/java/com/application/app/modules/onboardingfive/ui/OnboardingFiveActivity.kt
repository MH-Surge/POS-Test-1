package com.application.app.modules.onboardingfive.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityOnboardingFiveBinding
import com.application.app.modules.onboardingfive.`data`.model.ListartwoRowModel
import com.application.app.modules.onboardingfive.`data`.viewmodel.OnboardingFiveVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class OnboardingFiveActivity :
    BaseActivity<ActivityOnboardingFiveBinding>(R.layout.activity_onboarding_five) {
  private val viewModel: OnboardingFiveVM by viewModels<OnboardingFiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listarrowtwoAdapter =
    ListarrowtwoAdapter(viewModel.listarrowtwoList.value?:mutableListOf())
    binding.recyclerListarrowtwo.adapter = listarrowtwoAdapter
    listarrowtwoAdapter.setOnItemClickListener(
    object : ListarrowtwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListartwoRowModel) {
        onClickRecyclerListarrowtwo(view, position, item)
      }
    }
    )
    viewModel.listarrowtwoList.observe(this) {
      listarrowtwoAdapter.updateData(it)
    }
    binding.onboardingFiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListarrowtwo(
    view: View,
    position: Int,
    item: ListartwoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ONBOARDING_FIVE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OnboardingFiveActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

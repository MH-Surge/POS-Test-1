package com.application.app.modules.onboardingone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.onboardingone.`data`.model.OnboardingOneModel
import com.application.app.modules.onboardingone.`data`.model.OnboardingOneRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class OnboardingOneVM : ViewModel(), KoinComponent {
  val onboardingOneModel: MutableLiveData<OnboardingOneModel> =
      MutableLiveData(OnboardingOneModel())

  var navArguments: Bundle? = null

  val onboardingOneList: MutableLiveData<MutableList<OnboardingOneRowModel>> =
      MutableLiveData(mutableListOf())
}

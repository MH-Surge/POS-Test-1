package com.application.app.modules.onboardingtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.onboardingtwo.`data`.model.OnboardingTwoModel
import com.application.app.modules.onboardingtwo.`data`.model.OnboardingTwoRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class OnboardingTwoVM : ViewModel(), KoinComponent {
  val onboardingTwoModel: MutableLiveData<OnboardingTwoModel> =
      MutableLiveData(OnboardingTwoModel())

  var navArguments: Bundle? = null

  val onboardingTwoList: MutableLiveData<MutableList<OnboardingTwoRowModel>> =
      MutableLiveData(mutableListOf())
}

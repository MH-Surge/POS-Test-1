package com.application.app.modules.onboardingeight.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.onboardingeight.`data`.model.OnboardingEightModel
import org.koin.core.KoinComponent

class OnboardingEightVM : ViewModel(), KoinComponent {
  val onboardingEightModel: MutableLiveData<OnboardingEightModel> =
      MutableLiveData(OnboardingEightModel())

  var navArguments: Bundle? = null
}

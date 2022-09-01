package com.application.app.modules.onboardingfive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.onboardingfive.`data`.model.ListartwoRowModel
import com.application.app.modules.onboardingfive.`data`.model.OnboardingFiveModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class OnboardingFiveVM : ViewModel(), KoinComponent {
  val onboardingFiveModel: MutableLiveData<OnboardingFiveModel> =
      MutableLiveData(OnboardingFiveModel())

  var navArguments: Bundle? = null

  val listarrowtwoList: MutableLiveData<MutableList<ListartwoRowModel>> =
      MutableLiveData(mutableListOf())
}

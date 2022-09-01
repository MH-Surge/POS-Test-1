package com.application.app.modules.analytics.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.analytics.`data`.model.AnalyticsModel
import org.koin.core.KoinComponent

class AnalyticsVM : ViewModel(), KoinComponent {
  val analyticsModel: MutableLiveData<AnalyticsModel> = MutableLiveData(AnalyticsModel())

  var navArguments: Bundle? = null
}

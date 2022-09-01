package com.application.app.modules.framefortytwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.framefortytwo.`data`.model.FrameFortytwoModel
import org.koin.core.KoinComponent

class FrameFortytwoVM : ViewModel(), KoinComponent {
  val frameFortytwoModel: MutableLiveData<FrameFortytwoModel> =
      MutableLiveData(FrameFortytwoModel())

  var navArguments: Bundle? = null
}

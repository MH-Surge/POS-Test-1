package com.application.app.modules.framefortythree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.framefortythree.`data`.model.FrameFortythreeModel
import org.koin.core.KoinComponent

class FrameFortythreeVM : ViewModel(), KoinComponent {
  val frameFortythreeModel: MutableLiveData<FrameFortythreeModel> =
      MutableLiveData(FrameFortythreeModel())

  var navArguments: Bundle? = null
}

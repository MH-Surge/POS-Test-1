package com.application.app.modules.popupsuccessful.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.popupsuccessful.`data`.model.PopUpSuccessfulModel
import org.koin.core.KoinComponent

class PopUpSuccessfulVM : ViewModel(), KoinComponent {
  val popUpSuccessfulModel: MutableLiveData<PopUpSuccessfulModel> =
      MutableLiveData(PopUpSuccessfulModel())

  var navArguments: Bundle? = null
}

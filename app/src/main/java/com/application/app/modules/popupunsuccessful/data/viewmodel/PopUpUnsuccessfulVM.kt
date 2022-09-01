package com.application.app.modules.popupunsuccessful.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.popupunsuccessful.`data`.model.PopUpUnsuccessfulModel
import org.koin.core.KoinComponent

class PopUpUnsuccessfulVM : ViewModel(), KoinComponent {
  val popUpUnsuccessfulModel: MutableLiveData<PopUpUnsuccessfulModel> =
      MutableLiveData(PopUpUnsuccessfulModel())

  var navArguments: Bundle? = null
}

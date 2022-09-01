package com.application.app.modules.popup.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.popup.`data`.model.PopUpModel
import org.koin.core.KoinComponent

class PopUpVM : ViewModel(), KoinComponent {
  val popUpModel: MutableLiveData<PopUpModel> = MutableLiveData(PopUpModel())

  var navArguments: Bundle? = null
}

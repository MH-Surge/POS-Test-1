package com.application.app.modules.popupimagesearch.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.popupimagesearch.`data`.model.PopUpImageSearchModel
import org.koin.core.KoinComponent

class PopUpImageSearchVM : ViewModel(), KoinComponent {
  val popUpImageSearchModel: MutableLiveData<PopUpImageSearchModel> =
      MutableLiveData(PopUpImageSearchModel())

  var navArguments: Bundle? = null
}

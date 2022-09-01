package com.application.app.modules.iphone13promaxfivetwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promaxfivetwo.`data`.model.Iphone13ProMaxFiveTwoModel
import org.koin.core.KoinComponent

class Iphone13ProMaxFiveTwoVM : ViewModel(), KoinComponent {
  val iphone13ProMaxFiveTwoModel: MutableLiveData<Iphone13ProMaxFiveTwoModel> =
      MutableLiveData(Iphone13ProMaxFiveTwoModel())

  var navArguments: Bundle? = null
}

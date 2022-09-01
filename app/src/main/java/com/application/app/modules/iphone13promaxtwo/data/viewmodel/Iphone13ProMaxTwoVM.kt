package com.application.app.modules.iphone13promaxtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promaxtwo.`data`.model.Iphone13ProMaxTwoModel
import org.koin.core.KoinComponent

class Iphone13ProMaxTwoVM : ViewModel(), KoinComponent {
  val iphone13ProMaxTwoModel: MutableLiveData<Iphone13ProMaxTwoModel> =
      MutableLiveData(Iphone13ProMaxTwoModel())

  var navArguments: Bundle? = null
}

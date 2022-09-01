package com.application.app.modules.iphone13promaxfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promaxfour.`data`.model.Iphone13ProMaxFourModel
import org.koin.core.KoinComponent

class Iphone13ProMaxFourVM : ViewModel(), KoinComponent {
  val iphone13ProMaxFourModel: MutableLiveData<Iphone13ProMaxFourModel> =
      MutableLiveData(Iphone13ProMaxFourModel())

  var navArguments: Bundle? = null
}

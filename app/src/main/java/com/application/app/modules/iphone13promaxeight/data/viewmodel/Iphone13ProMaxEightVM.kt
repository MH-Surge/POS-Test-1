package com.application.app.modules.iphone13promaxeight.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promaxeight.`data`.model.Iphone13ProMaxEightModel
import org.koin.core.KoinComponent

class Iphone13ProMaxEightVM : ViewModel(), KoinComponent {
  val iphone13ProMaxEightModel: MutableLiveData<Iphone13ProMaxEightModel> =
      MutableLiveData(Iphone13ProMaxEightModel())

  var navArguments: Bundle? = null
}

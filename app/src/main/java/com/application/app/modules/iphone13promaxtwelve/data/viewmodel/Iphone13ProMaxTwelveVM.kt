package com.application.app.modules.iphone13promaxtwelve.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promaxtwelve.`data`.model.Iphone13ProMaxTwelveModel
import org.koin.core.KoinComponent

class Iphone13ProMaxTwelveVM : ViewModel(), KoinComponent {
  val iphone13ProMaxTwelveModel: MutableLiveData<Iphone13ProMaxTwelveModel> =
      MutableLiveData(Iphone13ProMaxTwelveModel())

  var navArguments: Bundle? = null
}

package com.application.app.modules.iphone13promaxnine.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promaxnine.`data`.model.Iphone13ProMaxNineModel
import org.koin.core.KoinComponent

class Iphone13ProMaxNineVM : ViewModel(), KoinComponent {
  val iphone13ProMaxNineModel: MutableLiveData<Iphone13ProMaxNineModel> =
      MutableLiveData(Iphone13ProMaxNineModel())

  var navArguments: Bundle? = null
}

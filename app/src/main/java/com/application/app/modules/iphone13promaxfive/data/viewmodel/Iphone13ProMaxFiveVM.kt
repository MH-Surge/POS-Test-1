package com.application.app.modules.iphone13promaxfive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promaxfive.`data`.model.Iphone13ProMaxFiveModel
import org.koin.core.KoinComponent

class Iphone13ProMaxFiveVM : ViewModel(), KoinComponent {
  val iphone13ProMaxFiveModel: MutableLiveData<Iphone13ProMaxFiveModel> =
      MutableLiveData(Iphone13ProMaxFiveModel())

  var navArguments: Bundle? = null
}

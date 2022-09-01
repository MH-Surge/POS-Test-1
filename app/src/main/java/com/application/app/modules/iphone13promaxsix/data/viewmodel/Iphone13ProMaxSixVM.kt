package com.application.app.modules.iphone13promaxsix.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promaxsix.`data`.model.Iphone13ProMaxSixModel
import org.koin.core.KoinComponent

class Iphone13ProMaxSixVM : ViewModel(), KoinComponent {
  val iphone13ProMaxSixModel: MutableLiveData<Iphone13ProMaxSixModel> =
      MutableLiveData(Iphone13ProMaxSixModel())

  var navArguments: Bundle? = null
}

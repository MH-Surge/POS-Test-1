package com.application.app.modules.iphone13promaxtwenty1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promaxtwenty1.`data`.model.Iphone13ProMaxTwenty1Model
import org.koin.core.KoinComponent

class Iphone13ProMaxTwenty1VM : ViewModel(), KoinComponent {
  val iphone13ProMaxTwenty1Model: MutableLiveData<Iphone13ProMaxTwenty1Model> =
      MutableLiveData(Iphone13ProMaxTwenty1Model())

  var navArguments: Bundle? = null
}

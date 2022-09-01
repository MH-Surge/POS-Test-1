package com.application.app.modules.iphone13promaxtwentyone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promaxtwentyone.`data`.model.Iphone13ProMaxTwentyoneModel
import org.koin.core.KoinComponent

class Iphone13ProMaxTwentyoneVM : ViewModel(), KoinComponent {
  val iphone13ProMaxTwentyoneModel: MutableLiveData<Iphone13ProMaxTwentyoneModel> =
      MutableLiveData(Iphone13ProMaxTwentyoneModel())

  var navArguments: Bundle? = null
}

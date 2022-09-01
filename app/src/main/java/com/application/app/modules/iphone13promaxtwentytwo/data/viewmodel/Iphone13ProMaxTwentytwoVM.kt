package com.application.app.modules.iphone13promaxtwentytwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promaxtwentytwo.`data`.model.Iphone13ProMaxTwentytwoModel
import org.koin.core.KoinComponent

class Iphone13ProMaxTwentytwoVM : ViewModel(), KoinComponent {
  val iphone13ProMaxTwentytwoModel: MutableLiveData<Iphone13ProMaxTwentytwoModel> =
      MutableLiveData(Iphone13ProMaxTwentytwoModel())

  var navArguments: Bundle? = null
}

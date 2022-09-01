package com.application.app.modules.iphone13promaxtwentythree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promaxtwentythree.`data`.model.Iphone13ProMaxTwentythreeModel
import org.koin.core.KoinComponent

class Iphone13ProMaxTwentythreeVM : ViewModel(), KoinComponent {
  val iphone13ProMaxTwentythreeModel: MutableLiveData<Iphone13ProMaxTwentythreeModel> =
      MutableLiveData(Iphone13ProMaxTwentythreeModel())

  var navArguments: Bundle? = null
}

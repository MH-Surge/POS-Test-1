package com.application.app.modules.iphone13promaxtwelveone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promaxtwelveone.`data`.model.Iphone13ProMaxTwelveOneModel
import org.koin.core.KoinComponent

class Iphone13ProMaxTwelveOneVM : ViewModel(), KoinComponent {
  val iphone13ProMaxTwelveOneModel: MutableLiveData<Iphone13ProMaxTwelveOneModel> =
      MutableLiveData(Iphone13ProMaxTwelveOneModel())

  var navArguments: Bundle? = null
}

package com.application.app.modules.iphone13promaxone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promaxone.`data`.model.Iphone13ProMaxOneModel
import org.koin.core.KoinComponent

class Iphone13ProMaxOneVM : ViewModel(), KoinComponent {
  val iphone13ProMaxOneModel: MutableLiveData<Iphone13ProMaxOneModel> =
      MutableLiveData(Iphone13ProMaxOneModel())

  var navArguments: Bundle? = null
}

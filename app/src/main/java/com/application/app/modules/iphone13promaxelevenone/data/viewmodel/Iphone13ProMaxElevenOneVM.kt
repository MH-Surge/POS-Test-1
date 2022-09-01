package com.application.app.modules.iphone13promaxelevenone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promaxelevenone.`data`.model.Iphone13ProMaxElevenOneModel
import org.koin.core.KoinComponent

class Iphone13ProMaxElevenOneVM : ViewModel(), KoinComponent {
  val iphone13ProMaxElevenOneModel: MutableLiveData<Iphone13ProMaxElevenOneModel> =
      MutableLiveData(Iphone13ProMaxElevenOneModel())

  var navArguments: Bundle? = null
}

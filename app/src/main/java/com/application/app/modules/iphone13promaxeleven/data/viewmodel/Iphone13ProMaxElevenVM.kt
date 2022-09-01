package com.application.app.modules.iphone13promaxeleven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promaxeleven.`data`.model.Iphone13ProMaxElevenModel
import org.koin.core.KoinComponent

class Iphone13ProMaxElevenVM : ViewModel(), KoinComponent {
  val iphone13ProMaxElevenModel: MutableLiveData<Iphone13ProMaxElevenModel> =
      MutableLiveData(Iphone13ProMaxElevenModel())

  var navArguments: Bundle? = null
}

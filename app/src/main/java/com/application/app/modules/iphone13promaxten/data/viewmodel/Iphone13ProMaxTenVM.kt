package com.application.app.modules.iphone13promaxten.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promaxten.`data`.model.Iphone13ProMaxTenModel
import org.koin.core.KoinComponent

class Iphone13ProMaxTenVM : ViewModel(), KoinComponent {
  val iphone13ProMaxTenModel: MutableLiveData<Iphone13ProMaxTenModel> =
      MutableLiveData(Iphone13ProMaxTenModel())

  var navArguments: Bundle? = null
}

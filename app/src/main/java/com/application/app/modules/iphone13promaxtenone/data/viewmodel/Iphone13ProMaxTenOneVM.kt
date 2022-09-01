package com.application.app.modules.iphone13promaxtenone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promaxtenone.`data`.model.Iphone13ProMaxTenOneModel
import org.koin.core.KoinComponent

class Iphone13ProMaxTenOneVM : ViewModel(), KoinComponent {
  val iphone13ProMaxTenOneModel: MutableLiveData<Iphone13ProMaxTenOneModel> =
      MutableLiveData(Iphone13ProMaxTenOneModel())

  var navArguments: Bundle? = null
}

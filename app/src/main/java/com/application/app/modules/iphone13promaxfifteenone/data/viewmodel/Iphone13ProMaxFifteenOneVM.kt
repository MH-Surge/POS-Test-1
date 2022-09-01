package com.application.app.modules.iphone13promaxfifteenone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promaxfifteenone.`data`.model.Iphone13ProMaxFifteenOneModel
import org.koin.core.KoinComponent

class Iphone13ProMaxFifteenOneVM : ViewModel(), KoinComponent {
  val iphone13ProMaxFifteenOneModel: MutableLiveData<Iphone13ProMaxFifteenOneModel> =
      MutableLiveData(Iphone13ProMaxFifteenOneModel())

  var navArguments: Bundle? = null
}

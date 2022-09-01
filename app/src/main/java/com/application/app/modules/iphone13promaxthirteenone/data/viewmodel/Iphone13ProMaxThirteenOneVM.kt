package com.application.app.modules.iphone13promaxthirteenone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promaxthirteenone.`data`.model.Iphone13ProMaxThirteenOneModel
import org.koin.core.KoinComponent

class Iphone13ProMaxThirteenOneVM : ViewModel(), KoinComponent {
  val iphone13ProMaxThirteenOneModel: MutableLiveData<Iphone13ProMaxThirteenOneModel> =
      MutableLiveData(Iphone13ProMaxThirteenOneModel())

  var navArguments: Bundle? = null
}

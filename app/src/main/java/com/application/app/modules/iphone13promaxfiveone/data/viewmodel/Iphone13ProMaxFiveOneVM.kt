package com.application.app.modules.iphone13promaxfiveone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promaxfiveone.`data`.model.Iphone13ProMaxFiveOneModel
import org.koin.core.KoinComponent

class Iphone13ProMaxFiveOneVM : ViewModel(), KoinComponent {
  val iphone13ProMaxFiveOneModel: MutableLiveData<Iphone13ProMaxFiveOneModel> =
      MutableLiveData(Iphone13ProMaxFiveOneModel())

  var navArguments: Bundle? = null
}

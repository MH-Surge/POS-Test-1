package com.application.app.modules.iphone13promaxsixone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promaxsixone.`data`.model.Iphone13ProMaxSixOneModel
import org.koin.core.KoinComponent

class Iphone13ProMaxSixOneVM : ViewModel(), KoinComponent {
  val iphone13ProMaxSixOneModel: MutableLiveData<Iphone13ProMaxSixOneModel> =
      MutableLiveData(Iphone13ProMaxSixOneModel())

  var navArguments: Bundle? = null
}

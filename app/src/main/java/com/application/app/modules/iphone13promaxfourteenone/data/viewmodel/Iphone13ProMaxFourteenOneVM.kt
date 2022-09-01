package com.application.app.modules.iphone13promaxfourteenone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promaxfourteenone.`data`.model.Iphone13ProMaxFourteenOneModel
import org.koin.core.KoinComponent

class Iphone13ProMaxFourteenOneVM : ViewModel(), KoinComponent {
  val iphone13ProMaxFourteenOneModel: MutableLiveData<Iphone13ProMaxFourteenOneModel> =
      MutableLiveData(Iphone13ProMaxFourteenOneModel())

  var navArguments: Bundle? = null
}

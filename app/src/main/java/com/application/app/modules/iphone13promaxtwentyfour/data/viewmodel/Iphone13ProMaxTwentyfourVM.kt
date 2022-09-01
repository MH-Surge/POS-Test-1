package com.application.app.modules.iphone13promaxtwentyfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promaxtwentyfour.`data`.model.Iphone13ProMaxTwentyfourModel
import org.koin.core.KoinComponent

class Iphone13ProMaxTwentyfourVM : ViewModel(), KoinComponent {
  val iphone13ProMaxTwentyfourModel: MutableLiveData<Iphone13ProMaxTwentyfourModel> =
      MutableLiveData(Iphone13ProMaxTwentyfourModel())

  var navArguments: Bundle? = null
}

package com.application.app.modules.iphone13promaxtwenty.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promaxtwenty.`data`.model.Iphone13ProMaxTwentyModel
import com.application.app.modules.iphone13promaxtwenty.`data`.model.ListrectanglefifteenTwo1RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class Iphone13ProMaxTwentyVM : ViewModel(), KoinComponent {
  val iphone13ProMaxTwentyModel: MutableLiveData<Iphone13ProMaxTwentyModel> =
      MutableLiveData(Iphone13ProMaxTwentyModel())

  var navArguments: Bundle? = null

  val listrectanglefifteenTwoList: MutableLiveData<MutableList<ListrectanglefifteenTwo1RowModel>> =
      MutableLiveData(mutableListOf())
}

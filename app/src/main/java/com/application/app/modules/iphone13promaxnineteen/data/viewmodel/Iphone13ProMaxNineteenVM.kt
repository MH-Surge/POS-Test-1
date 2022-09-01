package com.application.app.modules.iphone13promaxnineteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promaxnineteen.`data`.model.GridrectanglefifteenFourRowModel
import com.application.app.modules.iphone13promaxnineteen.`data`.model.Iphone13ProMaxNineteenModel
import com.application.app.modules.iphone13promaxnineteen.`data`.model.ListrectanglefifteenTwo2RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class Iphone13ProMaxNineteenVM : ViewModel(), KoinComponent {
  val iphone13ProMaxNineteenModel: MutableLiveData<Iphone13ProMaxNineteenModel> =
      MutableLiveData(Iphone13ProMaxNineteenModel())

  var navArguments: Bundle? = null

  val listrectanglefifteenTwoList: MutableLiveData<MutableList<ListrectanglefifteenTwo2RowModel>> =
      MutableLiveData(mutableListOf())

  val gridrectanglefifteenFourList: MutableLiveData<MutableList<GridrectanglefifteenFourRowModel>> =
      MutableLiveData(mutableListOf())
}

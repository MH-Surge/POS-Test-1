package com.application.app.modules.iphone13promaxfifteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promaxfifteen.`data`.model.Iphone13ProMaxFifteenModel
import com.application.app.modules.iphone13promaxfifteen.`data`.model.ListrectanglefifteenFourRowModel
import com.application.app.modules.iphone13promaxfifteen.`data`.model.ListrectanglefifteenRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class Iphone13ProMaxFifteenVM : ViewModel(), KoinComponent {
  val iphone13ProMaxFifteenModel: MutableLiveData<Iphone13ProMaxFifteenModel> =
      MutableLiveData(Iphone13ProMaxFifteenModel())

  var navArguments: Bundle? = null

  val listrectanglefifteenList: MutableLiveData<MutableList<ListrectanglefifteenRowModel>> =
      MutableLiveData(mutableListOf())

  val listrectanglefifteenFourList: MutableLiveData<MutableList<ListrectanglefifteenFourRowModel>> =
      MutableLiveData(mutableListOf())
}

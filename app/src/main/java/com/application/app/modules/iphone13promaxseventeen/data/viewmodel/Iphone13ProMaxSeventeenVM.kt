package com.application.app.modules.iphone13promaxseventeen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promaxseventeen.`data`.model.Gridgrid2RowModel
import com.application.app.modules.iphone13promaxseventeen.`data`.model.Iphone13ProMaxSeventeenModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class Iphone13ProMaxSeventeenVM : ViewModel(), KoinComponent {
  val iphone13ProMaxSeventeenModel: MutableLiveData<Iphone13ProMaxSeventeenModel> =
      MutableLiveData(Iphone13ProMaxSeventeenModel())

  var navArguments: Bundle? = null

  val gridgridList: MutableLiveData<MutableList<Gridgrid2RowModel>> =
      MutableLiveData(mutableListOf())
}

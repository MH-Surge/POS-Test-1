package com.application.app.modules.iphone13promaxthirteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promaxthirteen.`data`.model.Gridgrid4RowModel
import com.application.app.modules.iphone13promaxthirteen.`data`.model.Iphone13ProMaxThirteenModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class Iphone13ProMaxThirteenVM : ViewModel(), KoinComponent {
  val iphone13ProMaxThirteenModel: MutableLiveData<Iphone13ProMaxThirteenModel> =
      MutableLiveData(Iphone13ProMaxThirteenModel())

  var navArguments: Bundle? = null

  val gridgridList: MutableLiveData<MutableList<Gridgrid4RowModel>> =
      MutableLiveData(mutableListOf())
}

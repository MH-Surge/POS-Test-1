package com.application.app.modules.iphone13promaxeighteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promaxeighteen.`data`.model.GridgridRowModel
import com.application.app.modules.iphone13promaxeighteen.`data`.model.Iphone13ProMaxEighteenModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class Iphone13ProMaxEighteenVM : ViewModel(), KoinComponent {
  val iphone13ProMaxEighteenModel: MutableLiveData<Iphone13ProMaxEighteenModel> =
      MutableLiveData(Iphone13ProMaxEighteenModel())

  var navArguments: Bundle? = null

  val gridgridList: MutableLiveData<MutableList<GridgridRowModel>> =
      MutableLiveData(mutableListOf())
}

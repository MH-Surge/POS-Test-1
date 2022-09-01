package com.application.app.modules.iphone13promaxfourteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promaxfourteen.`data`.model.Iphone13ProMaxFourteenModel
import com.application.app.modules.iphone13promaxfourteen.`data`.model.ListrectanglefifteenTwo3RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class Iphone13ProMaxFourteenVM : ViewModel(), KoinComponent {
  val iphone13ProMaxFourteenModel: MutableLiveData<Iphone13ProMaxFourteenModel> =
      MutableLiveData(Iphone13ProMaxFourteenModel())

  var navArguments: Bundle? = null

  val listrectanglefifteenTwoList: MutableLiveData<MutableList<ListrectanglefifteenTwo3RowModel>> =
      MutableLiveData(mutableListOf())
}

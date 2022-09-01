package com.application.app.modules.iphone13promaxsixteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promaxsixteen.`data`.model.Iphone13ProMaxSixteenModel
import com.application.app.modules.iphone13promaxsixteen.`data`.model.ListrectanglefifteenTwoRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class Iphone13ProMaxSixteenVM : ViewModel(), KoinComponent {
  val iphone13ProMaxSixteenModel: MutableLiveData<Iphone13ProMaxSixteenModel> =
      MutableLiveData(Iphone13ProMaxSixteenModel())

  var navArguments: Bundle? = null

  val listrectanglefifteenTwoList: MutableLiveData<MutableList<ListrectanglefifteenTwoRowModel>> =
      MutableLiveData(mutableListOf())
}

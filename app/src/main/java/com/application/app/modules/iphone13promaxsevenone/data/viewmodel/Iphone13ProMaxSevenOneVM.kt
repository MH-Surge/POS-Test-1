package com.application.app.modules.iphone13promaxsevenone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promaxsevenone.`data`.model.Iphone13ProMaxSevenOneModel
import com.application.app.modules.iphone13promaxsevenone.`data`.model.StaggeredrectanglefifteenRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class Iphone13ProMaxSevenOneVM : ViewModel(), KoinComponent {
  val iphone13ProMaxSevenOneModel: MutableLiveData<Iphone13ProMaxSevenOneModel> =
      MutableLiveData(Iphone13ProMaxSevenOneModel())

  var navArguments: Bundle? = null

  val staggeredrectanglefifteenList: MutableLiveData<MutableList<StaggeredrectanglefifteenRowModel>>
      = MutableLiveData(mutableListOf())
}

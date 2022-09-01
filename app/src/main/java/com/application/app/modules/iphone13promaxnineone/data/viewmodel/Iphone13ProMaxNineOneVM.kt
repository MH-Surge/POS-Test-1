package com.application.app.modules.iphone13promaxnineone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promaxnineone.`data`.model.GridcategoryRowModel
import com.application.app.modules.iphone13promaxnineone.`data`.model.Iphone13ProMaxNineOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class Iphone13ProMaxNineOneVM : ViewModel(), KoinComponent {
  val iphone13ProMaxNineOneModel: MutableLiveData<Iphone13ProMaxNineOneModel> =
      MutableLiveData(Iphone13ProMaxNineOneModel())

  var navArguments: Bundle? = null

  val gridcategoryList: MutableLiveData<MutableList<GridcategoryRowModel>> =
      MutableLiveData(mutableListOf())
}

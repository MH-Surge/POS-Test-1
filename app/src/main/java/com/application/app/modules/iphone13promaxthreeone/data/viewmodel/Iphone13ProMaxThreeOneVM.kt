package com.application.app.modules.iphone13promaxthreeone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promaxthreeone.`data`.model.Gridgrid3RowModel
import com.application.app.modules.iphone13promaxthreeone.`data`.model.Iphone13ProMaxThreeOneModel
import com.application.app.modules.iphone13promaxthreeone.`data`.model.ListordercounterOneRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class Iphone13ProMaxThreeOneVM : ViewModel(), KoinComponent {
  val iphone13ProMaxThreeOneModel: MutableLiveData<Iphone13ProMaxThreeOneModel> =
      MutableLiveData(Iphone13ProMaxThreeOneModel())

  var navArguments: Bundle? = null

  val gridgridList: MutableLiveData<MutableList<Gridgrid3RowModel>> =
      MutableLiveData(mutableListOf())

  val listordercounterOneList: MutableLiveData<MutableList<ListordercounterOneRowModel>> =
      MutableLiveData(mutableListOf())
}

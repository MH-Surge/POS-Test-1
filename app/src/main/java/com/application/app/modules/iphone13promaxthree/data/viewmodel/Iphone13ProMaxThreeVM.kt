package com.application.app.modules.iphone13promaxthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promaxthree.`data`.model.Gridgrid1RowModel
import com.application.app.modules.iphone13promaxthree.`data`.model.Iphone13ProMaxThreeModel
import com.application.app.modules.iphone13promaxthree.`data`.model.ListordercounterRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class Iphone13ProMaxThreeVM : ViewModel(), KoinComponent {
  val iphone13ProMaxThreeModel: MutableLiveData<Iphone13ProMaxThreeModel> =
      MutableLiveData(Iphone13ProMaxThreeModel())

  var navArguments: Bundle? = null

  val gridgridList: MutableLiveData<MutableList<Gridgrid1RowModel>> =
      MutableLiveData(mutableListOf())

  val listordercounterList: MutableLiveData<MutableList<ListordercounterRowModel>> =
      MutableLiveData(mutableListOf())
}

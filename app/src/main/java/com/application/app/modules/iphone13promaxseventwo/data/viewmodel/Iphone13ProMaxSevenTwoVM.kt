package com.application.app.modules.iphone13promaxseventwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promaxseventwo.`data`.model.Gridgrid5RowModel
import com.application.app.modules.iphone13promaxseventwo.`data`.model.Iphone13ProMaxSevenTwoModel
import com.application.app.modules.iphone13promaxseventwo.`data`.model.ListmenuTwoRowModel
import com.application.app.modules.iphone13promaxseventwo.`data`.model.ListordercounterOne1RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class Iphone13ProMaxSevenTwoVM : ViewModel(), KoinComponent {
  val iphone13ProMaxSevenTwoModel: MutableLiveData<Iphone13ProMaxSevenTwoModel> =
      MutableLiveData(Iphone13ProMaxSevenTwoModel())

  var navArguments: Bundle? = null

  val gridgridList: MutableLiveData<MutableList<Gridgrid5RowModel>> =
      MutableLiveData(mutableListOf())

  val listmenuTwoList: MutableLiveData<MutableList<ListmenuTwoRowModel>> =
      MutableLiveData(mutableListOf())

  val listordercounterOneList: MutableLiveData<MutableList<ListordercounterOne1RowModel>> =
      MutableLiveData(mutableListOf())
}

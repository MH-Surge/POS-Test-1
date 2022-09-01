package com.application.app.modules.iphone13promaxfourone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promaxfourone.`data`.model.Iphone13ProMaxFourOneModel
import com.application.app.modules.iphone13promaxfourone.`data`.model.ListserverRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class Iphone13ProMaxFourOneVM : ViewModel(), KoinComponent {
  val iphone13ProMaxFourOneModel: MutableLiveData<Iphone13ProMaxFourOneModel> =
      MutableLiveData(Iphone13ProMaxFourOneModel())

  var navArguments: Bundle? = null

  val listserverList: MutableLiveData<MutableList<ListserverRowModel>> =
      MutableLiveData(mutableListOf())
}

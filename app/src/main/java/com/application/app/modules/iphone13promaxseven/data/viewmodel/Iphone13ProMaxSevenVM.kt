package com.application.app.modules.iphone13promaxseven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone13promaxseven.`data`.model.Iphone13ProMaxSevenModel
import com.application.app.modules.iphone13promaxseven.`data`.model.ListcameraRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class Iphone13ProMaxSevenVM : ViewModel(), KoinComponent {
  val iphone13ProMaxSevenModel: MutableLiveData<Iphone13ProMaxSevenModel> =
      MutableLiveData(Iphone13ProMaxSevenModel())

  var navArguments: Bundle? = null

  val listcameraList: MutableLiveData<MutableList<ListcameraRowModel>> =
      MutableLiveData(mutableListOf())
}

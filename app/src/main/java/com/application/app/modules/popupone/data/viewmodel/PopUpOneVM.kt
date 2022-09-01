package com.application.app.modules.popupone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.popupone.`data`.model.PopUpOneModel
import com.application.app.modules.popupone.`data`.model.PopUpOneRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PopUpOneVM : ViewModel(), KoinComponent {
  val popUpOneModel: MutableLiveData<PopUpOneModel> = MutableLiveData(PopUpOneModel())

  var navArguments: Bundle? = null

  val popUpOneList: MutableLiveData<MutableList<PopUpOneRowModel>> =
      MutableLiveData(mutableListOf())
}

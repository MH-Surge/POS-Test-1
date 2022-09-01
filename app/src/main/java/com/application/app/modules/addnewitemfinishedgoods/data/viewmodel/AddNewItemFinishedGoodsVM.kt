package com.application.app.modules.addnewitemfinishedgoods.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.addnewitemfinishedgoods.`data`.model.AddNewItemFinishedGoodsModel
import org.koin.core.KoinComponent

class AddNewItemFinishedGoodsVM : ViewModel(), KoinComponent {
  val addNewItemFinishedGoodsModel: MutableLiveData<AddNewItemFinishedGoodsModel> =
      MutableLiveData(AddNewItemFinishedGoodsModel())

  var navArguments: Bundle? = null
}

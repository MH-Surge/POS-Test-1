package com.application.app.modules.addnewitemfinishedgoodsone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.addnewitemfinishedgoodsone.`data`.model.AddNewItemFinishedGoodsOneModel
import org.koin.core.KoinComponent

class AddNewItemFinishedGoodsOneVM : ViewModel(), KoinComponent {
  val addNewItemFinishedGoodsOneModel: MutableLiveData<AddNewItemFinishedGoodsOneModel> =
      MutableLiveData(AddNewItemFinishedGoodsOneModel())

  var navArguments: Bundle? = null
}

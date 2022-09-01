package com.application.app.modules.addnewitem.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.addnewitem.`data`.model.AddNewItemModel
import org.koin.core.KoinComponent

class AddNewItemVM : ViewModel(), KoinComponent {
  val addNewItemModel: MutableLiveData<AddNewItemModel> = MutableLiveData(AddNewItemModel())

  var navArguments: Bundle? = null
}

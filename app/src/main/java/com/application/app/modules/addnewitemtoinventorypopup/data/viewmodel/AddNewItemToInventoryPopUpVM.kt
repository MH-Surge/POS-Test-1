package com.application.app.modules.addnewitemtoinventorypopup.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.addnewitemtoinventorypopup.`data`.model.AddNewItemToInventoryPopUpModel
import org.koin.core.KoinComponent

class AddNewItemToInventoryPopUpVM : ViewModel(), KoinComponent {
  val addNewItemToInventoryPopUpModel: MutableLiveData<AddNewItemToInventoryPopUpModel> =
      MutableLiveData(AddNewItemToInventoryPopUpModel())

  var navArguments: Bundle? = null
}

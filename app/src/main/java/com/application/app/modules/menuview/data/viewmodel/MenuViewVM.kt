package com.application.app.modules.menuview.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.menuview.`data`.model.MenuViewModel
import org.koin.core.KoinComponent

class MenuViewVM : ViewModel(), KoinComponent {
  val menuViewModel: MutableLiveData<MenuViewModel> = MutableLiveData(MenuViewModel())

  var navArguments: Bundle? = null
}

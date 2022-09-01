package com.application.app.modules.emptystate.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.emptystate.`data`.model.EmptyStateModel
import org.koin.core.KoinComponent

class EmptyStateVM : ViewModel(), KoinComponent {
  val emptyStateModel: MutableLiveData<EmptyStateModel> = MutableLiveData(EmptyStateModel())

  var navArguments: Bundle? = null
}

package com.application.app.modules.loginsignupone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.loginsignupone.`data`.model.LogInSignUpOneModel
import org.koin.core.KoinComponent

class LogInSignUpOneVM : ViewModel(), KoinComponent {
  val logInSignUpOneModel: MutableLiveData<LogInSignUpOneModel> =
      MutableLiveData(LogInSignUpOneModel())

  var navArguments: Bundle? = null
}

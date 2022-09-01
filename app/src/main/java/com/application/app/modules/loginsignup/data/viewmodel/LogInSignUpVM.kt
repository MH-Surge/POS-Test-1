package com.application.app.modules.loginsignup.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.loginsignup.`data`.model.LogInSignUpModel
import org.koin.core.KoinComponent

class LogInSignUpVM : ViewModel(), KoinComponent {
  val logInSignUpModel: MutableLiveData<LogInSignUpModel> = MutableLiveData(LogInSignUpModel())

  var navArguments: Bundle? = null
}

package com.application.app.modules.forgotpasswordtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.forgotpasswordtwo.`data`.model.ForgotPasswordTwoModel
import org.koin.core.KoinComponent

class ForgotPasswordTwoVM : ViewModel(), KoinComponent {
  val forgotPasswordTwoModel: MutableLiveData<ForgotPasswordTwoModel> =
      MutableLiveData(ForgotPasswordTwoModel())

  var navArguments: Bundle? = null
}

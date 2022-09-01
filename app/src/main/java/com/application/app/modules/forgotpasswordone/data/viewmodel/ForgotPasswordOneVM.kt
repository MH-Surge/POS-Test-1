package com.application.app.modules.forgotpasswordone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.forgotpasswordone.`data`.model.ForgotPasswordOneModel
import org.koin.core.KoinComponent

class ForgotPasswordOneVM : ViewModel(), KoinComponent {
  val forgotPasswordOneModel: MutableLiveData<ForgotPasswordOneModel> =
      MutableLiveData(ForgotPasswordOneModel())

  var navArguments: Bundle? = null
}

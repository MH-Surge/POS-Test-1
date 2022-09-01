package com.application.app.modules.onboardingseven.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class OnboardingSevenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtYoureAllSet: String? = MyApp.getInstance().resources.getString(R.string.lbl_you_re_all_set)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNowthatyouve: String? =
      MyApp.getInstance().resources.getString(R.string.msg_now_that_you_ve)

)

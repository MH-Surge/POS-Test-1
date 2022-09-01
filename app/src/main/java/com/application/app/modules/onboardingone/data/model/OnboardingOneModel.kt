package com.application.app.modules.onboardingone.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class OnboardingOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTellusAboutY: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tell_us_about_y)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhatKindofBu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_kind_of_bu)

)

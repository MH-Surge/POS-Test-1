package com.application.app.modules.onboardingsix.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class OnboardingSixModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOhNo: String? = MyApp.getInstance().resources.getString(R.string.lbl_oh_no)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWereSorry: String? = MyApp.getInstance().resources.getString(R.string.lbl_we_re_sorry)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeonlycatert: String? =
      MyApp.getInstance().resources.getString(R.string.msg_we_only_cater_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignYourBusin: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_your_busin)

)

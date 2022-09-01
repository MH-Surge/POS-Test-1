package com.application.app.modules.popupone.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class PopUpOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCancel: String? = MyApp.getInstance().resources.getString(R.string.lbl_cancel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterYourPin: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_enter_your_pin)

)

package com.application.app.modules.popupone.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class PopUpOneRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup272: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup267: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup268: String? = MyApp.getInstance().resources.getString(R.string.lbl_3)

)

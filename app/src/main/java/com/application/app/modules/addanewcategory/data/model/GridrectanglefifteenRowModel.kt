package com.application.app.modules.addanewcategory.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class GridrectanglefifteenRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSteaks: String? = MyApp.getInstance().resources.getString(R.string.lbl_steaks)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcode: String? = MyApp.getInstance().resources.getString(R.string.lbl_3400)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUnits: String? = MyApp.getInstance().resources.getString(R.string.lbl_units)

)

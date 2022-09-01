package com.application.app.modules.iphone13promaxsevenone.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone13ProMaxSevenOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLinQPOS: String? = MyApp.getInstance().resources.getString(R.string.lbl_linq_pos)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInventory: String? = MyApp.getInstance().resources.getString(R.string.lbl_inventory)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupNinetySevenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupThirtyThreeValue: String? = null
)

package com.application.app.modules.addanewcategory.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class AddANewCategoryModel(
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
  var etGroup236Value: String? = null
)

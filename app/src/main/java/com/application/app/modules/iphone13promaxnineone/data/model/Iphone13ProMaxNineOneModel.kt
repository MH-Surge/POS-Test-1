package com.application.app.modules.iphone13promaxnineone.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone13ProMaxNineOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLinQPOS: String? = MyApp.getInstance().resources.getString(R.string.lbl_linq_pos)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCategories: String? = MyApp.getInstance().resources.getString(R.string.lbl_categories)

)

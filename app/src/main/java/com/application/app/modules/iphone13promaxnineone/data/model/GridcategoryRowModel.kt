package com.application.app.modules.iphone13promaxnineone.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class GridcategoryRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCategory: String? = MyApp.getInstance().resources.getString(R.string.lbl_category)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSnacks: String? = MyApp.getInstance().resources.getString(R.string.lbl_snacks)

)

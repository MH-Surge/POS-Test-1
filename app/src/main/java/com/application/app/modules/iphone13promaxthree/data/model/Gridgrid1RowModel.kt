package com.application.app.modules.iphone13promaxthree.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class Gridgrid1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNewOrder: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_order)

)

package com.application.app.modules.iphone13promaxthree.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class ListordercounterRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOrderCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_order_001)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtItemsCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_18_items)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotal: String? = MyApp.getInstance().resources.getString(R.string.lbl_total2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_mwk_118_750_00)

)

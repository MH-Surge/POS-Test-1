package com.application.app.modules.iphone13promaxthreeone.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class ListordercounterOneRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOrderCounterOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_order_002)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtItemsCounterOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_items)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotalOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_total2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_mwk_18_750_00)

)

package com.application.app.modules.iphone13promaxsixone.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone13ProMaxSixOneModel(
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
  var txtProductsforRe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_products_for_re)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtViewAll: String? = MyApp.getInstance().resources.getString(R.string.lbl_view_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDryAgedSteaks: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_dry_aged_steaks)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt14UnitsLeft: String? = MyApp.getInstance().resources.getString(R.string.lbl_14_units_left)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInventoryInsig: String? =
      MyApp.getInstance().resources.getString(R.string.msg_inventory_insig)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtViewAllOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_view_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup240Value: String? = null
)

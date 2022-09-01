package com.application.app.modules.iphone13promaxthreeone.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone13ProMaxThreeOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLinQPOS: String? = MyApp.getInstance().resources.getString(R.string.lbl_linq_pos)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDashboard: String? = MyApp.getInstance().resources.getString(R.string.lbl_dashboard)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInventory: String? = MyApp.getInstance().resources.getString(R.string.lbl_inventory)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmployeeManage: String? =
      MyApp.getInstance().resources.getString(R.string.msg_employee_manage)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_open_orders2)
  ,
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
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtServer: String? = MyApp.getInstance().resources.getString(R.string.lbl_server)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBettyJones: String? = MyApp.getInstance().resources.getString(R.string.lbl_betty_jones)

)

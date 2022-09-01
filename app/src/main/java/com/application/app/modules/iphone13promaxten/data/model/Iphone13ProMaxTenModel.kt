package com.application.app.modules.iphone13promaxten.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone13ProMaxTenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLinQPOS: String? = MyApp.getInstance().resources.getString(R.string.lbl_linq_pos)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBack: String? = MyApp.getInstance().resources.getString(R.string.lbl_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCompletePaymen: String? =
      MyApp.getInstance().resources.getString(R.string.msg_complete_paymen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMobileMoney: String? = MyApp.getInstance().resources.getString(R.string.lbl_mobile_money)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGratuity: String? = MyApp.getInstance().resources.getString(R.string.lbl_gratuity)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAirtelMoneyNu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_airtel_money_nu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt09900000000: String? = MyApp.getInstance().resources.getString(R.string.lbl_09900000000)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup161Value: String? = null
)

package com.application.app.modules.iphone13promaxnine.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone13ProMaxNineModel(
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
  var txtCash: String? = MyApp.getInstance().resources.getString(R.string.lbl_cash)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGratuity: String? = MyApp.getInstance().resources.getString(R.string.lbl_gratuity)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCollectCashan: String? =
      MyApp.getInstance().resources.getString(R.string.msg_collect_cash_an)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup161Value: String? = null
)

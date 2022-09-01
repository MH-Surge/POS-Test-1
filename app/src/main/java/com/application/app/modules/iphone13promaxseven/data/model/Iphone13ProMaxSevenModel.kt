package com.application.app.modules.iphone13promaxseven.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone13ProMaxSevenModel(
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
  var txtSelectAPaymen: String? =
      MyApp.getInstance().resources.getString(R.string.msg_select_a_paymen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWallet: String? = MyApp.getInstance().resources.getString(R.string.lbl_wallet)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAppleAndroid: String? = MyApp.getInstance().resources.getString(R.string.msg_apple_android)

)

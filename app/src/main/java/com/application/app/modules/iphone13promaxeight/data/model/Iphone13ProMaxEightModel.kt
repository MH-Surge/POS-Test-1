package com.application.app.modules.iphone13promaxeight.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone13ProMaxEightModel(
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
  var txtCard: String? = MyApp.getInstance().resources.getString(R.string.lbl_card)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSwipeorInsert: String? =
      MyApp.getInstance().resources.getString(R.string.msg_swipe_or_insert)

)

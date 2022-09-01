package com.application.app.modules.iphone13promaxtwenty.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone13ProMaxTwentyModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSpagehettiMeat: String? =
      MyApp.getInstance().resources.getString(R.string.msg_spagehetti_meat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup161Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFiftyEightValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupSixtyTwoValue: String? = null
)
